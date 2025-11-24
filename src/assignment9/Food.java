package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	
	/**
	 * Creates a new Food at a random location
	 */

	//the "random" location is either 0.5, 1.5, ... 9.5
	//this is also helpful because it means that no two apples will be overlapping
	public Food() {
		this.x=(Math.random()*0.9+0.05);
		this.y=(Math.random()*0.9+0.05);
	}

	//I added getters so the snake can know if it's touching the food

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		Color appleColor = new Color(171, 24, 24);
		StdDraw.setPenColor(appleColor); //it has to be red cuz it's an apple
		StdDraw.filledCircle(x,y,FOOD_SIZE);
	}
	
}
