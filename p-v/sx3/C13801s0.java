package sx3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13604l;

/* renamed from: sx3.s0 */
public class C13801s0 extends C13800r0 {
    /* renamed from: o */
    public static final <K, V> List<C13604l<K, V>> m13103o(Map<? extends K, ? extends V> map) {
        C87412m.m108594g(map, "<this>");
        if (map.size() == 0) {
            return C64186f0.f181907d;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C64186f0.f181907d;
        }
        Map.Entry next = it.next();
        if (!it.hasNext()) {
            return C26236u.m33719b(new C13604l(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C13604l(next.getKey(), next.getValue()));
        do {
            Map.Entry next2 = it.next();
            arrayList.add(new C13604l(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
