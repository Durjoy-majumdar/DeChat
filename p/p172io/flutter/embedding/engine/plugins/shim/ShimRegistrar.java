package p172io.flutter.embedding.engine.plugins.shim;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p172io.flutter.FlutterInjector;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.PluginRegistry;
import p172io.flutter.plugin.platform.PlatformViewRegistry;
import p172io.flutter.view.FlutterNativeView;
import p172io.flutter.view.FlutterView;
import p172io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.embedding.engine.plugins.shim.ShimRegistrar */
class ShimRegistrar implements PluginRegistry.Registrar, FlutterPlugin, ActivityAware {
    private static final String TAG = "ShimRegistrar";
    private ActivityPluginBinding activityPluginBinding;
    private final Set<PluginRegistry.ActivityResultListener> activityResultListeners = new HashSet();
    private final Map<String, Object> globalRegistrarMap;
    private final Set<PluginRegistry.NewIntentListener> newIntentListeners = new HashSet();
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private final String pluginId;
    private final Set<PluginRegistry.RequestPermissionsResultListener> requestPermissionsResultListeners = new HashSet();
    private final Set<PluginRegistry.UserLeaveHintListener> userLeaveHintListeners = new HashSet();
    private final Set<PluginRegistry.ViewDestroyListener> viewDestroyListeners = new HashSet();

    public ShimRegistrar(String str, Map<String, Object> map) {
        this.pluginId = str;
        this.globalRegistrarMap = map;
    }

    private void addExistingListenersToActivityPluginBinding() {
        for (PluginRegistry.RequestPermissionsResultListener addRequestPermissionsResultListener : this.requestPermissionsResultListeners) {
            this.activityPluginBinding.addRequestPermissionsResultListener(addRequestPermissionsResultListener);
        }
        for (PluginRegistry.ActivityResultListener addActivityResultListener : this.activityResultListeners) {
            this.activityPluginBinding.addActivityResultListener(addActivityResultListener);
        }
        for (PluginRegistry.NewIntentListener addOnNewIntentListener : this.newIntentListeners) {
            this.activityPluginBinding.addOnNewIntentListener(addOnNewIntentListener);
        }
        for (PluginRegistry.UserLeaveHintListener addOnUserLeaveHintListener : this.userLeaveHintListeners) {
            this.activityPluginBinding.addOnUserLeaveHintListener(addOnUserLeaveHintListener);
        }
    }

    public Context activeContext() {
        return this.activityPluginBinding == null ? context() : activity();
    }

    public Activity activity() {
        ActivityPluginBinding activityPluginBinding2 = this.activityPluginBinding;
        if (activityPluginBinding2 != null) {
            return activityPluginBinding2.getActivity();
        }
        return null;
    }

    public PluginRegistry.Registrar addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
        this.activityResultListeners.add(activityResultListener);
        ActivityPluginBinding activityPluginBinding2 = this.activityPluginBinding;
        if (activityPluginBinding2 != null) {
            activityPluginBinding2.addActivityResultListener(activityResultListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
        this.newIntentListeners.add(newIntentListener);
        ActivityPluginBinding activityPluginBinding2 = this.activityPluginBinding;
        if (activityPluginBinding2 != null) {
            activityPluginBinding2.addOnNewIntentListener(newIntentListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
        this.requestPermissionsResultListeners.add(requestPermissionsResultListener);
        ActivityPluginBinding activityPluginBinding2 = this.activityPluginBinding;
        if (activityPluginBinding2 != null) {
            activityPluginBinding2.addRequestPermissionsResultListener(requestPermissionsResultListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
        this.userLeaveHintListeners.add(userLeaveHintListener);
        ActivityPluginBinding activityPluginBinding2 = this.activityPluginBinding;
        if (activityPluginBinding2 != null) {
            activityPluginBinding2.addOnUserLeaveHintListener(userLeaveHintListener);
        }
        return this;
    }

    public PluginRegistry.Registrar addViewDestroyListener(PluginRegistry.ViewDestroyListener viewDestroyListener) {
        this.viewDestroyListeners.add(viewDestroyListener);
        return this;
    }

    public Context context() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getApplicationContext();
        }
        return null;
    }

    public String lookupKeyForAsset(String str) {
        return FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(str);
    }

    public BinaryMessenger messenger() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getBinaryMessenger();
        }
        return null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding2) {
        Log.m165290v(TAG, "Attached to an Activity.");
        this.activityPluginBinding = activityPluginBinding2;
        addExistingListenersToActivityPluginBinding();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.m165290v(TAG, "Attached to FlutterEngine.");
        this.pluginBinding = flutterPluginBinding;
    }

    public void onDetachedFromActivity() {
        Log.m165290v(TAG, "Detached from an Activity.");
        this.activityPluginBinding = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        Log.m165290v(TAG, "Detached from an Activity for config changes.");
        this.activityPluginBinding = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.m165290v(TAG, "Detached from FlutterEngine.");
        for (PluginRegistry.ViewDestroyListener onViewDestroy : this.viewDestroyListeners) {
            onViewDestroy.onViewDestroy((FlutterNativeView) null);
        }
        this.pluginBinding = null;
        this.activityPluginBinding = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding2) {
        Log.m165290v(TAG, "Reconnected to an Activity after config changes.");
        this.activityPluginBinding = activityPluginBinding2;
        addExistingListenersToActivityPluginBinding();
    }

    public PlatformViewRegistry platformViewRegistry() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getPlatformViewRegistry();
        }
        return null;
    }

    public PluginRegistry.Registrar publish(Object obj) {
        this.globalRegistrarMap.put(this.pluginId, obj);
        return this;
    }

    public TextureRegistry textures() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getTextureRegistry();
        }
        return null;
    }

    public FlutterView view() {
        throw new UnsupportedOperationException("The new embedding does not support the old FlutterView.");
    }

    public String lookupKeyForAsset(String str, String str2) {
        return FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(str, str2);
    }
}
