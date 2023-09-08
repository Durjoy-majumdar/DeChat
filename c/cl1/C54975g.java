package cl1;

import cl1.C54951d;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cl1.g */
public final class C54975g extends C87413o implements C32227p<Long, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54951d f154099d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54975g(C54951d dVar) {
        super(2);
        this.f154099d = dVar;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).longValue();
        long longValue = ((Number) obj2).longValue();
        C54951d.C54953c cVar = this.f154099d.f154008p;
        if (cVar != null) {
            cVar.setVideoTotalTime(longValue);
        }
        return C13598b0.f38549a;
    }
}
