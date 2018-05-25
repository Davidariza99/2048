package Juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Juego extends JPanel implements KeyListener, Runnable {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 600;
	public static final Font main = new Font("Bebas Neue Regular", Font.PLAIN, 28);
	private Thread juego;
	private boolean running;
	private BufferedImage Image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	private GameBoard board;
	
	private long startTime;
	private long elapsed;
	private boolean set;
	
	public Juego() {
		setFocusable(true);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		addKeyListener(this);
		
		board = new GameBoard(WIDTH / 2 - GameBoard.BOARD_WIDTH / 2, HEIGHT - GameBoard.BOARD_HEIGHT - 10);
	}
	
	private void update() {
		board.update();
		Keyboard.update();
	}
	
	private void render() {
		Graphics2D g = (Graphics2D) Image.getGraphics();
		g.setColor(Color.black);
		g.fillRect(0,0, WIDTH, HEIGHT);
		board.render(g);
		g.dispose();
		
		Graphics2D g2d = (Graphics2D) getGraphics();
		g2d.drawImage(Image, 0, 0, null);
		g2d.dispose();
		
	}
	@Override
	public void run() {
		int fps = 0, update = 0;
		long fpsTimer = System.currentTimeMillis();
		double nsPerUpdate = 1000000000.0/60;
		
		//last update in nanoseconds
		double then = System.nanoTime();
		double unprocessed = 0;
		
		while(running) {
		
		boolean shouldRender = false;
		double now = System.nanoTime();
		unprocessed += (now - then) / nsPerUpdate;
		then = now;
			
		//update queue
			while(unprocessed >= 1) {
				update++;
				update();
				unprocessed--;
				shouldRender = true;
			}
		
		//Rendering
			if(shouldRender){
				fps++;
				render();
				shouldRender = false;
			}else {
				try {
					Thread.sleep(1);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		//FPS Timer
		if(System.currentTimeMillis() - fpsTimer > 100) {
			System.out.printf("%d fps %d updates", fps, update);
			System.out.println();
			fps = 0;
			update = 0;
			fpsTimer += 1000;
			
		}
	
	}

	public synchronized void start() {
		if(running) return;
		running = true;
		juego = new Thread(this, "juego");
		juego.start();
	}
	
	public synchronized void stop() {
		if(!running) return;
		running = false;
		System.exit(0);
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		Keyboard.keyPressed(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Keyboard.keyReleased(e);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
