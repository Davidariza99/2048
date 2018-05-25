package Juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Tile {

	public static final int WIDTH = 100;
	public static final int HEIGHT = 100;
	public static final int SLIDE_SPEED = 15;
	public static final int ARC_WIDTH = 30;
	public static final int ARC_HEIGHT = 30;
	
	private int value;
	private BufferedImage tileimage;
	private Color background;
	private Color text;
	private Font font;
	private Point slideTo;
	private int x;
	private int y;
	
	private boolean beginningAnimation = true;
	private double scaleFirst = 0.1;
	private BufferedImage beginningImage;
	
	private boolean combineAnimation = false;
	private double scaleCombine = 1.2;
	private BufferedImage combineImage;
	private boolean canCombine = true;
	
	public Tile(int value, int x, int y) {
		this.value = value;
		this.x = x;
		this.y = y;
		slideTo = new Point(x, y);
		tileimage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
		beginningImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
		combineImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
		drawImage();
	}
	
	
	private void drawImage() {
		Graphics2D g = (Graphics2D)tileimage.getGraphics();
		if(value == 2) {
			background = new Color(0xe0e0e0);
			text = new Color(0Xb40404);
			
		}
		else if(value == 4){
			background = new Color(0xd0d0d0);
			text = new Color(0Xb40404);
			
		}
		else if(value == 8){
			background = new Color(0xbfbfbf);
			text = new Color(0Xb40404);
			
		}
		else if(value == 16){
			background = new Color(0xa9a9a9);
			text = new Color(0Xb40404);
			
		}
		else if(value == 32){
			background = new Color(0x848484);
			text = new Color(0Xb40404);
			
		}
		else if(value == 64){
			background = new Color(0x555555);
			text = new Color(0Xb40404);
			
		}
		else if(value == 128){
			background = new Color(0x444444);
			text = new Color(0Xb40404);
			
		}
		else if(value == 256){
			background = new Color(0x333333);
			text = new Color(0Xb40404);
			
		}
		else if(value == 512){
			background = new Color(0x222222);
			text = new Color(0Xb40404);
			
		}
		else if(value == 1024){
			background = new Color(0x111111);
			text = new Color(0Xb40404);
			
		}
		else if(value == 2048){
			background = new Color(0xffffff);
			text = new Color(0Xb40404);
			
		}else {
			background = Color.white;
			text = Color.black;
		}
		
		g.setColor(new Color(0, 0, 0, 0));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(background);
		g.fillRoundRect(0, 0, WIDTH, HEIGHT, ARC_WIDTH, ARC_HEIGHT);
		
		
		g.setColor(text);
		
		if(value <= 64) {
			font = Juego.main.deriveFont(36f);
			
		}else {
			font = Juego.main;
		
		}
		
		g.setFont(font);
		
		int drawX = WIDTH / 2 - DrawUtils.getMessageWidth("" + value, font, g) / 2;
		int drawY = HEIGHT / 2 + DrawUtils.getMessageHeight("" + value, font, g) / 2;
		g.drawString("" + value, drawX, drawY);
		g.dispose();
		
	}
	
	public void update() {
		if(beginningAnimation) {
			AffineTransform transform = new AffineTransform();
			transform.translate(WIDTH / 2 - scaleFirst * WIDTH / 2, HEIGHT / 2 - scaleFirst * HEIGHT / 2);
			transform.scale(scaleFirst, scaleFirst);
			Graphics2D g2d = (Graphics2D) beginningImage.getGraphics();
			g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			g2d.setColor(new Color(0, 0, 0, 0));
			g2d.fillRect(0, 0, WIDTH, HEIGHT);
			g2d.drawImage(tileimage, transform, null);
			scaleFirst += 0.05;
			g2d.dispose();
			if(scaleFirst >= 1)
				beginningAnimation = false;	
		}
		else if(combineAnimation){
			AffineTransform transform = new AffineTransform();
			transform.translate(WIDTH / 2 - scaleCombine * WIDTH / 2, HEIGHT / 2 - scaleCombine * HEIGHT / 2);
			transform.scale(scaleCombine, scaleCombine);
			Graphics2D g2d = (Graphics2D) combineImage.getGraphics();
			g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			g2d.setColor(new Color(0, 0, 0, 0));
			g2d.fillRect(0, 0, WIDTH, HEIGHT);
			g2d.drawImage(tileimage, transform, null);
			scaleCombine += 0.05;
			g2d.dispose();
			if(scaleCombine >= 1)
				combineAnimation = false;
		}
	}
	
	public void render(Graphics2D g) {
		if(beginningAnimation) {
			g.drawImage(beginningImage, x, y, null);
		}
		else if(combineAnimation) {
			g.drawImage(combineImage, (int)(x + WIDTH / 2 - scaleCombine * WIDTH / 2), 
									  (int)(y + HEIGHT / 2 - scaleCombine * HEIGHT / 2), null);
		}else {
			g.drawImage(tileimage, x, y, null);
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
		drawImage();  
	}

	public boolean canCombine() {
		return canCombine;
	}


	public void setCanCombine(boolean canCombine) {
		this.canCombine = canCombine;
	}


	public Point getSlideTo() {
		return slideTo;
	}


	public void setSlideTo(Point slideTo) {
		this.slideTo = slideTo;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public boolean isCombineAnimation() {
		return combineAnimation;
	}


	public void setCombineAnimation(boolean combineAnimation) {
		this.combineAnimation = combineAnimation;
		if(combineAnimation) scaleCombine = 1.2;
	}
}











