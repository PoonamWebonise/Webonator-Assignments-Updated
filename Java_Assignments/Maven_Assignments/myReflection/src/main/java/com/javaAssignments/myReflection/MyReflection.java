package com.javaAssignments.myReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class MyReflection {

	public static void main(String[] args) {
		
		Class <?> c=Demo.class;
		Method[] allMethods=c.getDeclaredMethods();
		for(Method eachMethod: allMethods)
		{
			System.out.println("method: "+eachMethod.getName());
		}

		Field[] allFields=c.getDeclaredFields();
		for(Field eachField: allFields)
		{
			System.out.println("variables: "+eachField.getName());
		}
		
		Constructor<?> allCons[]= c.getDeclaredConstructors();
		for(Constructor eachCons: allCons)
		{
			System.out.println("constructors: "+eachCons.getName());
		}
	}

}

class Demo {
	
	int a;
	String b;
	double c;
	
	Demo() {
		
	}
	Demo(int a){
		
	}
	void print(){
	
	}
	
	void getValues(int a){
		
	}
	
	void getName(int x, int y){
		
	}
}