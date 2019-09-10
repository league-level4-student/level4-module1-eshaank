 package _06_Snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class _00_SnakeGame implements ActionListener, KeyListener {
	public static final Color BORDER_COLOR = Color.WHITE;
	public static final Color BACKGROUND_COLOR = Color.BLACK;
	public static final Color FOOD_COLOR = Color.RED;
	public static final int WIDTH = 1;
	public static final int HEIGHT = 1;
	public static final int WINDOW_SCALE = 1400;
	public static final int WINDOW_WIDTH = WINDOW_SCALE * WIDTH;
	public static final int WINDOW_HEIGHT = WINDOW_SCALE * HEIGHT;

	private JFrame window;
	private JPanel panel;

	private Snake snake;

	private Timer timer;

	private Location foodLocation;

	public _00_SnakeGame() {
		snake = new Snake(new Location(WIDTH / 2, HEIGHT / 2));

		window = new JFrame("Snake");
		panel = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;

				g2.setColor(BACKGROUND_COLOR);
				g2.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

				g2.setColor(FOOD_COLOR);
				g2.drawOval(foodLocation.x * 25, foodLocation.y * 25, Snake.BODY_SIZE,
						Snake.BODY_SIZE);
				snake.draw(g);
			}
		};

		panel.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		window.add(panel);

		timer = new Timer(0, this);

		window.pack();
		window.addKeyListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

		setFoodLocation();
//##eshaan sucks
		startGame();
	}

	public void startGame() {
		String instructions = "";

		String[] options = new String[] { "Expert", "Moderate", "Beginner" };
		int input = JOptionPane.showOptionDialog(null, instructions, "Snake", 0, -1, null, options, 0);

		String choice = options[input];

		switch (choice) {
		case "Expert":
			timer.setDelay(45);
			break;
		case "Moderate":
			timer.setDelay(90);
			break;
		case "Beginner":
			timer.setDelay(135);
			break;
		}

		timer.start();
	}

	public static void main(String[] args) {
		new _00_SnakeGame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		case 38:
			snake.setDirection(Direction.UP);
			break;
		case 40:
			snake.setDirection(Direction.DOWN);
			break;
		case 37:
			snake.setDirection(Direction.LEFT);
			break;
		case 39:
			snake.setDirection(Direction.RIGHT);
			break;
		case 32:
			snake.feed();
			break;
		}


	}

	private void setFoodLocation() {
		Random x1 = new Random();
		int x = x1.nextInt(10);
		Random y1 = new Random();
		int y = y1.nextInt(10);

		System.out.println(x + ", " + y);
		
		Location loc = new Location(x, y);
		
		
		
		if (snake.isLocationOnSnake(snake.getHeadLocation())) {
			x += 15;
			y += 10;
			foodLocation = loc;
		}
		foodLocation = loc;
		
	}

	private void gameOver() {

		timer.stop();
		JOptionPane.showMessageDialog(null, "Your snake is dead.");
		String playAgain = JOptionPane.showInputDialog("Would you like to play again?");
		if (playAgain.equalsIgnoreCase("yes")) {
			snake.reset(snake.getHeadLocation());
			setFoodLocation();
			timer.start();
		} else {
			System.exit(0);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
snake.update();
		
if (snake.isHeadCollidingWithBody() || snake.isOutOfBounds()) {
	gameOver();
}
		

if (snake.getHeadLocation().equals(foodLocation)) {
	snake.feed();
	setFoodLocation();
}
panel.repaint();

	}
}
