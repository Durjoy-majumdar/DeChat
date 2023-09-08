package p172io.flutter.app;

import android.app.Activity;
import android.app.Application;
import p172io.flutter.FlutterInjector;

/* renamed from: io.flutter.app.FlutterApplication */
public class FlutterApplication extends Application {
    private Activity mCurrentActivity = null;

    public Activity getCurrentActivity() {
        return this.mCurrentActivity;
    }

    public void onCreate() {
        super.onCreate();
        FlutterInjector.instance().flutterLoader().startInitialization(this);
    }

    public void setCurrentActivity(Activity activity) {
        this.mCurrentActivity = activity;
    }
}
