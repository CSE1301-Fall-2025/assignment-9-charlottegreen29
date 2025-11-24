package assignment9;

import java.awt.Color;
import java.util.Random;

public class ColorUtils {
	
	public static Color solidColor() {
		Random r = new Random();
		return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}

	//this is the exact shade of purple of the snake in the google snake game
	public static Color snakePurple(){
		return new Color(120,81,169);
	}
	
	private static Color transparent(Color c) {
		int r = c.getRed();
		int g = c.getGreen();
		int b = c.getBlue();
		return new Color(r, g, b, 64);
	}
	
	public static Color transparentColor() {
		return transparent(solidColor());
	}
}
