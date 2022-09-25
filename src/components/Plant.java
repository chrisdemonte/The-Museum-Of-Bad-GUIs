package components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Plant extends ImageView{

	public Plant(double x, double y) {
		this.setImage(new Image("/assets/decorations/potted_plant.png"));
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.setFitWidth(Museum.WIDTH * .25);
		this.setFitHeight(Museum.HEIGHT * .5);
		//Museum.CONTAINER.getChildren().add(this);
	}
}
