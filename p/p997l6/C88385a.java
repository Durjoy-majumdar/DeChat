package p997l6;

import android.os.Build;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: l6.a */
public final class C88385a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f255377d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "home_generator");
        this.f255377d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f255377d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        } else {
            C87412m.m108603p("channel");
            throw null;
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C87412m.m108594g(methodCall, "call");
        C87412m.m108594g(result, "result");
        if (C87412m.m108589b(methodCall.method, "getPlatformVersion")) {
            result.success(C87412m.m108600m("Android ", Build.VERSION.RELEASE));
        } else {
            result.notImplemented();
        }
    }
}
