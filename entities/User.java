package com.user.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	
//DECLARE VARIABLE
@Id
private long UserID;
private String UserName;
private String UserCity;


//PARAMETERIZED CONSTRUCTOR
public User(int userID, String userName, String userCity) {
	super();
	UserID = userID;
	UserName = userName;
	UserCity = userCity;
}


//DEFAULT CONSTRUCTOR
public User() {
	super();
	// TODO Auto-generated constructor stub
}


//GETTER AND SETTER METHOD
public long getUserID() {
	return UserID;
}

public void setUserID(long userID) {
	UserID = userID;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getUserCity() {
	return UserCity;
}

public void setUserCity(String userCity) {
	UserCity = userCity;
}


//toString METHOD
@Override
public String toString() {
	return "User [UserID=" + UserID + ", UserName=" + UserName + ", UserCity=" + UserCity + "]";
}




}
