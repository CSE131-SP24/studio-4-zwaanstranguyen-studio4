package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class star {

	public static void main(String[] args) {
		double [] x = {0.25, 0.43, 0.5, 0.57,0.75, 0.62, 0.7, 0.5, 0.3,0.38};
		double [] y = {0.6, 0.6, 0.75, 0.6, 0.6, 0.47, 0.33, 0.4, 0.33, 0.47};
		
		StdDraw.setPenRadius(0.005);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.3);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		
		StdDraw.filledPolygon(x, y);
		
		
	}
}
