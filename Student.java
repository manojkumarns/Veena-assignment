package org.te.comparator;

import java.util.Comparator;

public class Student {
	int id;
	String name;
	int marks;
	int age;
	

	public Student(int id, String name, int marks, int age) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}


	






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}









	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}









	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}




}
