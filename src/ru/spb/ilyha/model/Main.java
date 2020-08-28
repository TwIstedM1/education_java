package ru.spb.ilyha.model;

public class Main {
    
    public static void main(String[] args){
        
        Person person = new Person ("Alex", "Charm", 26, 178, "Russia");
        
        Cat cat1 = new Cat ("Murky","Maine Coon", 1, "Orange", person);
        Cat cat2 = new Cat ("Lunara","Maine Coon", 2, "Blue", null);
		Cat cat3 = new Cat ("Murky","Maine Coon", 1, "Orange", person);
        
        
        System.out.println(cat1.isHomeless());
        System.out.println(cat2.isHomeless());

        System.out.println(cat1.equals(cat2));
		System.out.println(cat1.equals(cat3));
		
    }
}

