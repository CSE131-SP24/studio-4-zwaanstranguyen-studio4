package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		int c1 = in.nextInt();
		int c2 = in.nextInt();
		int c3 = in.nextInt();
		
		String tf = in.next();
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(c1, c2, c3);
		if (shape == "rectangle") {
			if(tf == "true") {
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);}
			if(tf == "false") {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);}

			}
	}
}
