package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p823sg.C101611g;
import p823sg.C101614i;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.model.j1 */
public final class C6045j1 {

    /* renamed from: a */
    public static final C6045j1 f22331a = new C6045j1();

    /* renamed from: b */
    public static final C101611g<Long, C6046k1> f22332b = new C101614i(10);

    /* renamed from: a */
    public final String mo7003a(long j) {
        C6046k1 k1Var = f22332b.get(Long.valueOf(j));
        if (k1Var == null) {
            return null;
        }
        return mo7004b(k1Var.f22333a, k1Var.f22334b);
    }

    /* renamed from: b */
    public final String mo7004b(String str, String str2) {
        boolean z = false;
        if (str == null || C112551y.m153811k(str)) {
            if (str2 == null || C112551y.m153811k(str2)) {
                z = true;
            }
            if (z) {
                Log.m105924i("MicroMsg.WebViewAdReportHelper", "getAdReportParams null");
                return null;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizInfo", str);
        jSONObject.put("sourceInfo", str2);
        return jSONObject.toString();
    }
}
