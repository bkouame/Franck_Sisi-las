package app;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Hello extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("#by franck");
		stage.setWidth(600);
		stage.setHeight(600);
		stage.setResizable(false);
		
		AnchorPane root = new AnchorPane();
		
		root.setBackground(new Background(new BackgroundFill(Color.web("F0F4F8"), null, null)));
		
		Scene scene = new Scene(root);
		
		Label label = new Label("Bienvenue dans la mini app");
		Label label2 = new Label("Franck");
		
//		label2.setFont(Font.font("pacifico",FontWeight.BOLD, 28));
//		label2.setTextFill(Color.web("#044E54"));
		label2.setLayoutX(225);
		label2.setLayoutY(200);
		label2.setId("label2");
		
		label.setLayoutX(160);
		label.setLayoutY(150);
		label.setFont(Font.font("pacifico",FontWeight.BOLD, 15));
		
		root.getChildren().addAll(label,label2);
		
		Button bouton = new Button("ta surprise ici");
		bouton.setLayoutX(235);
		bouton.setLayoutY(300);
		bouton.setContentDisplay(ContentDisplay.TOP);
		bouton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				Stage newpage = new Stage();
				newpage.setWidth(600);
				newpage.setHeight(600);
				AnchorPane root2 = new AnchorPane();
				root2.setBackground(new Background(new BackgroundFill(Color.web("F0F4F8"), null, null)));
				Scene scene1 = new Scene(root2);
				newpage.setScene(scene1);
				Label lab = new Label("Même prière que Silas");
				lab.setFont(Font.font("pacifico",FontWeight.BOLD, 40));
				lab.setTextFill(Color.web("red"));
				lab.setLayoutX(100);
				lab.setLayoutY(200);
				root2.setId("root2");
				root2.getChildren().add(lab);
				scene1.getStylesheets().add(getClass().getResource("app.css").toString());
				newpage.show();
			}
		});
		root.getChildren().add(bouton);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		scene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Pacifico");
		stage.setScene(scene);
		stage.show();
		stage.centerOnScreen();
	}
	public void main(String args) {
		launch(args);
	}
}
