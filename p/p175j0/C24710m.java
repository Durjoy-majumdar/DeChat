package p175j0;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j0.m */
public final class C24710m extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Object[] f70479d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24710m(Object[] objArr) {
        super(3);
        this.f70479d = objArr;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C24665d dVar = (C24665d) obj;
        C87412m.m108594g(dVar, "applier");
        C87412m.m108594g((C24661b2) obj2, "<anonymous parameter 1>");
        C87412m.m108594g((C24724t1) obj3, "<anonymous parameter 2>");
        for (Object d : this.f70479d) {
            dVar.mo51488d(d);
        }
        return C13598b0.f38549a;
    }
}
