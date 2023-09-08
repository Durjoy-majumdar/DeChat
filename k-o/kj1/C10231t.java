package kj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8777j5;
import i50.C60251a;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import nj3.C76912y0;
import ok1.C62042e;

/* renamed from: kj1.t */
public final class C10231t extends C10538e {

    /* renamed from: h */
    public final int f31244h;

    /* renamed from: i */
    public final String f31245i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10231t(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31244h = e1Var.f30999r;
        this.f31245i = mo10805j() ? "anchorlive.more.silent" : "startlive.more.silent";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31245i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return true;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        String str;
        Class cls = C54991o.class;
        C54067f0.C0062l lVar = C54067f0.C0062l.BEFORE;
        C54067f0.C0066n nVar = C54067f0.C0066n.MUTE_CLOSE;
        C54067f0.C0062l lVar2 = C54067f0.C0062l.LIVING;
        C54067f0.C0066n nVar2 = C54067f0.C0066n.MUTE_OPEN;
        Class cls2 = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        C62042e eVar = C62042e.f176370a;
        boolean z = true;
        if (!(eVar.mo87027N0() && !eVar.mo87030O0())) {
            boolean j = mo10805j();
            int i = C0966R.raw.icons_outlined_mic_on;
            if (!j) {
                C10125e1.C10132d dVar = e1Var.f30989h;
                if (dVar != null && dVar.f31035a == 1) {
                    C45795b bVar = e1Var.f30982b;
                    if (bVar == null || !((C54991o) bVar.mo71262a(cls)).f154274W2) {
                        z = false;
                    }
                    if (z) {
                        str = e1Var.f30985d.getResources().getString(C0966R.string.f360638dx3);
                        C87412m.m108593f(str, "context.resources.getStr…_more_action_cancel_mute)");
                        ((C54108o) C86312j.m106911c(cls2)).mo9602Jz(nVar, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar));
                    } else {
                        str = e1Var.f30985d.getResources().getString(C0966R.string.dxs);
                        C87412m.m108593f(str, "context.resources.getStr…er_live_more_action_mute)");
                        ((C54108o) C86312j.m106911c(cls2)).mo9602Jz(nVar2, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar));
                        i = C0966R.raw.icons_outlined_mic_off;
                    }
                    mo10807m(e0Var, e1Var.f30999r, str, i);
                }
            } else if (!((C54991o) e1Var.mo10534b(cls)).f154305d3) {
                if (C60251a.f171781k1 == null) {
                    z = false;
                }
                if (z) {
                    return;
                }
                if (((C54991o) e1Var.mo10534b(cls)).f154274W2) {
                    int i2 = this.f31244h;
                    String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360638dx3);
                    C87412m.m108593f(string, "getContext().resources.g…_more_action_cancel_mute)");
                    mo10807m(e0Var, i2, string, C0966R.raw.icons_outlined_mic_on);
                    ((C54108o) C86312j.m106911c(cls2)).mo9602Jz(nVar, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar2));
                    return;
                }
                int i3 = this.f31244h;
                String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dxs);
                C87412m.m108593f(string2, "getContext().resources.g…er_live_more_action_mute)");
                mo10807m(e0Var, i3, string2, C0966R.raw.icons_outlined_mic_off);
                ((C54108o) C86312j.m106911c(cls2)).mo9602Jz(nVar2, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar2));
            }
        }
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31244h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        Class cls = C54991o.class;
        C54067f0.C0062l lVar = C54067f0.C0062l.LIVING;
        C54067f0.C0064m mVar = C54067f0.C0064m.MUTE_CLOSE;
        C54067f0.C0062l lVar2 = C54067f0.C0062l.BEFORE;
        C54067f0.C0064m mVar2 = C54067f0.C0064m.MUTE_OPEN;
        Class cls2 = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        if (mo10805j()) {
            if (((C54991o) e1Var.mo10534b(cls)).f154274W2) {
                MMActivity mMActivity = e1Var.f30985d;
                C76912y0.m92768g(mMActivity, mMActivity.getResources().getString(C0966R.string.dff));
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c, mVar, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar), (String) null, 4, (Object) null);
            } else {
                MMActivity mMActivity2 = e1Var.f30985d;
                C76912y0.m92768g(mMActivity2, mMActivity2.getResources().getString(C0966R.string.dg5));
                C7335d c2 = C86312j.m106911c(cls2);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c2, mVar2, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar), (String) null, 4, (Object) null);
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", !((C54991o) e1Var.mo10534b(cls)).f154274W2);
            e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_MUTE_MIC, bundle);
            return;
        }
        C62042e eVar = C62042e.f176370a;
        C45795b bVar = e1Var.f30982b;
        eVar.getClass();
        if (bVar != null && ((C54991o) bVar.mo71262a(cls)).f154274W2) {
            C7335d c3 = C86312j.m106911c(cls2);
            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c3, mVar, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar2), (String) null, 4, (Object) null);
            eVar.mo87113r1(e1Var.f30982b, e1Var.f30985d, false);
            return;
        }
        C7335d c4 = C86312j.m106911c(cls2);
        C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c4, mVar2, ((C54108o) C86312j.m106911c(cls2)).Ex0(lVar2), (String) null, 4, (Object) null);
        eVar.mo87113r1(e1Var.f30982b, e1Var.f30985d, true);
    }
}
