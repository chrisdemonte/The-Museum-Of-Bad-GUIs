package components;

import javafx.scene.control.Label;

public class Banner extends Exhibit{
	
	public Label banner;
	public Label curatorBanner;

	public Banner(int index) {
		super(index, "Welcome Banner", " The Museum \n of \n UI Excellence");
		// TODO Auto-generated constructor stub
		banner = new Label(this.description);
		banner.setMinSize(this.width, this.height);
		banner.setStyle("-fx-font-size: 50; -fx-font-weight: bold;");
		
		curatorBanner = new Label("Curators: Christopher DeMonte & Patricia Moore");
		curatorBanner.setMinSize(this.width * .75, this.height * .1);
		curatorBanner.setLayoutY(this.height * .89);
		curatorBanner.setLayoutX(this.width * .25);
		curatorBanner.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
		this.getChildren().addAll(banner, curatorBanner);
	}

}
