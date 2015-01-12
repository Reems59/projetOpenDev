package project.game;

import java.awt.Point;

import javax.swing.text.Position;

import gameframework.drawing.DrawableImage;
import gameframework.drawing.SpriteManagerDefaultImpl;
import gameframework.game.GameData;
import gameframework.game.GameLevelDefaultImpl;
import project.drawing.BoardSurvival;

public class Level1 extends GameLevelDefaultImpl {

	public Level1(GameData data) {
		super(data);
	}

	protected void init() {
		this.universe = this.data.getUniverse();
		this.gameBoard = new BoardSurvival(this.data);
		this.loadEntities();
	}
	
	private void loadEntities() {
		test t = new test(this.data.getCanvas());
		
		this.universe.addGameEntity(t);
		this.universe.allOneStepMoves();
		//this.universe.addGameEntity(new Player(this.data.getCanvas(),"/mariosprite.jpg"));
		
		
	}
	
}
