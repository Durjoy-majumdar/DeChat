package a10;

import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* renamed from: a10.m */
public final class C112722m implements FlutterPlugin, ActivityAware {

    /* renamed from: d */
    public final C112720l f337499d;

    public C112722m(C112720l lVar) {
        C87412m.m108594g(lVar, "rootEngineActivityAware");
        this.f337499d = lVar;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f337499d.onAttachedToActivity(activityPluginBinding);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
    }

    public void onDetachedFromActivity() {
        this.f337499d.onDetachedFromActivity();
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f337499d.onDetachedFromActivityForConfigChanges();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f337499d.onReattachedToActivityForConfigChanges(activityPluginBinding);
    }
}
