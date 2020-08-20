import java.awt.Color;

public class Ship extends Sprite {

	public Color[][] getColorGrid(){
		return Display.SHIP_SHAPE;
	}
	public Ship(int x, int y) {
		this.setxDot(x);
		this.setyDot(y);
	}
}
