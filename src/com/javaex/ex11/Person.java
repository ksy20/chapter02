package com.javaex.ex11;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
	
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		if(age<1) {
			return 1;
		}
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: "+this.name);
	System.out.println("나이: "+age);
	}

}
