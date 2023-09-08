package com.tencent.p014mm.plugin.sns.waid;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.waid.WaidProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import kv2.C34071b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.sns.waid.a */
public class C30474a {
    /* renamed from: a */
    public static String m39101a(String str) {
        SnsMethodCalculate.markStartTimeMs("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return "";
        }
        String replace = str.replace(",", ";");
        SnsMethodCalculate.markEndTimeMs("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        return replace;
    }

    /* renamed from: b */
    public static void m39102b(String str) {
        SnsMethodCalculate.markStartTimeMs("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!C34071b.m40236j()) {
            Log.m105920e("ad.waid.WaidReporter", "reportDeviceChange isWxEnvInitDone==false");
            SnsMethodCalculate.markEndTimeMs("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            String a = m39101a(str);
            Log.m105924i("ad.waid.WaidReporter", "reportDeviceChange data=" + a);
            C115669n.INSTANCE.mo160131h(18666, 2004, a);
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidReporter", "reportDeviceChange exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    /* renamed from: c */
    public static void m39103c(WaidProvider.C30473a aVar, String str) {
        String[] strArr;
        SnsMethodCalculate.markStartTimeMs("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!C34071b.m40236j()) {
            Log.m105920e("ad.waid.WaidReporter", "reportPkg isWxEnvInitDone==false");
            SnsMethodCalculate.markEndTimeMs("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        if (!(aVar == null || (strArr = aVar.f82132b) == null || strArr.length <= 1)) {
            try {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (true) {
                    String[] strArr2 = aVar.f82132b;
                    if (i >= strArr2.length) {
                        break;
                    }
                    sb.append(strArr2[i]);
                    if (i != aVar.f82132b.length - 1) {
                        sb.append("|");
                    }
                    i++;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rawCallPkg", aVar.f82131a);
                jSONObject.put("callPkgType", aVar.f82133c);
                jSONObject.put("pkgsFromUid", sb.toString());
                jSONObject.put("queryPkg", str);
                String a = m39101a(jSONObject.toString());
                Log.m105924i("ad.waid.WaidReporter", "reportPkg data=" + a);
                C115669n.INSTANCE.mo160131h(18666, 2002, a);
            } catch (Throwable th) {
                Log.m105920e("ad.waid.WaidReporter", "reportPkg exp=" + android.util.Log.getStackTraceString(th));
            }
        }
        SnsMethodCalculate.markEndTimeMs("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    /* renamed from: d */
    public static void m39104d(String str, int i, String str2, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!C34071b.m40236j()) {
            Log.m105920e("ad.waid.WaidReporter", "reportQuery isWxEnvInitDone==false");
            SnsMethodCalculate.markEndTimeMs("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callPkg", str);
            jSONObject.put("callPkgType", i);
            jSONObject.put("queryPkg", str2);
            jSONObject.put("errCode", i2);
            jSONObject.put("waitInit", i3);
            jSONObject.put("timeCost", i4);
            String a = m39101a(jSONObject.toString());
            Log.m105924i("ad.waid.WaidReporter", "reportQuery data=" + a);
            C115669n.INSTANCE.mo160131h(18666, 2000, a);
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidReporter", "reportQuery exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    /* renamed from: e */
    public static void m39105e(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!C34071b.m40236j()) {
            Log.m105920e("ad.waid.WaidReporter", "reportWaidChange isWxEnvInitDone==false");
            SnsMethodCalculate.markEndTimeMs("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("needUpdate", i);
            jSONObject.put("kvCount", i2);
            String a = m39101a(jSONObject.toString());
            Log.m105924i("ad.waid.WaidReporter", "reportWaidChange data=" + a);
            C115669n.INSTANCE.mo160131h(18666, 2003, a);
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidReporter", "reportWaidChange exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }
}
