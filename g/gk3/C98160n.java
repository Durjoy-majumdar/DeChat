package gk3;

import fy3.C32226l;
import gk3.C98154l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gk3.n */
public final class C98160n extends C87413o implements C32226l<C98154l.C98155a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98134c f287779d;

    /* renamed from: e */
    public final /* synthetic */ long f287780e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98160n(C98134c cVar, long j) {
        super(1);
        this.f287779d = cVar;
        this.f287780e = j;
    }

    public Object invoke(Object obj) {
        String str;
        C98154l.C98155a aVar = (C98154l.C98155a) obj;
        C98134c cVar = this.f287779d;
        if (cVar != null) {
            long j = this.f287780e;
            if (aVar == null || (str = aVar.f287772b) == null) {
                str = "";
            }
            cVar.mo135808b(j, str);
        }
        return C13598b0.f38549a;
    }
}
