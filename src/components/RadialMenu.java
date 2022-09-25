package components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RadialMenu extends Exhibit{

	public ImageView imageView; 
	public RadialMenu(int index) {
		super(index, "Radial Menus are not Fun", "Developers thunk radial menus are intuitive than they actually are.");
		imageView = new ImageView(new Image("/assets/radial_UI.gif"));
		imageView.setFitWidth(this.width - 10);
		imageView.setFitHeight(this.height - 10);
		imageView.setLayoutX(5);
		imageView.setLayoutY(5);
		this.getChildren().add(imageView);
	}

}
