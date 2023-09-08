package hu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: hu1.c */
public class C87596c implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f253680d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.m105925i("MicroMsg.Flutter.FlutterDataReportPlugin", "onAttachedToEngine FlutterDataReportPlugin CHANNEL%s", "com.tencent.mm.flutter.datareport");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter.datareport");
        this.f253680d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f253680d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        if (str.equals("android_idkey_report")) {
            C117407d.INSTANCE.idkeyStat((long) ((Integer) methodCall.argument("id")).intValue(), (long) ((Integer) methodCall.argument("key")).intValue(), (long) ((Integer) methodCall.argument("value")).intValue(), false);
        } else if (str.equals("android_kv_report")) {
            C117407d.INSTANCE.kvStat(((Integer) methodCall.argument("id")).intValue(), (String) methodCall.argument("value"));
        }
    }
}
