package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	private String department;

	public Depart() {
	}

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void showInformation() {
		System.out.println("이름:" + super.getName()+ "\t" + "연봉:" + super.getSalary() + "\t" + "부서:" + department);
	}
	
}
