package lab5;

import java.util.Scanner;

import test.Job;

public class Employee {

	public String name; 
	public int id;
	public int age;
	public double Salary;
	public Boolean Merried;
	public String job;
 public Employee(int id ,String name,double Salary, String job) {
	  this.id = id;
      this.name = name;
      this.Salary = Salary;
      this.job = job;


 }

public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public byte getSalary(byte Salary) {
     return Salary;
 }

 public void setSalary(byte Salary) {
     this.Salary = Salary;
 }

 public String getJob() {
     return job;
 }

 public void setJob(String job) {
     this.job = job;
 }

}


