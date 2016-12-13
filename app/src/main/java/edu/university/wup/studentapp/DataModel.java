package edu.university.wup.studentapp;

/**
 * Created by noc on 12/13/2016.
 */
public class DataModel {
    private int icon;
    private String text;

    public DataModel(int icon, String text){
        this.icon=icon;
        this.text = text;
    }
    public int getIcon(){
        return  icon;
    }
    public  String getText(){
        return text;
    }
}
