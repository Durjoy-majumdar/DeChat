package p175j0;

import a14.C53916l;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j0.p0 */
public final class C60673p0 extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60677q0 f172817d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<C13598b0> f172818e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60673p0(C60677q0 q0Var, C53916l<? super C13598b0> lVar) {
        super(1);
        this.f172817d = q0Var;
        this.f172818e = lVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C60677q0 q0Var = this.f172817d;
        Object obj2 = q0Var.f172830a;
        C53916l<C13598b0> lVar = this.f172818e;
        synchronized (obj2) {
            q0Var.f172831b.remove(lVar);
        }
        return C13598b0.f38549a;
    }
}
