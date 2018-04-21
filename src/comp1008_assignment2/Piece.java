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
    }
    
    /**
     * 
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Accepts String "title" as argument, throws exception if String is empty
     * @param title
     * @throws IllegalArgumentException 
     */
    public void setTitle(String title) throws IllegalArgumentException{
        if(title.isEmpty())
            throw new IllegalArgumentException("Enter the title.");
        else
            this.title = title;
    }

    /**
     * 
     * @return String
     */
    public String getComposer() {
        return composer;
    }

    /**
     * Accepts String "composer" as argument, throws exception if String is empty
     * @param composer
     * @throws IllegalArgumentException 
     */
    public void setComposer(String composer) throws IllegalArgumentException {
        if(composer.isEmpty())
            throw new IllegalArgumentException("Enter the composer.");
        else
            this.composer = composer;
    }

    /**
     * 
     * @return String
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Accepts String "genre" as argument, throws exception if String is empty
     * @param genre
     * @throws IllegalArgumentException 
     */
    public void setGenre(String genre) throws IllegalArgumentException {
        if(genre.isEmpty())
            throw new IllegalArgumentException("Enter the genre.");
        else
            this.genre = genre;
    }

    public String getPeriod() {
        return period;
    }

    /**
     * Accepts String 'period ' as argument, throws exception if String is empty
     * @param period 
     */
    public void setPeriod(String period) {
        if(period.isEmpty())
            throw new IllegalArgumentException("Enter the period");
        this.period = period;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    /**
     * Accepts int 'length' as argument, throws exception if 
     * int is < 1 or > 1000
     * Length is length of piece in minutes
     * @param length
     * @throws IllegalArgumentException 
     */
    public void setLengthInMinutes(int length) throws IllegalArgumentException {
        if(length < 1 || length > 1000)
            throw new IllegalArgumentException("Please enter a value between 1 and 1000");
        else
            this.lengthInMinutes = length;
    }

    public int getPublishYear() {
        return publishYear;
    }

    /**
     * Accepts in "publishYear" as argument.
     * Throws exception if year is lower than 500 
     * or higher than one year from now (calculated with LocalDate methods)
     * @param publishYear
     * @throws IllegalArgumentException 
     */
    public void setPublishYear(int publishYear) throws IllegalArgumentException {
        // allow for submission of pieces to be published within a year
        int oneYearFromNow = LocalDate.now().getYear()+1;
        
        if(publishYear < 500 || publishYear > oneYearFromNow)
            throw new IllegalArgumentException(
                    "Please enter a year between 500AD and one year from now");
        else
            this.publishYear = publishYear;
    }

    /**
     * Returns formatted String containing all data of Piece object
     * @return 
     */
    @Override
    public String toString()
    {
        return String.format("%s by %s is a piece in the %s genre from the %s period."
                            +" It is %d minutes long and was published in the year %d.",
                            getTitle(), getComposer(), getGenre(), getPeriod(),
                            getLengthInMinutes(), getPublishYear());
    }
    
    
}
