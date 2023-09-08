package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.bk */
public class C113556bk {

    /* renamed from: a */
    private static volatile C113556bk f339831a;

    /* renamed from: b */
    private boolean f339832b = false;

    private C113556bk() {
    }

    /* renamed from: a */
    public static C113556bk m156203a() {
        if (f339831a == null) {
            synchronized (C113556bk.class) {
                if (f339831a == null) {
                    f339831a = new C113556bk();
                }
            }
        }
        return f339831a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo171691a(com.tencent.mapsdk.internal.C113565bo r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f339832b     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r2 == 0) goto L_0x0027
            com.tencent.mapsdk.internal.cn r2 = r2.mo171805q()     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.mo171939a()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            com.tencent.mapsdk.internal.bk$1 r2 = new com.tencent.mapsdk.internal.bk$1     // Catch:{ all -> 0x0029 }
            r2.<init>()     // Catch:{ all -> 0x0029 }
            com.tencent.mapsdk.internal.kb$b$a r2 = com.tencent.mapsdk.internal.C113865kb.m157396a(r2)     // Catch:{ all -> 0x0029 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0029 }
            r2.mo172279a(r0)     // Catch:{ all -> 0x0029 }
            r2 = 1
            r1.f339832b = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113556bk.mo171691a(com.tencent.mapsdk.internal.bo):void");
    }
}
