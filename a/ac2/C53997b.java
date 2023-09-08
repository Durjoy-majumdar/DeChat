package ac2;

import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import gy3.C87412m;
import zb2.C103001d;
import zb2.C66781o;

/* renamed from: ac2.b */
public abstract class C53997b<T extends C103001d<T>, Q> extends C53996a<T> {
    /* renamed from: b */
    public final C45252f<C39534d<T>> mo70650e(LifecycleScope lifecycleScope, C53998c<T> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        return mo74667c(lifecycleScope, (C66781o) cVar);
    }

    /* renamed from: c */
    public abstract C45252f<C39534d<T>> mo74667c(LifecycleScope lifecycleScope, C66781o<T, Q> oVar);

    /* renamed from: f */
    public abstract void mo74668f();
}
