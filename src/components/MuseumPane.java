package components;


import javafx.scene.layout.Pane;

public class MuseumPane extends Pane{
	
	public static Pane wall;
	public static Pane floor;
	public static double xLayout = 0;
	
	public MuseumPane(double width, double height) {
		this.setMinSize(width, height);
		
		wall = new Pane();
		wall.setMinSize(width, 520);
		wall.setStyle("-fx-background-image: url(\"assets/pixel_white_brick_wall.jpg\"); -fx-background-size: 395 368;");
		//wall.setStyle("-fx-background-image: url(\"assets/pixel_white_wall.jpg\"); -fx-background-size: 1080 520;");
		//wall.setStyle("-fx-background-image: url(\"assets/pixel_white_wall.jpg\"); -fx-background-size: 2160 1040;");
		this.getChildren().add(wall); 
		
		floor = new Pane();
		floor.setMinSize(width, 200);
		floor.setLayoutY(520);
		floor.setStyle("-fx-background-image: url(\"assets/pixel_wood_floor.jpg\");-fx-background-size: 512 288;");
		this.getChildren().add(floor);
		

	}

	
}
