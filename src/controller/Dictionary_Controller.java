package controller;

import java.util.*;

import model.Database;
import model.Dictionary;
import model.Word;

public class Dictionary_Controller {

    private Word word;
    private Dictionary dic;
    private Database db;
    
    public Dictionary_Controller() {
    }

    public void searchbyInitial(char initial) {
        // TODO implement here
    }

    public void searchbyFullWord(String wordname) {
        // TODO implement here
    }

    public void search(String text) {
        if(text.length()==1){
        	char alphabet = text.charAt(0);
        	this.searchbyInitial(alphabet);
        } else if(text.length() >1){
        	String userTypedWord = text;
        	word = db.selectWordbyText(userTypedWord);
        }
        word.setXPos(0);
        word.setYPos(0);
    }

    public void dictionaryOpen() {
    	db.initializeDictionary(dic);
    }

    public void init() {
        // TODO implement here
    }

}