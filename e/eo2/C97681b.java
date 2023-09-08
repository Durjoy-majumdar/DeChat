package eo2;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import ao2.C79617c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fo2.C116889a;
import fo2.C87029c;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p156gj.C87203t;
import vr2.C37817q;
import zt3.C119157j;

/* renamed from: eo2.b */
public class C97681b {

    /* renamed from: a */
    public static String f286507a = "";

    /* renamed from: b */
    public static String f286508b = "";

    /* renamed from: c */
    public static Map<Integer, String> f286509c = new ConcurrentHashMap();

    /* renamed from: d */
    public static String f286510d = "";

    /* renamed from: e */
    public static Map<Integer, String> f286511e = new ConcurrentHashMap();

    /* renamed from: f */
    public static String f286512f = "";

    /* renamed from: g */
    public static Map<Integer, String> f286513g = new ConcurrentHashMap();

    /* renamed from: h */
    public static String f286514h = "";

    /* renamed from: i */
    public static String f286515i;

    /* renamed from: j */
    public static volatile String f286516j = "";

    /* renamed from: eo2.b$a */
    public class C97682a implements Runnable {
        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
            try {
                synchronized (C97681b.class) {
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                    String str = C97681b.f286516j;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                    if (!Util.isNullOrNil(str)) {
                        Log.m105928w("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, already inited");
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
                        return;
                    }
                    String a = C97681b.m125892a();
                    if (!Util.isNullOrNil(a)) {
                        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                        C97681b.f286516j = a;
                        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                        HashMap<String, HashMap<String, String>> hashMap = C79617c.f233467a;
                        SnsMethodCalculate.markStartTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                        C79617c.m96686e("", "wv_ua_info", a);
                        SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                        Log.m105924i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, refresh");
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th));
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
        }
    }

    /* renamed from: a */
    public static String m125892a() {
        String str;
        String str2;
        String str3;
        String str4;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        String str5 = "";
        SnsMethodCalculate.markStartTimeMs("doGetWebViewUAInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        try {
            Context context = MMApplicationContext.getContext();
            long currentTimeMillis = System.currentTimeMillis();
            boolean f = C31645a.m39491f();
            String b = C116889a.m164872b(context, f);
            long currentTimeMillis2 = System.currentTimeMillis();
            JSONObject a = C87029c.m108054a(context);
            a.put("chrome_version", Util.nullAsNil(b));
            long currentTimeMillis3 = System.currentTimeMillis();
            String str6 = "access$100";
            str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
            long j = currentTimeMillis2 - currentTimeMillis;
            long j2 = currentTimeMillis3 - currentTimeMillis2;
            if (j >= 2000 || j2 >= 1000) {
                str = str6;
                str4 = "doGetWebViewUAInfo";
                try {
                    C37817q.m41545a("webview_ua_info", "ua_time_cost", (int) j, (int) j2, str5);
                } catch (Throwable th) {
                    th = th;
                    str3 = str4;
                    Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th));
                    C115669n.INSTANCE.mo175911u(1893, 5);
                    C37817q.m41545a("webview_ua_info", "webViewUAInfoErr", 0, 0, th.toString());
                    SnsMethodCalculate.markEndTimeMs(str3, str2);
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                    return str5;
                }
            } else {
                str4 = "doGetWebViewUAInfo";
                str = str6;
            }
            String jSONObject = a.toString();
            Log.m105924i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, visitDexOrODex=" + f + ", chromeVerCost=" + j + ", total=" + (currentTimeMillis3 - currentTimeMillis) + ", info=" + jSONObject);
            SnsMethodCalculate.markEndTimeMs(str4, str2);
            str5 = jSONObject;
        } catch (Throwable th4) {
            th = th4;
            str = "access$100";
            str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
            str3 = "doGetWebViewUAInfo";
            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th));
            C115669n.INSTANCE.mo175911u(1893, 5);
            C37817q.m41545a("webview_ua_info", "webViewUAInfoErr", 0, 0, th.toString());
            SnsMethodCalculate.markEndTimeMs(str3, str2);
            SnsMethodCalculate.markEndTimeMs(str, str2);
            return str5;
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
        return str5;
    }

    /* renamed from: b */
    public static String m125893b() {
        SnsMethodCalculate.markStartTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        try {
            if (!Util.isNullOrNil(f286515i)) {
                Log.m105918d("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getAndroidUserAgent, sysUa=" + f286515i);
                String str = f286515i;
                SnsMethodCalculate.markEndTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                return str;
            }
            long currentTimeMillis = System.currentTimeMillis();
            f286515i = Util.nullAsNil(System.getProperty("http.agent"));
            Log.m105924i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getAndroidUserAgent, cost=" + (System.currentTimeMillis() - currentTimeMillis) + ", sysUa" + f286515i);
            String str2 = f286515i;
            SnsMethodCalculate.markEndTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str2;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getAndroidUserAgent: " + th.toString());
            SnsMethodCalculate.markEndTimeMs("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return "";
        }
    }

    /* renamed from: c */
    public static String m125894c(int i) {
        Context context;
        SnsMethodCalculate.markStartTimeMs("getDeviceId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        String str = (String) ((ConcurrentHashMap) f286509c).get(Integer.valueOf(i));
        if (!Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getDeviceId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 && i2 >= 23 && (context = MMApplicationContext.getContext()) != null) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    TelephonyManager cast = TelephonyManager.class.cast(systemService);
                    if (cast != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i));
                        String str2 = (String) C117292a.m165364j(cast, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/device/utils/DeviceInfoUtils", "getDeviceId", "(I)Ljava/lang/String;", "android/telephony/TelephonyManager", "getDeviceId", "(I)Ljava/lang/String;");
                        if (!Util.isNullOrNil(str2)) {
                            ((ConcurrentHashMap) f286509c).put(Integer.valueOf(i), str2);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getDeviceId" + i + ": " + th.toString());
            }
        }
        String nullAsNil = Util.nullAsNil((String) ((ConcurrentHashMap) f286509c).get(Integer.valueOf(i)));
        SnsMethodCalculate.markEndTimeMs("getDeviceId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return nullAsNil;
    }

    /* renamed from: d */
    public static String m125895d(int i) {
        Context context;
        SnsMethodCalculate.markStartTimeMs("getIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        String str = (String) ((ConcurrentHashMap) f286511e).get(Integer.valueOf(i));
        if (!Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 && i2 >= 26 && (context = MMApplicationContext.getContext()) != null) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    TelephonyManager cast = TelephonyManager.class.cast(systemService);
                    if (cast != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i));
                        String str2 = (String) C117292a.m165364j(cast, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/device/utils/DeviceInfoUtils", "getIMEI", "(I)Ljava/lang/String;", "android/telephony/TelephonyManager", "getImei", "(I)Ljava/lang/String;");
                        if (!Util.isNullOrNil(str2)) {
                            ((ConcurrentHashMap) f286511e).put(Integer.valueOf(i), str2);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getIMEI" + i + ": " + th.toString());
            }
        }
        String nullAsNil = Util.nullAsNil((String) ((ConcurrentHashMap) f286511e).get(Integer.valueOf(i)));
        SnsMethodCalculate.markEndTimeMs("getIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return nullAsNil;
    }

    /* renamed from: e */
    public static String m125896e() {
        SnsMethodCalculate.markStartTimeMs("getIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        try {
            String f = C87203t.m108270f(false);
            SnsMethodCalculate.markEndTimeMs("getIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return f;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getIMEIWx: " + th.toString());
            SnsMethodCalculate.markEndTimeMs("getIMEIWx", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return "";
        }
    }

    /* renamed from: f */
    public static String m125897f(int i) {
        Context context;
        SnsMethodCalculate.markStartTimeMs("getMEID", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        String str = (String) ((ConcurrentHashMap) f286513g).get(Integer.valueOf(i));
        if (!Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getMEID", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 && i2 >= 26 && (context = MMApplicationContext.getContext()) != null) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    TelephonyManager cast = TelephonyManager.class.cast(systemService);
                    if (cast != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i));
                        String str2 = (String) C117292a.m165364j(cast, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/device/utils/DeviceInfoUtils", "getMEID", "(I)Ljava/lang/String;", "android/telephony/TelephonyManager", "getMeid", "(I)Ljava/lang/String;");
                        if (!Util.isNullOrNil(str2)) {
                            ((ConcurrentHashMap) f286513g).put(Integer.valueOf(i), str2);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getMEID" + i + ": " + th.toString());
            }
        }
        String nullAsNil = Util.nullAsNil((String) ((ConcurrentHashMap) f286513g).get(Integer.valueOf(i)));
        SnsMethodCalculate.markEndTimeMs("getMEID", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return nullAsNil;
    }

    /* renamed from: g */
    public static String m125898g() {
        SnsMethodCalculate.markStartTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        if (!Util.isNullOrNil(f286507a)) {
            String str = f286507a;
            SnsMethodCalculate.markEndTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        try {
            String l = C87203t.m108276l();
            f286507a = l;
            if (Util.isNullOrNil(l)) {
                Log.m105928w("AdDeviceInfo.DeviceInfoUtils", "oaid is empty");
            }
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getOAID: " + th.toString());
            C115669n.INSTANCE.mo175911u(1896, 12);
            C37817q.m41545a("oaid_empty2", "exp", 0, 0, "");
        }
        String str2 = f286507a;
        SnsMethodCalculate.markEndTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return str2;
    }

    /* renamed from: h */
    public static String m125899h(boolean z) {
        SnsMethodCalculate.markStartTimeMs("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        if (z) {
            C115669n.INSTANCE.mo175911u(1893, 8);
        } else {
            C115669n.INSTANCE.mo175911u(1893, 9);
        }
        if (!Util.isNullOrNil(f286516j)) {
            Log.m105918d("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, info=" + f286516j + ", isPreload=" + z);
            if (z) {
                C115669n.INSTANCE.mo175911u(1893, 10);
            } else {
                C115669n.INSTANCE.mo175911u(1893, 11);
            }
            String str = f286516j;
            SnsMethodCalculate.markEndTimeMs("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C97682a());
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, HashMap<String, String>> hashMap = C79617c.f233467a;
        SnsMethodCalculate.markStartTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        String c = C79617c.m96684c("", "wv_ua_info");
        SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        Log.m105924i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, useLocal, cost=" + (System.currentTimeMillis() - currentTimeMillis) + ", value=" + c);
        SnsMethodCalculate.markEndTimeMs("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return c;
    }
}
