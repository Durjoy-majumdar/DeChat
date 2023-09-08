package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p828wa.C53096b;
import p828wa.C53138x;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.t0 */
public class C5986t0 extends C43620m2<C53138x> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.t0$a */
    public class C5987a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f22237d;

        public C5987a(C5986t0 t0Var, JSONObject jSONObject) {
            this.f22237d = jSONObject;
        }

        public void run() {
            Log.m105924i("MicroMsg.JsApiLog", "jslog : " + this.f22237d.optString("msg"));
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "log";
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
        ((C119157j) C119157j.f356862d).mo183875f(new C5987a(this, jSONObject));
    }
}
