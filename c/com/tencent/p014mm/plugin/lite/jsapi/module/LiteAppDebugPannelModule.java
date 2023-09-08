package com.tencent.p014mm.plugin.lite.jsapi.module;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1020pa.C89327d;
import p1198ka.C117395a;
import p1198ka.C117396b;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.module.LiteAppDebugPannelModule */
public class LiteAppDebugPannelModule extends C117396b {
    @C117395a(uiThread = false)
    public JSONArray getLiteAppList() {
        List<WxaLiteAppInfo> k = C115492q.m162360g().mo175473k();
        JSONArray jSONArray = new JSONArray();
        for (WxaLiteAppInfo next : k) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", next.f339290d);
                jSONObject.put(C66261f3.COL_UPDATETIME, next.f339301r);
                jSONObject.put("type", next.f339296j);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    @C117395a(uiThread = false)
    public boolean removeLiteApp(String str) {
        WxaLiteAppInfo j = C115492q.m162360g().mo175472j(str);
        C115492q.m162360g().mo175477o(j);
        C89327d.m111648a(C72994y1.f212834c + "/pkg/" + str);
        StringBuilder sb = new StringBuilder();
        sb.append("xxxxxx:");
        sb.append(j.f339295i);
        Log.m105924i("LiteAppDebugPannelModule", sb.toString());
        return true;
    }
}
