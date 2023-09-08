package com.tencent.p014mm.plugin.game.luggage;

import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45297a;
import d93.C45298c;
import java.util.Map;
import p828wa.C53133t;
import te3.C52018xt1;
import w93.C53091f;

/* renamed from: com.tencent.mm.plugin.game.luggage.m */
public class C41927m {

    /* renamed from: com.tencent.mm.plugin.game.luggage.m$a */
    public class C41928a implements C45297a<C52018xt1> {

        /* renamed from: a */
        public final /* synthetic */ GameWebPerformanceInfo f112940a;

        /* renamed from: b */
        public final /* synthetic */ C53133t f112941b;

        public C41928a(GameWebPerformanceInfo gameWebPerformanceInfo, C53133t tVar) {
            this.f112940a = gameWebPerformanceInfo;
            this.f112941b = tVar;
        }

        /* renamed from: A */
        public void mo63661A(int i, String str, int i2, int i3, String str2) {
        }

        /* renamed from: B */
        public void mo65764B(int i, String str) {
            this.f112940a.f108345G = System.currentTimeMillis();
            C53091f.m59453h(str, System.currentTimeMillis());
        }

        /* renamed from: D */
        public void mo65765D(int i, String str) {
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ void mo63682j(int i, String str, String str2, Object obj) {
            C52018xt1 xt12 = (C52018xt1) obj;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ boolean mo65766k(int i, String str, Object obj) {
            C52018xt1 xt12 = (C52018xt1) obj;
            return false;
        }

        /* renamed from: l */
        public void mo65767l(int i, boolean z, String str, String str2, Object obj) {
            Log.m105925i("MicroMsg.LuggageGetA8KeyUtil", "getA8Key end, time: %d", Long.valueOf(System.currentTimeMillis()));
            Map<String, String> f = C45298c.m50183f(((C52018xt1) obj).f144958x);
            this.f112940a.f108346H = System.currentTimeMillis();
            C53091f.m59452g(str, System.currentTimeMillis());
            MMWebView mMWebView = (MMWebView) this.f112941b.mo73819g();
            if (Util.isNullOrNil(str2) || mMWebView == null) {
                Log.m105920e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
            } else {
                C40319a0.m43495c(true, new C41932o(str2, f, mMWebView));
            }
            C40319a0.m43495c(true, new C41930n(this.f112941b, str2));
        }

        /* renamed from: r */
        public void mo65768r(int i, String str, String str2) {
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static void m45504a(p828wa.C53133t r5, java.lang.String r6, boolean r7) {
        /*
            com.tencent.mm.game.report.api.GameWebPerformanceInfo r0 = com.tencent.p014mm.game.report.api.GameWebPerformanceInfo.m43446b(r6)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.LuggageGetA8KeyUtil"
            java.lang.String r4 = "getA8Key begin, time: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f108345G = r1
            d93.c r1 = new d93.c
            r1.<init>()
            com.tencent.mm.plugin.game.luggage.m$a r2 = new com.tencent.mm.plugin.game.luggage.m$a
            r2.<init>(r0, r5)
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0044 }
            r0 = -1
            r1.mo70851q(r6, r3, r0, r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)
            if (r7 == 0) goto L_0x0040
            int r5 = r5.hashCode()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, d93.c> r6 = d93.C45302f.f122730a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.put(r5, r1)
        L_0x0040:
            return
        L_0x0041:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r5     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.C41927m.m45504a(wa.t, java.lang.String, boolean):void");
    }
}
