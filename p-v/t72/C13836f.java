package t72;

/* renamed from: t72.f */
public class C13836f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118391i f38977d;

    public C13836f(C118391i iVar) {
        this.f38977d = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065 A[Catch:{ Exception -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067 A[Catch:{ Exception -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            java.lang.String r1 = "MicroMsg.SubCoreBaseMonitor"
            java.lang.String r0 = ";"
            r2 = 0
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x00c2 }
            f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00c2 }
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ Exception -> 0x00c2 }
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_INSTALL_FIRST_CLIENT_VERSION_INT     // Catch:{ Exception -> 0x00c2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object r3 = r3.mo119685f(r4, r5)     // Catch:{ Exception -> 0x00c2 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x00c2 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x00c2 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x00c2 }
            f40.o r4 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00c2 }
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()     // Catch:{ Exception -> 0x00c2 }
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_INSTALL_FIRST_TIME_LONG     // Catch:{ Exception -> 0x00c2 }
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object r4 = r4.mo119685f(r5, r6)     // Catch:{ Exception -> 0x00c2 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x00c2 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x00c2 }
            r6 = r18
            t72.i r7 = r6.f38977d     // Catch:{ Exception -> 0x00c0 }
            long r7 = t72.C118391i.wx0(r7)     // Catch:{ Exception -> 0x00c0 }
            r9 = 1
            if (r3 <= 0) goto L_0x004f
            int r10 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x00c0 }
            if (r10 != r3) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r10 = 0
            goto L_0x0050
        L_0x004f:
            r10 = 1
        L_0x0050:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r11.<init>()     // Catch:{ Exception -> 0x00c0 }
            r11.append(r3)     // Catch:{ Exception -> 0x00c0 }
            r11.append(r0)     // Catch:{ Exception -> 0x00c0 }
            int r3 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x00c0 }
            r11.append(r3)     // Catch:{ Exception -> 0x00c0 }
            r11.append(r0)     // Catch:{ Exception -> 0x00c0 }
            if (r10 == 0) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            r11.append(r3)     // Catch:{ Exception -> 0x00c0 }
            r11.append(r0)     // Catch:{ Exception -> 0x00c0 }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r10 = "yyyyMMdd"
            r3.<init>(r10)     // Catch:{ Exception -> 0x00c0 }
            java.util.Date r10 = new java.util.Date     // Catch:{ Exception -> 0x00c0 }
            r10.<init>(r4)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = r3.format(r10)     // Catch:{ Exception -> 0x00c0 }
            r11.append(r3)     // Catch:{ Exception -> 0x00c0 }
            r11.append(r0)     // Catch:{ Exception -> 0x00c0 }
            r11.append(r7)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x00c0 }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00c0 }
            r11 = 418(0x1a2, double:2.065E-321)
            r13 = 1
            r15 = 1
            r17 = 1
            r10 = r3
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ Exception -> 0x00c0 }
            r11 = 13778(0x35d2, float:1.9307E-41)
            r12 = 0
            r13 = 0
            r14 = 1
            r4 = 3
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00c0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00c0 }
            r15[r2] = r4     // Catch:{ Exception -> 0x00c0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00c0 }
            r15[r9] = r4     // Catch:{ Exception -> 0x00c0 }
            r4 = 2
            r15[r4] = r0     // Catch:{ Exception -> 0x00c0 }
            r10 = r3
            r10.mo160128e(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = "summerreportVersion install result[%s]"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00c0 }
            r4[r2] = r0     // Catch:{ Exception -> 0x00c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00d8
        L_0x00c0:
            r0 = move-exception
            goto L_0x00c5
        L_0x00c2:
            r0 = move-exception
            r6 = r18
        L_0x00c5:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "reportVersion err!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 418(0x1a2, double:2.065E-321)
            r10 = 2
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.C13836f.run():void");
    }
}
