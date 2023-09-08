package p973h6;

import android.app.Activity;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: h6.a */
public class C87452a implements FlutterPlugin, ActivityAware {

    /* renamed from: d */
    public MethodChannel f253416d;

    /* renamed from: e */
    public C87453b f253417e;

    /* renamed from: f */
    public ActivityPluginBinding f253418f;

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f253418f = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.f253417e);
        this.f253417e.f253420e = this.f253418f.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87453b bVar = new C87453b(flutterPluginBinding.getApplicationContext(), (Activity) null);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_mailer");
        this.f253416d = methodChannel;
        this.f253417e = bVar;
        methodChannel.setMethodCallHandler(bVar);
    }

    public void onDetachedFromActivity() {
        this.f253417e.f253420e = null;
        this.f253418f = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f253416d.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        ActivityPluginBinding activityPluginBinding = this.f253418f;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f253417e);
        }
        this.f253416d = null;
        this.f253417e = null;
        this.f253418f = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
