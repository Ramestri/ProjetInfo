/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.maquiaba.treillisa8.interfacegraphique3;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author francois
 */
public class MainFx extends Application {  

    @Override
    public void start(Stage stage) throws Exception {
        MainPane main = new MainPane();
        Scene sc = new Scene(main);
        stage.setScene(sc);
        stage.setTitle("inter graph");
          stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
