package org.te.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentList {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "manoj", 70, 22));
		set.add(new Student(2, "Vishu", 95, 23));
		set.add(new Student(5, "Amith", 80, 24));
		set.add(new Student(3, "Madhu", 50, 25));
		set.add(new Student(6, "Bala", 90, 26));
		set.add(new Student(4, "Yadava", 55, 27));
		set.add(new Student(4, "Yadava", 555, 127));
        ArrayList list= new ArrayList<Student>(set);
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter 1 to entry");
	    int j= sc.nextInt();
	    
	    
	    while(j==1) {
	    	System.out.println("enter 1 for sorting by id");
	    	System.out.println("enter 2 for sorting by name");
	    	System.out.println("enter 3 for sorting by age");
	    	System.out.println("enter 4 for sorting by marks");
	    	
	    	
	    	int a= sc.nextInt();
	    	if(a>4) {
	    		try {
					throw new Except("hgghsjdfh");
				} catch (Except e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	if(a==1) {
	    		Collections.sort(list,new Sorting());
	    		for(Object object:set)
	    		System.out.println(object);
	    	}else if(a==2) {
	    		Collections.sort(list,new SortByName());
	    		for(Object object:set)
		    		System.out.println(object);
	    	}else if(a==3) {
	    		Collections.sort(list,new SortByName());
	    		for(Object object:set)
		    		System.out.println(object);
	    	}else if(a==4) {
	    		Collections.sort(list,new SortByAge());
	    		for(Object object:set)
		    		System.out.println(object);
	    	}
	    	System.out.println("enter 1 for sorting again else press 0 for exit");
	    	j=sc.nextInt();
	    }
	}

}
