package p175j0;

import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j0.l */
public final class C60668l extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60687v0<Object> f172809d;

    /* renamed from: e */
    public final /* synthetic */ Object f172810e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60668l(C60687v0<Object> v0Var, Object obj) {
        super(2);
        this.f172809d = v0Var;
        this.f172810e = obj;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            this.f172809d.getClass();
            throw null;
        }
        hVar.mo51581d();
        return C13598b0.f38549a;
    }
}
