package com.byteshaft.logindemo.utils;

import android.app.Application;
import android.content.Context;


public class AppGlobals extends Application {

    public static final String KEY_FULLNAME = "full_name";
    public static final String KEY_EMAIL = "email";

    public static final String KEY_USER_TOKEN = "token";
    public static final String KEY_USER_LOGIN = "user_login";

    private static Context sContext;
    public static int postResponse;
    public static int responseCode = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }

    public static void setPostResponse(int value) {
        postResponse = value;
    }

    public static void setResponseCode(int code) {
        responseCode = code;
    }

    public static int getResponseCode() {
        return responseCode;
    }
}
