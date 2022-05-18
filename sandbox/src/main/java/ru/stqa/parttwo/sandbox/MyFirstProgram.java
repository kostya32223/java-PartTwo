package ru.stqa.parttwo.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args){
		//Задание: расстояние между точками
		Point p = new Point(4.2,2,6,4);
		System.out.println("расстояние междуточками =" + p.distance());


		//первая функция
	Square s = new Square(4);
	System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
	//вторая функция
	Rectangle r = new Rectangle(3,5);
	System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b +" = " + r.area());

	}


}