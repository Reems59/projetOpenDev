package project.game;

import gameframework.base.ObservableValue;
import gameframework.game.Game;
import gameframework.game.GameConfiguration;
import gameframework.game.GameData;
import gameframework.gui.GameWindow;
import gameframework.motion.MoveStrategyKeyboard;


/* Contient le jeu, les données, la config */
public class Survival {
	
	private Game game;
	private GameData data;
	private GameConfiguration config;
	private GameWindow window;
	
	public Survival() {
		this.config = new ConfigSurvival();
		this.data = new GameData(this.config);
		this.window = new GameWindow(this.data.getCanvas(),this.config,this.data.getLife(),this.data.getScore());
		this.game = new GameSurvival(this.data);
		this.data.getCanvas().addKeyListener(new MoveStrategyKeyboard());
		
	}
	
	public void start() {
		this.window.createGUI();
		this.game.start();
	}

}
