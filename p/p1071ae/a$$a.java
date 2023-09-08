package p1071ae;

/* renamed from: ae.a$$a */
public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112785a f304858d;

    public /* synthetic */ a$$a(C112785a aVar) {
        this.f304858d = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            ae.a r0 = r10.f304858d
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r1 = r0.f337706a
            monitor-enter(r1)
            java.lang.String r2 = "MicroMsg.AccPowerMonitor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            r3.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "#saving, size="
            r3.append(r4)     // Catch:{ all -> 0x0085 }
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r4 = r0.f337706a     // Catch:{ all -> 0x0085 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0085 }
            int r4 = r4.size()     // Catch:{ all -> 0x0085 }
            r3.append(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "acc-power-stats.bin"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)     // Catch:{ all -> 0x0085 }
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r0 = r0.f337706a     // Catch:{ all -> 0x0085 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0085 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0085 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0085 }
        L_0x0035:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x007d
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0085 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0085 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0085 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0085 }
            com.tencent.matrix.battery.accumulate.AccPowerStats r3 = (com.tencent.matrix.battery.accumulate.AccPowerStats) r3     // Catch:{ all -> 0x0085 }
            r5 = 0
            r6 = 0
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r3.writeToParcel(r7, r5)     // Catch:{ Exception -> 0x005f }
            byte[] r3 = r7.marshall()     // Catch:{ Exception -> 0x005f }
            r6 = r3
            goto L_0x0070
        L_0x005c:
            r0 = move-exception
            r6 = r7
            goto L_0x0077
        L_0x005f:
            r3 = move-exception
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            goto L_0x0077
        L_0x0063:
            r3 = move-exception
            r7 = r6
        L_0x0065:
            java.lang.String r8 = "MicroMsg.AccPowerMonitor"
            java.lang.String r9 = "encode err"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r3, r9, r5)     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0073
        L_0x0070:
            r7.recycle()     // Catch:{ all -> 0x0085 }
        L_0x0073:
            r2.encode((java.lang.String) r4, (byte[]) r6)     // Catch:{ all -> 0x0085 }
            goto L_0x0035
        L_0x0077:
            if (r6 == 0) goto L_0x007c
            r6.recycle()     // Catch:{ all -> 0x0085 }
        L_0x007c:
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x007d:
            p285zh.C119114c.m167927l()     // Catch:{ all -> 0x0085 }
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            p285zh.C119114c.m167927l()
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1071ae.a$$a.run():void");
    }
}
