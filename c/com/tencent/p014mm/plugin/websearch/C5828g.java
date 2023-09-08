package com.tencent.p014mm.plugin.websearch;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.websearch.g */
public class C5828g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Map f21987d;

    public C5828g(C96598h hVar, Map map) {
        this.f21987d = map;
    }

    public void run() {
        JSONObject jSONObject = new JSONObject();
        Map map = this.f21987d;
        if (map != null && map.size() > 0) {
            try {
                jSONObject.put("requestId", this.f21987d.get("requestId"));
                jSONObject.put("searchId", this.f21987d.get("searchId"));
                jSONObject.put("type", this.f21987d.get("type"));
                jSONObject.put("url", this.f21987d.get("url"));
                jSONObject.put("parentSearchID", this.f21987d.get("parentSearchID"));
            } catch (JSONException unused) {
            }
        }
        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putString("sos_fts_search_data_tmp", jSONObject.toString()).commit();
    }
}
