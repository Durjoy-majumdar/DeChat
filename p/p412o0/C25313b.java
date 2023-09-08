package p412o0;

import gy3.C87412m;
import java.util.Iterator;
import p411n0.C25077d;
import p411n0.C25093t;
import p414p0.C25406b;
import p854l0.C61178e;
import sx3.C22414i;

/* renamed from: o0.b */
public final class C25313b<E> extends C22414i<E> implements C61178e<E> {

    /* renamed from: g */
    public static final C25313b f71815g;

    /* renamed from: d */
    public final Object f71816d;

    /* renamed from: e */
    public final Object f71817e;

    /* renamed from: f */
    public final C25077d<E, C25312a> f71818f;

    static {
        C25406b bVar = C25406b.f71942a;
        f71815g = new C25313b(bVar, bVar, C25077d.f71499f);
    }

    public C25313b(Object obj, Object obj2, C25077d<E, C25312a> dVar) {
        C87412m.m108594g(dVar, "hashMap");
        this.f71816d = obj;
        this.f71817e = obj2;
        this.f71818f = dVar;
    }

    public C61178e<E> add(E e) {
        if (this.f71818f.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new C25313b(e, e, this.f71818f.mo52152a(e, new C25312a()));
        }
        Object obj = this.f71817e;
        C25312a aVar = this.f71818f.get(obj);
        C87412m.m108591d(aVar);
        return new C25313b(this.f71816d, e, this.f71818f.mo52152a(obj, new C25312a(aVar.f71813a, e)).mo52152a(e, new C25312a(obj, C25406b.f71942a)));
    }

    public boolean contains(Object obj) {
        return this.f71818f.containsKey(obj);
    }

    /* renamed from: f */
    public int mo52189f() {
        C25077d<E, C25312a> dVar = this.f71818f;
        dVar.getClass();
        return dVar.f71501e;
    }

    public Iterator<E> iterator() {
        return new C109826c(this.f71816d, this.f71818f);
    }

    public C61178e<E> remove(E e) {
        C25312a aVar = this.f71818f.get(e);
        if (aVar == null) {
            return this;
        }
        C25077d<E, C25312a> dVar = this.f71818f;
        boolean z = false;
        C25093t<K, V> v = dVar.f71500d.mo52214v(e != null ? e.hashCode() : 0, e, 0);
        if (dVar.f71500d != v) {
            dVar = v == null ? C25077d.f71499f : new C25077d<>(v, dVar.f71501e - 1);
        }
        Object obj = aVar.f71813a;
        C25406b bVar = C25406b.f71942a;
        if (obj != bVar) {
            C25312a aVar2 = dVar.get(obj);
            C87412m.m108591d(aVar2);
            dVar = dVar.mo52152a(aVar.f71813a, new C25312a(aVar2.f71813a, aVar.f71814b));
        }
        Object obj2 = aVar.f71814b;
        if (obj2 != bVar) {
            C25312a aVar3 = dVar.get(obj2);
            C87412m.m108591d(aVar3);
            dVar = dVar.mo52152a(aVar.f71814b, new C25312a(aVar.f71813a, aVar3.f71814b));
        }
        Object obj3 = aVar.f71813a;
        Object obj4 = !(obj3 != bVar) ? aVar.f71814b : this.f71816d;
        if (aVar.f71814b != bVar) {
            z = true;
        }
        if (z) {
            obj3 = this.f71817e;
        }
        return new C25313b(obj4, obj3, dVar);
    }
}
