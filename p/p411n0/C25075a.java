package p411n0;

import gy3.C87412m;
import java.util.Map;
import java.util.Map.Entry;
import sx3.C26233h;

/* renamed from: n0.a */
public abstract class C25075a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C26233h<E> {
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "element");
        C25081h hVar = (C25081h) this;
        V v = hVar.f71515d.get(entry.getKey());
        return v != null ? C87412m.m108589b(v, entry.getValue()) : entry.getValue() == null && hVar.f71515d.containsKey(entry.getKey());
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "element");
        return ((C25081h) this).f71515d.remove(entry.getKey(), entry.getValue());
    }
}
