package components;


import java.util.ArrayList;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class Museum extends Pane{
	
	public static Pane CONTAINER;
	public static ArrayList<Pane> WALL;
	public static ArrayList<Pane> FLOOR;
	public static ArrayList<Exhibit> EXHIBITS;
	public static LittleGuy LITTLE_GUY;
	public static double X_POS = 0;
	public static double WIDTH;
	public static double HEIGHT;
	public static int NUM_EXHIBITS;
	//public static FXMLLoader Loader;
	
	
	public Museum(double width, double height, int numExhibits, int startingOffset) throws Exception {
		this.setMinSize(width, height);
		WIDTH = width;
		HEIGHT = height;
		NUM_EXHIBITS = numExhibits;
		
		//Loader = loader;
		
		CONTAINER = new Pane();
		CONTAINER.setMinSize(WIDTH * NUM_EXHIBITS, HEIGHT);
		CONTAINER.setLayoutX(-startingOffset * WIDTH);
		X_POS = -startingOffset * WIDTH;
		
		WALL = new ArrayList<Pane>();
		FLOOR = new ArrayList<Pane>();
		EXHIBITS = new ArrayList<Exhibit>();
		
		for (int i = 0; i < numExhibits; i++) {
			WALL.add(new Pane());
			WALL.get(i).setMinSize(width, 520);
			WALL.get(i).setLayoutX(WIDTH * i);
			WALL.get(i).setStyle("-fx-background-image: url(\"assets/pixel_white_brick_wall.jpg\"); -fx-background-size: 395 368;");
			CONTAINER.getChildren().add(WALL.get(i)); 
		
			FLOOR.add(new Pane());
			FLOOR.get(i).setMinSize(width, 200);
			FLOOR.get(i).setLayoutY(520);
			FLOOR.get(i).setLayoutX(WIDTH * i);
			FLOOR.get(i).setStyle("-fx-background-image: url(\"assets/pixel_wood_floor.jpg\");-fx-background-size: 512 288;");
			CONTAINER.getChildren().add(FLOOR.get(i));
		}
		this.getChildren().add(CONTAINER);
		
		LITTLE_GUY = new LittleGuy();
		LITTLE_GUY.imageView.setLayoutX(WIDTH * .45);
		LITTLE_GUY.imageView.setLayoutY(HEIGHT * .6);
		this.getChildren().add(LITTLE_GUY.imageView);
		
		// Exhibits must be added to the wall manually here
		WALL.get(3).getChildren().add(new Banner(3));

		Pane tuiPane = FXMLLoader.load(getClass().getResource("/View/tuiView.fxml"));
		WALL.get(2).getChildren().add(tuiPane);

		WALL.get(4).getChildren().add(new AdvertisementHell(4));
		WALL.get(5).getChildren().add(new YouMustSub(5));
		WALL.get(6).getChildren().add(new RadialMenu(6));


	}
	
	public static void update() {
		if (LITTLE_GUY.moving == 1) {
			if (LITTLE_GUY.direction == 1) {
				Museum.X_POS += 7; 
			}
			if (LITTLE_GUY.direction == 2) {
				Museum.X_POS -= 7; 
			}
	        for (int i = 0; i < Museum.NUM_EXHIBITS; i++) {
	        	Museum.CONTAINER.setLayoutX(Museum.X_POS);
	        }
		}
	}

	
}
