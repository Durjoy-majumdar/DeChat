package p172io.flutter.embedding.android;

import com.google.android.play.core.splitcompat.SplitCompatApplication;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;

/* renamed from: io.flutter.embedding.android.FlutterPlayStoreSplitApplication */
public class FlutterPlayStoreSplitApplication extends SplitCompatApplication {
    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.google.android.play.core.splitcompat.SplitCompatApplication, io.flutter.embedding.android.FlutterPlayStoreSplitApplication] */
    public void onCreate() {
        FlutterPlayStoreSplitApplication.super.onCreate();
        FlutterInjector.setInstance(new FlutterInjector.Builder().setDeferredComponentManager(new PlayStoreDeferredComponentManager(this, (FlutterJNI) null)).build());
    }
}
