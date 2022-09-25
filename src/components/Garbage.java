package components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Garbage extends ImageView{

	public Garbage(double x, double y) {
		this.setImage(new Image("/assets/decorations/waste_basket.png"));
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.setFitWidth(Museum.WIDTH * .15);
		this.setFitHeight(Museum.HEIGHT * .3);
		//Museum.CONTAINER.getChildren().add(this);
	}
}
