package com.lti.casestudy.day1;



public class Course {
private int courseid;
private String coursename;
private int courseduration;
private int coursefees;


public Course(int courseid, String coursename, int courseduration, int coursefees) {
	super();
	this.courseid = courseid;
	this.coursename = coursename;
	this.courseduration = courseduration;
	this.coursefees = coursefees;
}

public int getCourseid() {
	return courseid;
}



public void setCourseid(int courseid) {
	this.courseid = courseid;
}


public String getCoursename() {
	return coursename;
}


public void setCoursename(String coursename) {
	this.coursename = coursename;
}



public int getCourseduration() {
	return courseduration;
}



public void setCourseduration(int courseduration) {
	this.courseduration = courseduration;
}



public int getCoursefees() {
	return coursefees;
}


public void setCoursefees(int coursefees) {
	this.coursefees = coursefees;
}



}

