package app;

import components.MuseumPane;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Runner extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		MuseumPane root = new MuseumPane(1280, 720);
		Scene scene = new Scene(root);
		
		
	    EventHandler<KeyEvent> keyPressHandler = new EventHandler<KeyEvent>() { 
	        @Override 
	        public void handle(KeyEvent event) { 
	           //Playing the animation 
	        System.out.println("keypressed");
	           if(event.getCode() == KeyCode.LEFT) {
	        	   MuseumPane.xLayout += 5;
	        	   MuseumPane.wall.setLayoutX(MuseumPane.xLayout);
	        	   MuseumPane.floor.setLayoutX(MuseumPane.xLayout);
	        	   
	           }
	           if(event.getCode() == KeyCode.RIGHT) {
	        	   MuseumPane.xLayout -= 5;
	        	   MuseumPane.wall.setLayoutX(MuseumPane.xLayout);
	        	   MuseumPane.floor.setLayoutX(MuseumPane.xLayout);
	           }
	        }           
	     };
	     
	    scene.setOnKeyPressed(keyPressHandler);
		
		stage.setScene(scene);
		stage.show();

	}
	public static void main (String[] args) {
		launch(args);
	}

}
