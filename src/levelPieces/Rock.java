package levelPieces;

import gameEngine.Drawable;

public class Rock implements Drawable{

	public Rock() {
		super();
	}

	@Override
	public void draw() {
		System.out.print("R");
	}

}
