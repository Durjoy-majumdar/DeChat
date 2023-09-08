package p1007mc;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p1007mc.C88723a;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: mc.b */
public final class C88726b implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f256087d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "flutterPluginBinding");
        Log.m105925i("MicroMsg.SkylineCrashReportPlugin", "onAttachedToEngine SkylineCrashReportPlugin CHANNEL%s", "com.tencent.skyline.crashreport");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.skyline.crashreport");
        this.f256087d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = this.f256087d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C87412m.m108594g(methodCall, "methodCall");
        C87412m.m108594g(result, "result");
        Log.m105925i("MicroMsg.SkylineCrashReportPlugin", "onMethodCall method", methodCall.method);
        if (C87412m.m108589b(methodCall.method, "crash_report")) {
            Map map = (Map) methodCall.argument("crashInfo");
            if (map == null) {
                map = new HashMap();
            }
            Boolean bool = (Boolean) methodCall.argument("killSelf");
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            String valueOf = String.valueOf(map.get("deviceParameters"));
            String valueOf2 = String.valueOf(map.get("customParameters"));
            String valueOf3 = String.valueOf(map.get("applicationParameters"));
            String valueOf4 = String.valueOf(map.get("dateTime"));
            String valueOf5 = String.valueOf(map.get("context"));
            StringBuilder sb = new StringBuilder();
            sb.append(map.get("error"));
            sb.append(10);
            sb.append(map.get("stackTrace"));
            String sb4 = sb.toString();
            C87412m.m108594g(sb4, "crashContent");
            C88723a.f256079a.mo113338a(new C88723a.C88725b(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, sb4, booleanValue ? 1 : 0));
        }
    }
}
