package components;

import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LittleGuy {
	
	public ImageView imageView;
	public long animationTimer;
	public long animationSpeed;
	public long lastUpdate;
	public int frame;
	public int numFrames;
	public int direction; //0 = up, 1 = left, 2 = right
	public int moving; //0= false, 1 = true
	public Image[][] images;
	public LittleGuy() {
		
		frame = 0;
		numFrames = 4;
		direction = 0;
		moving = 0;
		
		animationSpeed = 500000l;
		lastUpdate = System.nanoTime();
		animationTimer = lastUpdate;
		
		imageView = new ImageView();
		
		images = new Image[3][4];
		images[0][0] = new Image("/assets/little_guy_images/sprite_sheet_sliced_07.gif");
		images[0][1] = images[0][0];
		images[0][2] = images[0][0];
		images[0][3] = images[0][0];
		
		images[1][0] = new Image("/assets/little_guy_images/sprite_sheet_sliced_12.gif");
		images[1][1] = new Image("/assets/little_guy_images/sprite_sheet_sliced_13.gif");
		images[1][2] = new Image("/assets/little_guy_images/sprite_sheet_sliced_14.gif");
		images[1][3] = new Image("/assets/little_guy_images/sprite_sheet_sliced_15.gif");
		
		images[2][0] = new Image("/assets/little_guy_images/sprite_sheet_sliced_17.gif");
		images[2][1] = new Image("/assets/little_guy_images/sprite_sheet_sliced_18.gif");
		images[2][2] = new Image("/assets/little_guy_images/sprite_sheet_sliced_19.gif");
		images[2][3] = new Image("/assets/little_guy_images/sprite_sheet_sliced_20.png");
		
		imageView.setImage(images[0][0]);
		imageView.setFitWidth(200.0);
		imageView.setFitHeight(250.0);
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run(){
			Museum.LITTLE_GUY.update();
		}}, 0, 170);
		
	}
	
	public void update() {
		animationTimer = System.nanoTime();
		if (animationTimer - lastUpdate > animationSpeed) {
			frame = (frame + 1) % numFrames;
			lastUpdate = animationTimer;
			imageView.setImage(images[direction][frame]);
		}
	}

}
