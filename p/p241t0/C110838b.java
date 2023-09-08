package p241t0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p241t0.C110853i;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;

/* renamed from: t0.b */
public class C110838b extends C110849h {

    /* renamed from: f */
    public final C32226l<Object, C13598b0> f331586f;

    /* renamed from: g */
    public final C32226l<Object, C13598b0> f331587g;

    /* renamed from: h */
    public Set<C110851h0> f331588h;

    /* renamed from: i */
    public C110860k f331589i = C110860k.f331631h;

    /* renamed from: j */
    public int[] f331590j = new int[0];

    /* renamed from: k */
    public int f331591k = 1;

    /* renamed from: l */
    public boolean f331592l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110838b(int i, C110860k kVar, C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2) {
        super(i, kVar, (C8480h) null);
        C87412m.m108594g(kVar, "invalid");
        this.f331586f = lVar;
        this.f331587g = lVar2;
    }

    /* renamed from: b */
    public void mo162431b() {
        C110865n.f331652d = C110865n.f331652d.mo162506i(mo162463d()).mo162505f(this.f331589i);
    }

    /* renamed from: c */
    public void mo162424c() {
        if (!this.f331615c) {
            super.mo162424c();
            mo162426k(this);
        }
    }

    /* renamed from: f */
    public C32226l<Object, C13598b0> mo162432f() {
        return this.f331586f;
    }

    /* renamed from: g */
    public boolean mo162433g() {
        return false;
    }

    /* renamed from: h */
    public C32226l<Object, C13598b0> mo162434h() {
        return this.f331587g;
    }

    /* renamed from: j */
    public void mo162425j(C110849h hVar) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        this.f331591k++;
    }

    /* renamed from: k */
    public void mo162426k(C110849h hVar) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        int i = this.f331591k;
        if (i > 0) {
            int i2 = i - 1;
            this.f331591k = i2;
            if (i2 == 0 && !this.f331592l) {
                Set<C110851h0> u = mo162438u();
                if (u != null) {
                    if (true ^ this.f331592l) {
                        mo162441x((Set<C110851h0>) null);
                        int d = mo162463d();
                        for (C110851h0 f : u) {
                            for (C110856i0 f2 = f.mo159357f(); f2 != null; f2 = f2.f331619b) {
                                int i3 = f2.f331618a;
                                if (i3 == d || C110818d0.m150903D(this.f331589i, Integer.valueOf(i3))) {
                                    f2.f331618a = 0;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                }
                mo162462a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: l */
    public void mo162427l() {
        if (!this.f331592l && !this.f331615c) {
            mo162437s();
        }
    }

    /* renamed from: m */
    public void mo162435m(C110851h0 h0Var) {
        C87412m.m108594g(h0Var, "state");
        Set u = mo162438u();
        if (u == null) {
            u = new HashSet();
            mo162441x(u);
        }
        u.add(h0Var);
    }

    /* renamed from: n */
    public void mo162436n() {
        for (int s : this.f331590j) {
            C110865n.m151156s(s);
        }
        int i = this.f331616d;
        if (i >= 0) {
            C110865n.m151156s(i);
            this.f331616d = -1;
        }
    }

    /* renamed from: r */
    public C110849h mo162428r(C32226l<Object, C13598b0> lVar) {
        C110842d dVar;
        if (!this.f331615c) {
            mo162442z();
            int d = mo162463d();
            mo162440w(mo162463d());
            Object obj = C110865n.f331651c;
            synchronized (obj) {
                int i = C110865n.f331653e;
                C110865n.f331653e = i + 1;
                C110865n.f331652d = C110865n.f331652d.mo162510m(i);
                dVar = new C110842d(i, C110865n.m151142e(mo162464e(), d + 1, i), lVar, this);
            }
            if (!this.f331592l && !this.f331615c) {
                int d2 = mo162463d();
                synchronized (obj) {
                    int i2 = C110865n.f331653e;
                    C110865n.f331653e = i2 + 1;
                    mo162467p(i2);
                    C110865n.f331652d = C110865n.f331652d.mo162510m(mo162463d());
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                mo162468q(C110865n.m151142e(mo162464e(), d2 + 1, mo162463d()));
            }
            return dVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    /* renamed from: s */
    public final void mo162437s() {
        mo162440w(mo162463d());
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f331592l && !this.f331615c) {
            int d = mo162463d();
            synchronized (C110865n.f331651c) {
                int i = C110865n.f331653e;
                C110865n.f331653e = i + 1;
                mo162467p(i);
                C110865n.f331652d = C110865n.f331652d.mo162510m(mo162463d());
            }
            mo162468q(C110865n.m151142e(mo162464e(), d + 1, mo162463d()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r1 = (java.util.List) r5.f38555d;
        r2 = (java.util.Set) r5.f38556e;
        r9.f331592l = true;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r2 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if ((!r2.isEmpty()) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r5 = r1.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        if (r6 >= r5) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        ((fy3.C32227p) r1.get(r6)).invoke(r2, r9);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ce, code lost:
        if (r0 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        r2 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        if (r3 >= r2) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        ((fy3.C32227p) r1.get(r3)).invoke(r0, r9);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        r0 = p241t0.C110865n.f331651c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00eb, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        mo162436n();
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f4, code lost:
        return p241t0.C110853i.C110855b.f331617a;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p241t0.C110853i mo162429t() {
        /*
            r9 = this;
            java.util.Set r0 = r9.mo162438u()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            java.util.concurrent.atomic.AtomicReference<t0.a> r2 = p241t0.C110865n.f331657i
            java.lang.Object r3 = r2.get()
            java.lang.String r4 = "currentGlobalSnapshot.get()"
            gy3.C87412m.m108593f(r3, r4)
            t0.b r3 = (p241t0.C110838b) r3
            t0.k r4 = p241t0.C110865n.f331652d
            java.lang.Object r2 = r2.get()
            t0.a r2 = (p241t0.C110834a) r2
            int r2 = r2.f331614b
            t0.k r2 = r4.mo162506i(r2)
            java.util.Map r2 = p241t0.C110865n.m151140c(r3, r9, r2)
            goto L_0x0028
        L_0x0027:
            r2 = r1
        L_0x0028:
            java.lang.Object r3 = p241t0.C110865n.f331651c
            monitor-enter(r3)
            p241t0.C110865n.m151141d(r9)     // Catch:{ all -> 0x00f8 }
            r4 = 1
            if (r0 == 0) goto L_0x0073
            int r5 = r0.size()     // Catch:{ all -> 0x00f8 }
            if (r5 != 0) goto L_0x0038
            goto L_0x0073
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference<t0.a> r5 = p241t0.C110865n.f331657i     // Catch:{ all -> 0x00f8 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00f8 }
            t0.a r5 = (p241t0.C110834a) r5     // Catch:{ all -> 0x00f8 }
            int r6 = p241t0.C110865n.f331653e     // Catch:{ all -> 0x00f8 }
            t0.k r7 = p241t0.C110865n.f331652d     // Catch:{ all -> 0x00f8 }
            int r8 = r5.f331614b     // Catch:{ all -> 0x00f8 }
            t0.k r7 = r7.mo162506i(r8)     // Catch:{ all -> 0x00f8 }
            t0.i r2 = r9.mo162439v(r6, r2, r7)     // Catch:{ all -> 0x00f8 }
            t0.i$b r6 = p241t0.C110853i.C110855b.f331617a     // Catch:{ all -> 0x00f8 }
            boolean r6 = gy3.C87412m.m108589b(r2, r6)     // Catch:{ all -> 0x00f8 }
            if (r6 != 0) goto L_0x0058
            monitor-exit(r3)
            return r2
        L_0x0058:
            r9.mo162431b()     // Catch:{ all -> 0x00f8 }
            fy3.l<t0.k, rx3.b0> r2 = p241t0.C110865n.f331649a     // Catch:{ all -> 0x00f8 }
            p241t0.C110865n.m151157t(r5, r2)     // Catch:{ all -> 0x00f8 }
            java.util.Set<t0.h0> r2 = r5.f331588h     // Catch:{ all -> 0x00f8 }
            r9.mo162441x(r1)     // Catch:{ all -> 0x00f8 }
            r5.f331588h = r1     // Catch:{ all -> 0x00f8 }
            java.util.List<fy3.p<java.util.Set<? extends java.lang.Object>, t0.h, rx3.b0>> r1 = p241t0.C110865n.f331655g     // Catch:{ all -> 0x00f8 }
            java.util.List r1 = sx3.C110818d0.m150900B0(r1)     // Catch:{ all -> 0x00f8 }
            rx3.l r5 = new rx3.l     // Catch:{ all -> 0x00f8 }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x00f8 }
            goto L_0x00a6
        L_0x0073:
            r9.mo162431b()     // Catch:{ all -> 0x00f8 }
            java.util.concurrent.atomic.AtomicReference<t0.a> r2 = p241t0.C110865n.f331657i     // Catch:{ all -> 0x00f8 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00f8 }
            t0.a r2 = (p241t0.C110834a) r2     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = "previousGlobalSnapshot"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ all -> 0x00f8 }
            fy3.l<t0.k, rx3.b0> r5 = p241t0.C110865n.f331649a     // Catch:{ all -> 0x00f8 }
            p241t0.C110865n.m151157t(r2, r5)     // Catch:{ all -> 0x00f8 }
            java.util.Set<t0.h0> r2 = r2.f331588h     // Catch:{ all -> 0x00f8 }
            if (r2 == 0) goto L_0x009f
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x00f8 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x009f
            java.util.List<fy3.p<java.util.Set<? extends java.lang.Object>, t0.h, rx3.b0>> r1 = p241t0.C110865n.f331655g     // Catch:{ all -> 0x00f8 }
            java.util.List r1 = sx3.C110818d0.m150900B0(r1)     // Catch:{ all -> 0x00f8 }
            rx3.l r5 = new rx3.l     // Catch:{ all -> 0x00f8 }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x00f8 }
            goto L_0x00a6
        L_0x009f:
            sx3.f0 r2 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x00f8 }
            rx3.l r5 = new rx3.l     // Catch:{ all -> 0x00f8 }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x00f8 }
        L_0x00a6:
            monitor-exit(r3)
            A r1 = r5.f38555d
            java.util.List r1 = (java.util.List) r1
            B r2 = r5.f38556e
            java.util.Set r2 = (java.util.Set) r2
            r9.f331592l = r4
            r3 = 0
            if (r2 == 0) goto L_0x00ce
            boolean r5 = r2.isEmpty()
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00ce
            int r5 = r1.size()
            r6 = 0
        L_0x00c0:
            if (r6 >= r5) goto L_0x00ce
            java.lang.Object r7 = r1.get(r6)
            fy3.p r7 = (fy3.C32227p) r7
            r7.invoke(r2, r9)
            int r6 = r6 + 1
            goto L_0x00c0
        L_0x00ce:
            if (r0 == 0) goto L_0x00e9
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x00e9
            int r2 = r1.size()
        L_0x00db:
            if (r3 >= r2) goto L_0x00e9
            java.lang.Object r4 = r1.get(r3)
            fy3.p r4 = (fy3.C32227p) r4
            r4.invoke(r0, r9)
            int r3 = r3 + 1
            goto L_0x00db
        L_0x00e9:
            java.lang.Object r0 = p241t0.C110865n.f331651c
            monitor-enter(r0)
            r9.mo162436n()     // Catch:{ all -> 0x00f5 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00f5 }
            monitor-exit(r0)
            t0.i$b r0 = p241t0.C110853i.C110855b.f331617a
            return r0
        L_0x00f5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p241t0.C110838b.mo162429t():t0.i");
    }

    /* renamed from: u */
    public Set<C110851h0> mo162438u() {
        return this.f331588h;
    }

    /* renamed from: v */
    public final C110853i mo162439v(int i, Map<C110856i0, ? extends C110856i0> map, C110860k kVar) {
        C110856i0 p;
        C110856i0 i0Var;
        C87412m.m108594g(kVar, "invalidSnapshots");
        C110860k l = mo162464e().mo162510m(mo162463d()).mo162509l(this.f331589i);
        Set<C110851h0> u = mo162438u();
        C87412m.m108591d(u);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (C110851h0 next : u) {
            C110856i0 f = next.mo159357f();
            C110856i0 p2 = C110865n.m151153p(f, i, kVar);
            if (!(p2 == null || (p = C110865n.m151153p(f, mo162463d(), l)) == null || C87412m.m108589b(p2, p))) {
                C110856i0 p3 = C110865n.m151153p(f, mo162463d(), mo162464e());
                if (p3 != null) {
                    if (map == null || (i0Var = (C110856i0) map.get(p2)) == null) {
                        i0Var = next.mo159358i(p, p2, p3);
                    }
                    if (i0Var == null) {
                        return new C110853i.C110854a(this);
                    }
                    if (!C87412m.m108589b(i0Var, p3)) {
                        if (C87412m.m108589b(i0Var, p2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new C13604l(next, p2.mo159362b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(!C87412m.m108589b(i0Var, p) ? new C13604l(next, i0Var) : new C13604l(next, p.mo159362b()));
                        }
                    }
                } else {
                    C110865n.m151152o();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            mo162437s();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13604l lVar = (C13604l) arrayList.get(i2);
                C110851h0 h0Var = (C110851h0) lVar.f38555d;
                C110856i0 i0Var2 = (C110856i0) lVar.f38556e;
                i0Var2.f331618a = mo162463d();
                synchronized (C110865n.f331651c) {
                    i0Var2.f331619b = h0Var.mo159357f();
                    h0Var.mo159359m(i0Var2);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        }
        if (arrayList2 != null) {
            u.removeAll(arrayList2);
        }
        return C110853i.C110855b.f331617a;
    }

    /* renamed from: w */
    public final void mo162440w(int i) {
        synchronized (C110865n.f331651c) {
            this.f331589i = this.f331589i.mo162510m(i);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: x */
    public void mo162441x(Set<C110851h0> set) {
        this.f331588h = set;
    }

    /* renamed from: y */
    public C110838b mo162430y(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2) {
        C110840c cVar;
        if (!this.f331615c) {
            mo162442z();
            mo162440w(mo162463d());
            Object obj = C110865n.f331651c;
            synchronized (obj) {
                int i = C110865n.f331653e;
                C110865n.f331653e = i + 1;
                C110865n.f331652d = C110865n.f331652d.mo162510m(i);
                C110860k e = mo162464e();
                mo162468q(e.mo162510m(i));
                cVar = new C110840c(i, C110865n.m151142e(e, mo162463d() + 1, i), C110865n.m151147j(lVar, this.f331586f, true), C110865n.m151139b(lVar2, this.f331587g), this);
            }
            if (!this.f331592l && !this.f331615c) {
                int d = mo162463d();
                synchronized (obj) {
                    int i2 = C110865n.f331653e;
                    C110865n.f331653e = i2 + 1;
                    mo162467p(i2);
                    C110865n.f331652d = C110865n.f331652d.mo162510m(mo162463d());
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                mo162468q(C110865n.m151142e(mo162464e(), d + 1, mo162463d()));
            }
            return cVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if ((r3.f331616d >= 0) != false) goto L_0x000f;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162442z() {
        /*
            r3 = this;
            boolean r0 = r3.f331592l
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r3.f331616d
            if (r0 < 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            if (r1 == 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p241t0.C110838b.mo162442z():void");
    }
}
