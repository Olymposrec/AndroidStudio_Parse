package com.melihakkose.androildstudio_parse;

import android.app.Application;
import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //SET LOG LEVEL
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        //SERVER ile -UYGULAMA Baglanti koprusu
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("")
                .clientKey("")
                .server("")
                .build()
        );

    }
}
