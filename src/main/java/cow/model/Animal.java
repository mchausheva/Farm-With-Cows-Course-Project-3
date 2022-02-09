package cow.model;

import java.util.*;

public class Animal {

    private Animal mother;
    private Animal father;
    private int age;
    private String gender;
    private int monthsSinceLastBirth;
    private Farm farm;
    private Set<Animal> children;
    private Set<Animal> parent;
    
    public Animal() {
    }
    
	public Animal(int age, String gender, int monthsSinceLastBirth) {
		super();
		this.age = age;
		this.gender = gender;
		this.monthsSinceLastBirth = monthsSinceLastBirth;
		this.children = new HashSet<Animal>();
	}
	
	public Animal(Animal mother, Animal father, int age, String gender, Farm farm) {
		super();
		this.mother = mother;
		this.father = father;
		this.age = age;
		this.gender = gender;
		this.farm = farm;
	}

	public Animal getMother() {
		return mother;
	}
	public void setMother(Animal mother) {
		this.mother = mother;
	}
	public Animal getFather() {
		return father;
	}
	public void setFather(Animal father) {
		this.father = father;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getMonthsSinceLastBirth() {
		return monthsSinceLastBirth;
	}

	public void setMonthsSinceLastBirth(int monthsSinceLastBirth) {
		this.monthsSinceLastBirth = monthsSinceLastBirth;
	}

	public Farm getFarm() {
		return farm;
	}
	public void setFarm(Farm farm) {
		this.farm = farm;
	}
	public Set<Animal> getChildren() {
		return children;
	}
	public void setChildren(Set<Animal> children) {
		this.children = children;
	}
	public Set<Animal> getParent() {
		return parent;
	}
	public void setParent(Set<Animal> parent) {
		this.parent = parent;
	}

}