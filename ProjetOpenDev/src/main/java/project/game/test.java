package project.game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import gameframework.base.ObjectWithBoundedBox;
import gameframework.drawing.Drawable;
import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.drawing.SpriteManagerDefaultImpl;
import gameframework.game.GameEntity;
import gameframework.motion.GameMovable;

public class test extends GameMovable implements Drawable, GameEntity{
	SpriteManagerDefaultImpl d;
	DrawableImage di;
	public test(GameCanvas c){
		di=new DrawableImage("/mariosprite.jpg",c);
		d=new SpriteManagerDefaultImpl(di, 10, 20);
	}
	@Override
	public Rectangle getBoundingBox() {
		// TODO Auto-generated method stub
		return new Rectangle(new Rectangle(new Dimension(150, 257)));
	}

	@Override
	public void draw(Graphics g) {
		d.draw(g, new Point(70, 70));
		
	}

	@Override
	public void oneStepMoveAddedBehavior() {
		// TODO Auto-generated method stub
		
	}
	

}
