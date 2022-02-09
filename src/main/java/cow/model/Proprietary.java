package cow.model;

import java.util.*;

public class Proprietary {
	
    private String name;
    private String phoneNumber;
    private String email;
    private Аssociation association;
    private Set<Farm> farms;
    
    public Proprietary() {
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Аssociation getAssociation() {
		return association;
	}
	public void setAssociation(Аssociation association) {
		this.association = association;
	}
	public Set<Farm> getFarms() {
		return farms;
	}
	public void setFarms(Set<Farm> farms) {
		this.farms = farms;
	}

}