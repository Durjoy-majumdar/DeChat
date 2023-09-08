package tm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82374e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: tm0.q */
public final class C90550q extends C82268c<C82381f> {
    @Deprecated
    private static final int CTRL_INDEX = 919;
    @Deprecated
    private static final String NAME = "getSystemInfoAsync";

    /* renamed from: t */
    public boolean mo1769t() {
        return false;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C90549p pVar = null;
        C82374e v = fVar != null ? fVar.mo109675v("getSystemInfo") : null;
        if (v instanceof C90549p) {
            pVar = (C90549p) v;
        }
        if (pVar == null) {
            if (fVar != null) {
                fVar.mo109647a(i, mo115109j("fail:not supported"));
            }
        } else if (fVar != null) {
            fVar.mo109647a(i, mo115112m("ok", pVar.mo121609v(fVar)));
        }
    }
}
