package vm3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import om3.C77020b;
import rx3.C13598b0;

/* renamed from: vm3.f */
public final class C78443f implements C32226l<ArrayList<C77020b>, C13598b0> {
    public Object invoke(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, "snapshotList");
        Iterator it = arrayList.iterator();
        C87412m.m108593f(it, "snapshotList.iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            if (((C77020b) next).f225006e == 2) {
                it.remove();
            }
        }
        return C13598b0.f38549a;
    }
}
