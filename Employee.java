package com.sonata.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class SortByCity implements Comparator<Employee>{
	
	@Override
	public int compare(Employee a, Employee b) {
		return a.city.compareTo(b.city);
	}
	
}*/


public class Employee {
	
	private int id;
	private String name;
	private String gender;
	private int age;
	private int pincode;
	String city;

	public Employee(int id, String name, String gender,int age, int pincode, String city) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.pincode=pincode;
		this.city=city;
	}
	
	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return this.id + " " + this.gender + " " + this.age + " " + this.pincode + " " + this.city + " ";
	
	}
        
    public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		/*emp.add(new Employee(12,"Mayank","Male",21,6478,"Ongole"));
		emp.add(new Employee(15,"amar","Male",25,6378,"Nellore"));
		emp.add(new Employee(11,"Nani","Male",21,6478,"Ongole"));
		emp.add(new Employee(19,"anshu","Female",22,8678,"Kadapa"));
		emp.add(new Employee(10,"solana","Female",31,9478,"Guntur"));
		emp.add(new Employee(16,"sampu","Female",31,9478,"Nellore"));
		emp.add(new Employee(13,"Mrudhula","Female",26,9478,"Guntur"));*/
		emp.add(new Employee(20,"Nani","Male",24,9478,"Ongole"));
		emp.add(new Employee(25,"Nani","Male",24,9478,"Ongole"));

		emp.add(new Employee(22,"Nani","Male",24,9478,"Ongole"));

		emp.add(new Employee(27,"Nani","Male",24,9478,"Ongole"));

		emp.add(new Employee(23,"Nani","Male",24,9478,"Ongole"));




		System.out.println("Before sort");
		
		emp.stream().forEach(System.out::println);
		
		System.out.println("After sort");
		
		Comparator<Employee> cityComparator = Comparator.comparing(Employee::getCity);
		
		Comparator<Employee> pincodeComparator = Comparator
                .comparing(Employee::getPincode);
		
		
		Comparator<Employee> ageComparator = Comparator
                .comparing(Employee::getAge);
		
		Comparator<Employee> genderComparator = Comparator
                .comparing(Employee::getGender);
		
		Comparator<Employee> idComparator = Comparator
                .comparing(Employee::getId);
		
		Comparator<Employee> multiComparator = cityComparator
				.thenComparing(pincodeComparator)
				.thenComparing(ageComparator)
				.thenComparing(genderComparator)
				.thenComparing(idComparator);

		 
		Collections.sort(emp, multiComparator);
		
		emp.forEach(System.out::println);

	    //System.out.println(emp);

		
		/*for(int i=0;i<emp.size();i++) {
		    System.out.println(emp.get(i));
		}*/
	}

}
