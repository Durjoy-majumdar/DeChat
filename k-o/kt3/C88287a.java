package kt3;

import android.os.Build;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: kt3.a */
public final class C88287a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f255198d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "skyline_android_lib");
        this.f255198d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f255198d;
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
