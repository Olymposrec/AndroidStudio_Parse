package com.melihakkose.androildstudio_parse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INSERT DATA TO PARSE---------------------------------------------------------------
        /* ParseObject object = new ParseObject("Games");
        object.put("name","Red Dead Redemption 2");
        object.put("developer","Rockstar Games");
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e!=null){
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Object Saved",Toast.LENGTH_LONG).show();
                }
            }
        });

        //SELECT DATA TO PARSE---------------------------------------------------------------
        /*

        ParseQuery<ParseObject> query= ParseQuery.getQuery("Games");

        query.getInBackground("YTox8JVwLK", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(e!=null){
                    e.printStackTrace();
                }else{
                    String objectName=object.getString("name");
                    String objectDeveloper=object.getString("developer");

                    System.out.println("Name: "+objectName);
                    System.out.println("Developer: "+objectDeveloper);
                }
            }
        });
        ParseQuery<ParseObject> query =  ParseQuery.getQuery("Games");

        //FILTER QUERY---------------------------------------------------------------
        query.whereEqualTo("name","Dark Souls 3");
        query.whereEqualTo("developer","Rockstar Games");
        */

        //SELECT DATA TO PARSE---------------------------------------------------------------
        /*
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e!=null){
                    e.printStackTrace();
                }else{
                    if(objects.size()>0){
                        for (ParseObject object:objects){
                            String objectName =object.getString("name");
                            String objectDev=object.getString("developer");

                            System.out.println("Name: "+objectName);
                            System.out.println("Developer: "+objectDev);
                        }
                    }
                }
            }
        });
        */

        //USER OPERATIONS---------------------------------------------------------------
        /*
        ParseUser parseUser =new ParseUser();
        parseUser.setUsername("sidkikocman");
        parseUser.setPassword("123456");

        parseUser.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if(e!=null){
                    e.printStackTrace();
                }else {
                    Toast.makeText(MainActivity.this,"User Signed Up!!",Toast.LENGTH_LONG).show();
                }
            }
        });
        */

        //LOG IN--------------------------------------------
        /*
         ParseUser.logInInBackground("sidkikocman", "123456", new LogInCallback() {
             @Override
             public void done(ParseUser user, ParseException e) {
                 if(e!=null){
                     e.printStackTrace();
                     Toast.makeText(MainActivity.this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                 }else{
                     Toast.makeText(MainActivity.this,"Welcome: "+user.getUsername(),Toast.LENGTH_LONG).show();
                 }
             }
         });
         */






    }
}