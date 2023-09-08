package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C2046p2;
import org.json.JSONObject;
import p170ic.C87687a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.o1 */
public final class C1747o1 extends C82268c<C81879g> {
    private static final int CTRL_INDEX = 1071;
    private static final String NAME = "editImage";

    /* renamed from: g */
    public final int f11482g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null) {
            String optString = jSONObject != null ? jSONObject.optString("src") : null;
            if (optString == null) {
                optString = "";
            }
            C2046p2.m1997a(gVar, optString, (String) null, 6, new C1744n1(optString, gVar, i, this));
        }
    }
}
