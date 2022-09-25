package app;

import java.util.Timer;
import java.util.TimerTask;

import components.Museum;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Runner extends Application {

	//public static MuseumPane MUSEUM = null;
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Museum root = new Museum(1280, 720, 9, 4);
		Scene scene = new Scene(root, 1280, 720);
		
		
	    EventHandler<KeyEvent> keyPressHandler = new EventHandler<KeyEvent>() { 
	        @Override 
	        public void handle(KeyEvent event) { 
	           //Playing the animation 
	       // System.out.println("keypressed");
	           if(event.getCode() == KeyCode.LEFT) {
	        	  // Museum.X_POS += 7;   
	        	   Museum.LITTLE_GUY.direction = 1;
	        	   Museum.LITTLE_GUY.moving = 1;
	           }
	           if(event.getCode() == KeyCode.RIGHT) {
	        	 //  Museum.X_POS -= 7;
	        	   Museum.LITTLE_GUY.direction = 2;
	        	   Museum.LITTLE_GUY.moving = 1;
	           }
	          // for (int i = 0; i < Museum.NUM_EXHIBITS; i++) {
	        	  // Museum.WALL.get(i).setLayoutX(Museum.X_POS);
	        	  // Museum.FLOOR.get(i).setLayoutX(Museum.X_POS);
	        	 //  Museum.CONTAINER.setLayoutX(Museum.X_POS);
	         //  }
	        }           
	     };
		    EventHandler<KeyEvent> keyReleaseHandler = new EventHandler<KeyEvent>() { 
		        @Override 
		        public void handle(KeyEvent event) { 
		           //Playing the animation 
		        	Museum.LITTLE_GUY.direction = 0;
		        	Museum.LITTLE_GUY.moving = 1;
		        }           
		     };
	     
	    scene.setOnKeyPressed(keyPressHandler);
		scene.setOnKeyReleased(keyReleaseHandler);
		
		Timer gameLoop = new Timer();
		gameLoop.schedule(new TimerTask() {
			@Override
			public void run(){
			Museum.update();
			Museum.LITTLE_GUY.update();
		}}, 0, 33);
		
		stage.setScene(scene);
		stage.show();

	}
	public static void main (String[] args) {
		launch(args);
	}

}
