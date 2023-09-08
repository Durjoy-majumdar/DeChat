package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43656s;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43657t;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i2 */
public class C43613i2 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "showMenuItems";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiShowMenuItems", "invokeInOwn");
        JSONArray optJSONArray = aVar.f148190b.f129368c.optJSONArray("menuList");
        if (optJSONArray == null) {
            Log.m105924i("MicroMsg.JsApiShowMenuItems", "data is null");
            aVar.mo73778c("invalid_data", (JSONObject) null);
            return;
        }
        C43661n0 n0Var = ((C43658n) aVar.f148189a).f117951u;
        if (n0Var != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C43656s menuHelp = n0Var.getMenuHelp();
                String optString = optJSONArray.optString(i);
                Iterator<C43657t> it = menuHelp.f117902a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C43657t next = it.next();
                    if (next.f117905b.equals(optString)) {
                        next.f117906c = false;
                        break;
                    }
                }
            }
        }
        aVar.mo73776a();
    }
}
