package com.lti.casestudy.day1;

public class App {
	public static void main(String[] args) 
	{
		scenario1();
		scenario2();
		scenario3();
	
	}

	private static void scenario3() {
		
		
	}

	private static void scenario2() {
		
		Student[] sArray1=new Student[3];
		Student s1=new Student(1,"Abhi","02-02-1999");
		Student s2=new Student(2,"Abhay","02-02-1998");
		Student s3=new Student(3,"Abhinav","02-02-2000");
		sArray1[0]=s1;
		sArray1[1]=s2;
		sArray1[2]=s3;
		
		for(Student st:sArray1) {
			System.out.println(st);
		}
		
	}

	private static void scenario1() {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Sita","01-01-2000");
		Student s2=new Student(2,"Gita","01-01-1999");
		Student s3=new Student(3,"Rita","01-01-1998");
		Info i=new Info();
		i.display(s1);
		i.display(s3);
		i.display(s2);
	}

}
