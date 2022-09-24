package components;

import javafx.scene.control.Label;

public class Banner extends Exhibit{
	
	public Label banner;

	public Banner(int index) {
		super(index, "Welcome Banner", " The Museum \n of \n UI Excellence");
		// TODO Auto-generated constructor stub
		banner = new Label(this.description);
		banner.setMinSize(this.width, this.height);
		banner.setStyle("-fx-font-size: 40; -fx-font-weight: bold;");
		this.getChildren().add(banner);
	}

}
