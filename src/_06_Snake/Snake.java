package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 25;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		// 1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		// 2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		// 1. use a switch statement to check on the currentDirection
		// of the snake and calculate its next x and y position.
		int headX = 0;
		int headY = 0;
		switch (currentDirection) {
		case UP:
			headX = getHeadLocation().x;
			headY = getHeadLocation().y - 1;

			break;
		case DOWN:
			headX = getHeadLocation().x;
			headY = getHeadLocation().y + 1;

			break;
		case LEFT:
			headX = getHeadLocation().x - 1;
			headY = getHeadLocation().y;

			break;
		case RIGHT:
			headX = getHeadLocation().x + 1;
			headY = getHeadLocation().y;

			break;
		}

		// 2. Iterate through the SnakeSegments in reverse order
		// 2a. Update each snake segment to the location of the segment
		// in front of it.
		for (int i = snake.size() - 1; i > 0; i--) {
			snake.get(i).setLocation(snake.get(i - 1).getLocation());
			snake.get(0).setLocation(head.getLocation());
		}

		// 3. set the location of the head to the new location calculated in step 1
		head.setLocation(new Location(headX, headY));
		// 4. set canMove to true
		canMove = true;
	}

	public void setDirection(Direction d) {
		// 1. set the current direction equal to the passed in Direction only if canMove
		// is true.
		// set canMove equal to false.
		// make sure the snake cannot completely reverse directions.
		if (canMove == true) {

			if (d == Direction.UP) {
				canMove = true;
				currentDirection = d;
			} else if (d == Direction.DOWN) {
				canMove = true;
				currentDirection = d;
			} else if (d == Direction.LEFT) {
				canMove = true;
				currentDirection = d;
			} else if (d == Direction.RIGHT) {
				canMove = true;
				currentDirection = d;
			}
		}
		canMove = false;

	}

	public void reset(Location loc) {
		// 1. clear the snake
		snake.clear();
		// 2. set the location of the head
		loc = new Location(6, 7);
		head.setLocation(loc);
		// 3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		// 1. complete the method so it returns true if the head of the snake is outsize
		// of the window
		// and false otherwise
		System.out.println(head.getLocation().x + ", " + head.getLocation().y);
		if (head.getLocation().x > 77 || head.getLocation().y > 38 || head.getLocation().x < 0 || head.getLocation().y < 0) {
			return true;
		}
		return false;
	}

	public boolean isHeadCollidingWithBody() {
		// 1. complete the method so it returns true if the head is located
		// in the same location as any other body segment
		
		//System.out.println("Snake size: " + snake.size());
		for (int j = 1; j < snake.size(); j++) {
			if (head.getLocation().equals(snake.get(j).getLocation())) {
				return true;
			}
		}

		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		// 1. complete the method so it returns true if the passed in
		// location is located on the snake
		for (int i = 0; i < snake.size(); i++) {
			if (loc == head.getLocation()) {
				return true;
			}
		}

		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
