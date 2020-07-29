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
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String city;
	private  Date startDate;
	private boolean stat;

	public User() {
	}

	public User(String name, String city, Date startDate, boolean stat) {
		this.name = name;
		this.city = city;
		this.startDate = startDate;
		this.stat = stat;
	}
}
