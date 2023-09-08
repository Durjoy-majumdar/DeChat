package ac2;

import a14.C53934p0;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import gy3.C87412m;
import wx3.C15601d;
import zb2.C103001d;
import zb2.C66778l;

/* renamed from: ac2.e */
public final class C53999e<T extends C103001d<T>> extends C53996a<T> {
    /* renamed from: b */
    public C45252f<C39534d<T>> mo70650e(LifecycleScope lifecycleScope, C53998c<T> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C66778l.C66779a.C66780a(b, dVar, (C15601d<? super C66778l.C66779a.C66780a>) null), 1, (Object) null);
        return b;
    }
}
