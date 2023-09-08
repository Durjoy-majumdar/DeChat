package ac2;

import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58057l;
import gy3.C87412m;
import zb2.C103001d;

/* renamed from: ac2.a */
public abstract class C53996a<T extends C103001d<T>> implements C54000f<T, C53998c<T>, C39534d<T>> {
    /* renamed from: a */
    public C54000f<T, C53998c<T>, C39534d<T>> mo74666a(C54000f<T, C53998c<T>, C39534d<T>> fVar) {
        C87412m.m108594g(fVar, "dataSource");
        return new C54004i(this, fVar);
    }

    /* renamed from: b */
    public C45252f<C39534d<T>> mo70650e(LifecycleScope lifecycleScope, C53998c<T> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: d */
    public int mo70649d() {
        return 0;
    }

    public void onCreate() {
    }
}
