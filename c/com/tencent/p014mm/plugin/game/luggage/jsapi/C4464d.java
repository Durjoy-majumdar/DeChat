package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.autogen.events.WepkgNotifyEvent;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.d */
public class C4464d extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "batchUpdateWepkg";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject jSONObject;
        Log.m105924i("MicroMsg.JsApiBatchUpdateWepkg", "invokeInMM");
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiBatchUpdateWepkg", "data is null");
            bVar.mo6945a("fail", (JSONObject) null);
            return;
        }
        String optString = jSONObject.optString("pkgIdList");
        if (!Util.isNullOrNil(optString)) {
            try {
                JSONArray jSONArray = new JSONArray(optString);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    if (!Util.isNullOrNil((List) arrayList)) {
                        WepkgNotifyEvent wepkgNotifyEvent = new WepkgNotifyEvent();
                        WepkgNotifyEvent.C40188a aVar = wepkgNotifyEvent.f107837d;
                        aVar.f107838a = 8;
                        aVar.f107844g = 0;
                        aVar.f107845h = arrayList;
                        wepkgNotifyEvent.publish();
                        bVar.mo6945a((String) null, (JSONObject) null);
                        return;
                    }
                }
            } catch (JSONException unused2) {
                Log.m105920e("MicroMsg.JsApiBatchUpdateWepkg", "data is not json");
            }
        }
        bVar.mo6945a("fail", (JSONObject) null);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
