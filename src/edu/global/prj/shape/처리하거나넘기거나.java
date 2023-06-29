package edu.global.prj.shape;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class 처리하거나넘기거나 {

	public static void main(String[] args) {
		try {
			md();
		}
	catch(IOException e)
	e.printStackTrace();
	}
}

public static void md1() throws IOException
	Path fild = Paths.get()
	BufferedWriter writer = null;
	writer = Files.newBufferedWriter(file);
	writer.write('A');
	writer.write('z');
	
	if (writer != null)
		writer.close();
	
