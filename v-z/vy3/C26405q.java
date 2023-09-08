package vy3;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import wy3.C26436b;
import wy3.C26447e;
import wy3.C26469k;
import zz3.C26794h;

/* renamed from: vy3.q */
public final class C26405q extends C87413o implements C32226l<C26436b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C26397j f73643d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26405q(C26397j jVar) {
        super(1);
        this.f73643d = jVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        C26436b bVar = (C26436b) obj;
        if (bVar.mo52634f() == C26436b.C26437a.DECLARATION) {
            C26386d dVar = this.f73643d.f73629b;
            C26469k b = bVar.mo51892b();
            C87412m.m108592e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            dVar.getClass();
            C26384c cVar = C26384c.f73585a;
            if (C26384c.f73595k.containsKey(C26794h.m35219g((C26447e) b))) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
