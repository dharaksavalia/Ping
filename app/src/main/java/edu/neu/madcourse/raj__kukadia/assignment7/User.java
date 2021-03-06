package edu.neu.madcourse.raj__kukadia.assignment7;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class User {

    public String username;
    public String score;
    public String emailId;
    public String token;


    public User(){
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String emailID, String token){
        this.username = username;
        //this.score = score;
        this.token = token;
        this.emailId = emailID;
    }

}
