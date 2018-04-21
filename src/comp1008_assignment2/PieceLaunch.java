/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008_assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author nfisher
 */
public class PieceLaunch extends Application {
    
    public static void main(String[] args) 
    {
        launch(args);
    }

    /**
     * When program runs, method start() loads the FXML of GUI,
     * creates new scene using fxml resource, 
     * sets title and scene of new stage,
     * then shows the stage
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("pieceView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Classical Music Organizer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
