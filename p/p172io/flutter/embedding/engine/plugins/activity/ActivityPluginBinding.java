package p172io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.os.Bundle;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding */
public interface ActivityPluginBinding {

    /* renamed from: io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding$OnSaveInstanceStateListener */
    public interface OnSaveInstanceStateListener {
        void onRestoreInstanceState(Bundle bundle);

        void onSaveInstanceState(Bundle bundle);
    }

    void addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener);

    void addOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener);

    void addOnSaveStateListener(OnSaveInstanceStateListener onSaveInstanceStateListener);

    void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener);

    void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);

    Activity getActivity();

    Object getLifecycle();

    void removeActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener);

    void removeOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener);

    void removeOnSaveStateListener(OnSaveInstanceStateListener onSaveInstanceStateListener);

    void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener);

    void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);
}
