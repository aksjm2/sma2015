package model;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	static{
		try{
			Class.forName("org.sqlite.JDBC");
		}catch(Exception e){e.printStackTrace();}
	}
	
	public boolean dbConnect(){
		try{
			conn = DriverManager.getConnection("jdbc:sqlite:resource/db.sql");
			stmt = conn.createStatement();
		}catch(Exception e){
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			return false;
		}
		return true;
	}
	
    public Database() {
    }

    public Word selectGameWord(int randomword) {
    	Word word = new Word();//commit test
        String sql = "select * from Word where key ='"+randomword+"'";
        try {
			stmt = conn.createStatement();        
			rs = stmt.executeQuery(sql);
			if(rs.next())
			{
        	
			}
        }catch(SQLException e)
        {
        	System.out.println(e.getMessage());        	
        }
        return word;
    }

    public Alphabet selectGameAlphabet(char a) {
        // TODO implement here
        return null;
    }

    public void updateWord(Word word) {
        // TODO implement here
    }

    public void initializeDictionary(Dictionary d) {
        // TODO implement here
    }
    
    public void searchCorrectWord() {
        // TODO implement here
    }

    public void selectRewardImageURL(Picture p) {
        // TODO implement here
    }

    public void updateRewardImage(Picture p) {
        // TODO implement here
    }

    public void updateRewardToDefault(Picture p) {
        // TODO implement here
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void selectKeyboardImage(Picture vKeyboard)
    {
    	
    	
    }

	public Word selectWordbyText(String userTypedWord) {
		// TODO Auto-generated method stub
		return null;
	}

}