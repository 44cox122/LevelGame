package levelPieces;
import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

public class Door extends GamePiece implements Drawable{

	public Door() {
		super('D', GameEngine.BOARD_SIZE - 1);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == super.getLocation()) {
			return InteractionResult.ADVANCE;
		}
		else {
			return InteractionResult.NONE;
			
		}
	}
	public void draw() {
		System.out.print("D");
	}
}
