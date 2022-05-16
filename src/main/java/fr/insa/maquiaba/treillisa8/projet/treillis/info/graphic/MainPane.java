/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.projet.treillis.info.graphic;

import fr.insa.maquiaba.treillisa8.projet.treillis.info.Treillis;
import static java.awt.SystemColor.control;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author francois
 */
public class MainPane extends BorderPane { 
    
    private Treillis model;
 
    private DessinPane dessin;
    
    public MainPane(Treillis model) {
        this.model = model;
       this.dessin = new DessinPane(this);
        
//        this.setTop(this.entete);
//        this.setLeft(this.barreGauche);
        this.setCenter(this.dessin);
    }

    /**
     * @return the model
     */
    public Treillis getModel() {
        return model;
    }

 
    
}
