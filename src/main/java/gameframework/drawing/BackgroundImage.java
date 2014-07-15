package gameframework.drawing;

import java.awt.Canvas;
import java.awt.Graphics;
import java.net.URL;

public class BackgroundImage extends DrawableImage {

	public BackgroundImage(URL url, Canvas canvas) {
		super(url, canvas);
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(image, 0, 0, canvas.getWidth(), canvas.getHeight(), canvas);
	}
}