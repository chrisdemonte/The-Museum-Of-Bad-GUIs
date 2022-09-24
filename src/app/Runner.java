package app;

import components.MuseumPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Runner extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		MuseumPane root = new MuseumPane(1280, 720);
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();

	}
	public static void main (String[] args) {
		launch(args);
	}

}
