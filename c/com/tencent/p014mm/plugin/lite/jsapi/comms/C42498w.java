package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.lite.storage.C30151d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.w */
public class C42498w extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        WxaLiteAppInfo j = C115492q.m162360g().mo175472j(str);
        if (j == null) {
            Log.m105928w("LiteAppJsApiSession", "get LiteAppInfo fail");
            C115669n.INSTANCE.mo175913w(1293, 125, 1);
            this.f19815f.mo5689a("can not find liteApp from local storage");
            return;
        }
        String str2 = null;
        try {
            if (jSONObject.has("url")) {
                str2 = jSONObject.getString("url");
            }
            if (str2 == null) {
                str2 = LiteAppCenter.getAuthUrl(j.f339295i, j.f339290d, j.f339294h);
            }
            if (str2 != null) {
                if (!str2.isEmpty()) {
                    C30151d i = C115492q.m162360g().mo175471i(str2);
                    if (i == null) {
                        this.f19815f.mo5689a("auth info is not existed");
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(i.field_headerMap);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    JSONObject jSONObject3 = new JSONObject(i.field_paramMap);
                    Iterator<String> keys2 = jSONObject3.keys();
                    HashMap hashMap2 = new HashMap();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        hashMap2.put(next2, jSONObject3.getString(next2));
                    }
                    LiteAppCenter.setAuthInfo(str, i.field_param, hashMap, hashMap2, z);
                    jSONObject3.put(C66261f3.COL_UPDATETIME, i.field_updateTime);
                    this.f19815f.mo5692d(jSONObject3, false);
                    return;
                }
            }
            Log.m105928w("LiteAppJsApiSession", "get authurl fail");
            this.f19815f.mo5689a("get authUrl fail, please make sure config authUrl in config file");
        } catch (Exception unused) {
            this.f19815f.mo5689a("exception");
        }
    }
}
