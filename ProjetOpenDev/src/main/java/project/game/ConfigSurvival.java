package project.game;

import gameframework.drawing.GameCanvas;
import gameframework.drawing.GameCanvasDefaultImpl;
import gameframework.game.GameConfiguration;
import gameframework.game.GameUniverse;
import gameframework.game.GameUniverseDefaultImpl;

public class ConfigSurvival extends GameConfiguration {
	
	private final int nbRows = 40, nbColumn = 70;
	private final int spriteSize = 16;
	private final int defaultNbLives = 3;
	
	public int getNbRows() {
		return this.nbRows;
	}
	
	public int getNbColumns() {
		return this.nbColumn;
	}
	
	public int getSpriteSize() {
		return this.spriteSize;
	}
	
	public int getDefaultNbLives() {
		return this.defaultNbLives;
	}
	
	public GameCanvas createCanvas() {
		return new GameCanvasDefaultImpl();
	}
	
	public GameUniverse createUniverse() {
		return new GameUniverseDefaultImpl();
	}

}
