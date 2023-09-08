package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60213x3;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.r0 */
public class C4520r0 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.r0$a */
    public class C4521a implements C60213x3 {
        public C4521a(C4520r0 r0Var) {
        }

        /* renamed from: a */
        public void mo5408a(int i, String str) {
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "openFinderPostView";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiOpenFinderPostView", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        try {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76834ai(context, e.toString(), 1, new C4521a(this));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 100);
                jSONObject.put(StateEvent.Name.MESSAGE, "post successful");
            } catch (JSONException e2) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderPostView", e2, "OpenFinderPostViewTask exception", new Object[0]);
            }
            bVar.mo6945a((String) null, jSONObject);
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.JsApiOpenFinderPostView", e3, "OpenFinderPostViewTask exception", new Object[0]);
            bVar.mo6945a("post cancel", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
