package ru.spb.ilyha.model;

class Person {
    
    String fname;
    String lname;
    int age;
    int height;
    String country;
    
    public Person (String fname, String lname, int age, int height, String country) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.height = height;
        this.country = country;
    }
		
    public void cardPerson() {
        System.out.println("Name person: " + fname + " " + lname + "; Age: "+ age+ "; Height: " + height + "; Country: "+ country);
    }
	
	public static int happyBirthday(int x) {
		x++;
		System.out.println("Happy Birthday you are already: "+ x);
		return x;
	}
	
	public static int agePersons (int x, int y) {
		int max;
        if (x >= y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }
}