/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.interfacegraphique3;


import fr.insa.maquiaba.treillisa8.projet.treillis.info.Barre;
import fr.insa.maquiaba.treillisa8.projet.treillis.info.Noeud;
import fr.insa.maquiaba.treillisa8.projet.treillis.info.Treillis;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;  
import javafx.scene.shape.Rectangle;


/**
 *
 * @author francois
 */
public class DessinPane extends Pane{
    
    public static final double RAYON_NOEUD = 5;
    
    private MainPane main;
    
    public DessinPane(MainPane main){
        this.main = main;
        Rectangle clip = new Rectangle();
        clip.heightProperty().bind(this.heightProperty());
        clip.widthProperty().bind(this.widthProperty());
        this.setClip(clip);

        FxUtils.setSimpleBorder(this, Color.RED, 3);
        this.redrawAll();
    }
    
	
    
    public void redrawAll() {

        this.getChildren().clear();
        Treillis model = this.main.getModel();
        for(int i = 0 ; i < model.getNoeuds().size() ; i ++) {
            Noeud cur = model.getNoeuds().get(i);
            Circle rep = new Circle(cur.getNx(), cur.getNy(),RAYON_NOEUD);
            rep.setStroke(Color.RED);
            rep.setFill(Color.RED);
            this.getChildren().add(rep);
        }
        for(int i=0;i< model.getBarres().size();i++){
            Barre b = model.getBarres().get(i);
            Line l = new Line (b.getnDépart().getNx(), b.getnDépart().getNy(), b.getnArrivée().getNx(), b.getnArrivée().getNy());
            this.getChildren().add(l);
        }
    }
     
}
