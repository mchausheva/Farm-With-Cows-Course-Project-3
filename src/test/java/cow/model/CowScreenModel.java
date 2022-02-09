package cow.model;

import cow.service.CowService;

public class CowScreenModel {

    private Animal mother;
    private Animal father;
    private int age;
    private String gender;
    private Farm farm;    
    private String message;
    
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
	public Farm getFarm() {
		return farm;
	}
	public void setFarm(Farm farm) {
		this.farm = farm;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void clickCreateCowButton() {
		this.message = CowService.createCow(this.mother, this.father, this.age, this.gender, this.farm);
	}
	
	public void clickMateCowsButton() {
		this.message = CowService.cowsMate(this.mother, this.father);
	}
}
