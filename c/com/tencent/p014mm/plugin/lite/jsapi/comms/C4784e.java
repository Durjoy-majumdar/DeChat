package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Intent;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p193la.C10480b;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.e */
public class C4784e extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiCloseWindow", "Invoke LiteAppJsApiCloseWindow");
        Intent intent = new Intent();
        JSONObject optJSONObject = jSONObject.has("extraData") ? jSONObject.optJSONObject("extraData") : null;
        if (optJSONObject != null) {
            intent.putExtra("extraData", optJSONObject.toString());
        }
        C10480b bVar = this.f19814e;
        LiteAppCenter.closeWindow(bVar.f31713a, bVar.f31715c, intent);
        this.f19815f.mo5690b();
    }
}
