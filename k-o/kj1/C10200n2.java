package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import lj1.C10538e;
import nj3.C76874e0;
import nj3.C76875f0;
import ok1.C62042e;
import org.json.JSONObject;
import te3.C48814b61;

/* renamed from: kj1.n2 */
public final class C10200n2 extends C10538e {

    /* renamed from: h */
    public final int f31178h;

    /* renamed from: i */
    public final String f31179i = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10200n2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31178h = e1Var.f30963J;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31179i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return C62042e.f176370a.mo87101n1(((C54991o) this.f31809a.mo10534b(C54991o.class)).f154202G);
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int i = this.f31178h;
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360701bd1);
        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0);
        boolean k = C62042e.f176370a.mo87091k(e1Var.f30982b);
        C76875f0 f0Var = new C76875f0(e0Var.f224706f, i, 0);
        f0Var.f224717i = string;
        f0Var.mo107179d(C0966R.raw.icons_outlined_promotion_mini_app, color);
        f0Var.f224712d = k;
        f0Var.f224713e = false;
        ((ArrayList) e0Var.f224704d).add(f0Var);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 3);
        jSONObject.put("type", 1);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31178h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1 e1Var2 = e1Var;
        C87412m.m108594g(e1Var2, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 3);
        jSONObject.put("type", 2);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        C48814b61 b612 = ((C54991o) e1Var2.mo10534b(C54991o.class)).f154202G;
        if (b612 != null) {
            C62042e.f176370a.mo87100n1(b612, "clickVisitorPromotionMiniApp", e1Var2.f30985d);
        }
    }
}
