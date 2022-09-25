package components;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class AdvertisementHell extends Exhibit{

	public ImageView bottom;
	public boolean played;
	public ImageView right;
	public ImageView animated;
	public Label content;
	
	public AdvertisementHell(int index) {
		super(index, "Advertisement Hell", "You know the owners care more about add revenue than the content.");
		// TODO Auto-generated constructor stub
		bottom = new ImageView(new Image("/assets/advertisements/Advertisement_01.png"));
		bottom.setFitWidth(this.width * .9);
		bottom.setFitHeight(this.height * .12);
		bottom.setLayoutY((this.height * .88) - 5);
		bottom.setLayoutX(this.width * .05);
		right = new ImageView(new Image("/assets/advertisements/Advertisement_03.png"));
		right.setFitWidth(this.width * .25);
		right.setFitHeight((this.height * .88) - 10);
		right.setLayoutX(this.width * .7);
		right.setLayoutY(5);
		animated = new ImageView(new Image("/assets/advertisements/Advertisement_02.png"));
		animated.setFitHeight(0);
		animated.setFitWidth(this.width * .66);
		animated.setLayoutX(15);
		animated.setLayoutY(5);
		animated.setVisible(false);
		String text = new String("On Windows 10, the ability to determine the technical specifications of your computer can come in handy in many situations. It can be helpful to determine whether the device meets the requirements to install an application or upgrade to a new version. If the desktop or laptop isn't working, the specs can help troubleshoot the problem. Or, when you notice the computer slowing down over time, you can check the hardware specifications to confirm whether you have to upgrade a component or it's time to get a new machine.\r\n"
				+ "\r\n"
				+ "Whatever the reason it might be, Windows 10 has many ways to check the device specs (such as CPU, RAM, motherboard, video card, Basic Input/Output System (BIOS) or Unified Extensible Firmware Interface (UEFI), device model number, drivers, updates details, and Windows version), using desktop utilities or command tools. The only caveat is that the properties available could be slightly different depending on the method.\r\n"
				+ "\r\n"
				+ "In this Windows 10 guide, we will walk you through the steps to check your device's complete hardware and software specifications.");
		content = new Label(text);
		content.setWrapText(true);
		content.setTextOverrun(OverrunStyle.CLIP);
		content.setMinSize(this.width * .6, this.height * .8);
		content.setMaxSize(this.width * .6, this.height * .8);
		content.setLayoutX(this.width * .05);
		content.setLayoutY(10);
		played = false;
		
		this.getChildren().addAll(content, bottom, right, animated);
		
		EventHandler<MouseEvent> mouseEvent = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				eventUpdate();
				
			}
			
		};
		this.setOnMouseEntered(mouseEvent);
	}
	
	public void eventUpdate() {
		content.setMinSize(this.width * .6, this.height * .15);
		content.setMaxSize(this.width * .6, this.height * .15);
		content.setLayoutX(this.width * .05);
		content.setLayoutY(this.height * .65 + 10);
		if (played == false) {
			animated.setVisible(true);
			played = true;
		    Timeline timeline = new Timeline();
		        
		    timeline.getKeyFrames().addAll(
		                    new KeyFrame(Duration.ZERO, // set start position at 0
		                    new KeyValue(animated.fitHeightProperty(), 0),
		                    new KeyValue(animated.fitHeightProperty(), 0)),
		                    new KeyFrame(new Duration(1000), // set end position at 40s
				            new KeyValue(animated.fitHeightProperty(), this.height * .66),
				            new KeyValue(animated.fitHeightProperty(), this.height * .66)));
		    
		        // play 40s of animation
		    timeline.play();
		}
		
	}

}
