package components;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class YouMustSub extends Exhibit{

	public ImageView imageView;
	public YouMustSub(int index) {
		super(index, "You Must Subscribe", "You can't read the news until you pay for a subscription.");
		// TODO Auto-generated constructor stub
		imageView = new ImageView(new Image("/assets/must_sub/must_pay.png"));
		imageView.setFitWidth(this.width - 10);
		imageView.setFitHeight(this.height - 10);
		imageView.setLayoutX(5);
		imageView.setLayoutY(5);
		this.getChildren().add(imageView);
		EventHandler<MouseEvent> mouseEvent = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				eventUpdate();
				
			}
			
		};
		this.setOnMouseEntered(mouseEvent);
	}
	
	public void eventUpdate() {
		imageView.setImage(new Image("/assets/must_sub/must_paynow.png"));
	}
}
