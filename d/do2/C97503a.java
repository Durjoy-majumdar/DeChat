package do2;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import eo2.C31645a;
import eo2.C45680c;
import eo2.C97681b;
import h81.C32735h;
import j20.C117292a;
import org.json.JSONObject;
import p156gj.C87203t;
import vr2.C37817q;

/* renamed from: do2.a */
public class C97503a {

    /* renamed from: do2.a$a */
    public static final class C97504a {

        /* renamed from: a */
        public String f286156a;

        /* renamed from: b */
        public String f286157b;

        /* renamed from: c */
        public String f286158c;

        /* renamed from: d */
        public String f286159d;

        /* renamed from: e */
        public String f286160e;

        /* renamed from: f */
        public String f286161f;

        /* renamed from: g */
        public String f286162g;

        /* renamed from: h */
        public String f286163h;

        /* renamed from: i */
        public String f286164i;

        /* renamed from: j */
        public String f286165j;

        /* renamed from: k */
        public String f286166k;

        /* renamed from: l */
        public String f286167l;

        /* renamed from: m */
        public String f286168m;

        /* renamed from: n */
        public boolean f286169n;

        /* renamed from: o */
        public String f286170o;

        /* renamed from: p */
        public int f286171p;

        /* renamed from: q */
        public String f286172q;

        /* renamed from: r */
        public String f286173r;

        /* renamed from: s */
        public boolean f286174s;

        /* renamed from: t */
        public boolean f286175t;

        /* renamed from: a */
        public static C97504a m125624a(C97504a aVar, boolean z, boolean z2) {
            boolean z3;
            String str;
            String str2;
            boolean z4;
            String str3;
            String str4;
            String str5;
            String str6;
            Context context;
            Context context2;
            Context context3;
            Context context4;
            C97504a aVar2 = aVar;
            boolean z5 = z;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            aVar.getClass();
            Class cls = C32735h.class;
            SnsMethodCalculate.markStartTimeMs("genAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            aVar2.f286174s = z5;
            aVar2.f286175t = z2;
            long currentTimeMillis = System.currentTimeMillis();
            if (C31645a.m39488c()) {
                SnsMethodCalculate.markStartTimeMs("genOAID", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286156a = C97681b.m125898g();
                SnsMethodCalculate.markEndTimeMs("genOAID", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            } else {
                C115669n.INSTANCE.mo175911u(1896, 11);
            }
            SnsMethodCalculate.markStartTimeMs("isReportIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            try {
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_imei_switch, 1);
                if (Qe == 0) {
                    Log.m105918d("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportIMEI is false");
                }
                z3 = Qe == 1;
                SnsMethodCalculate.markEndTimeMs("isReportIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            } catch (Throwable th) {
                Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportIMEI, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("isReportIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
                z3 = false;
            }
            if (z3) {
                SnsMethodCalculate.markStartTimeMs("genDeviceId", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                String str7 = C97681b.f286507a;
                SnsMethodCalculate.markStartTimeMs("getDeviceId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                str2 = "access$000";
                if (!Util.isNullOrNil(C97681b.f286508b)) {
                    str3 = C97681b.f286508b;
                    SnsMethodCalculate.markEndTimeMs("getDeviceId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                    str = "genAllDeviceInfo";
                } else {
                    if (Build.VERSION.SDK_INT < 29 && (context4 = MMApplicationContext.getContext()) != null) {
                        try {
                            Object systemService = context4.getSystemService("phone");
                            if (systemService instanceof TelephonyManager) {
                                TelephonyManager cast = TelephonyManager.class.cast(systemService);
                                if (cast != null) {
                                    String str8 = (String) C117292a.m165363i(cast, "com/tencent/mm/plugin/sns/ad/device/utils/DeviceInfoUtils", "getDeviceId", "()Ljava/lang/String;", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;");
                                    if (!Util.isNullOrNil(str8)) {
                                        C97681b.f286508b = str8;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            StringBuilder sb = new StringBuilder();
                            str = "genAllDeviceInfo";
                            sb.append("AdDeviceInfo.DeviceInfoUtils.getDeviceId: ");
                            sb.append(th4.toString());
                            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", sb.toString());
                        }
                    }
                    str = "genAllDeviceInfo";
                    str3 = C97681b.f286508b;
                    SnsMethodCalculate.markEndTimeMs("getDeviceId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                }
                aVar2.f286158c = str3;
                SnsMethodCalculate.markEndTimeMs("genDeviceId", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genDeviceId0", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286159d = C97681b.m125894c(0);
                SnsMethodCalculate.markEndTimeMs("genDeviceId0", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genDeviceId1", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286160e = C97681b.m125894c(1);
                SnsMethodCalculate.markEndTimeMs("genDeviceId1", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genIMEI", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("getIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                if (!Util.isNullOrNil(C97681b.f286510d)) {
                    str4 = C97681b.f286510d;
                    SnsMethodCalculate.markEndTimeMs("getIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29 && i >= 26 && (context3 = MMApplicationContext.getContext()) != null) {
                        try {
                            Object systemService2 = context3.getSystemService("phone");
                            if (systemService2 instanceof TelephonyManager) {
                                TelephonyManager cast2 = TelephonyManager.class.cast(systemService2);
                                if (cast2 != null) {
                                    String str9 = (String) C117292a.m165363i(cast2, "com/tencent/mm/plugin/sns/ad/device/utils/DeviceInfoUtils", "getIMEI", "()Ljava/lang/String;", "android/telephony/TelephonyManager", "getImei", "()Ljava/lang/String;");
                                    if (!Util.isNullOrNil(str9)) {
                                        C97681b.f286510d = str9;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getIMEI: " + th5.toString());
                        }
                    }
                    str4 = C97681b.f286510d;
                    SnsMethodCalculate.markEndTimeMs("getIMEI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                }
                aVar2.f286161f = str4;
                SnsMethodCalculate.markEndTimeMs("genIMEI", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genIMEI0", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286162g = C97681b.m125895d(0);
                SnsMethodCalculate.markEndTimeMs("genIMEI0", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genIMEI1", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286163h = C97681b.m125895d(1);
                SnsMethodCalculate.markEndTimeMs("genIMEI1", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genMEID", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("getMEID", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                if (!Util.isNullOrNil(C97681b.f286512f)) {
                    str5 = C97681b.f286512f;
                    SnsMethodCalculate.markEndTimeMs("getMEID", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 29 && i2 >= 26 && (context2 = MMApplicationContext.getContext()) != null) {
                        try {
                            Object systemService3 = context2.getSystemService("phone");
                            if (systemService3 instanceof TelephonyManager) {
                                TelephonyManager cast3 = TelephonyManager.class.cast(systemService3);
                                if (cast3 != null) {
                                    String str10 = (String) C117292a.m165363i(cast3, "com/tencent/mm/plugin/sns/ad/device/utils/DeviceInfoUtils", "getMEID", "()Ljava/lang/String;", "android/telephony/TelephonyManager", "getMeid", "()Ljava/lang/String;");
                                    if (!Util.isNullOrNil(str10)) {
                                        C97681b.f286512f = str10;
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getMEID: " + th6.toString());
                        }
                    }
                    str5 = C97681b.f286512f;
                    SnsMethodCalculate.markEndTimeMs("getMEID", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                }
                aVar2.f286164i = str5;
                SnsMethodCalculate.markEndTimeMs("genMEID", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genMEID0", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286165j = C97681b.m125897f(0);
                SnsMethodCalculate.markEndTimeMs("genMEID0", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genMEID1", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286166k = C97681b.m125897f(1);
                SnsMethodCalculate.markEndTimeMs("genMEID1", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("genIMSI", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                SnsMethodCalculate.markStartTimeMs("getIMSI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                if (!Util.isNullOrNil(C97681b.f286514h)) {
                    str6 = C97681b.f286514h;
                    SnsMethodCalculate.markEndTimeMs("getIMSI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                } else {
                    if (Build.VERSION.SDK_INT < 29 && (context = MMApplicationContext.getContext()) != null) {
                        try {
                            Object systemService4 = context.getSystemService("phone");
                            if (systemService4 instanceof TelephonyManager) {
                                TelephonyManager cast4 = TelephonyManager.class.cast(systemService4);
                                if (cast4 != null) {
                                    String str11 = (String) C117292a.m165363i(cast4, "com/tencent/mm/plugin/sns/ad/device/utils/DeviceInfoUtils", "getIMSI", "()Ljava/lang/String;", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;");
                                    if (!TextUtils.isEmpty(str11)) {
                                        C97681b.f286514h = str11;
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            Log.m105920e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getIMSI: " + th7.toString());
                        }
                    }
                    str6 = C97681b.f286514h;
                    SnsMethodCalculate.markEndTimeMs("getIMSI", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                }
                aVar2.f286167l = str6;
                SnsMethodCalculate.markEndTimeMs("genIMSI", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            } else {
                str2 = "access$000";
                str = "genAllDeviceInfo";
            }
            if (C31645a.m39487b()) {
                SnsMethodCalculate.markStartTimeMs("genIMEIWx", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286157b = C97681b.m125896e();
                SnsMethodCalculate.markEndTimeMs("genIMEIWx", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            }
            SnsMethodCalculate.markStartTimeMs("isReportAndroidId", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            try {
                int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_androidid_switch, 1);
                if (Qe2 == 0) {
                    Log.m105918d("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportAndroidId is false");
                }
                z4 = Qe2 == 1;
                SnsMethodCalculate.markEndTimeMs("isReportAndroidId", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            } catch (Throwable th8) {
                Log.m105920e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportAndroidId, exp=" + th8.toString());
                SnsMethodCalculate.markEndTimeMs("isReportAndroidId", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
                z4 = false;
            }
            if (z4) {
                SnsMethodCalculate.markStartTimeMs("genAndroidId", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                String str12 = C97681b.f286507a;
                SnsMethodCalculate.markStartTimeMs("getAndroidId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                String b = C87203t.m108266b();
                SnsMethodCalculate.markEndTimeMs("getAndroidId", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                aVar2.f286168m = b;
                SnsMethodCalculate.markEndTimeMs("genAndroidId", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            }
            if (C31645a.m39486a()) {
                SnsMethodCalculate.markStartTimeMs("genHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286169n = C45680c.m50875c();
                aVar2.f286170o = C45680c.m50873a("hw_sc.build.platform.version");
                aVar2.f286171p = C45680c.m50874b();
                SnsMethodCalculate.markEndTimeMs("genHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            }
            if (C31645a.m39490e()) {
                SnsMethodCalculate.markStartTimeMs("genWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286172q = C97681b.m125899h(aVar2.f286175t);
                SnsMethodCalculate.markEndTimeMs("genWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            } else {
                C115669n.INSTANCE.mo175911u(1893, 6);
            }
            if (C31645a.m39489d()) {
                SnsMethodCalculate.markStartTimeMs("genSysUa", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
                aVar2.f286173r = C97681b.m125893b();
                SnsMethodCalculate.markEndTimeMs("genSysUa", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m105924i("AdDeviceInfo", "genAllDeviceInfo, timeCost = " + (currentTimeMillis2 - currentTimeMillis) + ", isForJsapi=" + z5);
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            return aVar2;
        }

        /* renamed from: b */
        public static String m125625b(C97504a aVar) {
            long currentTimeMillis;
            JSONObject jSONObject;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            aVar.getClass();
            String str = "";
            SnsMethodCalculate.markStartTimeMs("buildPartDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            try {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(1896, 1);
                currentTimeMillis = System.currentTimeMillis();
                jSONObject = new JSONObject();
                if (!Util.isNullOrNil(aVar.f286156a)) {
                    jSONObject.put("oaid", aVar.f286156a);
                    nVar.mo175911u(1896, 4);
                }
                if (!Util.isNullOrNil(aVar.f286157b)) {
                    jSONObject.put("imeiWx", aVar.f286157b);
                    nVar.mo175911u(1896, 3);
                }
                if (!Util.isNullOrNil(aVar.f286158c)) {
                    jSONObject.put("deviceId", aVar.f286158c);
                    nVar.mo175911u(1896, 5);
                }
                if (!Util.isNullOrNil(aVar.f286159d)) {
                    jSONObject.put("deviceId0", aVar.f286159d);
                }
                if (!Util.isNullOrNil(aVar.f286160e)) {
                    jSONObject.put("deviceId1", aVar.f286160e);
                }
                if (!Util.isNullOrNil(aVar.f286161f)) {
                    jSONObject.put("imei", aVar.f286161f);
                    nVar.mo175911u(1896, 2);
                }
                if (!Util.isNullOrNil(aVar.f286162g)) {
                    jSONObject.put("imei0", aVar.f286162g);
                }
                if (!Util.isNullOrNil(aVar.f286163h)) {
                    jSONObject.put("imei1", aVar.f286163h);
                }
                if (!Util.isNullOrNil(aVar.f286164i)) {
                    jSONObject.put("meid", aVar.f286164i);
                    nVar.mo175911u(1896, 7);
                }
                if (!Util.isNullOrNil(aVar.f286165j)) {
                    jSONObject.put("meid0", aVar.f286165j);
                }
                if (!Util.isNullOrNil(aVar.f286166k)) {
                    jSONObject.put("meid1", aVar.f286166k);
                }
                if (!Util.isNullOrNil(aVar.f286167l)) {
                    jSONObject.put("subscriberId", aVar.f286167l);
                    nVar.mo175911u(1896, 6);
                }
                if (!Util.isNullOrNil((String) null)) {
                    jSONObject.put("uuid", (Object) null);
                }
                if (!Util.isNullOrNil(aVar.f286168m)) {
                    jSONObject.put("androidId", aVar.f286168m);
                    nVar.mo175911u(1896, 8);
                }
                if (C31645a.m39486a() && aVar.f286169n) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_harmony_os", aVar.f286169n);
                    jSONObject2.put(TPDownloadProxyEnum.USER_OS_VERSION, aVar.f286170o);
                    jSONObject2.put("harmony_pure_mode", aVar.f286171p);
                    jSONObject.put("HarmonyInfo", jSONObject2);
                }
                if (!Util.isNullOrNil(aVar.f286172q)) {
                    jSONObject.put("uaBuildInfo", new JSONObject(aVar.f286172q));
                    nVar.mo175911u(1896, 10);
                }
            } catch (Exception e) {
                C115669n.INSTANCE.mo175911u(1893, 7);
                C37817q.m41545a("webview_ua_info", "webViewUAInfoErr", 1, 0, str);
                Log.m105920e("AdDeviceInfo", "webViewUAInfo, info=" + aVar.f286172q + ", exp=" + e.toString());
            } catch (Throwable th) {
                Log.m105920e("AdDeviceInfo", "buildPartDeviceInfo, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("buildPartDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            }
            if (!Util.isNullOrNil(aVar.f286173r)) {
                if (aVar.f286174s) {
                    jSONObject.put("sysUa", aVar.f286173r);
                }
                C115669n.INSTANCE.mo175911u(1896, 9);
            }
            String jSONObject3 = jSONObject.toString();
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m105918d("AdDeviceInfo", "buildPartDeviceInfo, timeCost = " + (currentTimeMillis2 - currentTimeMillis) + ", ret = " + jSONObject3);
            SnsMethodCalculate.markEndTimeMs("buildPartDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            str = jSONObject3;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo$Builder");
            return str;
        }
    }

    /* renamed from: a */
    public static synchronized String m125620a() {
        String nullAsNil;
        synchronized (C97503a.class) {
            SnsMethodCalculate.markStartTimeMs("getAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            C97504a aVar = new C97504a();
            C97504a.m125624a(aVar, false, false);
            nullAsNil = Util.nullAsNil(C97504a.m125625b(aVar));
            SnsMethodCalculate.markEndTimeMs("getAllDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        }
        return nullAsNil;
    }

    /* renamed from: b */
    public static String m125621b() {
        SnsMethodCalculate.markStartTimeMs("getImeiWx", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        String e = C31645a.m39487b() ? C97681b.m125896e() : "";
        SnsMethodCalculate.markEndTimeMs("getImeiWx", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        return e;
    }

    /* renamed from: c */
    public static String m125622c() {
        SnsMethodCalculate.markStartTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        String g = C31645a.m39488c() ? C97681b.m125898g() : "";
        SnsMethodCalculate.markEndTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        return g;
    }

    /* renamed from: d */
    public static String m125623d() {
        SnsMethodCalculate.markStartTimeMs("getSysUserAgent", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        if (C31645a.m39489d()) {
            String b = C97681b.m125893b();
            SnsMethodCalculate.markEndTimeMs("getSysUserAgent", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            return b;
        }
        SnsMethodCalculate.markEndTimeMs("getSysUserAgent", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        return "";
    }
}
