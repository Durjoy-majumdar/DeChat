package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import android.os.Bundle;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import lj1.C10538e;
import nj3.C76874e0;

/* renamed from: kj1.d2 */
public final class C10120d2 extends C10538e {

    /* renamed from: h */
    public final int f30944h;

    /* renamed from: i */
    public final String f30945i = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10120d2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30944h = e1Var.f30994m;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30945i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return !((C54991o) this.f31809a.mo10534b(C54991o.class)).f154286Z;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dxx);
        C87412m.m108593f(string, "getContext().resources.g…more_action_screen_clear)");
        e0Var.mo107144g(this.f30944h, string, C0966R.raw.finder_icons_screen_clear);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f30944h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        Class cls = C54991o.class;
        C87412m.m108594g(e1Var, "<this>");
        ((C54991o) e1Var.mo10534b(cls)).f154286Z = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((C54991o) e1Var.mo10534b(cls)).f154286Z);
        e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
        if (e1Var.f30984c == 0) {
            ((C54116w) C86312j.m106911c(C54116w.class)).Ox0(((C54991o) e1Var.mo10534b(cls)).f154286Z ? C54067f0.C0057g.CLICK_CLEAR_SCREEN_MENU : C54067f0.C0057g.CLICK_CLEAR_SCREEN_CANCEL);
        }
    }
}
