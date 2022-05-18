package ru.stqa.parttwo.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args){
		
	hello("world");
	hello("User");
	hello("Kostya");
	//первая функция
	double l = 4;
	System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
	//вторая функция
	double a = 3;
	double b = 5;
	System.out.println("Площадь прямоугольника со сторонами " + a + " и  " + b +" = " + area(a,b));

	}
	public static void hello(String somebody){
		System.out.println("Hi," + somebody);

	}
	public static double area(double len){
		return len*len;
	}
	public static double area(double a,double b){
		return a * b;
	}
}