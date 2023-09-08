package lq1;

import fy3.C32224a;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: lq1.j */
public final class C10640j<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32224a<C13598b0> f32051a;

    /* renamed from: b */
    public final /* synthetic */ C32224a<C13598b0> f32052b;

    public C10640j(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        this.f32051a = aVar;
        this.f32052b = aVar2;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            this.f32051a.invoke();
        } else {
            this.f32052b.invoke();
        }
        return C13598b0.f38549a;
    }
}
