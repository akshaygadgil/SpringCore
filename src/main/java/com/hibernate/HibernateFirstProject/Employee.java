package com.hibernate.HibernateFirstProject;

public class Employee {
	private int id;
	private String name;
	private String lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Employee(int id, String name, String lname) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lname=" + lname + "]";
	}
	
	

}
