package p241t0;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import p175j0.C108505i2;
import rx3.C13598b0;

/* renamed from: t0.h */
public abstract class C110849h {

    /* renamed from: e */
    public static final C110850a f331612e = new C110850a((C8480h) null);

    /* renamed from: a */
    public C110860k f331613a;

    /* renamed from: b */
    public int f331614b;

    /* renamed from: c */
    public boolean f331615c;

    /* renamed from: d */
    public int f331616d;

    /* renamed from: t0.h$a */
    public static final class C110850a {
        public C110850a(C8480h hVar) {
        }

        /* renamed from: a */
        public final <T> T mo162469a(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2, C32224a<? extends T> aVar) {
            C110849h hVar;
            C110849h i;
            C87412m.m108594g(aVar, "block");
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            C110849h a = C110865n.f331650b.mo159371a();
            if (a == null || (a instanceof C110838b)) {
                hVar = new C110862k0(a instanceof C110838b ? (C110838b) a : null, lVar, lVar2, true);
            } else if (lVar == null) {
                return aVar.invoke();
            } else {
                hVar = a.mo162428r(lVar);
            }
            try {
                i = hVar.mo162465i();
                T invoke = aVar.invoke();
                hVar.mo162466o(i);
                hVar.mo162424c();
                return invoke;
            } catch (Throwable th) {
                hVar.mo162424c();
                throw th;
            }
        }
    }

    public C110849h(int i, C110860k kVar, C8480h hVar) {
        int i2;
        int i3;
        int i4;
        this.f331613a = kVar;
        this.f331614b = i;
        if (i != 0) {
            C110860k e = mo162464e();
            C32226l<C110860k, C13598b0> lVar = C110865n.f331649a;
            C87412m.m108594g(e, "invalid");
            int[] iArr = e.f331635g;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = e.f331633e;
                if (j != 0) {
                    i4 = e.f331634f;
                    i3 = C110863l.m151124a(j);
                } else {
                    long j2 = e.f331632d;
                    if (j2 != 0) {
                        i4 = e.f331634f + 64;
                        i3 = C110863l.m151124a(j2);
                    }
                }
                i = i4 + i3;
            }
            synchronized (C110865n.f331651c) {
                i2 = C110865n.f331654f.mo162470a(i);
            }
        } else {
            i2 = -1;
        }
        this.f331616d = i2;
    }

    /* renamed from: a */
    public final void mo162462a() {
        synchronized (C110865n.f331651c) {
            mo162431b();
            mo162436n();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public void mo162431b() {
        C110865n.f331652d = C110865n.f331652d.mo162506i(mo162463d());
    }

    /* renamed from: c */
    public void mo162424c() {
        this.f331615c = true;
        synchronized (C110865n.f331651c) {
            int i = this.f331616d;
            if (i >= 0) {
                C110865n.m151156s(i);
                this.f331616d = -1;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public int mo162463d() {
        return this.f331614b;
    }

    /* renamed from: e */
    public C110860k mo162464e() {
        return this.f331613a;
    }

    /* renamed from: f */
    public abstract C32226l<Object, C13598b0> mo162432f();

    /* renamed from: g */
    public abstract boolean mo162433g();

    /* renamed from: h */
    public abstract C32226l<Object, C13598b0> mo162434h();

    /* renamed from: i */
    public C110849h mo162465i() {
        C108505i2<C110849h> i2Var = C110865n.f331650b;
        C110849h a = i2Var.mo159371a();
        i2Var.mo159372b(this);
        return a;
    }

    /* renamed from: j */
    public abstract void mo162425j(C110849h hVar);

    /* renamed from: k */
    public abstract void mo162426k(C110849h hVar);

    /* renamed from: l */
    public abstract void mo162427l();

    /* renamed from: m */
    public abstract void mo162435m(C110851h0 h0Var);

    /* renamed from: n */
    public void mo162436n() {
        int i = this.f331616d;
        if (i >= 0) {
            C110865n.m151156s(i);
            this.f331616d = -1;
        }
    }

    /* renamed from: o */
    public void mo162466o(C110849h hVar) {
        C110865n.f331650b.mo159372b(hVar);
    }

    /* renamed from: p */
    public void mo162467p(int i) {
        this.f331614b = i;
    }

    /* renamed from: q */
    public void mo162468q(C110860k kVar) {
        C87412m.m108594g(kVar, "<set-?>");
        this.f331613a = kVar;
    }

    /* renamed from: r */
    public abstract C110849h mo162428r(C32226l<Object, C13598b0> lVar);
}
