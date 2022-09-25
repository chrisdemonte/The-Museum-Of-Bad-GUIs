package components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class TitleCards extends Pane{

	public Label name;
	public Label description;
	public TitleCards(String name, String description) {
		this.name = new Label(name);
		this.name.setMinSize(Museum.WIDTH * .175, Museum.HEIGHT * .1);
		this.name.setMaxWidth(Museum.WIDTH * .175);
		this.name.setLayoutY(Museum.HEIGHT * .28);
		this.name.setLayoutX(Museum.WIDTH * .05);
		this.name.setWrapText(true);
		this.name.setAlignment(Pos.BASELINE_CENTER);
		this.name.setStyle("-fx-font-size: 16; -fx-font-weight: bold;-fx-background-color: white;"
				+ "-fx-effect: dropshadow(three-pass-box, derive(grey, -75%), 10, 0, 4, 4);"
				+ "-fx-border-color: darkgoldenrod;"
				+ " -fx-border-width: 5;");
		this.description = new Label(description);
		this.description.setMinSize(Museum.WIDTH * .175, Museum.HEIGHT * .1);
		this.description.setMaxWidth(Museum.WIDTH * .175);
		this.description.setLayoutY(Museum.HEIGHT * .29 + this.name.getMinHeight());
		this.description.setLayoutX(Museum.WIDTH * .05);
		this.description.setWrapText(true);
		this.description.setAlignment(Pos.BASELINE_CENTER);
		this.description.setPadding(new Insets(0,10,0,10));
		this.description.setStyle("-fx-font-size: 14; -fx-background-color: white;"
				+ "-fx-effect: dropshadow(three-pass-box, derive(grey, -75%), 10, 0, 4, 4);"
				+ "-fx-border-color: darkgoldenrod;"
				+ " -fx-border-width: 5;");
		this.getChildren().addAll(this.name, this.description);
	}
}
