package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210o.C11323a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.y1 */
public final class C83131y1 implements C11323a<List<? extends WxaAttributes>, Boolean> {

    /* renamed from: a */
    public boolean f242932a;

    /* renamed from: b */
    public final /* synthetic */ WeakReference<C81879g> f242933b;

    /* renamed from: c */
    public final /* synthetic */ int f242934c;

    /* renamed from: d */
    public final /* synthetic */ C82914r1 f242935d;

    /* renamed from: e */
    public final /* synthetic */ String f242936e;

    public C83131y1(WeakReference<C81879g> weakReference, int i, C82914r1 r1Var, String str) {
        this.f242933b = weakReference;
        this.f242934c = i;
        this.f242935d = r1Var;
        this.f242936e = str;
    }

    /* renamed from: a */
    public Boolean apply(List<WxaAttributes> list) {
        C87412m.m108594g(list, "input");
        boolean z = true;
        if (!this.f242932a) {
            try {
                C81879g gVar = this.f242933b.get();
                if (gVar != null) {
                    int i = this.f242934c;
                    C82914r1 r1Var = this.f242935d;
                    JSONObject jSONObject = new JSONObject();
                    String str = this.f242936e;
                    JSONArray jSONArray = new JSONArray();
                    for (WxaAttributes wxaAttributes : list) {
                        JSONObject optJSONObject = new JSONObject(wxaAttributes.field_appInfo).optJSONObject("PluginInfo");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        jSONArray.put(optJSONObject.put("appId", wxaAttributes.field_appId));
                    }
                    jSONObject.put("contactList", jSONArray);
                    jSONObject.put("callbackId", str);
                    C13598b0 b0Var = C13598b0.f38549a;
                    gVar.mo109647a(i, r1Var.mo115113n("ok", jSONObject));
                }
            } catch (JSONException unused) {
                C81879g gVar2 = this.f242933b.get();
                if (gVar2 != null) {
                    gVar2.mo109647a(this.f242934c, this.f242935d.mo115109j("fail: toJson fail"));
                }
            }
            this.f242932a = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
