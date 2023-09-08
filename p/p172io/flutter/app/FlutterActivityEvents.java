package p172io.flutter.app;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: io.flutter.app.FlutterActivityEvents */
public interface FlutterActivityEvents extends ComponentCallbacks2, PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {
    boolean onBackPressed();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onNewIntent(Intent intent);

    void onPause();

    void onPostResume();

    void onResume();

    void onStart();

    void onStop();

    void onUserLeaveHint();
}
