package cq1;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import bi3.C0289a;
import c14.C54637q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45252f;
import d14.C58057l;
import eb0.C75592q0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cq1.j */
public final class C45146j extends C53996a<C57974g> {

    /* renamed from: d */
    public final C72994y1.C72995a f122423d;

    /* renamed from: e */
    public ArrayList<String> f122424e;

    public C45146j(C72994y1.C72995a aVar) {
        C87412m.m108594g(aVar, "storageKey");
        this.f122423d = aVar;
    }

    /* renamed from: b */
    public C45252f<C39534d<C57974g>> mo70650e(LifecycleScope lifecycleScope, C53998c<C57974g> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        ArrayList<String> arrayList = this.f122424e;
        if (arrayList != null && cVar.f151264a < arrayList.size()) {
            int size = arrayList.size();
            int i = cVar.f151264a;
            int i2 = cVar.f151265b;
            int size2 = size > i + i2 ? i + i2 : arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<String> arrayList3 = this.f122424e;
            if (arrayList3 != null) {
                for (int i3 = cVar.f151264a; i3 < size2; i3++) {
                    arrayList2.add(arrayList3.get(i3));
                }
                for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList3)) {
                    if (((int) z1Var.f108320R1) != 0) {
                        ArrayList<T> arrayList4 = dVar.f106151b;
                        C57974g gVar = new C57974g(-1, z1Var, 0);
                        String string = MMApplicationContext.getContext().getString(C0966R.string.d18);
                        C87412m.m108593f(string, "getContext().getString(R…der_at_someone_recent_at)");
                        gVar.f165891n = string;
                        arrayList4.add(gVar);
                    }
                }
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: d */
    public int mo70649d() {
        return 0;
    }

    public void onCreate() {
        ArrayList<String> arrayList;
        this.f122424e = new ArrayList<>();
        C7125l lVar = C7125l.f25089a;
        C72994y1.C72995a aVar = this.f122423d;
        C87412m.m108594g(aVar, "key");
        List<C7124k> b = lVar.mo8291b(lVar.mo8292c(aVar));
        String s = C75592q0.m90789s();
        for (C7124k kVar : b) {
            if (!C87412m.m108589b(kVar.f25087a, s) && (arrayList = this.f122424e) != null) {
                arrayList.add(kVar.f25087a);
            }
        }
    }
}
