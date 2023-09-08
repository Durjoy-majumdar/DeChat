package lk1;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.storage.C72996z1;
import cq1.C57974g;
import d14.C45252f;
import d14.C58057l;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: lk1.a */
public final class C46869a extends C53996a<C57974g> {

    /* renamed from: d */
    public ArrayList<String> f126061d;

    /* renamed from: b */
    public C45252f<C39534d<C57974g>> mo70650e(LifecycleScope lifecycleScope, C53998c<C57974g> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        ArrayList<String> arrayList = this.f126061d;
        if (arrayList != null && cVar.f151264a < arrayList.size()) {
            int size = arrayList.size();
            int i = cVar.f151264a;
            int i2 = cVar.f151265b;
            int size2 = size > i + i2 ? i + i2 : arrayList.size();
            for (int i3 = cVar.f151264a; i3 < size2; i3++) {
                String str = arrayList.get(i3);
                C87412m.m108593f(str, "memberList[index]");
                if (C87412m.m108589b(str, "notify@all")) {
                    ArrayList<T> arrayList2 = dVar.f106151b;
                    C72996z1 z1Var = new C72996z1();
                    z1Var.setUsername("notify@all");
                    C13598b0 b0Var = C13598b0.f38549a;
                    arrayList2.add(new C57974g(-1, z1Var, 1));
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
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("notify@all");
        this.f126061d = arrayList;
    }
}
