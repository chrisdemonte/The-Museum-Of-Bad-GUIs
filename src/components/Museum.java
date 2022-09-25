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
		WALL.get(2).getChildren().add(new RedTextBlackBg(2));
		WALL.get(2).getChildren().add(new TitleCards("Be Still My Beating Blog", "Artists have a deep and burning heart, and a dark and firey blog to match. Red text over black background represents the blogger's brooding "
				+ "and expressive nature. When you see this page what do you see? Angst and passion."));

		Pane tuiPane = FXMLLoader.load(getClass().getResource("/View/tuiView.fxml"));
		tuiPane.setLayoutX(Museum.WIDTH * .25);
		tuiPane.setLayoutY(Museum.HEIGHT * .075);
		WALL.get(3).getChildren().add(tuiPane);
		WALL.get(3).getChildren().add(new TitleCards("Before There Was GUI", "It's said that an intuitive interface is one that works as the user expects it to. For the best intuitiveness look no further than the "
				+ "TUI! Extreme functionality custimization allows the TUI to work the way as many as one (1)* users expect it to."
				+ "\n*author of customizations"));
		
		WALL.get(4).getChildren().add(new Banner(4));
		
		WALL.get(5).getChildren().add(new AdvertisementHell(5));
		WALL.get(5).getChildren().add(new TitleCards("Advertisement Heaven", "With faster processors and internet speeds, developers can finally start u"
				+ "tilizing webpages to their full potential. Up to 90% of the screen can be used for advertisements with out affecting user experience. Amazing!"));
		WALL.get(6).getChildren().add(new YouMustSub(6));
		WALL.get(6).getChildren().add(new TitleCards("Users Must Subsribe", "Many websites require you to pay for a subscription to access their content, but "
				+ "this brilliant work by newsday.com grants you full access to their news articles for 2.5 seconds. For a single moment, you experience the joy of having a subscription."));
		WALL.get(7).getChildren().add(new RadialMenu(7));
		WALL.get(7).getChildren().add(new TitleCards("Radial Menu", "A pixelated window does not stop you from having a well-rounded experience. It feels like you"
				+ " are playing a videogame everytime you use this sleak GUI. For a fun and challenging experience, try using a radial GUI on a mobile device with one hand." ));
		
		Pane geoPane = FXMLLoader.load(getClass().getResource("/View/geocitiesView.fxml"));
		geoPane.setLayoutX(Museum.WIDTH * .25);
		geoPane.setLayoutY(Museum.HEIGHT * .075);
		WALL.get(8).getChildren().add(geoPane);
		WALL.get(8).getChildren().add(new TitleCards("1994", "Web 2.0 is well-regarded for its ease of use, interoperability and vast quantities of user-generated content. "
				+ "Web 1.0 featured none of those things, yet to this day it is still celebrated by all with reverence inconceivable for Web 2.0."));
		//CONTAINER
	}
	
	public static void update() {
		if (LITTLE_GUY.moving == 1) {
			if (LITTLE_GUY.direction == 1) {
				Museum.X_POS += 15; 
			}
			if (LITTLE_GUY.direction == 2) {
				Museum.X_POS -= 15; 
			}
	        for (int i = 0; i < Museum.NUM_EXHIBITS; i++) {
	        	Museum.CONTAINER.setLayoutX(Museum.X_POS);
	        }
		}
	}

	
}
