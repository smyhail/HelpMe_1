package com.sub.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private Date startDate;
	private String emailAddress;
	private int age;
	private int active;



	public User(String firstname, String lastname, Date startDate, String emailAddress, int age, int active) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.startDate = startDate;
		this.emailAddress = emailAddress;
		this.age = age;
		this.active = active;
	}



}
