package kf1;

import fy3.C32224a;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: kf1.a0 */
public final class C9619a0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32224a<C13598b0> f29932a;

    /* renamed from: b */
    public final /* synthetic */ C32224a<C13598b0> f29933b;

    public C9619a0(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        this.f29932a = aVar;
        this.f29933b = aVar2;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            this.f29932a.invoke();
        } else {
            this.f29933b.invoke();
        }
        return C13598b0.f38549a;
    }
}
