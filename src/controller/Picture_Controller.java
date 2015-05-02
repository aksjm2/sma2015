package controller;

import model.Database;
import model.Picture;


public class Picture_Controller {

    public String url;
    public Picture rewardPicture;
    public Database db;

    public Picture_Controller() {
    	
    }
    public void uploadPicture() {
    	System.out.println("Request upload Picture");
    }
    public void deletePicture() {
    	db.updateRewardToDefault(rewardPicture);
    }
    public void managePicture() {
    	db.selectRewardImageURL(rewardPicture);
    	rewardPicture.setXPos(0);
    	rewardPicture.setYPos(0);
    }
    public void selectFileDirectory(String url) {
    	rewardPicture.setImageURL(url);
    	db.updateRewardImage(rewardPicture);
    	rewardPicture.setXPos(0);
    	rewardPicture.setYPos(0);
    }
    public void init() {
    	
    }

}