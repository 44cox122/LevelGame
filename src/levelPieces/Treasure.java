package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;


public class Treasure extends GamePiece  implements Moveable, Drawable {
	public int j = GameEngine.BOARD_SIZE / 3 ;
	public Treasure() {
		super('T', 1);
		super.setLocation(j);
		
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == super.getLocation()) {
			return InteractionResult.GET_POINT;
		}
		else {
			return InteractionResult.NONE;
			
		}
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		j++;
		if(j>GameEngine.BOARD_SIZE) {j = j % GameEngine.BOARD_SIZE;}
		else if(j<0) {j = 0;}
		super.setLocation(j);
	}
	public void draw() {
		System.out.print("T");
	}
	
}
