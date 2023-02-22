package org.student;


import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		
		System.out.println("Ranjith");
		
	}

public void studentDept() {
	System.out.println("Computer Science");
	}

public void studentId() {
	System.out.println("471946");
}

public static void main(String[] args) {
	Student info = new Student();
	info.collegeCode();
	info.collegeName();
	info.collegeRank();
	info.deptName();
	info.studentDept();
	info.studentId();
	info.studentName();
}
}
