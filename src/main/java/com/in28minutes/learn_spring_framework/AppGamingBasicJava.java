package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacMan;
import com.in28minutes.learn_spring_framework.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContra();
		var game = new PacMan(); //Object Creation
		var gameRunner = new GameRunner(game);
		//Object Creation + Wiring the dependency
		// game is dependency of gameRunner
		gameRunner.run();

	}

}
