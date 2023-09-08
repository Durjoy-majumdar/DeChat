package p172io.flutter.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import p172io.flutter.app.FlutterActivityDelegate;
import p172io.flutter.plugin.common.PluginRegistry;
import p172io.flutter.view.FlutterNativeView;
import p172io.flutter.view.FlutterView;

@Deprecated
/* renamed from: io.flutter.app.FlutterFragmentActivity */
public class FlutterFragmentActivity extends FragmentActivity implements FlutterView.Provider, PluginRegistry, FlutterActivityDelegate.ViewFactory {
    private final FlutterActivityDelegate delegate;
    private final FlutterActivityEvents eventDelegate;
    private final PluginRegistry pluginRegistry;
    private final FlutterView.Provider viewProvider;

    public FlutterFragmentActivity() {
        FlutterActivityDelegate flutterActivityDelegate = new FlutterActivityDelegate(this, this);
        this.delegate = flutterActivityDelegate;
        this.eventDelegate = flutterActivityDelegate;
        this.viewProvider = flutterActivityDelegate;
        this.pluginRegistry = flutterActivityDelegate;
    }

    public FlutterNativeView createFlutterNativeView() {
        return null;
    }

    public FlutterView createFlutterView(Context context) {
        return null;
    }

    public FlutterView getFlutterView() {
        return this.viewProvider.getFlutterView();
    }

    public final boolean hasPlugin(String str) {
        return this.pluginRegistry.hasPlugin(str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.eventDelegate.onActivityResult(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.eventDelegate.onBackPressed()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.eventDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.eventDelegate.onCreate(bundle);
    }

    public void onDestroy() {
        this.eventDelegate.onDestroy();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.eventDelegate.onLowMemory();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.eventDelegate.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        this.eventDelegate.onPause();
    }

    public void onPostResume() {
        super.onPostResume();
        this.eventDelegate.onPostResume();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.eventDelegate.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onStart() {
        super.onStart();
        this.eventDelegate.onStart();
    }

    public void onStop() {
        this.eventDelegate.onStop();
        super.onStop();
    }

    public void onTrimMemory(int i) {
        this.eventDelegate.onTrimMemory(i);
    }

    public void onUserLeaveHint() {
        this.eventDelegate.onUserLeaveHint();
    }

    public final PluginRegistry.Registrar registrarFor(String str) {
        return this.pluginRegistry.registrarFor(str);
    }

    public boolean retainFlutterNativeView() {
        return false;
    }

    public final <T> T valuePublishedByPlugin(String str) {
        return this.pluginRegistry.valuePublishedByPlugin(str);
    }
}
