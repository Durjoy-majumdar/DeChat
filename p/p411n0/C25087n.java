package p411n0;

import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import p854l0.C61177b;
import sx3.C22414i;

/* renamed from: n0.n */
public final class C25087n<K, V> extends C22414i<Map.Entry<? extends K, ? extends V>> implements C61177b<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: d */
    public final C25077d<K, V> f71519d;

    public C25087n(C25077d<K, V> dVar) {
        C87412m.m108594g(dVar, "map");
        this.f71519d = dVar;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "element");
        V v = this.f71519d.get(entry.getKey());
        return v != null ? C87412m.m108589b(v, entry.getValue()) : entry.getValue() == null && this.f71519d.containsKey(entry.getKey());
    }

    /* renamed from: f */
    public int mo52189f() {
        C25077d<K, V> dVar = this.f71519d;
        dVar.getClass();
        return dVar.f71501e;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C25088o(this.f71519d.f71500d);
    }
}
