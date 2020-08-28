package ru.spb.ilyha.model;

class Cat{
	
	private final String name;
    private String breed;
    private int age;
    private final String color;
    private Person owner;
	
	public Cat(String name, String breed, int age, String color, Person owner){
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.owner = owner;
	}
	
	public boolean isHomeless() {
		
		if (owner != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(Cat cat) {
        
        return age == cat.age &&
               name.equals(cat.name) &&
               breed.equals(cat.breed) &&
               color.equals(cat.color);
    }
}