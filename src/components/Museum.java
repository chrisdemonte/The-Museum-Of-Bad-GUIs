package components;


import java.util.ArrayList;

import Controller.geocitiesController;
import Controller.tuiController;
import javafx.event.Event;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
		WALL.get(0).getChildren().add(new CNNisSlow(0));
		WALL.get(0).getChildren().add(new TitleCards("We Are Not Ready Yet", "You may remember waiting 30 minutes for a single image to load in 90s. It isn't the website's fault. The internet simply isn't fast enough for this UI. Scientists "
				+ "believe with advancements in infrasctructure and quantum computing, by 2035 CNN.com will load in under 10 seconds."));
		WALL.get(1).getChildren().add(new LingHallOfFame(1));
		WALL.get(1).getChildren().add(new TitleCards("Hall of Fame", "This is perhaps the best user interface and user experience that can be found today. When one visits this website they find themselves transported somewhere else. They "
				+ "forget what they even visted the site for. That is the mark of the highest quality. Truly superlative!"));
		
		WALL.get(2).getChildren().add(new RedTextBlackBg(2));
		WALL.get(2).getChildren().add(new TitleCards("Be Still My Beating Blog", "Artists have a deep and burning heart, and a dark and firey blog to match. Red text over a black background represents the blogger's brooding "
				+ "yet expressive nature. The generous use of animated gifs reminds us of a time when motion in digital art was innovative."));

		tuiController tuiControl = new tuiController();
		FXMLLoader tuiLoader = new FXMLLoader();
		tuiLoader.setLocation(getClass().getResource("/View/tuiView.fxml"));
		tuiLoader.setController(tuiControl);
		Pane tuiPane = (Pane) tuiLoader.load();
		tuiPane.setLayoutX(Museum.WIDTH * .25);
		tuiPane.setLayoutY(Museum.HEIGHT * .075);
		WALL.get(3).getChildren().add(tuiPane);
		WALL.get(3).getChildren().add(new TitleCards("Before There Was GUI", "It's said that an intuitive interface is one that works as the user expects it to. For the best intuitiveness look no further than the "
				+ "TUI! Extreme functionality custimization allows the TUI to work the way as many as one (1)* users expect it to."
				+ "\n*author of customizations"));
		
		WALL.get(4).getChildren().add(new Banner(4));
		WALL.get(4).getChildren().add(new TitleCards("Welcome!", "- Use LEFT and RIGHT arrow keys to move.\n\r- Use the MOUSE to interact with exhibits."));
		
		WALL.get(5).getChildren().add(new AdvertisementHell(5));
		WALL.get(5).getChildren().add(new TitleCards("Advertisement Heaven", "With faster processors and internet speeds, developers can finally start u"
				+ "tilizing webpages to their full potential. Up to 90% of the screen can be used for advertisements with out affecting user experience. Amazing!"));
		WALL.get(6).getChildren().add(new YouMustSub(6));
		WALL.get(6).getChildren().add(new TitleCards("Users Must Subscribe", "Many websites require you to pay for a subscription to access their content, but "
				+ "this brilliant work by newsday.com grants you full access to their news articles for 2.5 seconds. For a single moment, you experience the joy of having a subscription."));
		WALL.get(7).getChildren().add(new RadialMenu(7));
		WALL.get(7).getChildren().add(new TitleCards("Radial Menu", "A pixelated window does not stop you from having a well-rounded experience. It feels like you"
				+ " are playing a videogame everytime you use this sleak GUI. For a fun and challenging experience, try using a radial GUI on a mobile device with one hand." ));
		
		geocitiesController geoControl = new geocitiesController();
 		FXMLLoader geoLoader = new FXMLLoader();
		geoLoader.setLocation(getClass().getResource("/View/geocitiesView.fxml"));
		geoLoader.setController(geoControl);
		Pane geoPane = (Pane) geoLoader.load();
		geoPane.setLayoutX(Museum.WIDTH * .25);
		geoPane.setLayoutY(Museum.HEIGHT * .075);
		WALL.get(8).getChildren().add(geoPane);
		WALL.get(8).getChildren().add(new TitleCards("1994", "Web 2.0 is well-regarded for its ease of use, interoperability and vast quantities of user-generated content. "
				+ "Web 1.0 featured none of those things, yet to this day it is still celebrated by all with reverence inconceivable for Web 2.0."));
		geoControl.scrollPane.requestFocus();
		EventDispatcher scrollPaneEventDispatcher = geoControl.scrollPane.getEventDispatcher();
		geoControl.scrollPane.setEventDispatcher((event, tail) -> {
            if (KeyEvent.ANY.equals(event.getEventType().getSuperType())) {
               // System.out.println("DISPATCH\tScrollPane\tevent=" + event.getEventType());
            }
            Event eventToDispatch = scrollPaneEventDispatcher.dispatchEvent(event, tail);
            if (KeyEvent.KEY_PRESSED.equals(event.getEventType())) {
                if (KeyCode.LEFT.equals(((KeyEvent) event).getCode()) || KeyCode.RIGHT.equals(((KeyEvent) event).getCode())) {
                    if (eventToDispatch == null) {
                        return event;
                    }
                }
            }
            return eventToDispatch;
        });
		

		CONTAINER.getChildren().add(new Plant(WIDTH * .75, HEIGHT * .35));
		CONTAINER.getChildren().add(new Bench(WIDTH * 1.7, HEIGHT * .515));
		CONTAINER.getChildren().add(new Garbage(WIDTH * 2.75, HEIGHT * .525));
		CONTAINER.getChildren().add(new Plant(WIDTH * 2.82, HEIGHT * .35));
		CONTAINER.getChildren().add(new Plant(WIDTH * 3.77, HEIGHT * .35));
		CONTAINER.getChildren().add(new Plant(WIDTH * 4.75, HEIGHT * .35));
		CONTAINER.getChildren().add(new Bench(WIDTH * 3.92, HEIGHT * .515));
		CONTAINER.getChildren().add(new Garbage(WIDTH * 5.75, HEIGHT * .525));
		CONTAINER.getChildren().add(new Plant(WIDTH * 5.82, HEIGHT * .35));
		CONTAINER.getChildren().add(new Plant(WIDTH * 6.75, HEIGHT * .35));
		CONTAINER.getChildren().add(new Bench(WIDTH * 7.69, HEIGHT * .515));
		CONTAINER.getChildren().add(new Plant(WIDTH * 8.75, HEIGHT * .35));
		
		CONTAINER.requestFocus();
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
	       // System.out.println(Museum.X_POS );
		}
	}

	
}
