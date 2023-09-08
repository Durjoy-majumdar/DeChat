package ac2;

import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32226l;
import gy3.C87412m;
import zb2.C103001d;
import zb2.C66778l;

/* renamed from: ac2.h */
public final class C54003h<T extends C103001d<T>> extends C53996a<T> {

    /* renamed from: d */
    public final int f151269d;

    /* renamed from: e */
    public final C32226l<Integer, T> f151270e;

    public C54003h(int i, C32226l<? super Integer, ? extends T> lVar) {
        C87412m.m108594g(lVar, "creator");
        this.f151269d = i;
        this.f151270e = lVar;
    }

    /* renamed from: b */
    public C45252f<C39534d<T>> mo70650e(LifecycleScope lifecycleScope, C53998c<T> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C66778l.C66779a aVar = C66778l.f191877a;
        return aVar.mo90783a(lifecycleScope, aVar.mo90784b(this.f151269d, cVar, this.f151270e));
    }
}
