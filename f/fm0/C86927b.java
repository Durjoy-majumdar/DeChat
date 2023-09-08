package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;
import rq0.C90088g;

/* renamed from: fm0.b */
public class C86927b extends C86975r<C83780d1, C90088g> {
    public static final int CTRL_INDEX = 139;
    public static final String NAME = "disableScrollBounce";

    public C86927b() {
        super(C90088g.class);
    }

    /* renamed from: w */
    public void mo121371w(C81879g gVar, JSONObject jSONObject, int i, Object obj) {
        C83780d1 d1Var = (C83780d1) gVar;
        C90088g gVar2 = (C90088g) obj;
        if (!jSONObject.has("disable")) {
            d1Var.mo109647a(i, mo115109j("ok"));
            return;
        }
        if (jSONObject.optBoolean("disable", false)) {
            gVar2.mo116505d(false);
        } else {
            C81634a.C81639e L0 = d1Var.mo116157L0();
            if (L0 == null) {
                gVar2.mo116505d(false);
            } else {
                gVar2.mo116505d(L0.f239660j);
            }
        }
        d1Var.mo109647a(i, mo115109j("ok"));
    }
}
