package p172io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.util.Log;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: io.flutter.plugins.urllauncher.UrlLauncherPlugin */
public final class UrlLauncherPlugin implements FlutterPlugin, ActivityAware {
    private static final String TAG = "UrlLauncherPlugin";
    private MethodCallHandlerImpl methodCallHandler;
    private UrlLauncher urlLauncher;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new MethodCallHandlerImpl(new UrlLauncher(registrar.context(), registrar.activity())).startListening(registrar.messenger());
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        if (this.methodCallHandler == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            this.urlLauncher.setActivity(activityPluginBinding.getActivity());
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        UrlLauncher urlLauncher2 = new UrlLauncher(flutterPluginBinding.getApplicationContext(), (Activity) null);
        this.urlLauncher = urlLauncher2;
        MethodCallHandlerImpl methodCallHandlerImpl = new MethodCallHandlerImpl(urlLauncher2);
        this.methodCallHandler = methodCallHandlerImpl;
        methodCallHandlerImpl.startListening(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        if (this.methodCallHandler == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            this.urlLauncher.setActivity((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodCallHandlerImpl methodCallHandlerImpl = this.methodCallHandler;
        if (methodCallHandlerImpl == null) {
            Log.wtf(TAG, "Already detached from the engine.");
            return;
        }
        methodCallHandlerImpl.stopListening();
        this.methodCallHandler = null;
        this.urlLauncher = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
