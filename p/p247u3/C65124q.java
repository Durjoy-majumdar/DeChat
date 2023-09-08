package p247u3;

import a14.C0000n0;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import p247u3.C65014b0;
import p247u3.C65035c1;
import p247u3.C65067h1;
import p247u3.C65145q1;
import sx3.C110818d0;
import wx3.C15601d;

/* renamed from: u3.q */
public class C65124q<K, V> extends C65035c1<V> implements C65067h1.C65068a, C65014b0.C65016b<V> {

    /* renamed from: n */
    public boolean f187446n;

    /* renamed from: o */
    public boolean f187447o;

    /* renamed from: p */
    public int f187448p = Integer.MAX_VALUE;

    /* renamed from: q */
    public int f187449q = Integer.MIN_VALUE;

    /* renamed from: r */
    public final C65014b0<K, V> f187450r;

    /* renamed from: s */
    public final C65145q1<K, V> f187451s;

    /* renamed from: t */
    public final C65035c1.C65036a<V> f187452t;

    /* renamed from: u */
    public final K f187453u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65124q(C65145q1<K, V> q1Var, C0000n0 n0Var, C53896h0 h0Var, C53896h0 h0Var2, C65035c1.C65036a<V> aVar, C65035c1.C65038c cVar, C65145q1.C65150b.C65152b<K, V> bVar, K k) {
        super(q1Var, n0Var, h0Var, new C65067h1(), cVar);
        C65145q1<K, V> q1Var2 = q1Var;
        C65035c1.C65036a<V> aVar2 = aVar;
        C65035c1.C65038c cVar2 = cVar;
        C65145q1.C65150b.C65152b<K, V> bVar2 = bVar;
        C87412m.m108594g(q1Var2, "pagingSource");
        C87412m.m108594g(n0Var, "coroutineScope");
        C87412m.m108594g(h0Var, "notifyDispatcher");
        C87412m.m108594g(h0Var2, "backgroundDispatcher");
        C87412m.m108594g(cVar2, "config");
        C87412m.m108594g(bVar2, "initialPage");
        this.f187451s = q1Var2;
        this.f187452t = aVar2;
        this.f187453u = k;
        C65067h1<T> h1Var = this.f187207h;
        if (h1Var != null) {
            C65014b0<K, V> b0Var = r0;
            C65014b0<K, V> b0Var2 = new C65014b0<>(n0Var, cVar, q1Var, h0Var, h0Var2, this, h1Var);
            this.f187450r = b0Var;
            boolean z = true;
            if (cVar2.f187211c) {
                C65067h1<T> h1Var2 = this.f187207h;
                int i = bVar2.f187565d;
                int i2 = i != Integer.MIN_VALUE ? i : 0;
                int i3 = bVar2.f187566e;
                h1Var2.mo89269f(i2, bVar, i3 != Integer.MIN_VALUE ? i3 : 0, 0, this, (i == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) ? false : true);
            } else {
                C65067h1<T> h1Var3 = this.f187207h;
                int i4 = bVar2.f187565d;
                h1Var3.mo89269f(0, bVar, 0, i4 != Integer.MIN_VALUE ? i4 : 0, this, false);
            }
            if (aVar2 != null) {
                z = this.f187207h.size() != 0 ? false : z;
                if (aVar2 != null) {
                    if (this.f187448p == Integer.MAX_VALUE) {
                        this.f187448p = this.f187207h.size();
                    }
                    if (this.f187449q == Integer.MIN_VALUE) {
                        this.f187449q = 0;
                    }
                    if (z) {
                        C53895h.m60466d(this.f187205f, this.f187206g, (C53934p0) null, new C65113p(this, z, false, false, (C15601d) null), 2, (Object) null);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K>");
    }

    /* renamed from: f */
    public void mo89274f(int i) {
        if (i != 0) {
            for (T t : C110818d0.m150936h0(this.f187203d)) {
                C65035c1.C65037b bVar = (C65035c1.C65037b) t.get();
                if (bVar != null) {
                    bVar.mo89228b(0, i);
                }
            }
        }
        C65067h1<T> h1Var = this.f187207h;
        if (h1Var.f187273e <= 0) {
            int i2 = h1Var.f187274f;
        }
    }

    /* renamed from: i */
    public K mo89236i() {
        K b;
        C65067h1<T> h1Var = this.f187207h;
        C65035c1.C65038c cVar = this.f187208i;
        h1Var.getClass();
        C87412m.m108594g(cVar, "config");
        C65164r1 r1Var = ((ArrayList) h1Var.f187272d).isEmpty() ? null : new C65164r1(C110818d0.m150953y0(h1Var.f187272d), Integer.valueOf(h1Var.f187273e + h1Var.f187276h), new C65078l1(cVar.f187209a, cVar.f187210b, cVar.f187211c, cVar.f187212d, cVar.f187213e, 0, 32, (C8480h) null), h1Var.f187273e);
        return (r1Var == null || (b = this.f187451s.mo72455b(r1Var)) == null) ? this.f187453u : b;
    }

    /* renamed from: k */
    public final C65145q1<K, V> mo89237k() {
        return this.f187451s;
    }

    /* renamed from: l */
    public boolean mo89238l() {
        return this.f187450r.f187160a.get();
    }

    /* renamed from: n */
    public final void mo89299n(boolean z, boolean z2) {
        if (z) {
            C65035c1.C65036a<V> aVar = this.f187452t;
            C87412m.m108591d(aVar);
            aVar.mo79081b(C110818d0.m150914L(((C65145q1.C65150b.C65152b) C110818d0.m150914L(this.f187207h.f187272d)).f187562a));
        }
        if (z2) {
            C65035c1.C65036a<V> aVar2 = this.f187452t;
            C87412m.m108591d(aVar2);
            aVar2.mo79080a(C110818d0.m150923U(((C65145q1.C65150b.C65152b) C110818d0.m150923U(this.f187207h.f187272d)).f187562a));
        }
    }
}
