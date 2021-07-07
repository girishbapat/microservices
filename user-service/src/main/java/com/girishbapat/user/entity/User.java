package com.girishbapat.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long userId;

private String firstName;

private String lastName; 

private String email;

private Long departmentId;

/**
 * @return the userId
 */
public Long getUserId() {
	return userId;
}

/**
 * @param userId the userId to set
 */
public void setUserId(Long userId) {
	this.userId = userId;
}

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the departmentId
 */
public Long getDepartmentId() {
	return departmentId;
}

/**
 * @param departmentId the departmentId to set
 */
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}

}
