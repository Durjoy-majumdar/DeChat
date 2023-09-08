package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87413o;
import java.util.List;
import p1165z.C112527l;
import p175j0.C108504h;
import p415q0.C110261c;
import p435a0.C103166l0;
import p436a1.C103272w;
import p543h0.C107933d0;
import p721v0.C65503j;
import rx3.C13598b0;
import sx3.C64197v;
import ya0.C112430i;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.g1 */
public final class C104665g1 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C1288t0> f310807d;

    /* renamed from: e */
    public final /* synthetic */ C112430i f310808e;

    /* renamed from: f */
    public final /* synthetic */ C0000n0 f310809f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104665g1(List<C1288t0> list, C112430i iVar, C0000n0 n0Var) {
        super(2);
        this.f310807d = list;
        this.f310808e = iVar;
        this.f310809f = n0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        int i = 2;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            List<C1288t0> list = this.f310807d;
            C112430i iVar = this.f310808e;
            C0000n0 n0Var = this.f310809f;
            int i2 = 0;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C1288t0 t0Var = (C1288t0) next;
                    boolean z = i2 == iVar.mo164141i();
                    long j = C103272w.f304514f;
                    int i4 = C65503j.f188489K0;
                    float f = (float) 8;
                    C107933d0.m146236a(z, new C104663e1(n0Var, iVar, i2), C103166l0.m136521e(C103166l0.m136523g(C65503j.C65504a.f188490d, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f, 7, (Object) null), ((float) 1.5d) * f, 0.0f, i, (Object) null), false, (C112527l) null, j, 0, C110261c.m149878b(hVar, -1367344918, true, new C104664f1(iVar, i2, t0Var)), hVar, 12779904, 88);
                    iVar = iVar;
                    i2 = i3;
                    n0Var = n0Var;
                    i = 2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
