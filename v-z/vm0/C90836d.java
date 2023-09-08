package vm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import fm0.C86975r;
import gy3.C87412m;
import org.json.JSONObject;
import rq0.C90091i;

/* renamed from: vm0.d */
public final class C90836d extends C86975r<C81879g, C90091i> {
    private static final int CTRL_INDEX = 471;
    private static final String NAME = "hideStatusBar";

    public C90836d() {
        super(C90091i.class);
    }

    /* renamed from: w */
    public void mo121371w(C81879g gVar, JSONObject jSONObject, int i, Object obj) {
        C90091i iVar = (C90091i) obj;
        C87412m.m108594g(gVar, "env");
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(iVar, "ext");
        iVar.mo116581a();
        gVar.mo109647a(i, mo115109j("ok"));
    }
}
