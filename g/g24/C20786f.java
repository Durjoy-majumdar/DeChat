package g24;

import d24.C106982e;
import d24.C20383a;
import d24.C20400e0;
import d24.C20414o;
import d24.C20421s;
import e24.C20509c;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g24.f */
public final class C20786f {

    /* renamed from: a */
    public final C20383a f58712a;

    /* renamed from: b */
    public final C20784d f58713b;

    /* renamed from: c */
    public final C106982e f58714c;

    /* renamed from: d */
    public final C20414o f58715d;

    /* renamed from: e */
    public List<Proxy> f58716e = Collections.emptyList();

    /* renamed from: f */
    public int f58717f;

    /* renamed from: g */
    public List<InetSocketAddress> f58718g = Collections.emptyList();

    /* renamed from: h */
    public final List<C20400e0> f58719h = new ArrayList();

    /* renamed from: g24.f$a */
    public static final class C20787a {

        /* renamed from: a */
        public final List<C20400e0> f58720a;

        /* renamed from: b */
        public int f58721b = 0;

        public C20787a(List<C20400e0> list) {
            this.f58720a = list;
        }
    }

    public C20786f(C20383a aVar, C20784d dVar, C106982e eVar, C20414o oVar) {
        List<Proxy> list;
        this.f58712a = aVar;
        this.f58713b = dVar;
        this.f58714c = eVar;
        this.f58715d = oVar;
        C20421s sVar = aVar.f57113a;
        Proxy proxy = aVar.f57120h;
        if (proxy != null) {
            this.f58716e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f57119g.select(sVar.mo31947n());
            if (select == null || select.isEmpty()) {
                list = C20509c.m22207m(Proxy.NO_PROXY);
            } else {
                list = C20509c.m22206l(select);
            }
            this.f58716e = list;
        }
        this.f58717f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f58712a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32479a(d24.C20400e0 r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.f57200b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            d24.a r0 = r3.f58712a
            java.net.ProxySelector r1 = r0.f57119g
            if (r1 == 0) goto L_0x001f
            d24.s r0 = r0.f57113a
            java.net.URI r0 = r0.mo31947n()
            java.net.Proxy r2 = r4.f57200b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            g24.d r5 = r3.f58713b
            monitor-enter(r5)
            java.util.Set<d24.e0> r0 = r5.f58709a     // Catch:{ all -> 0x0029 }
            r0.add(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r5)
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g24.C20786f.mo32479a(d24.e0, java.io.IOException):void");
    }
}
