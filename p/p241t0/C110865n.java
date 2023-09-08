package p241t0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p175j0.C108505i2;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: t0.n */
public final class C110865n {

    /* renamed from: a */
    public static final C32226l<C110860k, C13598b0> f331649a = C36920a.f97959d;

    /* renamed from: b */
    public static final C108505i2<C110849h> f331650b = new C108505i2<>();

    /* renamed from: c */
    public static final Object f331651c = new Object();

    /* renamed from: d */
    public static C110860k f331652d;

    /* renamed from: e */
    public static int f331653e;

    /* renamed from: f */
    public static final C110857j f331654f = new C110857j();

    /* renamed from: g */
    public static final List<C32227p<Set<? extends Object>, C110849h, C13598b0>> f331655g = new ArrayList();

    /* renamed from: h */
    public static final List<C32226l<Object, C13598b0>> f331656h = new ArrayList();

    /* renamed from: i */
    public static final AtomicReference<C110834a> f331657i;

    /* renamed from: t0.n$a */
    public static final class C36920a extends C87413o implements C32226l<C110860k, C13598b0> {

        /* renamed from: d */
        public static final C36920a f97959d = new C36920a();

        public C36920a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C110860k) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: t0.n$b */
    public static final class C36921b extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Object, C13598b0> f97960d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Object, C13598b0> f97961e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36921b(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2) {
            super(1);
            this.f97960d = lVar;
            this.f97961e = lVar2;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, "state");
            this.f97960d.invoke(obj);
            this.f97961e.invoke(obj);
            return C13598b0.f38549a;
        }
    }

    static {
        C110860k kVar = C110860k.f331631h;
        f331652d = kVar;
        f331653e = 1;
        int i = f331653e;
        f331653e = i + 1;
        C110834a aVar = new C110834a(i, kVar);
        f331652d = f331652d.mo162510m(aVar.f331614b);
        AtomicReference<C110834a> atomicReference = new AtomicReference<>(aVar);
        f331657i = atomicReference;
        C110834a aVar2 = atomicReference.get();
        C87412m.m108593f(aVar2, "currentGlobalSnapshot.get()");
        C110849h hVar = aVar2;
    }

    /* renamed from: a */
    public static final void m151138a() {
        m151143f(C36919m.f97958d);
    }

    /* renamed from: b */
    public static final C32226l m151139b(C32226l lVar, C32226l lVar2) {
        return (lVar == null || lVar2 == null || C87412m.m108589b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new C13817o(lVar, lVar2);
    }

    /* renamed from: c */
    public static final Map m151140c(C110838b bVar, C110838b bVar2, C110860k kVar) {
        C110856i0 p;
        Set<C110851h0> u = bVar2.mo162438u();
        int d = bVar.mo162463d();
        if (u == null) {
            return null;
        }
        C110860k l = bVar2.mo162464e().mo162510m(bVar2.mo162463d()).mo162509l(bVar2.f331589i);
        HashMap hashMap = null;
        for (C110851h0 next : u) {
            C110856i0 f = next.mo159357f();
            C110856i0 p2 = m151153p(f, d, kVar);
            if (!(p2 == null || (p = m151153p(f, d, l)) == null || C87412m.m108589b(p2, p))) {
                C110856i0 p3 = m151153p(f, bVar2.mo162463d(), bVar2.mo162464e());
                if (p3 != null) {
                    C110856i0 i = next.mo159358i(p, p2, p3);
                    if (i == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(p2, i);
                } else {
                    m151152o();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static final void m151141d(C110849h hVar) {
        if (!f331652d.mo162508k(hVar.mo162463d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    /* renamed from: e */
    public static final C110860k m151142e(C110860k kVar, int i, int i2) {
        C87412m.m108594g(kVar, "<this>");
        while (i < i2) {
            kVar = kVar.mo162510m(i);
            i++;
        }
        return kVar;
    }

    /* renamed from: f */
    public static final <T> T m151143f(C32226l<? super C110860k, ? extends T> lVar) {
        T t;
        List<T> B0;
        C110834a aVar = f331657i.get();
        Object obj = f331651c;
        synchronized (obj) {
            C87412m.m108593f(aVar, "previousGlobalSnapshot");
            t = m151157t(aVar, lVar);
        }
        Set<C110851h0> set = aVar.f331588h;
        if (set != null) {
            synchronized (obj) {
                B0 = C110818d0.m150900B0(f331655g);
            }
            ArrayList arrayList = (ArrayList) B0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C32227p) arrayList.get(i)).invoke(set, aVar);
            }
        }
        return t;
    }

    /* renamed from: g */
    public static final C110849h m151144g(C110849h hVar, C32226l<Object, C13598b0> lVar) {
        boolean z = hVar instanceof C110838b;
        if (!z && hVar != null) {
            return new C110864l0(hVar, lVar, false);
        }
        return new C110862k0(z ? (C110838b) hVar : null, lVar, (C32226l<Object, C13598b0>) null, false);
    }

    /* renamed from: h */
    public static final <T extends C110856i0> T m151145h(T t, C110849h hVar) {
        C87412m.m108594g(t, "r");
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        T p = m151153p(t, hVar.mo162463d(), hVar.mo162464e());
        if (p != null) {
            return p;
        }
        m151152o();
        throw null;
    }

    /* renamed from: i */
    public static final C110849h m151146i() {
        C110849h a = f331650b.mo159371a();
        if (a != null) {
            return a;
        }
        C110834a aVar = f331657i.get();
        C87412m.m108593f(aVar, "currentGlobalSnapshot.get()");
        return aVar;
    }

    /* renamed from: j */
    public static final C32226l<Object, C13598b0> m151147j(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2, boolean z) {
        if (!z) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || C87412m.m108589b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new C36921b(lVar, lVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r5 == false) goto L_0x0054;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends p241t0.C110856i0> T m151148k(T r12, p241t0.C110851h0 r13) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "state"
            gy3.C87412m.m108594g(r13, r0)
            t0.i0 r0 = r13.mo159357f()
            t0.j r1 = f331654f
            int r2 = f331653e
            int r3 = r1.f331620a
            r4 = 0
            if (r3 <= 0) goto L_0x001b
            int[] r1 = r1.f331621b
            r2 = r1[r4]
        L_0x001b:
            int r2 = r2 + -1
            r1 = 0
            r3 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0067
            int r5 = r0.f331618a
            if (r5 != 0) goto L_0x0026
            goto L_0x0060
        L_0x0026:
            r6 = 1
            if (r5 == 0) goto L_0x0053
            if (r5 > r2) goto L_0x0053
            int r5 = r5 + 0
            r7 = 1
            r9 = 64
            r10 = 0
            if (r5 < 0) goto L_0x0041
            if (r5 >= r9) goto L_0x0041
            long r7 = r7 << r5
            long r7 = r7 & r10
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
        L_0x003d:
            r5 = 1
            goto L_0x0050
        L_0x003f:
            r5 = 0
            goto L_0x0050
        L_0x0041:
            if (r5 < r9) goto L_0x003f
            r9 = 128(0x80, float:1.794E-43)
            if (r5 >= r9) goto L_0x003f
            int r5 = r5 + -64
            long r7 = r7 << r5
            long r7 = r7 & r10
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x003d
        L_0x0050:
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x005a
            r3 = r0
            goto L_0x0064
        L_0x005a:
            int r1 = r0.f331618a
            int r2 = r3.f331618a
            if (r1 >= r2) goto L_0x0062
        L_0x0060:
            r1 = r0
            goto L_0x0067
        L_0x0062:
            r1 = r3
            goto L_0x0067
        L_0x0064:
            t0.i0 r0 = r0.f331619b
            goto L_0x001f
        L_0x0067:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x006f
            r1.f331618a = r0
            goto L_0x007e
        L_0x006f:
            t0.i0 r1 = r12.mo159362b()
            r1.f331618a = r0
            t0.i0 r12 = r13.mo159357f()
            r1.f331619b = r12
            r13.mo159359m(r1)
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p241t0.C110865n.m151148k(t0.i0, t0.h0):t0.i0");
    }

    /* renamed from: l */
    public static final <T extends C110856i0> T m151149l(T t, C110851h0 h0Var, C110849h hVar) {
        C87412m.m108594g(t, "<this>");
        C87412m.m108594g(h0Var, "state");
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        T k = m151148k(t, h0Var);
        k.mo159361a(t);
        k.f331618a = hVar.mo162463d();
        return k;
    }

    /* renamed from: m */
    public static final void m151150m(C110849h hVar, C110851h0 h0Var) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        C87412m.m108594g(h0Var, "state");
        C32226l<Object, C13598b0> h = hVar.mo162434h();
        if (h != null) {
            h.invoke(h0Var);
        }
    }

    /* renamed from: n */
    public static final <T extends C110856i0> T m151151n(T t, C110851h0 h0Var, C110849h hVar, T t2) {
        C87412m.m108594g(t, "<this>");
        C87412m.m108594g(h0Var, "state");
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        C87412m.m108594g(t2, "candidate");
        if (hVar.mo162433g()) {
            hVar.mo162435m(h0Var);
        }
        int d = hVar.mo162463d();
        if (t2.f331618a == d) {
            return t2;
        }
        T k = m151148k(t, h0Var);
        k.f331618a = d;
        hVar.mo162435m(h0Var);
        return k;
    }

    /* renamed from: o */
    public static final Void m151152o() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* renamed from: p */
    public static final <T extends C110856i0> T m151153p(T t, int i, C110860k kVar) {
        T t2 = null;
        while (t != null) {
            int i2 = t.f331618a;
            if ((i2 != 0 && i2 <= i && !kVar.mo162508k(i2)) && (t2 == null || t2.f331618a < t.f331618a)) {
                t2 = t;
            }
            t = t.f331619b;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    /* renamed from: q */
    public static final <T extends C110856i0> T m151154q(T t, C110851h0 h0Var) {
        C87412m.m108594g(t, "<this>");
        C87412m.m108594g(h0Var, "state");
        return m151155r(t, h0Var, m151146i());
    }

    /* renamed from: r */
    public static final <T extends C110856i0> T m151155r(T t, C110851h0 h0Var, C110849h hVar) {
        C87412m.m108594g(t, "<this>");
        C87412m.m108594g(h0Var, "state");
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        C32226l<Object, C13598b0> f = hVar.mo162432f();
        if (f != null) {
            f.invoke(h0Var);
        }
        T p = m151153p(t, hVar.mo162463d(), hVar.mo162464e());
        if (p != null) {
            return p;
        }
        m151152o();
        throw null;
    }

    /* renamed from: s */
    public static final void m151156s(int i) {
        int i2;
        C110857j jVar = f331654f;
        int i3 = jVar.f331623d[i];
        jVar.mo162471b(i3, jVar.f331620a - 1);
        jVar.f331620a--;
        int[] iArr = jVar.f331621b;
        int i4 = iArr[i3];
        int i5 = i3;
        while (i5 > 0) {
            int i6 = ((i5 + 1) >> 1) - 1;
            if (iArr[i6] <= i4) {
                break;
            }
            jVar.mo162471b(i6, i5);
            i5 = i6;
        }
        int[] iArr2 = jVar.f331621b;
        int i7 = jVar.f331620a >> 1;
        while (i3 < i7) {
            int i8 = (i3 + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < jVar.f331620a && (i2 = iArr2[i8]) < iArr2[i9]) {
                if (i2 >= iArr2[i3]) {
                    break;
                }
                jVar.mo162471b(i8, i3);
                i3 = i8;
            } else if (iArr2[i9] >= iArr2[i3]) {
                break;
            } else {
                jVar.mo162471b(i9, i3);
                i3 = i9;
            }
        }
        jVar.f331623d[i] = jVar.f331624e;
        jVar.f331624e = i;
    }

    /* renamed from: t */
    public static final <T> T m151157t(C110849h hVar, C32226l<? super C110860k, ? extends T> lVar) {
        T invoke = lVar.invoke(f331652d.mo162506i(hVar.mo162463d()));
        synchronized (f331651c) {
            int i = f331653e;
            f331653e = i + 1;
            C110860k i2 = f331652d.mo162506i(hVar.mo162463d());
            f331652d = i2;
            f331657i.set(new C110834a(i, i2));
            hVar.mo162424c();
            f331652d = f331652d.mo162510m(i);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return invoke;
    }

    /* renamed from: u */
    public static final <T extends C110856i0> T m151158u(T t, C110851h0 h0Var, C110849h hVar) {
        C87412m.m108594g(t, "<this>");
        C87412m.m108594g(h0Var, "state");
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        if (hVar.mo162433g()) {
            hVar.mo162435m(h0Var);
        }
        T p = m151153p(t, hVar.mo162463d(), hVar.mo162464e());
        if (p == null) {
            m151152o();
            throw null;
        } else if (p.f331618a == hVar.mo162463d()) {
            return p;
        } else {
            T l = m151149l(p, h0Var, hVar);
            hVar.mo162435m(h0Var);
            return l;
        }
    }
}
