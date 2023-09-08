package le3;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: le3.b */
public class C88489b {
    /* renamed from: a */
    public static String m110344a(String str) {
        return Util.isNullOrNil(str) ? "" : str.replaceAll(" ", "").trim().replaceAll("kB", "").trim().replaceAll("\\t", "").trim();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fb A[EDGE_INSN: B:90:0x00fb->B:40:0x00fb ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m110345b() {
        /*
            java.lang.String r1 = "AllSize:"
            java.lang.String r2 = "FreeSizes:"
            java.lang.String r3 = "AvailableSizes:"
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = "unexpected exception occurred."
            java.lang.String r6 = "exception:%s"
            java.lang.String r7 = ";"
            java.lang.String r8 = ""
            java.lang.String r9 = "MicroMsg.PostTaskHardwareInfo"
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x0329
            boolean r0 = f40.C86718e.m107551r()
            if (r0 == 0) goto L_0x0021
            goto L_0x0329
        L_0x0021:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r10 = 71
            r11 = 0
            java.lang.Object r0 = r0.mo119684e(r10, r11)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ver"
            r0.append(r1)
            int r1 = qe3.C89625d.f257841g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            eb0.C75569c4.m90660F(r0)
            return
        L_0x0050:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r12 = 77833(0x13009, float:1.09067E-40)
            java.lang.Object r0 = r0.mo119684e(r12, r11)
            java.lang.Long r0 = (java.lang.Long) r0
            r13 = 0
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r13)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r13)
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            r15 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0077
            return
        L_0x0077:
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 7
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r15 = 256(0x100, float:3.59E-43)
            r11 = 59
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ all -> 0x00bf }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00bf }
            java.lang.String r17 = "/proc/cpuinfo"
            java.io.InputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106423E(r17)     // Catch:{ all -> 0x00bf }
            r0.<init>(r12, r4)     // Catch:{ all -> 0x00bf }
            r10.<init>(r0)     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r0.<init>(r15)     // Catch:{ all -> 0x00bd }
        L_0x0095:
            java.lang.String r12 = r10.readLine()     // Catch:{ all -> 0x00bd }
            if (r12 == 0) goto L_0x00ac
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x00bd }
            if (r17 != 0) goto L_0x0095
            java.lang.String r12 = m110344a(r12)     // Catch:{ all -> 0x00bd }
            r0.append(r12)     // Catch:{ all -> 0x00bd }
            r0.append(r11)     // Catch:{ all -> 0x00bd }
            goto L_0x0095
        L_0x00ac:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bd }
            r11 = 95
            r12 = 44
            java.lang.String r0 = r0.replace(r12, r11)     // Catch:{ all -> 0x00bd }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            r11 = 0
            goto L_0x00cb
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c1
        L_0x00bf:
            r0 = move-exception
            r10 = 0
        L_0x00c1:
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0324 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r5, r12)     // Catch:{ all -> 0x0324 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            r0 = r8
        L_0x00cb:
            r14[r11] = r0
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ all -> 0x010d }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x010d }
            java.lang.String r11 = "/proc/meminfo"
            java.io.InputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106423E(r11)     // Catch:{ all -> 0x010d }
            r0.<init>(r11, r4)     // Catch:{ all -> 0x010d }
            r10.<init>(r0)     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010b }
            r0.<init>(r15)     // Catch:{ all -> 0x010b }
        L_0x00e2:
            java.lang.String r4 = r10.readLine()     // Catch:{ all -> 0x010b }
            if (r4 == 0) goto L_0x00fb
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x010b }
            if (r11 != 0) goto L_0x00e2
            java.lang.String r4 = m110344a(r4)     // Catch:{ all -> 0x010b }
            r0.append(r4)     // Catch:{ all -> 0x010b }
            r4 = 59
            r0.append(r4)     // Catch:{ all -> 0x010b }
            goto L_0x00e2
        L_0x00fb:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x010b }
            r4 = 44
            r11 = 95
            java.lang.String r0 = r0.replace(r4, r11)     // Catch:{ all -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            goto L_0x0119
        L_0x010b:
            r0 = move-exception
            goto L_0x010f
        L_0x010d:
            r0 = move-exception
            r10 = 0
        L_0x010f:
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x031f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r5, r11)     // Catch:{ all -> 0x031f }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            r0 = r8
        L_0x0119:
            r4 = 1
            r14[r4] = r0
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x01c2 }
            r0.<init>()     // Catch:{ Exception -> 0x01c2 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01c2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x01c2 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x01c2 }
            int r5 = r0.widthPixels     // Catch:{ Exception -> 0x01c2 }
            int r10 = r0.heightPixels     // Catch:{ Exception -> 0x01c2 }
            float r11 = r0.density     // Catch:{ Exception -> 0x01c2 }
            float r12 = r0.xdpi     // Catch:{ Exception -> 0x01c2 }
            float r0 = r0.ydpi     // Catch:{ Exception -> 0x01c2 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c2 }
            r15.<init>()     // Catch:{ Exception -> 0x01c2 }
            r15.append(r8)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = "width:"
            r15.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x01c2 }
            r15.append(r4)     // Catch:{ Exception -> 0x01c2 }
            r15.append(r7)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = r15.toString()     // Catch:{ Exception -> 0x01c2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c2 }
            r5.<init>()     // Catch:{ Exception -> 0x01c2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = "height:"
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r7)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01c2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c2 }
            r5.<init>()     // Catch:{ Exception -> 0x01c2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = "density:"
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r7)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01c2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c2 }
            r5.<init>()     // Catch:{ Exception -> 0x01c2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = "xd:"
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r7)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01c2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c2 }
            r5.<init>()     // Catch:{ Exception -> 0x01c2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r4 = "yd:"
            r5.append(r4)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r0)     // Catch:{ Exception -> 0x01c2 }
            r5.append(r7)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x01c2 }
            goto L_0x01d1
        L_0x01c2:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r4 = 0
            r5[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r6, r5)
            r0 = r8
        L_0x01d1:
            java.lang.String r4 = ","
            java.lang.String r5 = "_"
            java.lang.String r0 = r0.replace(r4, r5)
            r10 = 2
            r14[r10] = r0
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x024b }
            java.io.File r10 = p206nj.C88956h.m111060a()     // Catch:{ Exception -> 0x024b }
            java.lang.String r10 = r10.getPath()     // Catch:{ Exception -> 0x024b }
            r0.<init>(r10)     // Catch:{ Exception -> 0x024b }
            int r10 = r0.getBlockSize()     // Catch:{ Exception -> 0x024b }
            long r10 = (long) r10     // Catch:{ Exception -> 0x024b }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024b }
            r12.<init>()     // Catch:{ Exception -> 0x024b }
            r12.append(r8)     // Catch:{ Exception -> 0x024b }
            r12.append(r3)     // Catch:{ Exception -> 0x024b }
            int r15 = r0.getAvailableBlocks()     // Catch:{ Exception -> 0x024b }
            r17 = r13
            r18 = r14
            long r13 = (long) r15
            long r13 = r13 * r10
            r12.append(r13)     // Catch:{ Exception -> 0x0249 }
            r12.append(r7)     // Catch:{ Exception -> 0x0249 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0249 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0247 }
            r13.<init>()     // Catch:{ Exception -> 0x0247 }
            r13.append(r12)     // Catch:{ Exception -> 0x0247 }
            r13.append(r2)     // Catch:{ Exception -> 0x0247 }
            int r14 = r0.getFreeBlocks()     // Catch:{ Exception -> 0x0247 }
            long r14 = (long) r14     // Catch:{ Exception -> 0x0247 }
            long r14 = r14 * r10
            r13.append(r14)     // Catch:{ Exception -> 0x0247 }
            r13.append(r7)     // Catch:{ Exception -> 0x0247 }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x0247 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0247 }
            r13.<init>()     // Catch:{ Exception -> 0x0247 }
            r13.append(r12)     // Catch:{ Exception -> 0x0247 }
            r13.append(r1)     // Catch:{ Exception -> 0x0247 }
            int r0 = r0.getBlockCount()     // Catch:{ Exception -> 0x0247 }
            long r14 = (long) r0     // Catch:{ Exception -> 0x0247 }
            long r14 = r14 * r10
            r13.append(r14)     // Catch:{ Exception -> 0x0247 }
            r13.append(r7)     // Catch:{ Exception -> 0x0247 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0247 }
            goto L_0x025f
        L_0x0247:
            r0 = move-exception
            goto L_0x0251
        L_0x0249:
            r0 = move-exception
            goto L_0x0250
        L_0x024b:
            r0 = move-exception
            r17 = r13
            r18 = r14
        L_0x0250:
            r12 = r8
        L_0x0251:
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r10 = 0
            r11[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r6, r11)
            r0 = r12
        L_0x025f:
            java.lang.String r0 = r0.replace(r4, r5)
            r10 = 3
            r18[r10] = r0
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ Exception -> 0x02cb }
            java.lang.String r10 = a70.C112760b.m154195C()     // Catch:{ Exception -> 0x02cb }
            r0.<init>(r10)     // Catch:{ Exception -> 0x02cb }
            int r10 = r0.getBlockSize()     // Catch:{ Exception -> 0x02cb }
            long r10 = (long) r10     // Catch:{ Exception -> 0x02cb }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02cb }
            r12.<init>()     // Catch:{ Exception -> 0x02cb }
            r12.append(r8)     // Catch:{ Exception -> 0x02cb }
            r12.append(r3)     // Catch:{ Exception -> 0x02cb }
            int r3 = r0.getAvailableBlocks()     // Catch:{ Exception -> 0x02cb }
            long r13 = (long) r3     // Catch:{ Exception -> 0x02cb }
            long r13 = r13 * r10
            r12.append(r13)     // Catch:{ Exception -> 0x02cb }
            r12.append(r7)     // Catch:{ Exception -> 0x02cb }
            java.lang.String r3 = r12.toString()     // Catch:{ Exception -> 0x02cb }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c9 }
            r12.<init>()     // Catch:{ Exception -> 0x02c9 }
            r12.append(r3)     // Catch:{ Exception -> 0x02c9 }
            r12.append(r2)     // Catch:{ Exception -> 0x02c9 }
            int r2 = r0.getFreeBlocks()     // Catch:{ Exception -> 0x02c9 }
            long r13 = (long) r2     // Catch:{ Exception -> 0x02c9 }
            long r13 = r13 * r10
            r12.append(r13)     // Catch:{ Exception -> 0x02c9 }
            r12.append(r7)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r3 = r12.toString()     // Catch:{ Exception -> 0x02c9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c9 }
            r2.<init>()     // Catch:{ Exception -> 0x02c9 }
            r2.append(r3)     // Catch:{ Exception -> 0x02c9 }
            r2.append(r1)     // Catch:{ Exception -> 0x02c9 }
            int r0 = r0.getBlockCount()     // Catch:{ Exception -> 0x02c9 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x02c9 }
            long r0 = r0 * r10
            r2.append(r0)     // Catch:{ Exception -> 0x02c9 }
            r2.append(r7)     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x02c9 }
            goto L_0x02db
        L_0x02c9:
            r0 = move-exception
            goto L_0x02cd
        L_0x02cb:
            r0 = move-exception
            r3 = r8
        L_0x02cd:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r6, r1)
            r0 = r3
        L_0x02db:
            java.lang.String r0 = r0.replace(r4, r5)
            r1 = 4
            r18[r1] = r0
            r0 = 5
            r18[r0] = r8
            r0 = 6
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 71
            r3 = 0
            java.lang.Object r1 = r1.mo119684e(r2, r3)
            java.lang.String r1 = (java.lang.String) r1
            r18[r0] = r1
            r0 = 10719(0x29df, float:1.502E-41)
            r1 = r17
            r2 = r18
            r1.mo160131h(r0, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 77833(0x13009, float:1.09067E-40)
            r0.mo119676J(r2, r1)
            java.lang.String r0 = "report PostTaskHardwareInfo done "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            return
        L_0x031f:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            throw r0
        L_0x0324:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            throw r0
        L_0x0329:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le3.C88489b.m110345b():void");
    }
}
