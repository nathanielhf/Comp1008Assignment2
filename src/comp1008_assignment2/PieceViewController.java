/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008_assignment2;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author nfisher
 */
public class PieceViewController implements Initializable {
    
    @FXML private AnchorPane anchorPane;
    
    @FXML private TextField titleTextField;
    @FXML private TextField composerTextField;
    @FXML private TextField genreTextField;
    @FXML private TextField yearPublishedField;
    @FXML private ComboBox<String> periodComboBox;
    @FXML private TextField lengthField;    
    @FXML private ImageView imageView;   
    @FXML private Button submitPieceButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Piece piece = new Piece();
        // Configure the PeriodBox
        List periods = Arrays.asList(
                "Medieval", "Renaissance", "Baroque", "Classical", "Romantic", "Modern");
        periodComboBox.getItems().addAll(periods);
        
        //updateImage();
    }  
    
    public void submitPieceButtonPushed()
    {
        Piece newPiece = new Piece(titleTextField.getText(),
                                composerTextField.getText(),
                                genreTextField.getText(),
                                periodComboBox.getValue(),
                                Integer.parseInt(yearPublishedField.getText()),                                
                                Integer.parseInt(lengthField.getText())); 
        
        System.out.printf("%s", newPiece.toString());
    }
    
/*    public void updateTitleTextField() 
    {
        if(titleTextField.)
        {
        }
    }
    

    public void updateImage() 
    {
        
    }
*/
}
