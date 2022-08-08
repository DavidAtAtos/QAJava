package com.qa.helloworld;

public class ClassMembers {
	private String firstName;
    private String surname;
    private static int numberOfPeople = 0;

    public ClassMembers(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
        numberOfPeople++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
