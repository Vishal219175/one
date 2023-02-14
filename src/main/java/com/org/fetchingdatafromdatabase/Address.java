package com.org.fetchingdatafromdatabase;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="stud_address")     //here,we are changing the name of table
public class Address {

	@Id  // primary key
	@GeneratedValue(strategy= GenerationType.IDENTITY)  //it will auto increment id field
    @Column(name="a_id")   // //here we are changing the name of column
	private int addressId;
	
	@Column(length =50, name="street")  //here we are changing the length of column by 50,the default size of string type of column in database is 255

	private String street;
	
	private String  city;
	
	private boolean isOPen;
	
	@Transient  // Transient annotation here,double x wont be created in the databse because we are declaring it as a transient
	private double x;   // this will not be created in database in sql
	
	@Temporal(TemporalType.DATE) // it only saves the date and not the time here we can also give .time for time and timestamp for both time and date 
	private Date addDate;
	
	@Lob  //  it stands for large object  
	private byte[] image;

	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOPen() {
		return isOPen;
	}

	public void setOPen(boolean isOPen) {
		this.isOPen = isOPen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	
	
	public Address(int addressId, String street, String city, boolean isOPen, double x, Date addDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOPen = isOPen;
		this.x = x;
		this.addDate = addDate;
		this.image = image;
	}

	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOPen=" + isOPen
				+ ", x=" + x + ", addDate=" + addDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
	
	
	
	
	
}
