package bj2;

import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import f40.C86709a0;
import gy3.C87412m;
import i40.C60247c;
import java.util.ArrayList;
import java.util.List;
import p749xh.C66275u5;
import sx3.C36907w;
import wx3.C15601d;
import zb2.C66778l;

/* renamed from: bj2.o */
public final class C54470o extends C53996a<C54471p> {
    /* renamed from: b */
    public C45252f<C39534d<C54471p>> mo70650e(LifecycleScope lifecycleScope, C53998c<C54471p> cVar) {
        C39622i0 a;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        Class cls = C54468j.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        List<C54473v> multiQuery = C66275u5.f190679p.selectAll().log("MicroMsg.DemoStorage").limit(cVar.f151265b, cVar.f151264a).build().multiQuery(((C54472r) ((C54468j) a).mo85233d3(C54472r.class)).getDbProvider().getDB(), C54473v.class);
        if (!(!multiQuery.isEmpty())) {
            multiQuery = null;
        }
        if (multiQuery != null) {
            ArrayList<T> arrayList = dVar.f106151b;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(multiQuery, 10));
            for (C54473v pVar : multiQuery) {
                arrayList2.add(new C54471p(pVar));
            }
            dVar.f106150a = arrayList2.size() > cVar.f151265b;
            arrayList.addAll(arrayList2);
        }
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C66778l.C66779a.C66780a(b, dVar, (C15601d<? super C66778l.C66779a.C66780a>) null), 1, (Object) null);
        return b;
    }
}
