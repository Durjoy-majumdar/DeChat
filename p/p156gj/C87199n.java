package p156gj;

import a70.C112760b;
import java.util.Map;

/* renamed from: gj.n */
public final class C87199n {

    /* renamed from: d */
    public static C87199n f252864d;

    /* renamed from: a */
    public Map<Integer, Object> f252865a;

    /* renamed from: b */
    public String f252866b;

    /* renamed from: c */
    public boolean f252867c = false;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a A[SYNTHETIC, Splitter:B:33:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096 A[SYNTHETIC, Splitter:B:38:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7 A[SYNTHETIC, Splitter:B:45:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3 A[SYNTHETIC, Splitter:B:50:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87199n(java.lang.String r12) {
        /*
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.f252867c = r0
            r11.f252866b = r12
            java.lang.String r12 = ""
            java.lang.String r1 = "MicroMsg.CompatibleFileStorage"
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            java.lang.String r4 = r11.f252866b     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r5 = 1
            if (r4 != 0) goto L_0x0020
            r11.f252867c = r5     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r3.createNewFile()     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
        L_0x0020:
            long r6 = r3.length()     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0035
            r11.f252867c = r5     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r3.<init>()     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r11.f252865a = r3     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            goto L_0x00a0
        L_0x0035:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0078, all -> 0x0074 }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x006f, all -> 0x0069 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x006f, all -> 0x0069 }
            java.lang.Object r2 = r3.readObject()     // Catch:{ Exception -> 0x0067 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x0067 }
            r11.f252865a = r2     // Catch:{ Exception -> 0x0067 }
            r3.close()     // Catch:{ Exception -> 0x0067 }
            r4.close()     // Catch:{ Exception -> 0x0067 }
            r4.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005c
        L_0x0056:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r12, r4)
        L_0x005c:
            r3.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x00a0
        L_0x0060:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r12, r0)
            goto L_0x00a0
        L_0x0067:
            r2 = move-exception
            goto L_0x007c
        L_0x0069:
            r3 = move-exception
            r10 = r3
            r3 = r2
            r2 = r4
            r4 = r10
            goto L_0x00a5
        L_0x006f:
            r3 = move-exception
            r10 = r3
            r3 = r2
            r2 = r10
            goto L_0x007c
        L_0x0074:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x00a5
        L_0x0078:
            r3 = move-exception
            r4 = r2
            r2 = r3
            r3 = r4
        L_0x007c:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x00a1 }
            r5.<init>()     // Catch:{ all -> 0x00a1 }
            r11.f252865a = r5     // Catch:{ all -> 0x00a1 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a1 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r12, r5)     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0094
            r4.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0094
        L_0x008e:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r12, r4)
        L_0x0094:
            if (r3 == 0) goto L_0x00a0
            r3.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x00a0
        L_0x009a:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r12, r0)
        L_0x00a0:
            return
        L_0x00a1:
            r2 = move-exception
            r10 = r4
            r4 = r2
            r2 = r10
        L_0x00a5:
            if (r2 == 0) goto L_0x00b1
            r2.close()     // Catch:{ IOException -> 0x00ab }
            goto L_0x00b1
        L_0x00ab:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r12, r5)
        L_0x00b1:
            if (r3 == 0) goto L_0x00bd
            r3.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00bd
        L_0x00b7:
            r2 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r12, r0)
        L_0x00bd:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p156gj.C87199n.<init>(java.lang.String):void");
    }

    /* renamed from: a */
    public static synchronized C87199n m108254a() {
        C87199n nVar;
        synchronized (C87199n.class) {
            if (f252864d == null) {
                f252864d = new C87199n(C112760b.m154225d() + "CompatibleInfo.cfg");
            }
            nVar = f252864d;
        }
        return nVar;
    }

    /* renamed from: b */
    public synchronized void mo121634b(int i, Object obj) {
        this.f252865a.put(Integer.valueOf(i), obj);
        mo121635c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005f A[SYNTHETIC, Splitter:B:33:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f A[SYNTHETIC, Splitter:B:40:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0082 A[SYNTHETIC, Splitter:B:50:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0094 A[SYNTHETIC, Splitter:B:58:0x0094] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo121635c() {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0050, all -> 0x004b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0050, all -> 0x004b }
            java.lang.String r4 = r8.f252866b     // Catch:{ IOException -> 0x0050, all -> 0x004b }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0050, all -> 0x004b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0050, all -> 0x004b }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0046, all -> 0x0041 }
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r8.f252865a     // Catch:{ IOException -> 0x003f }
            r3.writeObject(r0)     // Catch:{ IOException -> 0x003f }
            r3.close()     // Catch:{ IOException -> 0x003f }
            r2.flush()     // Catch:{ IOException -> 0x003f }
            r2.close()     // Catch:{ IOException -> 0x003f }
            r2.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x0030
        L_0x0026:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r5)     // Catch:{ all -> 0x0086 }
        L_0x0030:
            r3.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x007d
        L_0x0034:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)     // Catch:{ all -> 0x0086 }
            goto L_0x007d
        L_0x003f:
            r0 = move-exception
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0080
        L_0x0046:
            r3 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0054
        L_0x004b:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L_0x0080
        L_0x0050:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
        L_0x0054:
            java.lang.String r4 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r6)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x006d
            r2.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x006d
        L_0x0063:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r5)     // Catch:{ all -> 0x0086 }
        L_0x006d:
            if (r3 == 0) goto L_0x007d
            r3.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x007d
        L_0x0073:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)     // Catch:{ all -> 0x0086 }
        L_0x007d:
            monitor-exit(r8)
            return
        L_0x007f:
            r0 = move-exception
        L_0x0080:
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x0092
        L_0x0086:
            r0 = move-exception
            goto L_0x00a3
        L_0x0088:
            r2 = move-exception
            java.lang.String r4 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r2, r5, r6)     // Catch:{ all -> 0x0086 }
        L_0x0092:
            if (r3 == 0) goto L_0x00a2
            r3.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x00a2
        L_0x0098:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.CompatibleFileStorage"
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r1)     // Catch:{ all -> 0x0086 }
        L_0x00a2:
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x00a3:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p156gj.C87199n.mo121635c():void");
    }
}
