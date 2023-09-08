package p172io.flutter.plugin.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import p172io.flutter.plugin.platform.PlatformViewRegistry;
import p172io.flutter.view.FlutterNativeView;
import p172io.flutter.view.FlutterView;
import p172io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.plugin.common.PluginRegistry */
public interface PluginRegistry {

    /* renamed from: io.flutter.plugin.common.PluginRegistry$ActivityResultListener */
    public interface ActivityResultListener {
        boolean onActivityResult(int i, int i2, Intent intent);
    }

    /* renamed from: io.flutter.plugin.common.PluginRegistry$NewIntentListener */
    public interface NewIntentListener {
        boolean onNewIntent(Intent intent);
    }

    @Deprecated
    /* renamed from: io.flutter.plugin.common.PluginRegistry$PluginRegistrantCallback */
    public interface PluginRegistrantCallback {
        void registerWith(PluginRegistry pluginRegistry);
    }

    @Deprecated
    /* renamed from: io.flutter.plugin.common.PluginRegistry$Registrar */
    public interface Registrar {
        Context activeContext();

        Activity activity();

        Registrar addActivityResultListener(ActivityResultListener activityResultListener);

        Registrar addNewIntentListener(NewIntentListener newIntentListener);

        Registrar addRequestPermissionsResultListener(RequestPermissionsResultListener requestPermissionsResultListener);

        Registrar addUserLeaveHintListener(UserLeaveHintListener userLeaveHintListener);

        Registrar addViewDestroyListener(ViewDestroyListener viewDestroyListener);

        Context context();

        String lookupKeyForAsset(String str);

        String lookupKeyForAsset(String str, String str2);

        BinaryMessenger messenger();

        PlatformViewRegistry platformViewRegistry();

        Registrar publish(Object obj);

        TextureRegistry textures();

        FlutterView view();
    }

    /* renamed from: io.flutter.plugin.common.PluginRegistry$RequestPermissionsResultListener */
    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: io.flutter.plugin.common.PluginRegistry$UserLeaveHintListener */
    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    @Deprecated
    /* renamed from: io.flutter.plugin.common.PluginRegistry$ViewDestroyListener */
    public interface ViewDestroyListener {
        boolean onViewDestroy(FlutterNativeView flutterNativeView);
    }

    @Deprecated
    boolean hasPlugin(String str);

    @Deprecated
    Registrar registrarFor(String str);

    @Deprecated
    <T> T valuePublishedByPlugin(String str);
}
