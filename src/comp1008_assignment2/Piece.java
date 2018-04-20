/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008_assignment2;

import java.time.LocalDate;
import java.time.Period;
import javafx.scene.image.Image;

/**
 *
 * @author nfisher
 */
public class Piece {

    // create instance variables
    private String title, composer, genre, period;
    private int lengthInMinutes, publishYear;
    private Image image;

    public Piece(String title, String composer, String genre, String period, int lengthInMinutes, int publishYear) {
        setTitle(title);
        setComposer(composer);
        setGenre(genre);
        setPeriod(period);
        setLengthInMinutes(lengthInMinutes);
        setPublishYear(publishYear);
        //setImage(new Image(getImageFileName()));
    }

    /*Piece() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException{
        if(title.isEmpty())
            throw new IllegalArgumentException("Enter the title.");
        else
            this.title = title;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) throws IllegalArgumentException {
        if(composer.isEmpty())
            throw new IllegalArgumentException("Enter the composer.");
        else
            this.composer = composer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) throws IllegalArgumentException {
        if(genre.isEmpty())
            throw new IllegalArgumentException("Enter the genre.");
        else
            this.genre = genre;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        if(period.isEmpty())
            throw new IllegalArgumentException("Enter the period");
        this.period = period;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int length) throws IllegalArgumentException {
        if(length <= 0 || length >= 1000)
            throw new IllegalArgumentException("Please enter a value between 0 and 1000");
        else
            this.lengthInMinutes = length;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) throws IllegalArgumentException {
        // allow for submission of pieces to be published within a year
        int oneYearFromNow = LocalDate.now().getYear()+1;
        
        if(publishYear < 500 || publishYear > oneYearFromNow)
            throw new IllegalArgumentException(
                    "Please enter a year between 500AD and one year from now");
        else
            this.publishYear = publishYear;
    }
    
    public Image getImage()
    {
        return image;
    }

    private String getImageFileName() {
        return String.format(("/images/%s.jpg"), getPeriod());
    }

    private void setImage(Image image) {
        this.image = image;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s, by %s is a piece in the %s genre from the %s period."
                            +" It is %d minutes long and was published in the year %d.",
                            getTitle(), getComposer(), getGenre(), getPeriod(),
                            getLengthInMinutes(), getPublishYear());
    }
    
    
}
