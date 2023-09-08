package kj1;

import ai1.C54033a;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import c02.C92331c;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import kg3.C76577a;
import lj1.C10538e;
import nj3.C76874e0;
import nj3.C76912y0;
import p565ir.C60606n;

/* renamed from: kj1.t0 */
public final class C10232t0 extends C10538e {

    /* renamed from: h */
    public final String f31246h = "anchorlive.more.handoff";

    /* renamed from: i */
    public final int f31247i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10232t0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31247i = e1Var.f31002u;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31246h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return C54033a.f151301a.mo74696a();
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        if (C54033a.f151301a.mo74696a()) {
            int i = this.f31247i;
            String string = e1Var.f30985d.getResources().getString(C0966R.string.dxg);
            C87412m.m108593f(string, "context.resources.getStr…live_more_action_handoff)");
            mo10808n(e0Var, i, string, C0966R.raw.icons_outlined_colorful_handoff, 0);
            if (mo10805j()) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.OPEN_HANDOFF, String.valueOf(1), (String) null, 4, (Object) null);
                return;
            }
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            wVar.getClass();
            C54116w.Ex0(wVar, C54067f0.C54076o0.OPEN_HANDOFF, String.valueOf(1), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31247i;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        MMActivity mMActivity;
        C87412m.m108594g(e1Var, "<this>");
        C10125e1 e1Var2 = this.f31809a;
        if (e1Var2 != null && (mMActivity = e1Var2.f30985d) != null) {
            if (((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(((C55001u) e1Var.mo10534b(C55001u.class)).f154420q)) {
                C76912y0.m92767f(mMActivity, MMApplicationContext.getContext().getResources().getString(C0966R.string.lqo));
                return;
            }
            HandOff c = C54033a.f151301a.mo74698c(e1Var.f30982b);
            if (c != null) {
                Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "openHandOff " + c);
                ((C92331c) C86312j.m106911c(C92331c.class)).k00(c);
            }
            C76912y0.m92769h(mMActivity, C76577a.m92166q(mMActivity, C0966R.string.dxh), C0966R.raw.icons_outlined_colorful_handoff_success);
            if (e1Var.f30984c == 0) {
                C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                wVar.getClass();
                C54116w.Ex0(wVar, C54067f0.C54076o0.OPEN_HANDOFF, String.valueOf(2), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                return;
            }
            C7335d c2 = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.OPEN_HANDOFF, String.valueOf(2), (String) null, 4, (Object) null);
        }
    }
}
