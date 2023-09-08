package p157gk;

import android.util.Pair;
import com.tencent.p014mm.storage.C57593a4;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gk.z */
public final class C59521z {
    /* renamed from: a */
    public final ArrayList<C32467x> mo84591a(String str) {
        boolean z = true;
        ArrayList<Pair<String, ArrayList<Integer>>> h = C59503r.f170040a.mo84587h(str, true);
        if (h != null && !h.isEmpty()) {
            z = false;
        }
        if (z) {
            return null;
        }
        ArrayList<C32467x> arrayList = new ArrayList<>();
        for (Pair pair : h) {
            Object obj = pair.second;
            C87412m.m108593f(obj, "it.second");
            if (mo84592b((ArrayList) obj)) {
                Object obj2 = pair.first;
                C87412m.m108593f(obj2, "it.first");
                Object obj3 = pair.second;
                C87412m.m108593f(obj3, "it.second");
                arrayList.add(new C32467x((String) obj2, (List) obj3));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo84592b(ArrayList<Integer> arrayList) {
        boolean z;
        Iterator<T> it = arrayList.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            if (C57593a4.f164912a.mo81940e(String.valueOf(((Number) it.next()).intValue()), C59491j.f169997b).isEmpty()) {
                z = true;
                continue;
            }
        } while (z);
        return true;
    }
}
