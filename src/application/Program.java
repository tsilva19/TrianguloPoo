package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//double xA, xB, xC, yA, yB, yC;
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre the measures of triangule X: ");
		x.a = sc.nextDouble();
		x.b  = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre the measures of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Tringulo Area de X: %.4f%n ", areaX);
		
		System.out.printf("Tringulo Area de Y: %.4f%n ", areaY);
		
		if (areaX > areaY) {
			System.out.println("Area maior : X ");
		}
		else {
			System.out.println("Area maiot : Y");
		}
		
		
		sc.close();
	}

}
