package components;

import javafx.scene.layout.Pane;

public class Exhibit extends Pane{
	
	public int index;
	public String name;
	public String description;
	
	public Exhibit(int index, String name, String description) {
		this.index = index;
		this.name = name;
		this.description = description;
		this.setMinSize( Museum.WIDTH * .33, Museum.HEIGHT * .5 );
		this.setLayoutX(Museum.WIDTH * .33);
		this.setLayoutY(Museum.HEIGHT * .1);
		
	}

}
