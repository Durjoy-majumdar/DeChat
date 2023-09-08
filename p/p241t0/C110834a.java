package p241t0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: t0.a */
public final class C110834a extends C110838b {

    /* renamed from: t0.a$a */
    public static final class C36918a extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C32226l<Object, C13598b0>> f97957d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36918a(List<C32226l<Object, C13598b0>> list) {
            super(1);
            this.f97957d = list;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, "state");
            List<C32226l<Object, C13598b0>> list = this.f97957d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(obj);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: t0.a$b */
    public static final class C110835b extends C87413o implements C32226l<C110860k, C110838b> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Object, C13598b0> f331582d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Object, C13598b0> f331583e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110835b(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2) {
            super(1);
            this.f331582d = lVar;
            this.f331583e = lVar2;
        }

        public Object invoke(Object obj) {
            int i;
            C110860k kVar = (C110860k) obj;
            C87412m.m108594g(kVar, "invalid");
            synchronized (C110865n.f331651c) {
                i = C110865n.f331653e;
                C110865n.f331653e = i + 1;
            }
            return new C110838b(i, kVar, this.f331582d, this.f331583e);
        }
    }

    /* renamed from: t0.a$c */
    public static final class C110836c extends C87413o implements C32226l<C110860k, C110846f> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Object, C13598b0> f331584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110836c(C32226l<Object, C13598b0> lVar) {
            super(1);
            this.f331584d = lVar;
        }

        public Object invoke(Object obj) {
            int i;
            C110860k kVar = (C110860k) obj;
            C87412m.m108594g(kVar, "invalid");
            synchronized (C110865n.f331651c) {
                i = C110865n.f331653e;
                C110865n.f331653e = i + 1;
            }
            return new C110846f(i, kVar, this.f331584d);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110834a(int r5, p241t0.C110860k r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.Object r0 = p241t0.C110865n.f331651c
            monitor-enter(r0)
            java.util.List<fy3.l<java.lang.Object, rx3.b0>> r1 = p241t0.C110865n.f331656h     // Catch:{ all -> 0x002f }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = r2 ^ 1
            r3 = 0
            if (r2 == 0) goto L_0x0018
            java.util.List r1 = sx3.C110818d0.m150900B0(r1)     // Catch:{ all -> 0x002f }
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 == 0) goto L_0x0029
            java.lang.Object r2 = sx3.C110818d0.m150940l0(r1)     // Catch:{ all -> 0x002f }
            fy3.l r2 = (fy3.C32226l) r2     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x002a
            t0.a$a r2 = new t0.a$a     // Catch:{ all -> 0x002f }
            r2.<init>(r1)     // Catch:{ all -> 0x002f }
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            monitor-exit(r0)
            r4.<init>(r5, r6, r3, r2)
            return
        L_0x002f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p241t0.C110834a.<init>(int, t0.k):void");
    }

    /* renamed from: c */
    public void mo162424c() {
        synchronized (C110865n.f331651c) {
            int i = this.f331616d;
            if (i >= 0) {
                C110865n.m151156s(i);
                this.f331616d = -1;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
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
        C110865n.m151138a();
    }

    /* renamed from: r */
    public C110849h mo162428r(C32226l<Object, C13598b0> lVar) {
        C110836c cVar = new C110836c(lVar);
        C32226l<C110860k, C13598b0> lVar2 = C110865n.f331649a;
        return (C110849h) C110865n.m151143f(new C110866p(cVar));
    }

    /* renamed from: t */
    public C110853i mo162429t() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    /* renamed from: y */
    public C110838b mo162430y(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2) {
        C110835b bVar = new C110835b(lVar, lVar2);
        C32226l<C110860k, C13598b0> lVar3 = C110865n.f331649a;
        return (C110838b) ((C110849h) C110865n.m151143f(new C110866p(bVar)));
    }
}
