package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.lm */
public final class C55066lm {

    /* renamed from: a */
    private List<String> f154616a = new ArrayList();

    /* renamed from: b */
    private List<String> f154617b = new ArrayList();

    /* renamed from: c */
    private final int f154618c = 300;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo76186a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            if (r3 == 0) goto L_0x001f
            java.lang.String r1 = r3.trim()     // Catch:{ all -> 0x001c }
            int r1 = r1.length()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x000f
            goto L_0x001f
        L_0x000f:
            java.util.List<java.lang.String> r1 = r2.f154617b     // Catch:{ all -> 0x001c }
            boolean r3 = r1.contains(r3)     // Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x0019
            monitor-exit(r2)
            return r0
        L_0x0019:
            r3 = 1
            monitor-exit(r2)
            return r3
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x001f:
            monitor-exit(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C55066lm.mo76186a(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo76187b(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = r2.trim()     // Catch:{ all -> 0x0047 }
            int r0 = r0.length()     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x000e
            goto L_0x004a
        L_0x000e:
            java.util.List<java.lang.String> r0 = r1.f154617b     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0022
            java.util.List<java.lang.String> r0 = r1.f154617b     // Catch:{ all -> 0x0047 }
            r0.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.List<java.lang.String> r0 = r1.f154617b     // Catch:{ all -> 0x0047 }
            r0.add(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0022:
            java.util.List<java.lang.String> r0 = r1.f154616a     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x003b
            java.util.List<java.lang.String> r0 = r1.f154617b     // Catch:{ all -> 0x0047 }
            m62179a((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x0047 }
            java.util.List<java.lang.String> r0 = r1.f154617b     // Catch:{ all -> 0x0047 }
            r0.add(r2)     // Catch:{ all -> 0x0047 }
            java.util.List<java.lang.String> r0 = r1.f154616a     // Catch:{ all -> 0x0047 }
            r0.remove(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x003b:
            java.util.List<java.lang.String> r0 = r1.f154616a     // Catch:{ all -> 0x0047 }
            m62179a((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x0047 }
            java.util.List<java.lang.String> r0 = r1.f154616a     // Catch:{ all -> 0x0047 }
            r0.add(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0047:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x004a:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C55066lm.mo76187b(java.lang.String):void");
    }

    /* renamed from: a */
    private static void m62179a(List<String> list) {
        if (list != null && list.size() > 300) {
            list.remove(0);
        }
    }

    /* renamed from: a */
    private synchronized void m62178a() {
        this.f154616a.clear();
        this.f154617b.clear();
    }
}
