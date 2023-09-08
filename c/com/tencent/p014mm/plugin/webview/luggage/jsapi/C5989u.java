package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.webview.luggage.C43626k0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import p828wa.C53138x;
import z83.C16125c;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.u */
public class C5989u extends C5954n2 implements C80883e<Bundle, Parcelable> {
    /* renamed from: b */
    public String mo5382b() {
        return "dispatchEvent";
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
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null || !jSONObject.has("liteAppInfo")) {
            String optString = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            Iterator<C53138x> it = C43626k0.m47360b().iterator();
            while (it.hasNext()) {
                it.next().f148259i.mo73815b(new C16125c(optString, optJSONObject));
            }
            aVar.mo73776a();
            return;
        }
        boolean isProcessExist = MMApplicationContext.isProcessExist(MMApplicationContext.getProcessName());
        Log.m105925i("JsApiDispatchEvent", "dispatch liteapp  process exist:%b, data:%s", Boolean.valueOf(isProcessExist), jSONObject.toString());
        if (isProcessExist) {
            Bundle bundle = new Bundle();
            bundle.putString("data", jSONObject.toString());
            C80907o.m98781d(MMApplicationContext.getProcessName(), bundle, getClass(), (C1256g) null);
        }
        aVar.mo73776a();
    }

    public void invoke(Object obj, C1256g gVar) {
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) obj).getString("data"));
            jSONObject.optJSONObject("liteAppInfo");
            jSONObject.optString("eventName");
        } catch (JSONException e) {
            Log.printErrStackTrace("JsApiDispatchEvent", e, "", new Object[0]);
        }
    }
}
