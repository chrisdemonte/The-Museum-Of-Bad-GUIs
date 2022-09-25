package components;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class TitleCards extends Pane{

	public Label name;
	public Label description;
	public TitleCards(String name, String description) {
		this.name = new Label(name);
		this.name.setMinSize(Museum.WIDTH * .2, Museum.HEIGHT * .1);
		this.name.setMaxWidth(Museum.WIDTH * .2);
		this.name.setLayoutY(Museum.HEIGHT * .3);
		this.name.setLayoutX(Museum.WIDTH * .1);
		this.name.setStyle("-fx-font-size: 20; -fx-font-weight: bold;-fx-background-color: white;"
				+ "-fx-effect: dropshadow(three-pass-box, derive(grey, -75%), 10, 0, 4, 4);\"\r\n"
				+ "-fx-border-color: darkgoldenrod;\\r\\n\"\r\n"
				+ " -fx-border-width: 5;\"");
		this.description = new Label(description);
		this.description.setMinSize(Museum.WIDTH * .3, Museum.HEIGHT * .1);
		this.description.setMaxWidth(Museum.WIDTH * .2);
		this.description.setLayoutY(Museum.HEIGHT * .3);
		this.description.setLayoutX(Museum.WIDTH * .05);
		this.description.setStyle("-fx-font-size: 20; -fx-font-weight: bold;-fx-background-color: white;"
				+ "-fx-effect: dropshadow(three-pass-box, derive(grey, -75%), 10, 0, 4, 4);"
				+ "-fx-border-color: darkgoldenrod;"
				+ " -fx-border-width: 5;\"");
		this.getChildren().addAll(this.name, this.description);
	}
}
