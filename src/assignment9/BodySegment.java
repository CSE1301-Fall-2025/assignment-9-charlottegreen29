package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		this.x = x;
		this.y = y;
		this.size = size;
		
		//See ColorUtils for some color options (or choose your own)
		//I chose my own cuz I like the purple
		this.color = ColorUtils.snakePurple();
	}

	//I'm adding getters and setters for x and y because we will be updating them in other classes
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Draws the segment
	 */
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(x,y,size);
	}

	//I'm adding a method that finds the distance from the segment to a point
	// this is copypasted from the zombies assignment (assignment 8)
	public double distanceCenterToPoint(double xOther, double yOther) {
		double distance = Math.sqrt(Math.pow((xOther - this.x),2) + Math.pow((yOther - this.y),2));
		return distance;
	}
	
}
