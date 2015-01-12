package project.game;


import java.awt.Graphics;
import gameframework.drawing.Drawable;
import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.game.GameEntity;




public class Player  implements  Drawable,GameEntity  {
	
	private DrawableImage image;
	
	public Player(GameCanvas canvas, String name) {
		this.image = new DrawableImage(name, canvas);
	}

	public void draw(Graphics g) {
		this.image.draw(g);
	}




}
