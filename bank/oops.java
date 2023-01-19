
package bank;
// // ###### CONSTRUCTERS #######

// Constructors have the same name as class or structure. 
// Constructors don’t have a return type. (Not even void)
// Constructors are only called once, at object creation.



// class Student{
//     String name;
//     int age;
// // these are the properties

// Student(String n,int a){
//     name= n;
//     age= a;
//     System.out.println("constructor called");
    

// }
// public void getInfo(){
//     System.out.println("The name of this student is " +name);
//     System.out.println("The age of this student is"+ age);

// }


// }
// public class oops{
//     public static void main(String args[]){
// Student s1= new Student("PRANSHU", 23);
//     // s1.name= "PRANSHU";
//     // s1.age=23;
//     s1.getInfo();

//     }

// }



// *******  four pillars of object-oriented programming  ******
// these four pillars are
//  Inheritance, Polymorphism, Encapsulation and Abstraction.
 


//  *******  POLYMORPHISM ********


// COMPILE TIME POLYMORPHISM


// EX.METHOD OVERLOADING

// class Student{
//     string name ;
//     int age;

//     public void getInfo(String n){
//         System.out.println("the name is"+ n);
//     }
//     public void getInfo(int a){
//         System.out.println("the age is"+ a);
//     }

// }

// public class oops{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.getInfo("pranshu");
//         s1.getInfo(23);

//     }
// }



// class pen{
//     String color;

//     public void printColor(){
//         System.out.println("the color of the pen is "+ this.color);
// }
// }
// public class oops{

// public static void main(String args[]) {
//     pen p1= new pen();
//         p1.color="red";
//     pen p2= new pen();
//     p2.color= "orange";
//     p1.printColor();

//     student s1= new student();
//     s1.name= "PRANSHU";
//     s1.age=23;
//     s1.getInfo();
    
// }
// }






// RUNTIME POLYMORPHISM


// the child class overrides the method of the parent class.
// dynamic polymorphism
// class Shape {

//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     float height;
//     float base;
//     public void area(float h,float b) {
//         height=h;
//         base=b;
//         System.out.println((1f/2f)*b*h+ "hello");
//     }  
//  }
//  class Circle extends Shape {
//     public void area(int r) {
//         System.out.println((3.14)*r*r);
//     }  
//  }

// public class oops{
//  public static void main(String args[]){

// Triangle t1=new Triangle();
// // t1.height=10;
// // t1.base=2;
// t1.area(10,2);

// Circle c1= new Circle();
// c1.area();
// preference is always given to child class 
// as it is not having any parameters so parent class will be taken into consideration

//  }
// }




// *****  INHERITANCE  *****

// process in which one object acquires all the properties and behaviors of its parent object automatically.

// ****  MULTI LEVEL INHERITANCE  *****

// class Shape {
//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     float height;
//     float base;
//     public void area(float h, float b) {
//         height=h;
//         base= b;
//         System.out.println((1f/2f)*b*h);
//     }  
//  }
//  class EquilateralTriangle extends Triangle {
//     float side;
//     public void area(float s) {
//         side=s;
//         System.out.println((Math. sqrt(3f)/4f)*s*s);
//     }  
//  }

//  public class oops{
//     public static void main(String args[]){
//         EquilateralTriangle t1= new EquilateralTriangle();
//         t1.area(2,4);
//     }
//  }
 
// import java.util.Scanner;
// import java.io.IOException;




// ****** IMPORTING PACKAGE ******

// package bank;

// public class oops{
//     public static void main(String args[]){
//        bank.Account account1= new bank.Account();
//        account1.name="customer1";

//     }
// }





//  ********  Encapsulation *******


// Encapsulation is the process of combining data and functions into a single unit called class.
//  In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. 
//  In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes.
//   Thus, encapsulation makes the concept of data hiding possible.
//   (Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies.
//    e.g. "protected", "private" feature in Java). 







// *******  ABSTRACTION *******

// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.


// abstract class Animal{
//     abstract void walk();
//     public void eat(){
//         System.out.println("Animal eats");
//     }

//         Animal(){
//             System.out.println("you are creating a new animal");
//         }
//     }


// class Horse extends Animal{
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
//     Horse(){
//         System.out.println("you are crating  a new horse");
//     }
// }

// class chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }

// public class oops{
//     public static void main(String args[]){
//         Horse horse = new Horse();
//         // first of all animal constructor will be called ...after that horse constructer
//         // if you create a object in derived class ...base class constructor will be called first then derived class
//         // this is known as constructor chaining
//         // horse.walk();
//         // horse.eat();
//     }
// }






// ******  INTERFACES ******


// interface Animal{
//      public void walk();
//     // this is an abstract function
//     // an abstract function can only be declared
//     // defining walk function
//     // All methods are public & abstract by default so we dont have to write these in fron of them

//     // Animal(){

//     // }

//     // ERROR-interface can not have constuctors

//     // public void eat(){

//     // }
//     // ERROR- because this is not an abstract function
// }

// class Horse implements Animal{
// // it will use all the properties of animal

// public void walk(){
//     // unlike the methods in interface ,we have to write public here beacuse if we dont -it will be default
//     System.out.println("walks on 4 legs");
//     // implementing walk function
// }  
// }

// public class oops{
//     public static void main(String args[]){
//         Horse horse = new Horse();
//         horse.walk();
//     }
// }


// MULTIPLE INHERITANCE
// Interfaces support the functionality of multiple inheritance.

// interface Animal{
//     public void walk();
// }
   
// interface Herbivore{
//     public void eat();

// }
// class Horse implements Animal,Herbivore{


// public void walk(){
   
//    System.out.println("walks on 4 legs");
   
// }  
// public void eat(){
//     System.out.println("eats grass");
// }
// }

// public class oops{
//    public static void main(String args[]){
//        Horse horse = new Horse();
//        horse.walk();
//        horse.eat();
//    }
// }

// ******* STATIC KEYWORD******


class Student{
    static String school;
}

public class oops{


public static void main(String args[]){
    Student.school="Aryan";
    // we dont need to make object like we did earlier ..we can directly assign value by class name

    Student s1 = new Student(){


    };
    System.out.println(s1.school);

}
}
    




 