package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.d0 */
public class C4783d0 extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiWriteCommData", "Invoke writeCommData");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString = jSONObject.optString("packageName");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("LiteAppJsApiWriteCommData", "writeCommData fail, packageName is null");
            this.f19815f.mo5689a("fail: packageName is null");
            return;
        }
        String optString2 = jSONObject.optString("data");
        Context context = MMApplicationContext.getContext();
        boolean commit = context.getSharedPreferences(MMApplicationContext.getPackageName() + "_comm_preferences", 0).edit().putString(optString, optString2).commit();
        Log.m105925i("LiteAppJsApiWriteCommData", "writeCommData, ret = %b, packageName = %s, data length = %d", Boolean.valueOf(commit), optString, Integer.valueOf(jSONObject.length()));
        if (commit) {
            this.f19815f.mo5690b();
        } else {
            this.f19815f.mo5689a("fail");
        }
    }
}
