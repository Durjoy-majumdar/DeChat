package lk1;

import a11.C39479c;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.storage.C44662n1;
import cq1.C57974g;
import d14.C45252f;
import d14.C58057l;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: lk1.b */
public final class C46870b extends C53996a<C57974g> {

    /* renamed from: d */
    public final String f126062d;

    public C46870b(String str) {
        C87412m.m108594g(str, "groupId");
        this.f126062d = str;
    }

    /* renamed from: b */
    public C45252f<C39534d<C57974g>> mo70650e(LifecycleScope lifecycleScope, C53998c<C57974g> cVar) {
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
        ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f126062d);
    }
}
