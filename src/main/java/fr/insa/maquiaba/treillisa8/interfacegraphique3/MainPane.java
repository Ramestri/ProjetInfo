/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.interfacegraphique3;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;    

/**
 *
 * @author maqui
 */
public class MainPane extends BorderPane {
    
    private HBox entete;
    private Label lId;
    private TextField tfId;
    private VBox outils;
    private Button bNoeud;
    
    
    
  public MainPane() {
      this.setMinWidth(1000);
      this.setMinHeight(500);
      this.lId = new Label("id : ");
      this.tfId = new TextField("123");
      this.entete = new HBox(this.lId);
      this.entete.getChildren().add(this.tfId);
      this.bNoeud = new Button("Noeud");
      this.outils = new VBox(this.bNoeud);
      
      FxUtils.setSimpleBorder(this.entete, Color.CYAN, 3);
      FxUtils.setSimpleBorder(this.outils, Color.RED, 3);
      
      this.setTop(this.entete);
      this.setLeft(this.outils);
      this.setCenter(new Button("en cours"));
  }
    
}
