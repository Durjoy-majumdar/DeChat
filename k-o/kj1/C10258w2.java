package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import cl1.C0678p1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import lj1.C10538e;
import nj3.C76874e0;
import nj3.C76912y0;
import org.json.JSONObject;

/* renamed from: kj1.w2 */
public final class C10258w2 extends C10538e {

    /* renamed from: h */
    public final int f31293h;

    /* renamed from: i */
    public final String f31294i = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10258w2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31293h = e1Var.f30956C;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31294i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C0678p1 p1Var = (C0678p1) this.f31809a.mo10534b(C0678p1.class);
        return p1Var.f1596f && p1Var.f1598h;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        if (C87412m.m108589b(((C0678p1) e1Var.mo10534b(C0678p1.class)).f1597g.getValue(), Boolean.TRUE)) {
            e0Var.mo107135b(this.f31293h, C0966R.string.mwn, C0966R.raw.finder_subtitle_off);
        } else {
            e0Var.mo107135b(this.f31293h, C0966R.string.mwo, C0966R.raw.finder_subtitle_on);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 6);
        jSONObject.put("type", 1);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31293h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1 e1Var2 = e1Var;
        Class cls = C0678p1.class;
        C87412m.m108594g(e1Var2, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", 6);
        jSONObject.put("type", 2);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        boolean b = C87412m.m108589b(((C0678p1) e1Var2.mo10534b(cls)).f1597g.getValue(), Boolean.TRUE);
        ((C0678p1) e1Var2.mo10534b(cls)).f1597g.postValue(Boolean.valueOf(!b));
        C76912y0.m92768g(this.f31809a.f30985d, b ? MMApplicationContext.getContext().getResources().getString(C0966R.string.mvc) : MMApplicationContext.getContext().getResources().getString(C0966R.string.mvd));
    }
}
