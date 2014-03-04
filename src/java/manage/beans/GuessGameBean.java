/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manage.beans;

import Model.GameService;
import com.sun.xml.ws.developer.Serialization;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @ Teresa Mahoney
 */
@Named
@SessionScoped
public class GuessGameBean implements Serializable{
    private int guessNumber;
    private int randomNumber;
    private String message;
    @Inject
    private GameService gameService;

    public GuessGameBean() {
    }
    @PostConstruct
    public void init(){
    this.randomNumber= gameService.getRandomInt(10);    
        
    }
    public String processSubmitGuess(){
        if(guessNumber<randomNumber){
            setMessage("You're too low.");
        }else if(guessNumber>randomNumber){
            setMessage("You're too high.");
        }else{
            setMessage("Got it!!!");
        }
        return null;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
    
    

  
    
}
