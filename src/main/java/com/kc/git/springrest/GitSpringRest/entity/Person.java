package com.kc.git.springrest.GitSpringRest.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {

	@Id
	//@GeneratedValue (strategy = GenerationType.AUTO)
	private Long personId;
	
	@Column(name= "first_name",nullable = false)
	private String firstName;
	
	@Column(name= "last_name",nullable = false)
	private String lastName;
	
	
	@Column(name= "social_security",nullable = false)
	private Integer ssn;
	
	@Column(name= "phone",nullable = true)
	private Integer phone;

	public Person() {
		
	}
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, personId, ssn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(personId, other.personId) && Objects.equals(ssn, other.ssn);
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn
				+ "]";
	}
	
	
}
