package hu1;

import android.os.Process;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: hu1.b */
public class C87595b implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f253679d;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.m105925i("MicroMsg.Flutter.FlutterCrashReportPlugin", "onAttachedToEngine FlutterCrashReportPlugin CHANNEL%s", "com.tencent.mm.flutter.crashreport");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter.crashreport");
        this.f253679d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f253679d.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        StringBuffer stringBuffer;
        int i;
        MultiProcessMMKV multiDefault;
        String string;
        MethodCall methodCall2 = methodCall;
        Log.m105919d("MicroMsg.Flutter.FlutterCrashReportPlugin", "onMethodCall method", methodCall2.method);
        String str = methodCall2.method;
        str.getClass();
        if (str.equals("crash_report")) {
            Map map = (Map) methodCall2.argument("crashInfo");
            String str2 = (String) methodCall2.argument("sessionId");
            boolean booleanValue = ((Boolean) methodCall2.argument("killSelf")).booleanValue();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("\n#deviceParameters=" + map.get("deviceParameters"));
            stringBuffer2.append("\n#customParameters=" + map.get("customParameters"));
            stringBuffer2.append("\n#applicationParameters=" + map.get("applicationParameters"));
            stringBuffer2.append("\n#dateTime=" + map.get("dateTime"));
            stringBuffer2.append("\n#context=" + map.get("context"));
            Map map2 = (Map) map.get("customParameters");
            C87412m.m108591d(map2);
            if (!map2.containsKey("WxaLiteApp") || (string = multiDefault.getString("wxa_lite_app_game_center_version", "")) == null) {
                stringBuffer = stringBuffer2;
                i = 2;
            } else {
                if (booleanValue) {
                    int i2 = (multiDefault = MultiProcessMMKV.getMultiDefault()).getInt("count_" + string, 0);
                    long j = multiDefault.getLong("time_" + string, 0);
                    stringBuffer = stringBuffer2;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - j > 3600000) {
                        multiDefault.putInt("count_" + string, 1);
                    } else {
                        multiDefault.putInt("count_" + string, i2 + 1);
                    }
                    multiDefault.putLong("time_" + string, currentTimeMillis);
                    Log.m105925i("MicroMsg.WxaLiteAppCrashReportHandler", "WxaLiteApp handle crash. version:%s count%d time:%s now:%s", string, Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(currentTimeMillis));
                    multiDefault.commit();
                } else {
                    stringBuffer = stringBuffer2;
                    Log.m105925i("MicroMsg.WxaLiteAppCrashReportHandler", "WxaLiteApp handle state error . version:%s", string);
                }
                Object obj = map.get("error");
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                if (str3.length() >= 10) {
                    str3 = str3.substring(0, 10);
                    C87412m.m108593f(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                if (booleanValue) {
                    C115669n.INSTANCE.mo175913w(1293, 103, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1293, 104, 1);
                }
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[3];
                objArr[0] = string;
                objArr[1] = booleanValue ? AppMeasurement.CRASH_ORIGIN : "bad state only";
                i = 2;
                objArr[2] = str3;
                nVar.mo160131h(20315, objArr);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            Object[] objArr2 = new Object[i];
            objArr2[0] = "FlutterCrash";
            objArr2[1] = str2;
            Log.m105925i("MicroMsg.Flutter.FlutterReportLogic", "reportFlutterActionAction %s %s", objArr2);
            C117407d dVar = C117407d.INSTANCE;
            Object[] objArr3 = new Object[3];
            objArr3[0] = Long.valueOf(currentTimeMillis2);
            objArr3[1] = "FlutterCrash";
            objArr3[i] = str2;
            dVar.mo160131h(17326, objArr3);
            dVar.idkeyStat(1053, (long) i, 1, false);
            String stringBuffer3 = stringBuffer.toString();
            CrashReportFactory.reportCrashMessage(stringBuffer3, "Flutter\n\tErrorMsg=" + map.get("error") + "\n" + map.get("stackTrace") + "\nkillSelf" + booleanValue);
            Log.appenderFlushSync();
            if (!BuildInfo.DEBUG && booleanValue) {
                Log.appenderClose();
                int myPid = Process.myPid();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(myPid));
                Object obj2 = new Object();
                C117292a.m165358d(obj2, aVar.mo10232b(), "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj2, "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                Object obj3 = new Object();
                C117292a.m165358d(obj3, aVar2.mo10232b(), "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "java/lang/System_EXEC_", "exit", "(I)V");
                System.exit(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(obj3, "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            }
        }
    }
}
