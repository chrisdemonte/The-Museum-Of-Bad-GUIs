package components;

import Controller.tuiController;
import javafx.scene.layout.Pane;

public class TUI extends Exhibit{

	public TUI(int index) {
			super(index, "TUI Exhibit", "Before the advent of the GUI... \n there was... \n the TUI.");
			// TODO Auto-generated constructor stub
			tuiController tuiPane = new tuiController();
			Pane pane = tuiPane.getPane();
			this.getChildren().add(pane);
	}

}
