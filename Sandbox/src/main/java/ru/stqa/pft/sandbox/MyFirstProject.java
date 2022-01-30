package ru.stqa.pft.sandbox;

public class MyFirstProject {
	
	public static void main (String[] args) {

		Point p1 = new Point(2, 3);

		Point p2 = new Point(5, 7);

		double distance = p1.distance(p2);
		System.out.println ("Distance between points x1 = " + p1.x + " y1 = " + p1.y + " and x2 = "+ p2.x + " y2 = "+p2.y+ " = " + distance);
	}
}
