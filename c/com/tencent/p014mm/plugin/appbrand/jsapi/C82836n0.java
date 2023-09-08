package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.eclipsesource.mmv8.Platform;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83984z3;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;
import p823sg.C77710q;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n0 */
public final class C82836n0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n0$a */
    public static final class C82837a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81879g f242252d;

        /* renamed from: e */
        public final /* synthetic */ String f242253e;

        public C82837a(C81879g gVar, String str) {
            this.f242252d = gVar;
            this.f242253e = str;
        }

        public final void run() {
            try {
                URLConnection openConnection = new URL("https://weapp.tencent.com/weapplib_coverage/saveCoverageData").openConnection();
                C87412m.m108592e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.addRequestProperty("Content-Type", "application/json");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                C87412m.m108593f(outputStream, "connection.outputStream");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, C119027c.f356488a);
                BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
                bufferedWriter.write(this.f242253e);
                bufferedWriter.flush();
                bufferedWriter.close();
                httpURLConnection.getOutputStream().close();
                int responseCode = httpURLConnection.getResponseCode();
                Log.m105924i("Luggage.JSCoverageUtils", "reportCoverage for appId:" + this.f242252d.getAppId() + ", responseCode:" + responseCode + ", data:" + this.f242253e);
            } catch (IOException e) {
                Log.m105920e("Luggage.JSCoverageUtils", "reportCoverage for appId:" + this.f242252d.getAppId() + ", get exception:" + e + ", data:" + this.f242253e);
            }
        }
    }

    /* renamed from: a */
    public static final void m101587a(C81879g gVar, Object obj, String str) {
        String str2;
        C87412m.m108594g(gVar, "component");
        C87412m.m108594g(obj, "jsRuntime");
        StringBuilder sb = new StringBuilder();
        sb.append("reportCoverage(appId:");
        sb.append(gVar.getAppId());
        sb.append(", ");
        if (obj instanceof C80669j) {
            str2 = "Worker";
        } else if (obj instanceof C40480g) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Context(");
            C40480g gVar2 = (C40480g) obj;
            sb4.append(gVar2.mo63262w() ? "Main" : String.valueOf(gVar2.getContextId()));
            sb4.append(')');
            str2 = sb4.toString();
        } else if (obj instanceof C83984z3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Page(");
            C83780d1 d1Var = ((C83984z3) obj).f245172e;
            sb5.append(d1Var != null ? d1Var.mo116162Q0() : null);
            sb5.append(')');
            str2 = sb5.toString();
        } else {
            throw new IllegalStateException("Invalid jsRuntime".toString());
        }
        sb.append(str2);
        sb.append(", data:");
        sb.append(str);
        sb.append(')');
        Log.m105924i("Luggage.JSCoverageUtils", sb.toString());
        if (!(str == null || str.length() == 0) && !C87412m.m108589b("null", str) && !C87412m.m108589b("undefined", str)) {
            ICommLibReader k = gVar.mo114272k();
            C87412m.m108591d(k);
            JSONObject jSONObject = new JSONObject();
            AppBrandInitConfig W = gVar.getRuntime().mo113036W();
            C87412m.m108592e(W, "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU");
            jSONObject.put("userUin", C77710q.m93738a(((AppBrandInitConfigLU) W).f234818T));
            jSONObject.put("platform", Platform.ANDROID);
            jSONObject.put("CoverageData", str);
            jSONObject.put("weapplibVersion", k.mo113377i());
            jSONObject.put("weapplibTime", k.mo113378ld());
            String appId = gVar.getAppId();
            if (appId == null) {
                appId = "";
            }
            jSONObject.put("appId", appId);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …y())\n        }.toString()");
            ((C119157j) C119157j.f356862d).mo183884o(new C82837a(gVar, jSONObject2));
        }
    }
}
