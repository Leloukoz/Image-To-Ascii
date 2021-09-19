package asar.img;

public class Pixel {
	
	public Pixel(int red, int green, int blue) {
		grayscale = (red + green + blue)/3;
	}
	
	private char[] characters = new char[]{'@', '%', '#', 'X', 'W', 'O', '1', 'I', ';', '*', '+', '=', '-', ':', ' ', '.'};
	
	private int grayscale;
	
	public int getGrayscale() {
		return grayscale;
	}
	
	public char getChar() {
		int layerLen = 255/characters.length; //shades per char
		int character = grayscale/layerLen - 1;
		
		if(character < 0) {
			character = 0;
		}
		
		if(character > characters.length - 1) {
			character = characters.length - 1;
		}
		
//		System.out.println(layerLen + "   " + character + "   " + (int)character);
		
		return characters[character];
	}
	
}
