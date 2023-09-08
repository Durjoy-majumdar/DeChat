package p241t0;

import gy3.C87412m;
import hy3.C108274e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p241t0.C110851h0;
import p411n0.C25077d;
import p854l0.C109074d;
import rx3.C13598b0;

/* renamed from: t0.x */
public final class C110876x<K, V> implements Map<K, V>, C110851h0, C108274e {

    /* renamed from: d */
    public C110856i0 f331665d = new C110877a(C25077d.f71499f);

    /* renamed from: e */
    public final Set<Map.Entry<K, V>> f331666e = new C110867q(this);

    /* renamed from: f */
    public final Set<K> f331667f = new C110868r(this);

    /* renamed from: g */
    public final Collection<V> f331668g = new C110870t(this);

    /* renamed from: t0.x$a */
    public static final class C110877a<K, V> extends C110856i0 {

        /* renamed from: c */
        public C109074d<K, ? extends V> f331669c;

        /* renamed from: d */
        public int f331670d;

        public C110877a(C109074d<K, ? extends V> dVar) {
            C87412m.m108594g(dVar, "map");
            this.f331669c = dVar;
        }

        /* renamed from: a */
        public void mo159361a(C110856i0 i0Var) {
            C87412m.m108594g(i0Var, "value");
            C110877a aVar = (C110877a) i0Var;
            synchronized (C110878y.f331671a) {
                this.f331669c = aVar.f331669c;
                this.f331670d = aVar.f331670d;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        /* renamed from: b */
        public C110856i0 mo159362b() {
            return new C110877a(this.f331669c);
        }

        /* renamed from: c */
        public final void mo162583c(C109074d<K, ? extends V> dVar) {
            C87412m.m108594g(dVar, "<set-?>");
            this.f331669c = dVar;
        }
    }

    /* renamed from: a */
    public final C110877a<K, V> mo162570a() {
        return (C110877a) C110865n.m151154q((C110877a) this.f331665d, this);
    }

    public void clear() {
        C110849h i;
        C25077d dVar = C25077d.f71499f;
        if (dVar != ((C110877a) C110865n.m151145h((C110877a) this.f331665d, C110865n.m151146i())).f331669c) {
            synchronized (C110878y.f331671a) {
                C110877a aVar = (C110877a) this.f331665d;
                synchronized (C110865n.f331651c) {
                    i = C110865n.m151146i();
                    C110877a aVar2 = (C110877a) C110865n.m151158u(aVar, this, i);
                    aVar2.mo162583c(dVar);
                    aVar2.f331670d++;
                }
                C110865n.m151150m(i, this);
            }
        }
    }

    public boolean containsKey(Object obj) {
        return mo162570a().f331669c.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo162570a().f331669c.containsValue(obj);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f331666e;
    }

    /* renamed from: f */
    public C110856i0 mo159357f() {
        return this.f331665d;
    }

    public V get(Object obj) {
        return mo162570a().f331669c.get(obj);
    }

    /* renamed from: i */
    public C110856i0 mo159358i(C110856i0 i0Var, C110856i0 i0Var2, C110856i0 i0Var3) {
        C110851h0.C110852a.m151097a(this, i0Var, i0Var2, i0Var3);
        return null;
    }

    public boolean isEmpty() {
        return mo162570a().f331669c.isEmpty();
    }

    public final Set<K> keySet() {
        return this.f331667f;
    }

    /* renamed from: m */
    public void mo159359m(C110856i0 i0Var) {
        C87412m.m108594g(i0Var, "value");
        this.f331665d = (C110877a) i0Var;
    }

    public V put(K k, V v) {
        C109074d<K, ? extends V> dVar;
        int i;
        V put;
        C110849h i2;
        boolean z;
        do {
            Object obj = C110878y.f331671a;
            synchronized (obj) {
                C110877a aVar = (C110877a) C110865n.m151145h((C110877a) this.f331665d, C110865n.m151146i());
                dVar = aVar.f331669c;
                i = aVar.f331670d;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(dVar);
            C109074d.C109075a<K, ? extends V> d = dVar.mo52154d();
            put = d.put(k, v);
            C109074d<K, ? extends V> build = d.build();
            if (C87412m.m108589b(build, dVar)) {
                break;
            }
            synchronized (obj) {
                C110877a aVar2 = (C110877a) this.f331665d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110877a aVar3 = (C110877a) C110865n.m151158u(aVar2, this, i2);
                    z = true;
                    if (aVar3.f331670d == i) {
                        aVar3.mo162583c(build);
                        aVar3.f331670d++;
                    } else {
                        z = false;
                    }
                }
                C110865n.m151150m(i2, this);
            }
        } while (!z);
        return put;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C109074d<K, ? extends V> dVar;
        int i;
        C110849h i2;
        boolean z;
        C87412m.m108594g(map, "from");
        do {
            Object obj = C110878y.f331671a;
            synchronized (obj) {
                C110877a aVar = (C110877a) C110865n.m151145h((C110877a) this.f331665d, C110865n.m151146i());
                dVar = aVar.f331669c;
                i = aVar.f331670d;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(dVar);
            C109074d.C109075a<K, ? extends V> d = dVar.mo52154d();
            d.putAll(map);
            C109074d<K, ? extends V> build = d.build();
            if (!C87412m.m108589b(build, dVar)) {
                synchronized (obj) {
                    C110877a aVar2 = (C110877a) this.f331665d;
                    synchronized (C110865n.f331651c) {
                        i2 = C110865n.m151146i();
                        C110877a aVar3 = (C110877a) C110865n.m151158u(aVar2, this, i2);
                        z = true;
                        if (aVar3.f331670d == i) {
                            aVar3.mo162583c(build);
                            aVar3.f331670d++;
                        } else {
                            z = false;
                        }
                    }
                    C110865n.m151150m(i2, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    public V remove(Object obj) {
        C109074d<K, ? extends V> dVar;
        int i;
        V remove;
        C110849h i2;
        boolean z;
        do {
            Object obj2 = C110878y.f331671a;
            synchronized (obj2) {
                C110877a aVar = (C110877a) C110865n.m151145h((C110877a) this.f331665d, C110865n.m151146i());
                dVar = aVar.f331669c;
                i = aVar.f331670d;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(dVar);
            C109074d.C109075a<K, ? extends V> d = dVar.mo52154d();
            remove = d.remove(obj);
            C109074d<K, ? extends V> build = d.build();
            if (C87412m.m108589b(build, dVar)) {
                break;
            }
            synchronized (obj2) {
                C110877a aVar2 = (C110877a) this.f331665d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110877a aVar3 = (C110877a) C110865n.m151158u(aVar2, this, i2);
                    z = true;
                    if (aVar3.f331670d == i) {
                        aVar3.mo162583c(build);
                        aVar3.f331670d++;
                    } else {
                        z = false;
                    }
                }
                C110865n.m151150m(i2, this);
            }
        } while (!z);
        return remove;
    }

    public final int size() {
        return mo162570a().f331669c.size();
    }

    public final Collection<V> values() {
        return this.f331668g;
    }
}
