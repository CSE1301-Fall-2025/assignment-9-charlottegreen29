package assignment9;

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color; //I found that this is the color library to make new colors

public class Game {

	private Food food;
	private Snake snake;
	private Color backgroundGreen = new Color(110, 219, 122);
	
	public Game() {
		this.food = new Food();
		this.snake = new Snake();

		StdDraw.enableDoubleBuffering(); //I'm leaving this here because it came with the code
		
	}
	
	public void play() {
		while (snake.isInBounds()) {
			int dir = getKeypress();
			this.snake.changeDirection(dir);

			//Keeping the line below for testing purposes until I'm sure my code works
			System.out.println("Keypress: " + dir);

			this.snake.move();

			if (this.snake.eatFood(this.food)){
				food = new Food();
			}

			this.updateDrawing();
			
			/*
			 * 1. Pass direction to your snake
			 * 2. Tell the snake to move
			 * 3. If the food has been eaten, make a new one
			 * 4. Update the drawing
			 */
		}
	}
	
	private int getKeypress() {
		if(StdDraw.isKeyPressed(KeyEvent.VK_W)) {
			return 1;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			return 2;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
			return 3;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			return 4;
		} else {
			return -1;
		}
	}
	
	/**
	 * Clears the screen, draws the snake and food, pauses, and shows the content
	 */
	private void updateDrawing() {
		/*
		 * 1. Clear screen
		 * 2. Draw snake and food
		 * 3. Pause (50 ms is good)
		 * 4. Show
		 */

		StdDraw.clear(backgroundGreen);
		snake.draw();
		food.draw();
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.5,0.9,"Snake length: " + snake.numSegments());
		StdDraw.pause(50);
		StdDraw.show();
		
	}
	
	public static void main(String[] args) {
		Game g = new Game();
		g.play();
	}
}
