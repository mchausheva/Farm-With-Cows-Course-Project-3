package cow.service;

import java.util.ArrayList;
import java.util.Random;

import cow.model.Animal;
import cow.model.Farm;

public class CowService {

	private static ArrayList<Animal> cowDB = new ArrayList<Animal>();
	
	public static String createCow(Animal mother, Animal father, int age, String gender, Farm farm) {
		if (mother == null || father == null || age == 0 ||
				gender == null || farm == null) {
			return "Непълни данни!";
		}
		Animal animal = new Animal(mother, father, age, gender, farm); 
		cowDB.add(animal);
		return "Успешно създаване на животно!";
	}
	
	public static String cowsMate(Animal mother, Animal father) {
		if (mother.getGender() == father.getGender()) {
			return "Неуспешно чифтосване, защото двете животни са от един и същи пол!";
		}
		
		if (mother.getAge() < 2 || father.getAge() < 2) {
			return "Неуспешно чифтосване, защото майка и/или баща са под 2 години!";
		}
		
		if (mother.getMonthsSinceLastBirth() < 10) {
			return "Неуспешно чифтосване, защото майката е раждала преди по-малко от 10 месеца!";
		}
		
		String [] genders = {"male", "female"};
		Random random = new Random();
		
		Animal child = new Animal();
		child.setMother(mother);
		child.setFather(father);
		child.setAge(0);
		child.setGender(genders[random.nextInt(genders.length)]);
		cowDB.add(child);
		
		mother.getChildren().add(child);
		father.getChildren().add(child);
		
		return "Успешно чифтосване на животни";
	}
}
