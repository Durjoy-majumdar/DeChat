package ez2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58057l;
import gy3.C87412m;
import java.util.List;

/* renamed from: ez2.d */
public final class C45724d extends C53996a<C45723c> {

    /* renamed from: d */
    public final List<C45723c> f123560d;

    public C45724d(List<C45723c> list) {
        C87412m.m108594g(list, "list");
        this.f123560d = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C45723c>> mo70650e(LifecycleScope lifecycleScope, C53998c<C45723c> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        dVar.f106151b.addAll(this.f123560d);
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }
}
