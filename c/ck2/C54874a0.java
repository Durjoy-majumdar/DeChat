package ck2;

import eb0.C75592q0;
import ek2.C58615a;
import rj2.C63451c;

/* renamed from: ck2.a0 */
public final class C54874a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63451c.C63452a.C63453a f153805d;

    /* renamed from: e */
    public final /* synthetic */ C54933y f153806e;

    public C54874a0(C63451c.C63452a.C63453a aVar, C54933y yVar) {
        this.f153805d = aVar;
        this.f153806e = yVar;
    }

    public final void run() {
        if (this.f153805d.f179988a == ((long) C75592q0.m90789s().hashCode())) {
            C54933y yVar = this.f153806e;
            yVar.f153961e = true;
            C58615a aVar = yVar.f153960d;
            if (aVar != null) {
                aVar.mo83501b(true);
            }
        }
    }
}
