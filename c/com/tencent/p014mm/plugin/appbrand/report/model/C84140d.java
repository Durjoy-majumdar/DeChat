package com.tencent.p014mm.plugin.appbrand.report.model;

import android.util.Pair;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.report.model.C84153l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Deque;
import java.util.LinkedList;
import p1044ub.C90630c;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.d */
public class C84140d implements C84153l, C84148k {

    /* renamed from: b */
    public final String f245639b;

    /* renamed from: c */
    public final SparseArray<C84153l.C84155b> f245640c = new SparseArray<>();

    /* renamed from: d */
    public final Deque<C84153l.C84155b> f245641d = new LinkedList();

    /* renamed from: e */
    public boolean f245642e = true;

    /* renamed from: f */
    public String f245643f;

    /* renamed from: g */
    public C84153l.C84155b f245644g;

    public C84140d(String str, String str2) {
        this.f245639b = str;
        synchronized (this) {
            this.f245643f = str2;
        }
    }

    /* renamed from: b */
    public synchronized void mo115885b(C90630c cVar) {
        if (this.f245642e) {
            mo116811r(cVar);
        }
    }

    /* renamed from: h */
    public void mo115891h(C90630c cVar) {
        synchronized (this) {
            C84153l.C84155b p = mo116808p(cVar);
            Pair<Integer, String> f = C84141e.m103710f(cVar);
            p.f245691c = new C84153l.C84157d(((Integer) f.first).intValue(), (String) f.second);
        }
    }

    /* renamed from: i */
    public synchronized boolean mo116806i(String str) {
        return !Util.isNullOrNil(this.f245643f) && this.f245643f.equals(str);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: m */
    public void mo115895m(p1044ub.C90630c r5, p1044ub.C90630c r6, com.tencent.p014mm.plugin.appbrand.page.C83817h4 r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f245642e     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x000a
            r4.mo116811r(r5)     // Catch:{ all -> 0x004f }
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            return
        L_0x000a:
            com.tencent.mm.plugin.appbrand.page.h4 r0 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.NAVIGATE_BACK     // Catch:{ all -> 0x004f }
            if (r7 != r0) goto L_0x0013
            r4.mo116813t(r5, r6)     // Catch:{ all -> 0x004f }
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            return
        L_0x0013:
            com.tencent.mm.plugin.appbrand.report.model.l$b r7 = r4.f245644g     // Catch:{ all -> 0x004f }
            r0 = 0
            if (r7 == 0) goto L_0x0025
            monitor-enter(r4)     // Catch:{ all -> 0x004f }
            r4.f245644g = r0     // Catch:{ all -> 0x0022 }
            r4.f245643f = r0     // Catch:{ all -> 0x0022 }
            r7 = 0
            r4.f245642e = r7     // Catch:{ all -> 0x0022 }
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            goto L_0x0025
        L_0x0022:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            throw r5     // Catch:{ all -> 0x004f }
        L_0x0025:
            if (r6 == 0) goto L_0x0037
            com.tencent.mm.plugin.appbrand.report.model.l$b r7 = r4.mo116808p(r6)     // Catch:{ all -> 0x004f }
            com.tencent.mm.plugin.appbrand.report.model.l$d r1 = new com.tencent.mm.plugin.appbrand.report.model.l$d     // Catch:{ all -> 0x004f }
            r2 = 2
            java.lang.String r3 = r5.mo116163R0()     // Catch:{ all -> 0x004f }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x004f }
            r7.f245691c = r1     // Catch:{ all -> 0x004f }
        L_0x0037:
            com.tencent.mm.plugin.appbrand.report.model.l$b r7 = new com.tencent.mm.plugin.appbrand.report.model.l$b     // Catch:{ all -> 0x004f }
            r7.<init>(r5)     // Catch:{ all -> 0x004f }
            if (r6 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            com.tencent.mm.plugin.appbrand.report.model.l$c r0 = new com.tencent.mm.plugin.appbrand.report.model.l$c     // Catch:{ all -> 0x004f }
            java.lang.String r5 = r6.mo116163R0()     // Catch:{ all -> 0x004f }
            r0.<init>(r5)     // Catch:{ all -> 0x004f }
        L_0x0048:
            r7.f245692d = r0     // Catch:{ all -> 0x004f }
            r4.mo116812s(r7)     // Catch:{ all -> 0x004f }
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84140d.mo115895m(ub.c, ub.c, com.tencent.mm.plugin.appbrand.page.h4):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return r0;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.tencent.p014mm.plugin.appbrand.report.model.C84153l.C84155b mo116807o(p1044ub.C90630c r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.report.model.l$b> r0 = r2.f245640c     // Catch:{ all -> 0x0021 }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0021 }
            com.tencent.mm.plugin.appbrand.report.model.l$b r0 = (com.tencent.p014mm.plugin.appbrand.report.model.C84153l.C84155b) r0     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001f
            com.tencent.mm.plugin.appbrand.report.model.l$b r1 = r2.f245644g     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001f
            int r1 = r1.f245689a     // Catch:{ all -> 0x0021 }
            int r3 = r3.hashCode()     // Catch:{ all -> 0x0021 }
            if (r1 != r3) goto L_0x001f
            com.tencent.mm.plugin.appbrand.report.model.l$b r3 = r2.f245644g     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            return r3
        L_0x001f:
            monitor-exit(r2)
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84140d.mo116807o(ub.c):com.tencent.mm.plugin.appbrand.report.model.l$b");
    }

    /* renamed from: p */
    public final C84153l.C84155b mo116808p(C90630c cVar) {
        C84153l.C84155b peek = peek();
        if (peek == null) {
            boolean z = BuildInfo.DEBUG;
            return new C84153l.C84155b(cVar);
        }
        if (peek.f245689a != cVar.hashCode() && !BuildInfo.DEBUG) {
            Log.printErrStackTrace("MicroMsg.AppBrandPageVisitStack", new Throwable(), "mismatch stack order", new Object[0]);
        }
        return peek;
    }

    public synchronized C84153l.C84155b peek() {
        return (C84153l.C84155b) ((LinkedList) this.f245641d).peekFirst();
    }

    /* renamed from: q */
    public synchronized C84153l.C84155b mo116810q() {
        C84153l.C84155b bVar;
        bVar = (C84153l.C84155b) ((LinkedList) this.f245641d).pollFirst();
        if (bVar != null) {
            Log.m105919d("MicroMsg.AppBrandPageVisitStack", "pop node(%d:%s)", Integer.valueOf(bVar.f245689a), bVar.f245690b);
            this.f245640c.remove(bVar.f245689a);
        }
        return bVar;
    }

    /* renamed from: r */
    public final synchronized void mo116811r(C90630c cVar) {
        this.f245643f = cVar.mo116163R0();
        this.f245642e = false;
        mo116812s(new C84153l.C84155b(cVar));
        peek().f245692d = Util.isNullOrNil(this.f245639b) ? null : new C84153l.C84156c(this.f245639b);
    }

    /* renamed from: s */
    public synchronized void mo116812s(C84153l.C84155b bVar) {
        Log.m105919d("MicroMsg.AppBrandPageVisitStack", "push node(%d:%s)", Integer.valueOf(bVar.f245689a), bVar.f245690b);
        if (((LinkedList) this.f245641d).peekFirst() != bVar) {
            ((LinkedList) this.f245641d).offerFirst(bVar);
        }
        this.f245640c.put(bVar.f245689a, bVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: t */
    public final synchronized void mo116813t(p1044ub.C90630c r7, p1044ub.C90630c r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r8.mo116163R0()     // Catch:{ all -> 0x0069 }
            boolean r0 = r6.mo116806i(r0)     // Catch:{ all -> 0x0069 }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            monitor-enter(r6)     // Catch:{ all -> 0x0069 }
            r6.f245644g = r1     // Catch:{ all -> 0x0016 }
            r6.f245643f = r1     // Catch:{ all -> 0x0016 }
            r2 = 0
            r6.f245642e = r2     // Catch:{ all -> 0x0016 }
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            goto L_0x0019
        L_0x0016:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            throw r7     // Catch:{ all -> 0x0069 }
        L_0x0019:
            com.tencent.mm.plugin.appbrand.report.model.l$b r2 = r6.mo116808p(r8)     // Catch:{ all -> 0x0069 }
            r6.f245644g = r2     // Catch:{ all -> 0x0069 }
            com.tencent.mm.plugin.appbrand.report.model.l$d r3 = new com.tencent.mm.plugin.appbrand.report.model.l$d     // Catch:{ all -> 0x0069 }
            r4 = 1
            java.lang.String r5 = r7.mo116163R0()     // Catch:{ all -> 0x0069 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0069 }
            r2.f245691c = r3     // Catch:{ all -> 0x0069 }
            int r2 = r7.hashCode()     // Catch:{ all -> 0x0069 }
        L_0x002f:
            monitor-enter(r6)     // Catch:{ all -> 0x0069 }
            java.util.Deque<com.tencent.mm.plugin.appbrand.report.model.l$b> r3 = r6.f245641d     // Catch:{ all -> 0x0066 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0066 }
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            if (r3 != 0) goto L_0x0045
            com.tencent.mm.plugin.appbrand.report.model.l$b r3 = r6.peek()     // Catch:{ all -> 0x0069 }
            int r3 = r3.f245689a     // Catch:{ all -> 0x0069 }
            if (r3 == r2) goto L_0x0045
            r6.mo116810q()     // Catch:{ all -> 0x0069 }
            goto L_0x002f
        L_0x0045:
            if (r0 == 0) goto L_0x004f
            com.tencent.mm.plugin.appbrand.report.model.l$b r0 = new com.tencent.mm.plugin.appbrand.report.model.l$b     // Catch:{ all -> 0x0069 }
            r0.<init>(r7)     // Catch:{ all -> 0x0069 }
            r6.mo116812s(r0)     // Catch:{ all -> 0x0069 }
        L_0x004f:
            com.tencent.mm.plugin.appbrand.report.model.l$b r0 = r6.mo116808p(r7)     // Catch:{ all -> 0x0069 }
            com.tencent.mm.plugin.appbrand.report.model.l$c r2 = new com.tencent.mm.plugin.appbrand.report.model.l$c     // Catch:{ all -> 0x0069 }
            java.lang.String r8 = r8.mo116163R0()     // Catch:{ all -> 0x0069 }
            r2.<init>(r8)     // Catch:{ all -> 0x0069 }
            r0.f245692d = r2     // Catch:{ all -> 0x0069 }
            com.tencent.mm.plugin.appbrand.report.model.l$b r7 = r6.mo116808p(r7)     // Catch:{ all -> 0x0069 }
            r7.f245691c = r1     // Catch:{ all -> 0x0069 }
            monitor-exit(r6)
            return
        L_0x0066:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            throw r7     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84140d.mo116813t(ub.c, ub.c):void");
    }
}
