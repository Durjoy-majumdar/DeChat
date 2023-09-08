package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import java.util.Map;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13604l;
import sx3.C90364q0;
import xl0.C91283d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.d */
public final class C82854d extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 788;
    public static final String NAME = "isSupportNFC";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var != null && !l0Var.mo56895eO()) {
                fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
            } else if (C91283d.m114511a()) {
                fVar.mo109647a(i, C82863k.m101618a(this, 0, "ok", (Map<String, ? extends Object>) null));
            } else {
                fVar.mo109647a(i, C82863k.m101618a(this, 13000, "fail", C90364q0.m113146e(new C13604l("errCode", 13000))));
            }
        }
    }
}
