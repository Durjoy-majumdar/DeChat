package com.tencent.p014mm.plugin.appbrand.debugger;

import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p284zb.C91635f;
import sp0.C90272a;
import te3.dw4;
import te3.mw4;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.t */
public class C81743t {

    /* renamed from: a */
    public C91635f f239879a;

    /* renamed from: b */
    public final dw4 f239880b;

    /* renamed from: c */
    public String f239881c;

    /* renamed from: d */
    public int f239882d = 0;

    /* renamed from: e */
    public int f239883e = 0;

    /* renamed from: f */
    public int f239884f = 0;

    /* renamed from: g */
    public C81744u f239885g;

    /* renamed from: h */
    public AtomicInteger f239886h = new AtomicInteger(0);

    /* renamed from: i */
    public long f239887i = 0;

    /* renamed from: j */
    public long f239888j = 0;

    /* renamed from: k */
    public long f239889k;

    /* renamed from: l */
    public long f239890l = System.currentTimeMillis();

    /* renamed from: m */
    public AtomicInteger f239891m = new AtomicInteger(0);

    /* renamed from: n */
    public boolean f239892n;

    /* renamed from: o */
    public boolean f239893o;

    /* renamed from: p */
    public LinkedList<Pair<String, ValueCallback<String>>> f239894p;

    /* renamed from: q */
    public final LinkedList<C81750x> f239895q;

    /* renamed from: r */
    public final Map<String, C81742s> f239896r;

    /* renamed from: s */
    public final LinkedList<mw4> f239897s;

    /* renamed from: t */
    public final HashMap<Integer, C81698b> f239898t;

    /* renamed from: u */
    public final Object f239899u;

    /* renamed from: v */
    public int f239900v;

    /* renamed from: w */
    public long f239901w;

    /* renamed from: x */
    public String f239902x;

    public C81743t() {
        new HashMap();
        new HashMap();
        this.f239894p = new LinkedList<>();
        this.f239895q = new LinkedList<>();
        this.f239896r = new HashMap();
        this.f239897s = new LinkedList<>();
        this.f239898t = new HashMap<>();
        this.f239899u = new Object();
        this.f239900v = 0;
        this.f239901w = 0;
        dw4 dw4 = new dw4();
        this.f239880b = dw4;
        dw4.f132552d = BuildInfo.CLIENT_VERSION_INT;
    }

    /* renamed from: a */
    public synchronized int mo114109a() {
        return this.f239882d;
    }

    /* renamed from: b */
    public void mo114110b(C91635f fVar, String str) {
        this.f239879a = fVar;
        C81738h0.f239874a = fVar.getRuntime().mo113036W().f234818T;
        this.f239885g = C81738h0.m100299e(str);
        AppBrandSysConfigLU o1 = this.f239879a.getRuntime().mo113051d0();
        if (o1 != null) {
            o1.f234892y = this.f239885g.f239907e;
            o1.f234894z = true;
            C90272a aVar = (C90272a) fVar.getRuntime().mo113018M(C90272a.class);
            if (aVar != null) {
                aVar.f259128e = !o1.f234892y;
            }
        }
    }

    /* renamed from: c */
    public synchronized boolean mo114111c() {
        return this.f239892n;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public synchronized boolean mo114112d() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0010 }
            int r0 = r2.f239884f     // Catch:{ all -> 0x000d }
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            r1 = 3
            if (r0 != r1) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81743t.mo114112d():boolean");
    }

    /* renamed from: e */
    public synchronized void mo114113e(int i) {
        this.f239884f = i;
    }

    /* renamed from: f */
    public void mo114114f() {
        this.f239889k = System.currentTimeMillis();
    }
}
