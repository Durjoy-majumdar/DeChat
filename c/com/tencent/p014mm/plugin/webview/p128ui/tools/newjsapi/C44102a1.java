package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45700h;
import f40.C86709a0;
import gy3.C87412m;
import java.util.List;
import kj2.C117407d;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.a1 */
public final class C44102a1 implements C45700h.C45701a {

    /* renamed from: a */
    public final /* synthetic */ long f119466a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f119467b;

    /* renamed from: c */
    public final /* synthetic */ C1256g<Bundle> f119468c;

    public C44102a1(long j, Bundle bundle, C1256g<Bundle> gVar) {
        this.f119466a = j;
        this.f119467b = bundle;
        this.f119468c = gVar;
    }

    /* renamed from: a */
    public void mo68728a(List<C45700h.C45704d> list) {
        C117407d.INSTANCE.mo182089r(1454, 191, 1);
        ((C45700h) C86709a0.m107533q(C45700h.class)).mo71038j1(this.f119466a);
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (C45700h.C45704d dVar : list) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(dVar.f123530b);
                C45700h.C45702b bVar = dVar.f123529a;
                String str = null;
                objArr[1] = bVar != null ? bVar.f123504a : null;
                Log.m105919d("MicroMsg.JsApiOnWebPageUrlExposed", "onPrefetchResult result: %s, %s", objArr);
                JSONObject jSONObject = new JSONObject();
                C45700h.C45702b bVar2 = dVar.f123529a;
                if (bVar2 != null) {
                    str = bVar2.f123504a;
                }
                if (str == null) {
                    str = "";
                }
                jSONObject.put("url", str);
                jSONObject.put("result", dVar.f123530b);
                jSONArray.put(jSONObject);
            }
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "prefetchResult.toString()");
        Log.m105925i("MicroMsg.JsApiOnWebPageUrlExposed", "onPrefetchResult result: %s", jSONArray2);
        this.f119467b.putString("url_result", jSONArray2);
        C1256g<Bundle> gVar = this.f119468c;
        if (gVar != null) {
            gVar.mo894a(this.f119467b);
        }
    }
}
