package com.student.Service;

import com.student.exception.MyException;

public interface Service {

	void AddDetail(int id, String name, int age, double grade, String course, String admissionDate,
			boolean active)throws MyException;
	void displayDetails();
	void removeStudentGrade();
	void sortByAdmissionDate();
	void sortByName();
	void searchByCourse(String course);
	void UpgradeGradeById();
}
