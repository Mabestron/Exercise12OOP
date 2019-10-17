package com.Exercise12OOP.app;
import com.Exercise12OOP.model.Square;
import com.Exercise12OOP.model.Circle;
import com.Exercise12OOP.model.Triangle;
import java.util.Scanner;

public class Shapeapp 
{

	public static void main(String[] args)
	{
		double radio=0;
		//Consntruccion de objeto SIN parametrizar
		Square square1= new Square();
		Circle circle1= new Circle();
		Triangle triangle1= new Triangle();
		
		
		///Construccion de objeto parametrizado
		Square square2 =new Square(10.2);
		Circle circle2= new Circle(5.3);
		Triangle triangle2= new Triangle(7.3,8.9);
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Imput the radio of the circle: ");
		radio=input.nextDouble();
		
		//Se guarda el valor introducido por el usuario usando el set creado en el model de circle
		//ya que no se parametrizó
		circle1.setRadio(radio);
		
		//Se muestra el valor del circulo mandando a llamar las funciones creadas en el model de circle
		System.out.println("El área del circulo es: "+circle1.CalculateArea(circle1.getRadio()));
		
		
	}

}
