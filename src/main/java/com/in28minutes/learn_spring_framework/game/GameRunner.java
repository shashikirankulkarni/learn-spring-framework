package com.in28minutes.learn_spring_framework.game;

import java.util.List;

public class GameRunner {

	//MarioGame game;
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game Mario");
		var test = List.of("SHashi","Kiran");
		
		System.out.println(test.getClass().getName());
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
