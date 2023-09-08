package p411n0;

import gy3.C87412m;
import java.util.Iterator;
import sx3.C64173a;

/* renamed from: n0.r */
public final class C25091r<K, V> extends C64173a<V> {

    /* renamed from: d */
    public final C25077d<K, V> f71521d;

    public C25091r(C25077d<K, V> dVar) {
        C87412m.m108594g(dVar, "map");
        this.f71521d = dVar;
    }

    public boolean contains(Object obj) {
        return this.f71521d.containsValue(obj);
    }

    /* renamed from: f */
    public int mo52189f() {
        C25077d<K, V> dVar = this.f71521d;
        dVar.getClass();
        return dVar.f71501e;
    }

    public Iterator<V> iterator() {
        return new C25092s(this.f71521d.f71500d);
    }
}
