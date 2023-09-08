package lo2;

import android.text.TextUtils;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import do2.C97503a;
import ea3.C45587d;
import eo2.C31645a;
import eo2.C45680c;
import eo2.C97681b;
import h81.C32735h;
import java.util.Map;
import org.json.JSONObject;
import os2.C100405h;
import xb0.C102609h;
import zt3.C119157j;

/* renamed from: lo2.s */
public class C99569s {

    /* renamed from: lo2.s$a */
    public class C10604a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f31969d;

        public C10604a(String str) {
            this.f31969d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper$1");
            try {
                Log.m105924i("AdPassThroughInfoHelper", "start send get http req to dest IPv4, url is " + this.f31969d);
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                SnsMethodCalculate.markStartTimeMs("reportStartReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(1612, 40);
                SnsMethodCalculate.markEndTimeMs("reportStartReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                C45587d.C7609a e = C45587d.m50636e(this.f31969d, (Map<String, String>) null, (String) null);
                if (e == null) {
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    SnsMethodCalculate.markStartTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    nVar.mo175911u(1612, 42);
                    SnsMethodCalculate.markEndTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    Log.m105920e("AdPassThroughInfoHelper", "not receive http response, url is " + this.f31969d);
                } else if (e.f25879a == 200) {
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    SnsMethodCalculate.markStartTimeMs("reportReqToDestIPv4Success", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    nVar.mo175911u(1612, 41);
                    SnsMethodCalculate.markEndTimeMs("reportReqToDestIPv4Success", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    Log.m105924i("AdPassThroughInfoHelper", "get http response success, url is " + this.f31969d);
                } else {
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    SnsMethodCalculate.markStartTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    nVar.mo175911u(1612, 42);
                    SnsMethodCalculate.markEndTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    Log.m105920e("AdPassThroughInfoHelper", "get http response failed, url is " + this.f31969d + ", statusCode is " + e.f25879a);
                }
            } catch (Throwable th) {
                Log.m105920e("AdPassThroughInfoHelper", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper$1");
        }
    }

    /* renamed from: a */
    public static void m129959a() {
        SnsMethodCalculate.markStartTimeMs("checkRespHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            SnsMethodCalculate.markStartTimeMs("reportAdResp", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1724, 5);
            SnsMethodCalculate.markEndTimeMs("reportAdResp", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            if (C31645a.m39486a() && C45680c.m50875c()) {
                SnsMethodCalculate.markStartTimeMs("reportRespIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                nVar.mo175911u(1724, 3);
                SnsMethodCalculate.markEndTimeMs("reportRespIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                if (C45680c.m50874b() == 0) {
                    SnsMethodCalculate.markStartTimeMs("reportRespIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    nVar.mo175911u(1724, 4);
                    SnsMethodCalculate.markEndTimeMs("reportRespIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                }
            }
        } catch (Throwable th) {
            Log.m105920e("AdPassThroughInfoHelper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("checkRespHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
    }

    /* renamed from: b */
    public static byte[] m129960b(String str) {
        SnsMethodCalculate.markStartTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1724, 6);
            jSONObject.put("ua", C97503a.m125623d());
            boolean c = C45680c.m50875c();
            int i = 1;
            if (C31645a.m39486a() && c) {
                SnsMethodCalculate.markStartTimeMs("reportReqIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                nVar.mo175911u(1724, 1);
                SnsMethodCalculate.markEndTimeMs("reportReqIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("is_harmony_os", c);
                jSONObject2.put(TPDownloadProxyEnum.USER_OS_VERSION, C45680c.m50873a("hw_sc.build.platform.version"));
                int b = C45680c.m50874b();
                if (b == 0) {
                    SnsMethodCalculate.markStartTimeMs("reportReqIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    nVar.mo175911u(1724, 2);
                    SnsMethodCalculate.markEndTimeMs("reportReqIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                }
                jSONObject2.put("harmony_pure_mode", b);
                jSONObject.put("HarmonyInfo", jSONObject2);
            }
            if (!Util.isNullOrNil(str)) {
                jSONObject.put("sessionKeyAd", str);
            }
            String c2 = m129961c();
            if (!Util.isNullOrNil(c2)) {
                jSONObject.put("oaid", c2);
                nVar.mo175911u(1724, 7);
            } else {
                nVar.mo175911u(1724, 9);
            }
            JSONObject d = m129962d();
            if (d != null) {
                jSONObject.put("webview_ua_info", d);
                nVar.mo175911u(1724, 8);
            }
            jSONObject.put("adPullRecords", C100405h.m131358jo());
            if (m129964f()) {
                int i2 = C102609h.m135510UY(6) ? 1 : 0;
                if (!C92856r0.m117121g()) {
                    i = 0;
                }
                jSONObject.put("supportH265", i2);
                jSONObject.put("supportWebP", i);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String jSONObject3 = jSONObject.toString();
            Log.m105924i("AdPassThroughInfoHelper", "getAdPassThroughInfo, timeCost = " + (currentTimeMillis2 - currentTimeMillis) + ", ret = " + jSONObject3);
            byte[] bytes = jSONObject3.getBytes();
            SnsMethodCalculate.markEndTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return bytes;
        } catch (Throwable th) {
            Log.m105920e("AdPassThroughInfoHelper", th.toString());
            byte[] bArr = new byte[0];
            SnsMethodCalculate.markEndTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return bArr;
        }
    }

    /* renamed from: c */
    public static String m129961c() {
        SnsMethodCalculate.markStartTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        SnsMethodCalculate.markStartTimeMs("isReqReportOaid", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_req_report_oaid, 0);
            Log.m105924i("AdPassThroughInfoHelper", "isReqReportOaid, value=" + Qe);
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReqReportOaid", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        } catch (Throwable th) {
            Log.m105920e("AdPassThroughInfoHelper", "isReqReportOaid, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReqReportOaid", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        }
        if (z) {
            String c = C97503a.m125622c();
            Log.m105924i("AdPassThroughInfoHelper", "getOAID, value=" + c);
            SnsMethodCalculate.markEndTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return c;
        }
        SnsMethodCalculate.markEndTimeMs(C1574a3.NAME, "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        return "";
    }

    /* renamed from: d */
    public static JSONObject m129962d() {
        String str;
        SnsMethodCalculate.markStartTimeMs("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            if (m129963e()) {
                SnsMethodCalculate.markStartTimeMs("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
                if (C31645a.m39490e()) {
                    str = C97681b.m125899h(false);
                    SnsMethodCalculate.markEndTimeMs("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
                } else {
                    SnsMethodCalculate.markEndTimeMs("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
                    str = "";
                }
                Log.m105924i("AdPassThroughInfoHelper", "getWebViewBuildInfoJson, value=" + str);
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    SnsMethodCalculate.markEndTimeMs("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    return jSONObject;
                }
            }
        } catch (Throwable th) {
            Log.m105920e("AdPassThroughInfoHelper", "getWebViewBuildInfoJson, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        return null;
    }

    /* renamed from: e */
    public static boolean m129963e() {
        SnsMethodCalculate.markStartTimeMs("isReqReportWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_req_report_webview_ua_build_info, 0);
            Log.m105924i("AdPassThroughInfoHelper", "isReqReportWebViewUaBuildInfo, value=" + Qe);
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReqReportWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdPassThroughInfoHelper", "isReqReportWebViewUaBuildInfo, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isReqReportWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m129964f() {
        SnsMethodCalculate.markStartTimeMs("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        boolean z = true;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_req_support_hevc_and_webp, 1);
            Log.m105924i("AdPassThroughInfoHelper", "isReqSupportHevcAndWebP, value is " + Qe);
            if (Qe <= 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdPassThroughInfoHelper", "isReqSupportHevcAndWebP, exp is " + th);
            SnsMethodCalculate.markEndTimeMs("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return true;
        }
    }

    /* renamed from: g */
    public static void m129965g(String str) {
        SnsMethodCalculate.markStartTimeMs("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("isReqIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_ipv4_req, 0);
            Log.m105924i("AdPassThroughInfoHelper", "isReqIPv4 is " + Qe);
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isReqIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        } catch (Throwable th) {
            Log.m105920e("AdPassThroughInfoHelper", th.toString());
            SnsMethodCalculate.markEndTimeMs("isReqIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        }
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C10604a(str));
        SnsMethodCalculate.markEndTimeMs("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
    }
}
