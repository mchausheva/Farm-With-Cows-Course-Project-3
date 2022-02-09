package cow.model;

import java.util.*;

public class Farm {
	
    private String farmName;
    private Set<Animal> animals;
    private Set<Proprietary> owner;
    
	public Farm() {
    }

	public String getFarmName() {
		return farmName;
	}
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}
	public Set<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}
	public Set<Proprietary> getOwner() {
		return owner;
	}
	public void setOwner(Set<Proprietary> owner) {
		this.owner = owner;
	}
    
}