package w42;

import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import kr0.C88273g1;
import kr0.C88274h0;

/* renamed from: w42.f */
public final class C90898f<T extends C7594e> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "preloadMiniProgramEnv";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C88273g1 g1Var = C88273g1.WXA_JSAPI_PRELOAD;
        Class cls = C88274h0.class;
        C87412m.m108594g(hVar, "data");
        if (hVar.optString("type", "app").equals("app")) {
            ((C88274h0) C86312j.m106911c(cls)).mo113305TH(g1Var);
        } else {
            ((C88274h0) C86312j.m106911c(cls)).mo113303QK(g1Var);
        }
        mo120840p().invoke(mo120844i());
    }
}
