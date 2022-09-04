package 미니프로젝트DB연습;

import java.util.Random;

public class 캐릭터 {

	private String nick;
	private String charType;
	private String memID;
	private int exp;
	private int lv;
	private int energy;
	private int work_ability;
	private int stress;
	
	Random rd=new Random();
	
	public 캐릭터(String nick, String charType) {
		this.nick=nick;
		this.charType=charType;
		this.exp=0;
		this.lv=1;
		this.energy=100;
		this.work_ability=rd.nextInt(5)+1;
		this.stress=0;		
	}
	
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {//
		this.nick = nick;
	}
	
	
	
	public String getcharType() {
		return charType;
	}
	
	public void setCharType(String charType) {//
		this.charType = charType;
	}
	
	public String getmemID() {
		return charType;
	}
	
	public void setmemID(String memID) {
		this.memID = memID;
	}
	
	
	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	
	
	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	
	
	public int getWork_ability() {
		return work_ability;
	}

	public void setWork_ability(int work_ability) {
		this.work_ability = work_ability;
	}

	
	
	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}



	
	
	
}
