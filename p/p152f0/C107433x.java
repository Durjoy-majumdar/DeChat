package p152f0;

import fy3.C32228q;
import gy3.C8480h;
import gy3.C87413o;
import p009c2.C104269s;
import p009c2.C28482z;
import p152f0.C107394p2;
import p155g0.C107601b0;
import p735w1.C38006x;
import p735w1.C38007y;

/* renamed from: f0.x */
public final class C107433x extends C87413o implements C32228q<Integer, Integer, Boolean, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C104269s f321438d;

    /* renamed from: e */
    public final /* synthetic */ boolean f321439e;

    /* renamed from: f */
    public final /* synthetic */ C28482z f321440f;

    /* renamed from: g */
    public final /* synthetic */ C107601b0 f321441g;

    /* renamed from: h */
    public final /* synthetic */ C107394p2 f321442h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107433x(C104269s sVar, boolean z, C28482z zVar, C107601b0 b0Var, C107394p2 p2Var) {
        super(3);
        this.f321438d = sVar;
        this.f321439e = z;
        this.f321440f = zVar;
        this.f321441g = b0Var;
        this.f321442h = p2Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C107346h0 h0Var = C107346h0.None;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
            intValue = this.f321438d.mo145896a(intValue);
        }
        if (!booleanValue) {
            intValue2 = this.f321438d.mo145896a(intValue2);
        }
        boolean z = false;
        if (this.f321439e) {
            long j = this.f321440f.f78286b;
            int i = C38006x.f100499c;
            if (!(intValue == ((int) (j >> 32)) && intValue2 == C38006x.m41695c(j))) {
                if ((intValue > intValue2 ? intValue2 : intValue) >= 0) {
                    if ((intValue < intValue2 ? intValue2 : intValue) <= this.f321440f.f78285a.length()) {
                        if (booleanValue || intValue == intValue2) {
                            C107601b0 b0Var = this.f321441g;
                            C107394p2 p2Var = b0Var.f321957d;
                            if (p2Var != null) {
                                p2Var.f321321i = false;
                            }
                            b0Var.mo158026m(h0Var);
                        } else {
                            this.f321441g.mo158021h();
                        }
                        ((C107394p2.C107396b) this.f321442h.f321327o).invoke(new C28482z(this.f321440f.f78285a, C38007y.m41701a(intValue, intValue2), (C38006x) null, 4, (C8480h) null));
                        z = true;
                    }
                }
                C107601b0 b0Var2 = this.f321441g;
                C107394p2 p2Var2 = b0Var2.f321957d;
                if (p2Var2 != null) {
                    p2Var2.f321321i = false;
                }
                b0Var2.mo158026m(h0Var);
            }
        }
        return Boolean.valueOf(z);
    }
}
