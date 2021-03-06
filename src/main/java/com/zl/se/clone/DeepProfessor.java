package com.zl.se.clone;

import java.io.Serializable;

public class DeepProfessor implements Cloneable,Serializable {
	 private String name;
	
	   private int age;
	
	   public String getName() {
	       return name;
	   }
	
	   public void setName(String name) {
	       this.name = name;
	   }
	
	   public int getAge() {
	       return age;
	   }
	
	   public void setAge(int age) {
	       this.age = age;
	   }
	   
	   @Override
	   public String toString() {
	       return "Professor [name=" + name + ", age=" + age + "]";
	   }
	
	   public Object clone() throws CloneNotSupportedException{
	       return super.clone();
	   }
	

}
