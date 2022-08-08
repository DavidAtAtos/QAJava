package com.qa.helloworld;

public class Results {
	private int physics;
	private int chemistry;
	private int biology;
	private int total;
	private double percentage;
	
	
	
	
	public Results (int physics , int chem ,int bio) {
		this.biology = bio;
		this.chemistry = chem;
		this.physics = physics;
		this.total = chem + bio + physics;
		this.percentage = (total * 100)/450;
	}
	
	 public void setChem(int chem) {
	        this.chemistry = chem;
	    }
	 public void setBio(int bio) {
	        this.biology = bio;
	    }
	 public void setPhysics(int Physics) {
	        this.physics = Physics;
	    }
	 public int getBio() {
	        return biology;
	    }
	 public void total() {
		 System.out.println("Biology marks -- " + biology+"/150");
		 System.out.println("Chemistry marks -- " + chemistry+"/150");
		 System.out.println("Physics marks -- " + physics+"/150");
		 System.out.println("Total marks -- " + total+"/450");
		
	 }
	 public void percentage() {
		 double b = biology ;
		 double p = physics;
		 double c = chemistry;
			if((b / 150)*100 < 60) {
				System.out.println("You have failed Biology");
				
			}
			if((c / 150)*100 < 60) {
				System.out.println("You have failed Chemistry"+ biology + b);
				
			}
			if((p / 150)*100 < 60) {
				System.out.println("You have failed Physics");
				
			}
		 this.percentage = (total * 100)/450;
		 System.out.println("Total Percentage -- " + percentage+"%");
		 if(percentage < 60) {
			 System.out.println("You have recieved under 60% , you have failed!");
		 }
		 
	 }
	public static void main(String[] args) {
		Results f = new Results (10,149,120);
		f.total();
		f.percentage();
		// TODO Auto-generated method stub

	}

}
