package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.45, 0.3);
		//StdDraw.setPenColor(StdDraw.WHITE);
		//StdDraw.filledRectangle(0.2, 0.2, 0.5, 0.25);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(0.5, 0.5, 0.175);
	}
}