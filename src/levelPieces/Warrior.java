package levelPieces;

import gameEngine.GameEngine;

import java.util.Random;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;



public class Warrior extends GamePiece implements Moveable,Drawable {
	Random rand = new Random();
	public int n = rand.nextInt(GameEngine.BOARD_SIZE); 
	
	
	public Warrior()  {
		super('W', 0);
		super.setLocation(n);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == super.getLocation()) {
			return InteractionResult.HIT;
		}
		else {
			return InteractionResult.NONE;
		}
		
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int j = rand.nextInt(6)-3;
		if(j>GameEngine.BOARD_SIZE) {j = j % GameEngine.BOARD_SIZE;}
		else if(j<0) {j = 0;}
		super.setLocation(j);		
	}
	public void draw() {
		System.out.print("W");
	}

}
