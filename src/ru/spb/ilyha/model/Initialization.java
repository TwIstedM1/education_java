package ru.spb.ilyha.model;

public class Initialization {
    
    public static void main(String[] args){
        
        Person alex = new Person ("Alex", 18);
        Person ilya = new Person ("Alex", 18);

        System.out.println("Экземпляр класса " + alex.name + " " + alex.age);
        System.out.println("Экземпляр класса " + ilya.name + " " + ilya.age);
    }
}
class Person {
    
   String name;
   int age;


    static {
        System.out.println("Это статический блок инциализации" );
    }
    
    public Person (String name, int age) {
            this.name = name;
            this.age = age;

            System.out.println("А это конструктор");
        }
    {
        name = "Alex";
        age = 19;
        System.out.println("Это блок инциализации с значением полей: " + name + " " + age);
    }
}
