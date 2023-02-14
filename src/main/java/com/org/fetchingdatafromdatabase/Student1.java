package com.org.fetchingdatafromdatabase;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
         /*
		 * @Entity annotation tells hibernate to map this class as a table into database
		 * with table name "Student" same as class name
		 */
@Entity
@Table(name="Student1")
public class Student1 {

	
	 /*
		 * /@Id annotation is used to mark the current field/variable as a primary key
		 * in the table
		 */
	
	@Id
	private int id;
	private String name;
	private String city;
	
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	public Student1(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
