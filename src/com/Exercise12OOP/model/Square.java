package com.Exercise12OOP.model;

public class Square extends Shape {
	private double side;
	
	//Constructor vacio
	public Square()
	{
		
	}
	
	//Constructor parametrizado
	public Square (double side)
	{
		this.side=side;
	}
	
	
	///Funtions to calculate area and perimeter
	public double CalculateArea(double side)
	{
		return side*side;
	}
	
	public double CalculatePerimeter(double side)
	{
		return side*4;
	}
	
	
	//getters and setters
	public double getRadio()
	{
		return side;
	}
	
	public void setRadio(double side)
	{
		this.side=side;
	}
	
	
}
