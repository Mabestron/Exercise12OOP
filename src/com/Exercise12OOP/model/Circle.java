package com.Exercise12OOP.model;
import java.lang.Math;

public class Circle extends Shape {
	
	private double radio;
	
	//Constructor vacio
	public Circle()
	{
		
	}
	
	
	//Constructor parametrizado
	public Circle(double radio)
	{
		this.radio=radio;
	}
	
	
	///Funtions to calculate area and perimeter
	public double CalculateArea(double radio)
	{
		return Math.pow(Math.PI*radio, 2);
	}
	
	public double CalculatePerimeter(double radio)
	{
		return (2*Math.PI)*radio;
	}
	
	
	//getters and setters
	public double getRadio()
	{
		return radio;
	}
	
	public void setRadio(double radio)
	{
		this.radio=radio;
	}


	@Override
	public void DoSomething() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
