package p411n0;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import p414p0.C110093d;
import p414p0.C35348a;
import p854l0.C109074d;
import sx3.C26232g;

/* renamed from: n0.f */
public final class C25079f<K, V> extends C26232g<K, V> implements C109074d.C109075a<K, V> {

    /* renamed from: d */
    public C25077d<K, V> f71505d;

    /* renamed from: e */
    public C110093d f71506e = new C110093d();

    /* renamed from: f */
    public C25093t<K, V> f71507f;

    /* renamed from: g */
    public V f71508g;

    /* renamed from: h */
    public int f71509h;

    /* renamed from: i */
    public int f71510i;

    public C25079f(C25077d<K, V> dVar) {
        C87412m.m108594g(dVar, "map");
        this.f71505d = dVar;
        this.f71507f = dVar.f71500d;
        this.f71510i = dVar.f71501e;
    }

    /* renamed from: a */
    public C25077d<K, V> build() {
        C25093t<K, V> tVar = this.f71507f;
        C25077d<K, V> dVar = this.f71505d;
        if (tVar != dVar.f71500d) {
            this.f71506e = new C110093d();
            dVar = new C25077d<>(this.f71507f, this.f71510i);
        }
        this.f71505d = dVar;
        return dVar;
    }

    /* renamed from: c */
    public void mo52163c(int i) {
        this.f71510i = i;
        this.f71509h++;
    }

    public void clear() {
        C25093t tVar = C25093t.f71522e;
        this.f71507f = C25093t.f71522e;
        mo52163c(0);
    }

    public boolean containsKey(Object obj) {
        return this.f71507f.mo52196d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public V get(Object obj) {
        return this.f71507f.mo52199g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public V put(K k, V v) {
        this.f71508g = null;
        this.f71507f = this.f71507f.mo52204l(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.f71508g;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C87412m.m108594g(map, "from");
        C25077d dVar = map instanceof C25077d ? (C25077d) map : null;
        if (dVar == null) {
            C25079f fVar = map instanceof C25079f ? (C25079f) map : null;
            dVar = fVar != null ? fVar.build() : null;
        }
        if (dVar != null) {
            C35348a aVar = new C35348a(0, 1, (C8480h) null);
            int i = this.f71510i;
            this.f71507f = this.f71507f.mo52205m(dVar.f71500d, 0, aVar, this);
            int i2 = (dVar.f71501e + i) - aVar.f94665a;
            if (i != i2) {
                mo52163c(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public final boolean remove(Object obj, Object obj2) {
        int i = this.f71510i;
        C25093t<K, V> o = this.f71507f.mo52207o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            C25093t tVar = C25093t.f71522e;
            o = C25093t.f71522e;
        }
        this.f71507f = o;
        if (i != this.f71510i) {
            return true;
        }
        return false;
    }

    public V remove(Object obj) {
        this.f71508g = null;
        C25093t<K, V> n = this.f71507f.mo52206n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            C25093t tVar = C25093t.f71522e;
            n = C25093t.f71522e;
        }
        this.f71507f = n;
        return this.f71508g;
    }
}
