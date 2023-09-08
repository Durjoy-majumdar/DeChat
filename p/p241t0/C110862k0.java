package p241t0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Set;
import rx3.C13598b0;

/* renamed from: t0.k0 */
public final class C110862k0 extends C110838b {

    /* renamed from: m */
    public final C110838b f331642m;

    /* renamed from: n */
    public final C32226l<Object, C13598b0> f331643n;

    /* renamed from: o */
    public final C32226l<Object, C13598b0> f331644o;

    /* renamed from: p */
    public final boolean f331645p;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r5.f331586f;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110862k0(p241t0.C110838b r5, fy3.C32226l<java.lang.Object, rx3.C13598b0> r6, fy3.C32226l<java.lang.Object, rx3.C13598b0> r7, boolean r8) {
        /*
            r4 = this;
            t0.k r0 = p241t0.C110860k.f331631h
            if (r5 == 0) goto L_0x0008
            fy3.l<java.lang.Object, rx3.b0> r1 = r5.f331586f
            if (r1 != 0) goto L_0x0012
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<t0.a> r1 = p241t0.C110865n.f331657i
            java.lang.Object r1 = r1.get()
            t0.a r1 = (p241t0.C110834a) r1
            fy3.l<java.lang.Object, rx3.b0> r1 = r1.f331586f
        L_0x0012:
            fy3.l r1 = p241t0.C110865n.m151147j(r6, r1, r8)
            if (r5 == 0) goto L_0x001c
            fy3.l<java.lang.Object, rx3.b0> r2 = r5.f331587g
            if (r2 != 0) goto L_0x0026
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<t0.a> r2 = p241t0.C110865n.f331657i
            java.lang.Object r2 = r2.get()
            t0.a r2 = (p241t0.C110834a) r2
            fy3.l<java.lang.Object, rx3.b0> r2 = r2.f331587g
        L_0x0026:
            fy3.l r2 = p241t0.C110865n.m151139b(r7, r2)
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            r4.f331642m = r5
            r4.f331643n = r6
            r4.f331644o = r7
            r4.f331645p = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241t0.C110862k0.<init>(t0.b, fy3.l, fy3.l, boolean):void");
    }

    /* renamed from: A */
    public final C110838b mo162512A() {
        C110838b bVar = this.f331642m;
        if (bVar != null) {
            return bVar;
        }
        C110834a aVar = C110865n.f331657i.get();
        C87412m.m108593f(aVar, "currentGlobalSnapshot.get()");
        return aVar;
    }

    /* renamed from: c */
    public void mo162424c() {
        this.f331615c = true;
    }

    /* renamed from: d */
    public int mo162463d() {
        return mo162512A().mo162463d();
    }

    /* renamed from: e */
    public C110860k mo162464e() {
        return mo162512A().mo162464e();
    }

    /* renamed from: g */
    public boolean mo162433g() {
        return mo162512A().mo162433g();
    }

    /* renamed from: j */
    public void mo162425j(C110849h hVar) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        C110878y.m151177a();
        throw null;
    }

    /* renamed from: k */
    public void mo162426k(C110849h hVar) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        C110878y.m151177a();
        throw null;
    }

    /* renamed from: l */
    public void mo162427l() {
        mo162512A().mo162427l();
    }

    /* renamed from: m */
    public void mo162435m(C110851h0 h0Var) {
        C87412m.m108594g(h0Var, "state");
        mo162512A().mo162435m(h0Var);
    }

    /* renamed from: p */
    public void mo162467p(int i) {
        C110878y.m151177a();
        throw null;
    }

    /* renamed from: q */
    public void mo162468q(C110860k kVar) {
        C87412m.m108594g(kVar, "value");
        C110878y.m151177a();
        throw null;
    }

    /* renamed from: r */
    public C110849h mo162428r(C32226l<Object, C13598b0> lVar) {
        return !this.f331645p ? C110865n.m151144g(mo162512A().mo162428r((C32226l<Object, C13598b0>) null), lVar) : mo162512A().mo162428r(C110865n.m151147j(lVar, this.f331586f, true));
    }

    /* renamed from: t */
    public C110853i mo162429t() {
        return mo162512A().mo162429t();
    }

    /* renamed from: u */
    public Set<C110851h0> mo162438u() {
        return mo162512A().mo162438u();
    }

    /* renamed from: x */
    public void mo162441x(Set<C110851h0> set) {
        C110878y.m151177a();
        throw null;
    }

    /* renamed from: y */
    public C110838b mo162430y(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2) {
        C32226l<Object, C13598b0> j = C110865n.m151147j(lVar, this.f331586f, true);
        C32226l b = C110865n.m151139b(lVar2, this.f331587g);
        return !this.f331645p ? new C110862k0(mo162512A().mo162430y((C32226l<Object, C13598b0>) null, b), j, b, false) : mo162512A().mo162430y(j, b);
    }
}
