package mp2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import org.json.JSONObject;
import vr2.C102260r;

/* renamed from: mp2.a */
public class C34628a {
    /* renamed from: a */
    public static String m40408a(String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("getAppIdFromExtra", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
            str2 = new JSONObject(str).optString("appId");
        } catch (Exception unused) {
            Log.m105920e("OpenSdkAdHelper", "getAppIdFromExtra, exp=" + str.toString() + ", extInfo=" + str);
            str2 = "";
        }
        SnsMethodCalculate.markEndTimeMs("getAppIdFromExtra", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        return str2;
    }

    /* renamed from: b */
    public static String m40409b(String str, String str2) {
        String str3;
        String str4;
        SnsMethodCalculate.markStartTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
            JSONObject jSONObject = new JSONObject(str2);
            str4 = jSONObject.optString("canvasId");
            try {
                str3 = jSONObject.optString("uxInfo");
            } catch (Exception unused) {
                Log.m105920e("OpenSdkAdHelper", "getOpenCanvasAdExtraInfo, appId=" + str + ", extInfo=" + str2);
                str3 = "";
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appId", Util.nullAsNil(str));
                jSONObject2.put("canvasId", str4);
                jSONObject2.put("uxInfo", str3);
                String jSONObject3 = jSONObject2.toString();
                SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
                return jSONObject3;
            }
        } catch (Exception unused2) {
            str4 = "";
            Log.m105920e("OpenSdkAdHelper", "getOpenCanvasAdExtraInfo, appId=" + str + ", extInfo=" + str2);
            str3 = "";
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("appId", Util.nullAsNil(str));
            jSONObject22.put("canvasId", str4);
            jSONObject22.put("uxInfo", str3);
            String jSONObject32 = jSONObject22.toString();
            SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
            return jSONObject32;
        }
        try {
            JSONObject jSONObject222 = new JSONObject();
            jSONObject222.put("appId", Util.nullAsNil(str));
            jSONObject222.put("canvasId", str4);
            jSONObject222.put("uxInfo", str3);
            String jSONObject322 = jSONObject222.toString();
            SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
            return jSONObject322;
        } catch (Exception unused3) {
            SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m40410c(int i) {
        SnsMethodCalculate.markStartTimeMs("isFromOpenSdk", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        boolean z = i == 29;
        SnsMethodCalculate.markEndTimeMs("isFromOpenSdk", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        return z;
    }

    /* renamed from: d */
    public static void m40411d(String str, int i) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("reportOpenCanvas", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
            if (!C86709a0.m107522a()) {
                if (MMApplicationContext.isMainProcess()) {
                    Log.m105920e("OpenSdkAdHelper", "reportOpenCanvas, !MMKernel has ready, subKey=" + i + ", content=" + str);
                    SnsMethodCalculate.markEndTimeMs("reportOpenCanvas", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
                    return;
                }
            }
            Log.m105924i("OpenSdkAdHelper", "reportOpenCanvas, subKey=" + i + ", content=" + str);
            C115669n.INSTANCE.mo175911u(1667, i);
            String str3 = "";
            try {
                if (TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("subKey", i);
                    str2 = jSONObject.toString();
                } else {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject2.put("subKey", i);
                    str2 = jSONObject2.toString();
                }
                str3 = str2;
            } catch (Exception unused) {
            }
            C102260r.m134858a("opensdk_open_canvas", str3);
        } catch (Throwable th) {
            Log.m105920e("OpenSdkAdHelper", "reportOpenCanvas, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportOpenCanvas", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
    }
}
