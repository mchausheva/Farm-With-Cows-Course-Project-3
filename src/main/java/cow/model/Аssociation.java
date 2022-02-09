package cow.model;

import java.util.*;

/**
 * 
 */
public class Аssociation {

    private String nickname;
    private Set<Proprietary> member;
    
    public Аssociation() {
    }

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Set<Proprietary> getMember() {
		return member;
	}
	public void setMember(Set<Proprietary> member) {
		this.member = member;
	}
}