package com.example.optikokuyucu;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Firebase yapılandırmasını sağlayın
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setApplicationId("YOUR_APP_ID") // Firebase konsolundan alın
                .setApiKey("YOUR_API_KEY") // Firebase konsolundan alın
                .build();

        // FirebaseApp'ı başlatın
        FirebaseApp.initializeApp(this, options);
    }
}