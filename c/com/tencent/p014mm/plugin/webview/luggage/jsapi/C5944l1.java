package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.l1 */
public class C5944l1 extends C43620m2 {
    /* renamed from: b */
    public String mo5382b() {
        return "reportIDKey";
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
        JSONArray optJSONArray = aVar.f148190b.f129368c.optJSONArray("idKeyDataInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            Log.m105920e("MicroMsg.JsApiReportIDKey", "idkey data is null");
            aVar.mo73778c("invaild_parms", (JSONObject) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            IDKey iDKey = new IDKey();
            iDKey.SetID(Util.getInt(optJSONObject.optString("id"), 0));
            iDKey.SetKey(Util.getInt(optJSONObject.optString("key"), 0));
            iDKey.SetValue((long) Util.getInt(optJSONObject.optString("value"), 0));
            arrayList.add(iDKey);
        }
        if (arrayList.size() > 0) {
            C115669n.INSTANCE.mo160124a(arrayList, true);
        }
        aVar.mo73776a();
    }
}
