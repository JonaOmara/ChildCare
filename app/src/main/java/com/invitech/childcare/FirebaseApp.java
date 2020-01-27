package com.invitech.childcare;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by invitech on 24-09-2019.
 */
public class FirebaseApp extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
