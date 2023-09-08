package hl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import di3.C86312j;
import kr0.C88267e;
import kz1.C88349l;
import org.json.JSONObject;
import p169ib.C8870b;
import p547hb.C87464c;

/* renamed from: hl0.k */
public class C8539k extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1029;
    public static final String NAME = "startGameLive";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Class cls = C88349l.class;
        C87464c cVar = (C87464c) eVar.mo114341l0().mo116150E0(C87464c.class);
        if (cVar != null) {
            cVar.mo111266l(true, false, new C8870b());
        }
        ((C88349l) C86312j.m106911c(cls)).aj0(eVar.getAppId(), eVar.getRuntime().mo113210l1().f239365g, eVar.getContext(), jSONObject.optString("path", ""), jSONObject.optString("reportInfo", ""), ((C88349l) C86312j.m106911c(cls)).mo118246VG(), ((C88349l) C86312j.m106911c(cls)).mo118240QG());
        eVar.mo109647a(i, mo115109j("ok"));
    }
}
