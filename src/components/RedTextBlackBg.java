package components;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RedTextBlackBg extends Exhibit{

	public Label title;
	public Label label;
	public ImageView reaper;
	public ImageView cooltext;
	public RedTextBlackBg(int index) {
		super(index, "Red Text on Black Background", "So edgy");
		// TODO Auto-generated constructor stub
		title = new Label ();
		this.title.setLayoutX(5);
		this.title.setLayoutY(5);
		this.title.setMinSize(this.width - 10, this.height * .2 - 10);
		this.title.setStyle("-fx-font-size: 20; -fx-font-weight: bold;-fx-background-color: black;"
				+ "-fx-text-fill: red;");
		label = new Label("   There are cemeteries that are lonely,\r\n"
				+ "   the heart moving through a tunnel,\r\n"
				+ "   in it darkness, darkness, darkness,\r\n"
				+ "   like a shipwreck we die going into ourselves,\r\n"
				+ "   as though we were drowning inside our hearts,\r\n"
				+ "   as though we lived falling out of the skin into the soul.\r\n"
				+ "   <\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3<\\3"
				+ "	  \r\n\r\n\t\tHosted on LiveJournal (2001)");
		this.label.setMinSize(this.width - 10, this.height * .8 + 5);
		this.label.setLayoutX(5);
		this.label.setLayoutY( this.height * .2 - 10);
		this.label.setStyle("-fx-font-size: 16; -fx-background-color: black;"
				+ "-fx-text-fill: red;");
		this.reaper = new ImageView(new Image("/assets/reaper.jpg"));
		this.reaper.setFitWidth(this.width * .3);
		this.reaper.setFitHeight(this.height * .66);
		this.reaper.setLayoutX(this.width * .66);
		this.reaper.setLayoutY(this.height * .2);
		this.cooltext = new ImageView(new Image("/assets/cooltext420046471770038.gif"));
		this.cooltext.setFitWidth(this.width - 10);
		this.cooltext.setFitHeight(this.height * .2);
		this.cooltext.setLayoutX(10);
		this.cooltext.setLayoutY(10);
		this.getChildren().addAll(title, label, reaper, cooltext);
	}

}
