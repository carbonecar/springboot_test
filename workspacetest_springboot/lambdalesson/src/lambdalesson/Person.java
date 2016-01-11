package lambdalesson;

import java.time.LocalDate;

public class Person {

	public enum SEX{
		MALE,FEMALE;
	}
	private String name;
	private LocalDate date;
	private SEX gender;
	private int age;
	
	public Person(String name,int age,SEX gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public SEX getGender() {
		return gender;
	}
	public void setGender(SEX gender) {
		this.gender = gender;
	}
	public void printPerson() {
		System.out.println(name);
	}
	
	
}
