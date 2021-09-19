package asar.main;

import asar.img.AsciiProcess;
import asar.io.FileHandler;

public class Init {
	
	public Init() {
		printImage("File Name.png");
	}

	public static void main(String[] args) {
		new Init();
	}
	
	private void printImage(String path) {
		AsciiProcess ap = new AsciiProcess(FileHandler.loadBufferedImage(path));
		ap.process();
	}
	
}
