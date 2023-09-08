package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.n0$$a;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.k0 */
public final class C4492k0 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "hideAllTopRightBtns";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
        Log.m105924i("hideAllTopRightBtns", "invokeInOwn");
        if (aVar != null) {
            JSONObject jSONObject = aVar.f148190b.f129368c;
            boolean z = false;
            if (jSONObject != null) {
                z = jSONObject.optBoolean("hide", false);
            }
            C53095a aVar2 = (C53095a) aVar.f148189a;
            if (aVar2 instanceof C43658n) {
                C43661n0 n0Var = ((C43658n) aVar2).f117951u;
                n0Var.getClass();
                ((C119157j) C119157j.f356862d).mo183895z(new n0$$a(n0Var, z));
                aVar.mo73776a();
                return;
            }
            aVar.mo73778c("fail", (JSONObject) null);
        }
    }
}
