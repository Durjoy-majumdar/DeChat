package p411n0;

import gy3.C87412m;
import java.util.Iterator;
import p854l0.C61177b;
import sx3.C22414i;

/* renamed from: n0.p */
public final class C25089p<K, V> extends C22414i<K> implements C61177b<K> {

    /* renamed from: d */
    public final C25077d<K, V> f71520d;

    public C25089p(C25077d<K, V> dVar) {
        C87412m.m108594g(dVar, "map");
        this.f71520d = dVar;
    }

    public boolean contains(Object obj) {
        return this.f71520d.containsKey(obj);
    }

    /* renamed from: f */
    public int mo52189f() {
        C25077d<K, V> dVar = this.f71520d;
        dVar.getClass();
        return dVar.f71501e;
    }

    public Iterator<K> iterator() {
        return new C25090q(this.f71520d.f71500d);
    }
}
