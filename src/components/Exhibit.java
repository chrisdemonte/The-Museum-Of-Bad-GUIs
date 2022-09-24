package components;

import javafx.scene.layout.Pane;

/*
 * The Exhibit class is an abstract root class for all the museum exhibits
 * 
 * The class's size and xy layouts are set for adding the exhibit to the Museum wall.
 * Exhibits are designed to have a Musuem Wall Pane as a parent.
 * 
 */
public abstract class Exhibit extends Pane{
	
	public int index;
	public String name;
	public String description;
	public double width;
	public double height;
	
	public Exhibit(int index, String name, String description) {
		this.index = index;
		this.name = name;
		this.description = description;
		this.width = Museum.WIDTH * .33;
		this.height = Museum.HEIGHT * .58;
		this.setMinSize( this.width, this.height );
		this.setMaxSize( this.width, this.height );
		this.setLayoutX(Museum.WIDTH * .33);
		this.setLayoutY(Museum.HEIGHT * .075);
		this.setStyle("-fx-background-color: white;" 
				+ "-fx-effect: dropshadow(three-pass-box, derive(grey, -75%), 10, 0, 4, 4);"
				+ "-fx-border-color: darkgoldenrod;\r\n"
				+ " -fx-border-width: 5;");
		
	}

}
