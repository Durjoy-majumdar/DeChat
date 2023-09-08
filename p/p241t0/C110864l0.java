package p241t0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: t0.l0 */
public final class C110864l0 extends C110849h {

    /* renamed from: f */
    public final C110849h f331646f;

    /* renamed from: g */
    public final boolean f331647g;

    /* renamed from: h */
    public final C32226l<Object, C13598b0> f331648h;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r4 = r4.mo162432f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110864l0(p241t0.C110849h r4, fy3.C32226l<java.lang.Object, rx3.C13598b0> r5, boolean r6) {
        /*
            r3 = this;
            t0.k r0 = p241t0.C110860k.f331631h
            r1 = 0
            r2 = 0
            r3.<init>(r1, r0, r2)
            r3.f331646f = r4
            r3.f331647g = r6
            if (r4 == 0) goto L_0x0013
            fy3.l r4 = r4.mo162432f()
            if (r4 != 0) goto L_0x001d
        L_0x0013:
            java.util.concurrent.atomic.AtomicReference<t0.a> r4 = p241t0.C110865n.f331657i
            java.lang.Object r4 = r4.get()
            t0.a r4 = (p241t0.C110834a) r4
            fy3.l<java.lang.Object, rx3.b0> r4 = r4.f331586f
        L_0x001d:
            fy3.l r4 = p241t0.C110865n.m151147j(r5, r4, r6)
            r3.f331648h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p241t0.C110864l0.<init>(t0.h, fy3.l, boolean):void");
    }

    /* renamed from: c */
    public void mo162424c() {
        this.f331615c = true;
    }

    /* renamed from: d */
    public int mo162463d() {
        return mo162513s().mo162463d();
    }

    /* renamed from: e */
    public C110860k mo162464e() {
        return mo162513s().mo162464e();
    }

    /* renamed from: f */
    public C32226l<Object, C13598b0> mo162432f() {
        return this.f331648h;
    }

    /* renamed from: g */
    public boolean mo162433g() {
        return mo162513s().mo162433g();
    }

    /* renamed from: h */
    public C32226l<Object, C13598b0> mo162434h() {
        return null;
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
        mo162513s().mo162427l();
    }

    /* renamed from: m */
    public void mo162435m(C110851h0 h0Var) {
        C87412m.m108594g(h0Var, "state");
        mo162513s().mo162435m(h0Var);
    }

    /* renamed from: r */
    public C110849h mo162428r(C32226l<Object, C13598b0> lVar) {
        return !this.f331647g ? C110865n.m151144g(mo162513s().mo162428r((C32226l<Object, C13598b0>) null), lVar) : mo162513s().mo162428r(C110865n.m151147j(lVar, this.f331648h, true));
    }

    /* renamed from: s */
    public final C110849h mo162513s() {
        C110849h hVar = this.f331646f;
        if (hVar != null) {
            return hVar;
        }
        C110834a aVar = C110865n.f331657i.get();
        C87412m.m108593f(aVar, "currentGlobalSnapshot.get()");
        return aVar;
    }
}
