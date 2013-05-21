package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SignUpCallback;

import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		//Parse.initialize(this, "pzO2Z8rqw2V7q0B9Pmn1dpzQfeZwvZ5RVyFOlviR", "zODqX3jQh4zN9GHuTtVTG7PcXlIZJrOP25AHC019");
		 Parse.initialize(this, "oCDhJCuOGcGYLBxVBU2ATWK0Yq6vLvRfvKHjUJ0d", "AOyVKtW72DNGnLVVdnq5OpIh5YSOcXFet19yhcQD"); 

		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "jd");
		testObject.saveInBackground();
		
		ParseObject Usuario = new ParseObject("Usuarios");
		Usuario.put("UserName", "dguzman");
		Usuario.put("Password","106");
		Usuario.saveInBackground();
		
	}

}
