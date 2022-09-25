package components;

import javafx.scene.control.Label;

public class RedTextBlackBg extends Exhibit{

	public Label title;
	public Label label;
	public RedTextBlackBg(int index) {
		super(index, "Red Text on Black Background", "So edgy");
		// TODO Auto-generated constructor stub
		title = new Label ("THE SOUND OF MY SOUL:");
		this.title.setLayoutX(5);
		this.title.setLayoutY(5);
		this.title.setMinSize(this.width - 10, this.height * .2 - 10);
		this.title.setStyle("-fx-font-size: 20; -fx-font-weight: bold;-fx-background-color: black;"
				+ "-fx-text-fill: red;");
		label = new Label("There are cemeteries that are lonely,\r\n"
				+"the heart moving through a tunnel,\r\n"
				+ "in it darkness, darkness, darkness,\r\n"
				+ "like a shipwreck we die going into ourselves,\r\n"
				+ "as though we were drowning inside our hearts,\r\n"
				+ "as though we lived falling out of the skin into the soul.");
		this.label.setMinSize(this.width - 10, this.height * .8 - 10);
		this.label.setLayoutX(5);
		this.label.setLayoutY(5);
		this.label.setStyle("-fx-font-size: 16; -fx-font-weight: bold;-fx-background-color: black;"
				+ "-fx-text-fill: red;");
		this.getChildren().addAll(title, label);
	}

}
