package com.application.sujata.social_me;

import java.util.HashMap;

/**
 * Created by sujata on 26/3/16.
 */
public class Post {


    private HashMap<String,String> eventDetails;

    Post(HashMap<String,String> eventDetails){
        this.eventDetails = eventDetails;
    }

    public String getEventName(){
        return eventDetails.get(Config.KEY_ENAME);
    }
    public String getEdesc() {
        return eventDetails.get(Config.KEY_EDESC);
    }
    public String getCategory() {
        return eventDetails.get(Config.KEY_CATEGORY);
    }
    public String getGname() {
        return eventDetails.get(Config.KEY_GROUPNAME);
    }
    public String getEDatetime() {
        return eventDetails.get(Config.KEY_ETIME);
    }
    public String getGeneratedDateTime(){
        return eventDetails.get(Config.KEY_EGENERATED);
    }
}