package components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bench extends ImageView{

	public Bench(double x, double y) {
		this.setImage(new Image("/assets/decorations/bench.png"));
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.setFitWidth(Museum.WIDTH * .4);
		this.setFitHeight(Museum.HEIGHT * .3);
		//Museum.CONTAINER.getChildren().add(this);
	}
}
