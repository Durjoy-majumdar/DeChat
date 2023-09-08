package com.tencent.p014mm.plugin.appbrand.jsapi;

import di3.C86312j;
import f62.C7994b0;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p1 */
public final class C1769p1 extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 875;
    public static final String NAME = "bindGroup";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p1$a */
    public static final class C1770a implements C7994b0.C7995a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f11510a;

        /* renamed from: b */
        public final /* synthetic */ int f11511b;

        /* renamed from: c */
        public final /* synthetic */ C1769p1 f11512c;

        public C1770a(C82381f fVar, int i, C1769p1 p1Var) {
            this.f11510a = fVar;
            this.f11511b = i;
            this.f11512c = p1Var;
        }

        /* renamed from: a */
        public final void mo1112a(boolean z, String str, String str2) {
            if (z) {
                if (str2 == null || str2.length() == 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("openId", str2);
                    C82381f fVar = this.f11510a;
                    if (fVar != null) {
                        fVar.mo109647a(this.f11511b, this.f11512c.mo115112m("ok", hashMap));
                        return;
                    }
                    return;
                }
            }
            C82381f fVar2 = this.f11510a;
            if (fVar2 != null) {
                fVar2.mo109647a(this.f11511b, this.f11512c.mo115109j("fail"));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str = null;
        String appId = fVar != null ? fVar.getAppId() : null;
        if (!(appId == null || appId.length() == 0)) {
            String optString = jSONObject != null ? jSONObject.optString("signature") : null;
            String optString2 = jSONObject != null ? jSONObject.optString("groupId") : null;
            if (jSONObject != null) {
                str = jSONObject.optString("nonceStr");
            }
            C7994b0.C7996b bVar = new C7994b0.C7996b();
            bVar.f26678d = appId;
            bVar.f26681g = optString;
            bVar.f26679e = optString2;
            bVar.f26680f = str;
            ((C7994b0) C86312j.m106911c(C7994b0.class)).mo9096hp(fVar.getContext(), bVar, new C1770a(fVar, i, this));
        } else if (fVar != null) {
            fVar.mo109647a(i, mo115109j("fail:appId is null"));
        }
    }
}
