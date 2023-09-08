package com.tencent.p014mm.feature.performance;

import android.app.Application;

/* renamed from: com.tencent.mm.feature.performance.q$$e */
public final /* synthetic */ class q$$e implements Runnable {
    public /* synthetic */ q$$e(Application application) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.tencent.matrix.battery.accumulate.AccPowerStats} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r10 == null) goto L_0x0077;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            ae.a r0 = p1071ae.C112785a.f337705f
            r0.getClass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "acc-power-stats.bin"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)
            java.lang.String[] r3 = r2.allKeys()
            if (r3 == 0) goto L_0x0088
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x0019:
            if (r6 >= r4) goto L_0x0088
            r7 = r3[r6]
            byte[] r7 = r2.decodeBytes(r7)
            if (r7 == 0) goto L_0x0085
            java.lang.String r8 = "MicroMsg.AccPowerMonitor"
            r9 = 0
            android.os.Parcel r10 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            int r11 = r7.length     // Catch:{ Exception -> 0x0065 }
            r10.unmarshall(r7, r5, r11)     // Catch:{ Exception -> 0x0065 }
            r10.setDataPosition(r5)     // Catch:{ Exception -> 0x0065 }
            android.os.Parcelable$Creator<com.tencent.matrix.battery.accumulate.AccPowerStats> r7 = com.tencent.matrix.battery.accumulate.AccPowerStats.CREATOR     // Catch:{ Exception -> 0x0065 }
            java.lang.Object r7 = r7.createFromParcel(r10)     // Catch:{ Exception -> 0x0065 }
            com.tencent.matrix.battery.accumulate.AccPowerStats r7 = (com.tencent.matrix.battery.accumulate.AccPowerStats) r7     // Catch:{ Exception -> 0x0065 }
            int r11 = r7.f343029d     // Catch:{ Exception -> 0x0065 }
            r12 = 5
            if (r11 != r12) goto L_0x0043
            r10.recycle()
            r9 = r7
            goto L_0x0077
        L_0x0043:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065 }
            r11.<init>()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r13 = "ver mismatch, get="
            r11.append(r13)     // Catch:{ Exception -> 0x0065 }
            int r7 = r7.f343029d     // Catch:{ Exception -> 0x0065 }
            r11.append(r7)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r7 = ", curr="
            r11.append(r7)     // Catch:{ Exception -> 0x0065 }
            r11.append(r12)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r7 = r11.toString()     // Catch:{ Exception -> 0x0065 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r7)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0074
        L_0x0062:
            r0 = move-exception
            r9 = r10
            goto L_0x007f
        L_0x0065:
            r7 = move-exception
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            goto L_0x007f
        L_0x0069:
            r7 = move-exception
            r10 = r9
        L_0x006b:
            java.lang.String r11 = "decode err"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0062 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r7, r11, r12)     // Catch:{ all -> 0x0062 }
            if (r10 == 0) goto L_0x0077
        L_0x0074:
            r10.recycle()
        L_0x0077:
            if (r9 == 0) goto L_0x0085
            java.lang.String r7 = r9.f343030e
            r1.put(r7, r9)
            goto L_0x0085
        L_0x007f:
            if (r9 == 0) goto L_0x0084
            r9.recycle()
        L_0x0084:
            throw r0
        L_0x0085:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0088:
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r2 = r0.f337706a
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r3 = r0.f337706a     // Catch:{ all -> 0x012b }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x012b }
            r3.clear()     // Catch:{ all -> 0x012b }
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r3 = r0.f337706a     // Catch:{ all -> 0x012b }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x012b }
            r3.putAll(r1)     // Catch:{ all -> 0x012b }
            monitor-exit(r2)     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "MicroMsg.AccPowerMonitor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#init, size="
            r2.append(r3)
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r3 = r0.f337706a
            java.util.HashMap r3 = (java.util.HashMap) r3
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = 1
            r0.f337707b = r1
            p285zh.C119114c.m167919d()
            java.lang.String r0 = "notifyTraceMore"
            r1 = 50000(0xc350, float:7.0065E-41)
            boolean r0 = p212oe.b$$f.m166059d(r0, r1)
            java.lang.String r1 = "notifyTraceAddicted"
            r2 = 10000(0x2710, float:1.4013E-41)
            boolean r1 = p212oe.b$$f.m166059d(r1, r2)
            p285zh.C119114c.f356684a = r0
            p285zh.C119114c.f356685b = r1
            zh.c$$e r0 = p285zh.C119114c.f356687d
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356689f
            r0.mo183790d()
            boolean r0 = p285zh.C119114c.f356684a
            if (r0 == 0) goto L_0x011d
            zh.c$$e r0 = p285zh.C119114c.f356688e
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356690g
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356691h
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356692i
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356693j
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356694k
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356695l
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356696m
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356697n
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356698o
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356699p
            r0.mo183790d()
            zh.c$$e r0 = p285zh.C119114c.f356700q
            r0.mo183790d()
        L_0x011d:
            p285zh.C119114c.m167919d()
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            zh.d r1 = new zh.d
            r1.<init>()
            r0.addLifecycleCallback((com.tencent.matrix.lifecycle.C80401d) r1)
            return
        L_0x012b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x012b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.performance.q$$e.run():void");
    }
}
