package test.android.orca.com.mvvm_test.view;

import android.app.Application;
import android.content.Context;

public class GlobalActivity extends Application {
    private static Context appContext;
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();

        /* If you has other classes that need context object to initialize when application is created,
         you can use the appContext here to process. */
    }

    public static Context getAppContext() {
        return appContext;
    }
}
