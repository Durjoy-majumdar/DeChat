package com.tencent.p014mm.app;

/* renamed from: com.tencent.mm.app.l0 */
public class C80605l0 implements Runnable {
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0121, code lost:
        if (r5.equals(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getMainProcessName() + ":push") != false) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r31 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            java.lang.String r1 = "MicroMsg.MMCrashReporter"
            r2 = 0
            if (r0 == 0) goto L_0x002a
            r0 = 2000(0x7d0, float:2.803E-42)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getIntRandom(r0, r2)     // Catch:{ InterruptedException -> 0x0029 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0029 }
            r3.<init>()     // Catch:{ InterruptedException -> 0x0029 }
            java.lang.String r4 = "randomTime = "
            r3.append(r4)     // Catch:{ InterruptedException -> 0x0029 }
            r3.append(r0)     // Catch:{ InterruptedException -> 0x0029 }
            java.lang.String r3 = r3.toString()     // Catch:{ InterruptedException -> 0x0029 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ InterruptedException -> 0x0029 }
            long r3 = (long) r0     // Catch:{ InterruptedException -> 0x0029 }
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "activity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 != 0) goto L_0x0039
            return
        L_0x0039:
            r3 = 0
            r4 = 16
            java.util.List r0 = r0.getHistoricalProcessExitReasons(r3, r2, r4)     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x02df
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x004a
            goto L_0x02df
        L_0x004a:
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 10
            long r3 = r3 % r5
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0059
            r3 = 1
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "rollDiceToReportExitInfo = "
            r4.append(r8)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r8 = "Recent_Exit_Info_Hash_Code"
            int r4 = r4.decodeInt(r8, r2)
            long r9 = (long) r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "lastRecentExitInfoHashCodeFromMMKV = "
            r4.append(r11)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            java.util.Iterator r4 = r0.iterator()
            r0 = 1
            r11 = 1
        L_0x0094:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x02df
            java.lang.Object r12 = r4.next()
            android.app.ApplicationExitInfo r12 = (android.app.ApplicationExitInfo) r12
            int r13 = r12.hashCode()
            int r14 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x00ad
            long r14 = (long) r13
            int r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x00ae
        L_0x00ad:
            r11 = 0
        L_0x00ae:
            if (r0 == 0) goto L_0x00ce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = "save recently exit info hash code here, hashCode = "
            r0.append(r14)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            r0.encode((java.lang.String) r8, (int) r13)
            r14 = 0
            goto L_0x00cf
        L_0x00ce:
            r14 = r0
        L_0x00cf:
            java.lang.String r15 = r12.toString()
            java.lang.String r5 = r12.getProcessName()
            int r0 = r12.getReason()
            r6 = 6
            if (r0 != r6) goto L_0x00e1
            r17 = 1
            goto L_0x00e3
        L_0x00e1:
            r17 = 0
        L_0x00e3:
            r18 = 9
            r19 = 8
            r20 = 7
            r21 = 5
            r22 = 4
            r6 = 10
            r25 = 2
            r7 = 3
            if (r3 == 0) goto L_0x01c0
            if (r17 != 0) goto L_0x01c0
            if (r11 == 0) goto L_0x01c0
            int r0 = r12.getReason()
            if (r0 == r6) goto L_0x01c0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getMainProcessName()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0123
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getMainProcessName()
            r0.append(r6)
            java.lang.String r6 = ":push"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01c0
        L_0x0123:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r6 = r12.getPid()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r13 = 1
            r0[r13] = r6
            r0[r25] = r15
            java.lang.String r6 = "[ExitInfo] going to report, pid : [%d], hashCode : [%d], %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r0)
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x01a5 }
            r6 = 11
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x01a5 }
            r13[r2] = r5     // Catch:{ all -> 0x01a5 }
            int r6 = r12.getImportance()     // Catch:{ all -> 0x01a5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01a5 }
            r26 = 1
            r13[r26] = r6     // Catch:{ all -> 0x01a5 }
            java.lang.String r6 = r12.getDescription()     // Catch:{ all -> 0x01a5 }
            r13[r25] = r6     // Catch:{ all -> 0x01a5 }
            int r6 = r12.getReason()     // Catch:{ all -> 0x01a5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01a5 }
            r13[r7] = r6     // Catch:{ all -> 0x01a5 }
            long r28 = r12.getTimestamp()     // Catch:{ all -> 0x01a5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x01a5 }
            r13[r22] = r6     // Catch:{ all -> 0x01a5 }
            long r28 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x01a5 }
            r13[r21] = r6     // Catch:{ all -> 0x01a5 }
            long r28 = r12.getPss()     // Catch:{ all -> 0x01a5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x01a5 }
            r23 = 6
            r13[r23] = r6     // Catch:{ all -> 0x01a5 }
            long r28 = r12.getRss()     // Catch:{ all -> 0x01a5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x01a5 }
            r13[r20] = r6     // Catch:{ all -> 0x01a5 }
            int r6 = r12.getStatus()     // Catch:{ all -> 0x01a5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01a5 }
            r13[r19] = r6     // Catch:{ all -> 0x01a5 }
            r13[r18] = r15     // Catch:{ all -> 0x01a5 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x01a5 }
            r27 = 10
            r13[r27] = r6     // Catch:{ all -> 0x01a5 }
            r6 = 25592(0x63f8, float:3.5862E-41)
            r0.mo160131h(r6, r13)     // Catch:{ all -> 0x01a5 }
            goto L_0x01da
        L_0x01a5:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "report exit info error : "
            r6.append(r13)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x01da
        L_0x01c0:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r6 = r12.getPid()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r13 = 1
            r0[r13] = r6
            r0[r25] = r15
            java.lang.String r6 = "[ExitInfo] not report, pid : [%d], hashCode : [%d], %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r0)
        L_0x01da:
            if (r17 != 0) goto L_0x01e0
        L_0x01dc:
            r2 = 1
            r6 = 0
            goto L_0x02d9
        L_0x01e0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "happens ANR previously, processName : "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r6 = ", pid = "
            r0.append(r6)
            int r6 = r12.getPid()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.io.InputStream r6 = r12.getTraceInputStream()     // Catch:{ all -> 0x02c8 }
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ all -> 0x02ba }
            r13.<init>(r6)     // Catch:{ all -> 0x02ba }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x02ae }
            r7.<init>(r13)     // Catch:{ all -> 0x02ae }
        L_0x020e:
            java.lang.String r0 = r7.readLine()     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x022a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a2 }
            r2.<init>()     // Catch:{ all -> 0x02a2 }
            r2.append(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x02a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x02a2 }
            r2 = 0
            goto L_0x020e
        L_0x022a:
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x02a2 }
            r2 = 11
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02a2 }
            r24 = 0
            r2[r24] = r5     // Catch:{ all -> 0x02a2 }
            int r5 = r12.getImportance()     // Catch:{ all -> 0x02a2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x02a2 }
            r24 = 1
            r2[r24] = r5     // Catch:{ all -> 0x02a2 }
            java.lang.String r5 = r12.getDescription()     // Catch:{ all -> 0x02a2 }
            r2[r25] = r5     // Catch:{ all -> 0x02a2 }
            int r5 = r12.getReason()     // Catch:{ all -> 0x02a2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x02a2 }
            r17 = 3
            r2[r17] = r5     // Catch:{ all -> 0x02a2 }
            long r29 = r12.getTimestamp()     // Catch:{ all -> 0x02a2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x02a2 }
            r2[r22] = r5     // Catch:{ all -> 0x02a2 }
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x02a2 }
            r2[r21] = r5     // Catch:{ all -> 0x02a2 }
            long r21 = r12.getPss()     // Catch:{ all -> 0x02a2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x02a2 }
            r17 = 6
            r2[r17] = r5     // Catch:{ all -> 0x02a2 }
            long r21 = r12.getRss()     // Catch:{ all -> 0x02a2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x02a2 }
            r2[r20] = r5     // Catch:{ all -> 0x02a2 }
            int r5 = r12.getStatus()     // Catch:{ all -> 0x02a2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x02a2 }
            r2[r19] = r5     // Catch:{ all -> 0x02a2 }
            r2[r18] = r15     // Catch:{ all -> 0x02a2 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x02a2 }
            r12 = 10
            r2[r12] = r5     // Catch:{ all -> 0x02a2 }
            r5 = 25592(0x63f8, float:3.5862E-41)
            r0.mo160131h(r5, r2)     // Catch:{ all -> 0x02a2 }
            r7.close()     // Catch:{ all -> 0x02ae }
            r13.close()     // Catch:{ all -> 0x02ba }
            if (r6 == 0) goto L_0x01dc
            r6.close()     // Catch:{ all -> 0x02c8 }
            goto L_0x01dc
        L_0x02a2:
            r0 = move-exception
            r2 = r0
            r7.close()     // Catch:{ all -> 0x02a8 }
            goto L_0x02ad
        L_0x02a8:
            r0 = move-exception
            r5 = r0
            r2.addSuppressed(r5)     // Catch:{ all -> 0x02ae }
        L_0x02ad:
            throw r2     // Catch:{ all -> 0x02ae }
        L_0x02ae:
            r0 = move-exception
            r2 = r0
            r13.close()     // Catch:{ all -> 0x02b4 }
            goto L_0x02b9
        L_0x02b4:
            r0 = move-exception
            r5 = r0
            r2.addSuppressed(r5)     // Catch:{ all -> 0x02ba }
        L_0x02b9:
            throw r2     // Catch:{ all -> 0x02ba }
        L_0x02ba:
            r0 = move-exception
            r2 = r0
            if (r6 == 0) goto L_0x02c7
            r6.close()     // Catch:{ all -> 0x02c2 }
            goto L_0x02c7
        L_0x02c2:
            r0 = move-exception
            r5 = r0
            r2.addSuppressed(r5)     // Catch:{ all -> 0x02c8 }
        L_0x02c7:
            throw r2     // Catch:{ all -> 0x02c8 }
        L_0x02c8:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = "print ANR trace error : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r5)
        L_0x02d9:
            r0 = r14
            r2 = 0
            r5 = 0
            goto L_0x0094
        L_0x02df:
            return
        L_0x02e0:
            java.lang.String r0 = "getHistoricalProcessExitReasons error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80605l0.run():void");
    }
}
