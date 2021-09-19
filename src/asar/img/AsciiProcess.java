package asar.img;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class AsciiProcess {
	
	private boolean xtMem = false;
	private String finalPrint = ""; 
	
	private BufferedImage image;
	private List<Pixel> pixels = new ArrayList<Pixel>();
	
	public AsciiProcess(BufferedImage image) {
		this.image = image;
	}
	
	public void process() {
		for(int i = 0; i < image.getHeight(); i++) {
			for(int j = 0; j < image.getWidth(); j++) {
				int color = image.getRGB(j, i);
				
				int b = color & 0xff;
				int g = (color & 0xff00) >> 8;
				int r = (color & 0xff0000) >> 16;
				
				Pixel pixel = new Pixel(r, g, b);
				
				System.out.print(pixel.getChar());
			}
			System.out.println();
		}
	}

}
