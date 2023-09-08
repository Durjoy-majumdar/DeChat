package p411n0;

import gy3.C87412m;
import p411n0.C25093t;
import p854l0.C109074d;
import sx3.C26231d;

/* renamed from: n0.d */
public final class C25077d<K, V> extends C26231d<K, V> implements C109074d<K, V> {

    /* renamed from: f */
    public static final C25077d f71499f = new C25077d(C25093t.f71522e, 0);

    /* renamed from: d */
    public final C25093t<K, V> f71500d;

    /* renamed from: e */
    public final int f71501e;

    public C25077d(C25093t<K, V> tVar, int i) {
        C87412m.m108594g(tVar, "node");
        this.f71500d = tVar;
        this.f71501e = i;
    }

    /* renamed from: a */
    public C25077d<K, V> mo52152a(K k, V v) {
        C25093t.C25094a<K, V> u = this.f71500d.mo52213u(k != null ? k.hashCode() : 0, k, v, 0);
        return u == null ? this : new C25077d<>(u.f71527a, this.f71501e + u.f71528b);
    }

    public boolean containsKey(Object obj) {
        return this.f71500d.mo52196d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: d */
    public C109074d.C109075a mo52154d() {
        return new C25079f(this);
    }

    public V get(Object obj) {
        return this.f71500d.mo52199g(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
