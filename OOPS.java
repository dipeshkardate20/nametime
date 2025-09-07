public class OOPS{
    public static void main(String args[]){
        // Pen p1 = new Pen() ;

        // p1.setcolor("blue");
        // System.out.println(p1.color);

        // p1.settip(5);

        // System.out.println(p1.tip);
        // Student s1 = new Student();

        //  here the s1 work as key 
        // the Student() work as the home whichs key is s1 
        // and the s1 is pointing towards home 

        // Student s2 = new Student();
        
        // home h1 = new home();
        // student d1 = new student();
        // student d2 = new student("Dipesh");
        // System.out.println(d2);

        // student d3 = new student(20);
        // System.out.println(d3); 
        // Student s1 = new Student();
        // s1.name = "Dipesh";
        // s1.roll = 23;
        // s1.password = "abcd";

        // Student s2 = new Student(s1);
        // ş2.password = "xyz";

        // s1.marks[0] = 100;
        // s1.marks[1] = 80;
        // s1.marks[2] = 70;

        // Fish tuna = new Fish();

        // tuna.eats();

        // Dog doggy = new Dog();
        // doggy.eats();
        // doggy.legs = 4;
        // System.out.println(doggy.legs);







    }

}

class Animal{
    int teeth;

    void eats(){
        System.out.println("Eats FOOD");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class Mammel extends Animal{
    void walks(){
        System.out.println("walks");
    }

}
class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }

}
class fish extends Animal{
    void swim(){
        System.out.println("swims");
    }

}


// class Dog extends Mammel{
//     String breed;
// }
// class Fish extends Animal{
//     int fings;

//     void swim(){
//         System.out.println("swims in water ");
//     }
// }

class Student {
    String name ;
    int roll;
    String password;

    int marks[];

    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks  = s1.marks;

    }

    Student(){
        System.out.println("This is the constructor....");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;

    }

    
    // https://chatgpt.com/c/68bdbe1f-006c-8324-9e35-ccf14e9e2926

    //  here the student is the constructor 
    
}
class student{

    String name ;
    int roll;

    // student(){
    //     System.out.println("This is the ocnstructor...");
    // }

    student(String name){
        this.name = name;
    }

    student(int roll){
        this.roll = roll;

    }


}


class home {

    
    home(){
        System.out.println("Welcome to the home ");
    }
}

class Pen{
    String color;
    int tip ;

    void setcolor(String newcolor){
        color = newcolor;
    }

    void settip(int newtip){
        tip = newtip;
    }

    // this is only for education purpose 

}