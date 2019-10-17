package com.Exercise12OOP.model;

public abstract class Shape implements Shapeable {

	@Override
	public String Draw() {
		// TODO Auto-generated method stub
		return "Figure is begin Draw";
	}

	@Override
	public String ChangeColor() {
		// TODO Auto-generated method stub
		return "Figure is begin Change it's Color";
	}

	@Override
	public String Erase() {
		// TODO Auto-generated method stub
		return "Figure is begin Erase";
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}


}
