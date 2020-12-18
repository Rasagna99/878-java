package com.lti.casestudy.day1;

public class Student {
	private int stdid;
	private String name;
	private String dob;
	
	public Student(int stdid,String name,String dob)
	{                                            //parameterized constructor
		this.stdid=stdid;
		this.name=name;
		this.dob=dob;
	}
	
	void getdetails() {
		System.out.println("Student id"+stdid);
		System.out.println("Student name"+name);
		System.out.println("student dob"+dob);
	}
	
	//getters
		public int getStdid() 
		{
			return stdid;
	     }
		String getName() 
		{
			return name;
		}
		String geDdob()
		{
			return dob;
		}
	//setters
		public void setStdid(int stdid) 
		{
			this.stdid=stdid;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setDob(String dob) 
		{
			this.dob=dob;
		}
		
}
