package kj1;

import android.view.ViewGroup;
import cl1.C0657g1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import gy3.C87412m;
import lj1.C10535c;
import te3.C51068r71;

/* renamed from: kj1.e2 */
public final class C10138e2 extends C10535c {

    /* renamed from: h */
    public final String f31053h = "audience.more.morefunction.rewardlimitamount";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10138e2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31053h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C51068r71 r712 = ((C0657g1) this.f31809a.mo10534b(C0657g1.class)).f1556h;
        return r712 != null && r712.f140741d == 1;
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        ((ViewGroup) v0Var.f18463f.findViewById(C0966R.C0970id.nqn)).setVisibility(0);
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.ope);
    }
}
