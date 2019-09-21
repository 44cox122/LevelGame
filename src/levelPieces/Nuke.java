package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Nuke extends GamePiece implements Drawable{

	public Nuke() {
		super('N', 8);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(super.getLocation() >= playerLocation - 2 && super.getLocation() <= playerLocation + 2 ) {
			return InteractionResult.NUKED;
		}
		else {
			return InteractionResult.NONE;
		}
	}
	public void draw() {
		System.out.print("N");
	}

}
