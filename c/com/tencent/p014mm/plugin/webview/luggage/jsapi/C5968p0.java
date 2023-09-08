package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import nm0.C11221d;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.p0 */
public class C5968p0 extends C43620m2 {
    /* renamed from: b */
    public String mo5382b() {
        return C11221d.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
        int optInt = aVar.f148190b.f129368c.optInt("id");
        if (optInt <= 0) {
            aVar.mo73778c("fail", (JSONObject) null);
        }
        String optString = aVar.f148190b.f129368c.optString("value");
        boolean z = true;
        boolean z2 = aVar.f148190b.f129368c.optInt("is_important") > 0;
        if (aVar.f148190b.f129368c.optInt("is_report_now") <= 0) {
            z = false;
        }
        C115669n.INSTANCE.mo160126c(optInt, optString, z, z2);
        aVar.mo73776a();
    }
}
