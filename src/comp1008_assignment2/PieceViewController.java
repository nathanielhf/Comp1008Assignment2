/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008_assignment2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author nfisher
 */
public class PieceViewController implements Initializable {
    
    
    @FXML private TextField titleTextField;

    @FXML private TextField composerTextField;

    @FXML private TextField genreTextField;

    @FXML private TextField yearPublishedField;

    @FXML private ComboBox<String> periodComboBox;

    @FXML private TextField lengthField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
