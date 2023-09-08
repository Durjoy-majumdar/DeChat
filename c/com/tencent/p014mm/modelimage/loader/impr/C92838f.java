package com.tencent.p014mm.modelimage.loader.impr;

import ic0.C98662p;
import jc0.C98931a;

/* renamed from: com.tencent.mm.modelimage.loader.impr.f */
public class C92838f implements C98662p {

    /* renamed from: a */
    public C98931a<String, Integer> f267411a = new C98931a<>(10);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo127156a(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            jc0.a<java.lang.String, java.lang.Integer> r0 = r7.f267411a     // Catch:{ all -> 0x0075 }
            monitor-enter(r0)     // Catch:{ all -> 0x0075 }
            sg.g<K, V> r1 = r0.f290003a     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0069
            q90.d r1 = (q90.C101062d) r1     // Catch:{ all -> 0x0072 }
            boolean r1 = r1.check(r8)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            r0 = 1
            if (r1 == 0) goto L_0x005e
            jc0.a<java.lang.String, java.lang.Integer> r1 = r7.f267411a     // Catch:{ all -> 0x0075 }
            sg.g<K, V> r1 = r1.f290003a     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0055
            q90.d r1 = (q90.C101062d) r1     // Catch:{ all -> 0x0075 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0075 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0075 }
            jc0.a<java.lang.String, java.lang.Integer> r2 = r7.f267411a     // Catch:{ all -> 0x0075 }
            int r3 = r1 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0075 }
            r2.mo138273a(r8, r3)     // Catch:{ all -> 0x0075 }
            r2 = 50
            if (r1 < r2) goto L_0x0067
            r3 = 0
            if (r1 == r2) goto L_0x003a
            int r4 = r1 % 500
            if (r4 != 0) goto L_0x0053
        L_0x003a:
            java.lang.String r4 = "MicroMsg.imageloader.DefaultImageRetryDownloadListener"
            java.lang.String r5 = "Url %s retry over time %d current time:%d, then stop retry download"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0075 }
            r6[r3] = r8     // Catch:{ all -> 0x0075 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0075 }
            r6[r0] = r8     // Catch:{ all -> 0x0075 }
            r8 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0075 }
            r6[r8] = r0     // Catch:{ all -> 0x0075 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ all -> 0x0075 }
        L_0x0053:
            monitor-exit(r7)
            return r3
        L_0x0055:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "mData == null"
            r8.<init>(r0)     // Catch:{ all -> 0x0075 }
            throw r8     // Catch:{ all -> 0x0075 }
        L_0x005e:
            jc0.a<java.lang.String, java.lang.Integer> r1 = r7.f267411a     // Catch:{ all -> 0x0075 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0075 }
            r1.mo138273a(r8, r2)     // Catch:{ all -> 0x0075 }
        L_0x0067:
            monitor-exit(r7)
            return r0
        L_0x0069:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "mData == null"
            r8.<init>(r1)     // Catch:{ all -> 0x0072 }
            throw r8     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r8     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.loader.impr.C92838f.mo127156a(java.lang.String):boolean");
    }
}
