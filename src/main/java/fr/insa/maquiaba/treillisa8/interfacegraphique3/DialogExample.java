package fr.insa.maquiaba.treillisa8.interfacegraphique3;

import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
public class DialogExample extends Application {
   @Override
   public void start(Stage stage) {
      //Creating a dialog
      Dialog<String> dialog = new Dialog<String>();
      //Setting the title
      dialog.setTitle("Dialog");
      ButtonType type = new ButtonType("Ok", ButtonData.OK_DONE);
      //Setting the content of the dialog
      dialog.setContentText("This is a sample dialog");
      //Adding buttons to the dialog pane
      dialog.getDialogPane().getButtonTypes().add(type);
      //Setting the label
      
      Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
      
      //Creating a button
      Button button = new Button("Noeud");
      //Showing the dialog on clicking the button
      button.setOnAction(e -> {
         DialogData dia = new DialogData();
         Optional<Data> res = dia.showAndWait();
         if (res.isEmpty()) {
             System.out.println("entree annulée");
         } else {
             Data da = res.get();
             System.out.println("Data entrée : " + da);
         }
      });
      //Creating a vbox to hold the button and the label
      HBox pane = new HBox(15);
      //Setting the space between the nodes of a HBox pane
      pane.setPadding(new Insets(50, 150, 50, 60));
      pane.getChildren().addAll(button);
      //Creating a scene object
      Scene scene = new Scene(new Group(pane), 595, 250, Color.WHITE);
      stage.setTitle("Dialog");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
}