package p60;

import o60.C100292f;
import w60.C102354f;

/* renamed from: p60.g */
public class C100637g implements C100292f {

    /* renamed from: a */
    public C102354f<String, Integer> f294832a = new C102354f<>(10);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo139546a(x60.C102564a<?> r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            w60.f<java.lang.String, java.lang.Integer> r0 = r7.f294832a     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x0085 }
            monitor-enter(r0)     // Catch:{ all -> 0x0085 }
            sg.g<K, V> r2 = r0.f301454a     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0079
            q90.d r2 = (q90.C101062d) r2     // Catch:{ all -> 0x0082 }
            boolean r1 = r2.check(r1)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            r0 = 1
            if (r1 == 0) goto L_0x006a
            w60.f<java.lang.String, java.lang.Integer> r1 = r7.f294832a     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x0085 }
            sg.g<K, V> r1 = r1.f301454a     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0061
            q90.d r1 = (q90.C101062d) r1     // Catch:{ all -> 0x0085 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0085 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0085 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0085 }
            w60.f<java.lang.String, java.lang.Integer> r2 = r7.f294832a     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0085 }
            int r4 = r1 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0085 }
            r2.mo141921a(r3, r4)     // Catch:{ all -> 0x0085 }
            r2 = 50
            if (r1 < r2) goto L_0x0077
            r3 = 0
            if (r1 == r2) goto L_0x0046
            int r4 = r1 % 500
            if (r4 != 0) goto L_0x005f
        L_0x0046:
            java.lang.String r4 = "MicroMsg.Loader.DefaultImageRetryDownloadListener"
            java.lang.String r5 = "Url %s retry over time %d current time:%d, then stop retry download"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0085 }
            r6[r3] = r8     // Catch:{ all -> 0x0085 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0085 }
            r6[r0] = r8     // Catch:{ all -> 0x0085 }
            r8 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0085 }
            r6[r8] = r0     // Catch:{ all -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ all -> 0x0085 }
        L_0x005f:
            monitor-exit(r7)
            return r3
        L_0x0061:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "mData == null"
            r8.<init>(r0)     // Catch:{ all -> 0x0085 }
            throw r8     // Catch:{ all -> 0x0085 }
        L_0x006a:
            w60.f<java.lang.String, java.lang.Integer> r1 = r7.f294832a     // Catch:{ all -> 0x0085 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0085 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0085 }
            r1.mo141921a(r8, r2)     // Catch:{ all -> 0x0085 }
        L_0x0077:
            monitor-exit(r7)
            return r0
        L_0x0079:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "mData == null"
            r8.<init>(r1)     // Catch:{ all -> 0x0082 }
            throw r8     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            throw r8     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p60.C100637g.mo139546a(x60.a):boolean");
    }
}
