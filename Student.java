package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("The student name");
	}
	public void studentDept()
	{
		System.out.println("The student Department");
	}
	public void studentId()
	{
		System.out.println("The student ID");
	}

	public static void main(String[] args)
	{
		Student obj =new Student();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
	}
}
