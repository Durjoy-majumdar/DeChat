package p152f0;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C104254h0;
import p869y0.C112339w;

/* renamed from: f0.y */
public final class C107436y extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C107394p2 f321445d;

    /* renamed from: e */
    public final /* synthetic */ C112339w f321446e;

    /* renamed from: f */
    public final /* synthetic */ boolean f321447f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107436y(C107394p2 p2Var, C112339w wVar, boolean z) {
        super(0);
        this.f321445d = p2Var;
        this.f321446e = wVar;
        this.f321447f = z;
    }

    public Object invoke() {
        C104254h0 h0Var;
        C107394p2 p2Var = this.f321445d;
        C112339w wVar = this.f321446e;
        boolean z = !this.f321447f;
        if (!p2Var.mo157812b()) {
            wVar.mo164065a();
        } else if (z && (h0Var = p2Var.f321316d) != null && C87412m.m108589b(h0Var.f308582a.f153174b.get(), h0Var)) {
            h0Var.f308583b.mo145865e();
        }
        return Boolean.TRUE;
    }
}
