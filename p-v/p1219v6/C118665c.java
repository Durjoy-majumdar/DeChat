package p1219v6;

import android.app.Activity;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: v6.c */
public class C118665c implements FlutterPlugin, ActivityAware {

    /* renamed from: d */
    public FlutterPlugin.FlutterPluginBinding f355075d;

    /* renamed from: e */
    public C118664b f355076e;

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C118664b bVar = new C118664b();
        this.f355076e = bVar;
        Activity activity = activityPluginBinding.getActivity();
        BinaryMessenger binaryMessenger = this.f355075d.getBinaryMessenger();
        bVar.f355070d = activity;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "sososdk.github.com/orientation");
        bVar.f355071e = methodChannel;
        methodChannel.setMethodCallHandler(bVar);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "sososdk.github.com/orientationEvent");
        bVar.f355072f = eventChannel;
        eventChannel.setStreamHandler(new C118662a(bVar, activity));
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f355075d = flutterPluginBinding;
    }

    public void onDetachedFromActivity() {
        C118664b bVar = this.f355076e;
        if (bVar != null) {
            bVar.f355070d = null;
            MethodChannel methodChannel = bVar.f355071e;
            if (methodChannel != null) {
                methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
                bVar.f355071e = null;
            }
            EventChannel eventChannel = bVar.f355072f;
            if (eventChannel != null) {
                eventChannel.setStreamHandler((EventChannel.StreamHandler) null);
                bVar.f355072f = null;
            }
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f355075d = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
