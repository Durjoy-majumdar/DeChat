package tx3;

import gy3.C87412m;
import java.util.Map;
import java.util.Map.Entry;
import sx3.C26233h;

/* renamed from: tx3.a */
public abstract class C26313a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C26233h<E> {
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "element");
        return ((C26324e) this).f73345d.mo53249f(entry);
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "element");
        C26317d<K, V> dVar = ((C26324e) this).f73345d;
        dVar.getClass();
        dVar.mo53242c();
        int i = dVar.mo53253i(entry.getKey());
        if (i < 0) {
            return false;
        }
        V[] vArr = dVar.f73329e;
        C87412m.m108591d(vArr);
        if (!C87412m.m108589b(vArr[i], entry.getValue())) {
            return false;
        }
        dVar.mo53258l(i);
        return true;
    }
}
