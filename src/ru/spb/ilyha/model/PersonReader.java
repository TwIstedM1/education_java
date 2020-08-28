package ru.spb.ilyha.model;
import java.util.Scanner;

class PersonReader {
  
    public static Person readPerson() {
    
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name");
		String fnamePerson = s.nextLine();
		
		System.out.println("Enter last name ");
		String lnamePerson = s.nextLine();
		
		System.out.println("Enter age");
        int agePerson = s.nextInt();
		
		System.out.println("Enter height");
		int heightPerson = s.nextInt();
		
		System.out.println("Enter country");
        String countryPerson = s.nextLine();
		
        return new Person(fnamePerson, lnamePerson, agePerson, heightPerson, countryPerson);
    }
    
}