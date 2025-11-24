package assignment9;

import java.util.LinkedList;

public class Snake {

	private static final double SEGMENT_SIZE = 0.02;
	private static final double MOVEMENT_SIZE = SEGMENT_SIZE * 1.5;
	private LinkedList<BodySegment> segments;
	private double deltaX;
	private double deltaY;
	
	public Snake() {
		deltaX = 0;
		deltaY = 0;

		//I created the segments list and added the initial segment to it.
		segments = new LinkedList<>();
		BodySegment firstSegment = new BodySegment(4.5,4.5,SEGMENT_SIZE);
		segments.add(firstSegment);
	}
	
	public void changeDirection(int direction) {
		if(direction == 1) { //up
			deltaY = MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 2) { //down
			deltaY = -MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 3) { //left
			deltaY = 0;
			deltaX = -MOVEMENT_SIZE;
		} else if (direction == 4) { //right
			deltaY = 0;
			deltaX = MOVEMENT_SIZE;
		}
	}
	
	/**
	 * Moves the snake by updating the position of each of the segments
	 * based on the current direction of travel
	 */
	public void move() {
		//this code changes the poisition of just the head of the snake
		double newX = segments.getFirst().getX() + deltaX;
		double newY = segments.getFirst().getY() + deltaY;
		BodySegment newHead = new BodySegment(newX, newY, SEGMENT_SIZE);
		segments.add(0, newHead);
	}
	
	/**
	 * Draws the snake by drawing each segment
	 */
	public void draw() {
		for (BodySegment segment : segments){
			segment.draw();
		}
	}
	
	/**
	 * The snake attempts to eat the given food, growing if it does so successfully
	 * @param f the food to be eaten
	 * @return true if the snake successfully ate the food
	 */
	public boolean eatFood(Food f) {
		//FIXME
		return false;
	}
	
	/**
	 * Returns true if the head of the snake is in bounds
	 * @return whether or not the head is in the bounds of the window
	 */
	public boolean isInBounds() {
		if (segments.getFirst().getX()>0.0 && segments.getFirst().getX()<1.0){ //checks x bounds
			if (segments.getFirst().getY()>0.0 && segments.getFirst().getY()<1.0){ //checks y bounds
				return true;
			}
		}
		return false;
	}
}
