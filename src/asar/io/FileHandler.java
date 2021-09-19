package asar.io;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class FileHandler {
	
	public static BufferedImage loadBufferedImage(String path) {
		BufferedImage image = null;
		
		try {
			
			image = ImageIO.read(new File(path));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return image;
	}

}
