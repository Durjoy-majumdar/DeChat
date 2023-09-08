package com.tencent.p014mm.plugin.report.service;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: com.tencent.mm.plugin.report.service.k */
public class C57276k {

    /* renamed from: a */
    public static String f164057a;

    /* renamed from: b */
    public static Byte f164058b = new Byte((byte) 0);

    static {
        StringBuilder sb = new StringBuilder();
        Context context = MMApplicationContext.getContext();
        String str = null;
        if (context != null) {
            try {
                C86009m1 c = C86009m1.m106378c(context.getFilesDir());
                if (!c.mo119967g()) {
                    c.mo119964e();
                }
                str = c.toString();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ReportManagerKvCheck", e.getMessage());
            }
        }
        sb.append(str);
        sb.append("/kvcomm/exception/");
        f164057a = sb.toString();
        if (!C86013q1.m106450k(f164057a)) {
            C86013q1.m106461v(f164057a);
        }
    }

    /* renamed from: a */
    public static String m66019a() {
        String processName = MMApplicationContext.getProcessName();
        if (processName == null || processName.length() == 0) {
            return "MM";
        }
        String[] split = processName.split(XVFSFile.PATH_SEPARATOR);
        return split.length <= 1 ? "MM" : split[1];
    }

    /* renamed from: b */
    public static byte[] m66020b(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c1 A[EDGE_INSN: B:134:0x01c1->B:61:0x01c1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0269 A[EDGE_INSN: B:138:0x0269->B:91:0x0269 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ae A[Catch:{ Exception -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c5 A[Catch:{ Exception -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c6 A[Catch:{ Exception -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x025b A[Catch:{ Exception -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026d A[Catch:{ Exception -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x026f A[Catch:{ Exception -> 0x00e3 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66021c() {
        /*
            java.lang.Byte r1 = f164058b
            monitor-enter(r1)
            java.lang.String r0 = f164057a     // Catch:{ all -> 0x036e }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r2.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r3 = "loadFilesToReport, filepath:"
            r2.append(r3)     // Catch:{ all -> 0x036e }
            java.lang.String r3 = f164057a     // Catch:{ all -> 0x036e }
            r2.append(r3)     // Catch:{ all -> 0x036e }
            java.lang.String r3 = " not exist."
            r2.append(r3)     // Catch:{ all -> 0x036e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x036e }
            monitor-exit(r1)     // Catch:{ all -> 0x036e }
            return
        L_0x002b:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x036e }
            java.lang.String r2 = f164057a     // Catch:{ all -> 0x036e }
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x036e }
            com.tencent.mm.vfs.m1[] r2 = r0.mo119984u()     // Catch:{ all -> 0x036e }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r2.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r3 = "list file fail, filePath:"
            r2.append(r3)     // Catch:{ all -> 0x036e }
            java.lang.String r3 = f164057a     // Catch:{ all -> 0x036e }
            r2.append(r3)     // Catch:{ all -> 0x036e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x036e }
            monitor-exit(r1)     // Catch:{ all -> 0x036e }
            return
        L_0x0053:
            int r3 = r2.length     // Catch:{ all -> 0x036e }
            r5 = 0
        L_0x0055:
            if (r5 >= r3) goto L_0x036c
            r0 = r2[r5]     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r6 = "loadFilesToReport, file is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)     // Catch:{ all -> 0x036e }
            r19 = r2
            r16 = r3
            goto L_0x0364
        L_0x0069:
            java.lang.String r6 = r0.mo119971i()     // Catch:{ all -> 0x036e }
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)     // Catch:{ all -> 0x036e }
            int r8 = (int) r7     // Catch:{ all -> 0x036e }
            java.lang.String r7 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r9.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r10 = "loadFilesToReport, filename:"
            r9.append(r10)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r0.mo119971i()     // Catch:{ all -> 0x036e }
            r9.append(r0)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = ", filelenth:"
            r9.append(r0)     // Catch:{ all -> 0x036e }
            r9.append(r8)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)     // Catch:{ all -> 0x036e }
            r0 = 0
        L_0x0096:
            if (r0 < r8) goto L_0x00b0
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r7.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r8 = "loadFilesToReport, read to end, deletefile:"
            r7.append(r8)     // Catch:{ all -> 0x036e }
            r7.append(r6)     // Catch:{ all -> 0x036e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)     // Catch:{ all -> 0x036e }
            goto L_0x0118
        L_0x00b0:
            r7 = 4
            byte[] r9 = com.tencent.p014mm.vfs.C86013q1.m106433O(r6, r0, r7)     // Catch:{ all -> 0x036e }
            if (r9 != 0) goto L_0x00cf
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r7.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r8 = "loadFilesToReport, get obj_len fail. delete file:"
            r7.append(r8)     // Catch:{ all -> 0x036e }
            r7.append(r6)     // Catch:{ all -> 0x036e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x036e }
            goto L_0x0118
        L_0x00cf:
            int r0 = r0 + 4
            r10 = 0
            r11 = 0
        L_0x00d3:
            if (r10 >= r7) goto L_0x00fb
            int r12 = 3 - r10
            int r12 = r12 * 8
            byte r13 = r9[r10]     // Catch:{ Exception -> 0x00e3 }
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r12 = r13 << r12
            int r11 = r11 + r12
            int r10 = r10 + 1
            goto L_0x00d3
        L_0x00e3:
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r7.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r8 = "loadFilesToReport, byteArrayToInt error. delete file:"
            r7.append(r8)     // Catch:{ all -> 0x036e }
            r7.append(r6)     // Catch:{ all -> 0x036e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x036e }
            goto L_0x0118
        L_0x00fb:
            byte[] r7 = com.tencent.p014mm.vfs.C86013q1.m106433O(r6, r0, r11)     // Catch:{ all -> 0x036e }
            if (r7 != 0) goto L_0x011c
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r7.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r8 = "loadFilesToReport, get obj_data fail. delete file:"
            r7.append(r8)     // Catch:{ all -> 0x036e }
            r7.append(r6)     // Catch:{ all -> 0x036e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x036e }
        L_0x0118:
            r19 = r2
            goto L_0x01cb
        L_0x011c:
            int r9 = r0 + r11
            java.lang.String r0 = ".statictis_new2"
            boolean r0 = r6.contains(r0)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x01cf
            com.tencent.mm.plugin.report.service.h r0 = new com.tencent.mm.plugin.report.service.h     // Catch:{ all -> 0x036e }
            r0.<init>()     // Catch:{ all -> 0x036e }
            r0.parseFrom(r7)     // Catch:{ Exception -> 0x0186 }
            int r13 = r0.f164051d     // Catch:{ Exception -> 0x0186 }
            int r14 = r0.f164055h     // Catch:{ Exception -> 0x0186 }
            java.lang.String r15 = r0.f164052e     // Catch:{ Exception -> 0x0186 }
            boolean r7 = r0.f164054g     // Catch:{ Exception -> 0x0186 }
            boolean r12 = r0.f164053f     // Catch:{ Exception -> 0x0186 }
            boolean r0 = r0.f164056i     // Catch:{ Exception -> 0x0186 }
            java.lang.String r4 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0186 }
            r10.<init>()     // Catch:{ Exception -> 0x0186 }
            r19 = r2
            java.lang.String r2 = "loadFilesToReport, reportkvcomm, logid:"
            r10.append(r2)     // Catch:{ Exception -> 0x0184 }
            r10.append(r13)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = ", type:"
            r10.append(r2)     // Catch:{ Exception -> 0x0184 }
            r10.append(r14)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = ", value:"
            r10.append(r2)     // Catch:{ Exception -> 0x0184 }
            r10.append(r15)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = ", isReportNow:"
            r10.append(r2)     // Catch:{ Exception -> 0x0184 }
            r10.append(r12)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = ", isImportant"
            r10.append(r2)     // Catch:{ Exception -> 0x0184 }
            r10.append(r7)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = r10.toString()     // Catch:{ Exception -> 0x0184 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x0184 }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0184 }
            r4 = r12
            r12 = r2
            r16 = r4
            r17 = r7
            r18 = r0
            r12.mo175915y(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0184 }
            r16 = r3
            goto L_0x02ec
        L_0x0184:
            r0 = move-exception
            goto L_0x0189
        L_0x0186:
            r0 = move-exception
            r19 = r2
        L_0x0189:
            java.lang.String r2 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r4.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r7 = "loadFilesToReport(kvcomm), objLen = "
            r4.append(r7)     // Catch:{ all -> 0x036e }
            r4.append(r11)     // Catch:{ all -> 0x036e }
            java.lang.String r7 = ", Exception:"
            r4.append(r7)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036e }
            r4.append(r0)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x036e }
            if (r11 == 0) goto L_0x01c1
            com.tencent.mm.matrix.a r0 = com.tencent.p014mm.matrix.C55262j.f157382a     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x01b4
            r0 = 0
            goto L_0x01ba
        L_0x01b4:
            r2 = 83
            boolean r0 = r0.mo76562e2(r2)     // Catch:{ all -> 0x036e }
        L_0x01ba:
            if (r0 == 0) goto L_0x01bd
            goto L_0x01c1
        L_0x01bd:
            r16 = r3
            goto L_0x0339
        L_0x01c1:
            com.tencent.mm.matrix.a r0 = com.tencent.p014mm.matrix.C55262j.f157382a     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x01c6
            goto L_0x01cb
        L_0x01c6:
            r2 = 83
            r0.mo76561bO(r2)     // Catch:{ all -> 0x036e }
        L_0x01cb:
            r16 = r3
            goto L_0x0361
        L_0x01cf:
            r19 = r2
            java.lang.String r0 = ".monitor"
            boolean r0 = r6.contains(r0)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x0276
            com.tencent.mm.plugin.report.service.e r0 = new com.tencent.mm.plugin.report.service.e     // Catch:{ all -> 0x036e }
            r0.<init>()     // Catch:{ all -> 0x036e }
            r0.parseFrom(r7)     // Catch:{ IOException -> 0x0233 }
            int r2 = r0.f164047d     // Catch:{ IOException -> 0x0233 }
            long r12 = (long) r2     // Catch:{ IOException -> 0x0233 }
            int r2 = r0.f164048e     // Catch:{ IOException -> 0x0233 }
            long r14 = (long) r2     // Catch:{ IOException -> 0x0233 }
            int r2 = r0.f164049f     // Catch:{ IOException -> 0x0233 }
            r4 = r3
            long r2 = (long) r2
            boolean r0 = r0.f164050g     // Catch:{ IOException -> 0x022f }
            java.lang.String r7 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x022f }
            r10.<init>()     // Catch:{ IOException -> 0x022f }
            r16 = r4
            java.lang.String r4 = "loadFilesToReport, reportidkey, id:"
            r10.append(r4)     // Catch:{ IOException -> 0x022d }
            r10.append(r12)     // Catch:{ IOException -> 0x022d }
            java.lang.String r4 = ", key:"
            r10.append(r4)     // Catch:{ IOException -> 0x022d }
            r10.append(r14)     // Catch:{ IOException -> 0x022d }
            java.lang.String r4 = ", value:"
            r10.append(r4)     // Catch:{ IOException -> 0x022d }
            r10.append(r2)     // Catch:{ IOException -> 0x022d }
            java.lang.String r4 = ", isImportant"
            r10.append(r4)     // Catch:{ IOException -> 0x022d }
            r10.append(r0)     // Catch:{ IOException -> 0x022d }
            java.lang.String r4 = r10.toString()     // Catch:{ IOException -> 0x022d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)     // Catch:{ IOException -> 0x022d }
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ IOException -> 0x022d }
            r21 = r12
            r23 = r14
            r25 = r2
            r27 = r0
            r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ IOException -> 0x022d }
            goto L_0x02ec
        L_0x022d:
            r0 = move-exception
            goto L_0x0236
        L_0x022f:
            r0 = move-exception
            r16 = r4
            goto L_0x0236
        L_0x0233:
            r0 = move-exception
            r16 = r3
        L_0x0236:
            java.lang.String r2 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r3.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r4 = "loadFilesToReport(idkey), objLen = "
            r3.append(r4)     // Catch:{ all -> 0x036e }
            r3.append(r11)     // Catch:{ all -> 0x036e }
            java.lang.String r4 = ", IOException:"
            r3.append(r4)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036e }
            r3.append(r0)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x036e }
            if (r11 == 0) goto L_0x0269
            com.tencent.mm.matrix.a r0 = com.tencent.p014mm.matrix.C55262j.f157382a     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x0261
            r0 = 0
            goto L_0x0267
        L_0x0261:
            r2 = 83
            boolean r0 = r0.mo76562e2(r2)     // Catch:{ all -> 0x036e }
        L_0x0267:
            if (r0 == 0) goto L_0x0339
        L_0x0269:
            com.tencent.mm.matrix.a r0 = com.tencent.p014mm.matrix.C55262j.f157382a     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x026f
            goto L_0x0361
        L_0x026f:
            r2 = 83
            r0.mo76561bO(r2)     // Catch:{ all -> 0x036e }
            goto L_0x0361
        L_0x0276:
            r16 = r3
            java.lang.String r0 = ".group_monitor"
            boolean r0 = r6.contains(r0)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x034b
            com.tencent.mm.plugin.report.service.d r0 = new com.tencent.mm.plugin.report.service.d     // Catch:{ all -> 0x036e }
            r0.<init>()     // Catch:{ all -> 0x036e }
            r0.parseFrom(r7)     // Catch:{ IOException -> 0x0304 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0304 }
            r2.<init>()     // Catch:{ IOException -> 0x0304 }
            java.util.LinkedList<com.tencent.mm.plugin.report.service.e> r0 = r0.f164046e     // Catch:{ IOException -> 0x0304 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0304 }
            r3 = 0
        L_0x0294:
            boolean r4 = r0.hasNext()     // Catch:{ IOException -> 0x0304 }
            if (r4 == 0) goto L_0x02e7
            java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x0304 }
            com.tencent.mm.plugin.report.service.e r3 = (com.tencent.p014mm.plugin.report.service.C57274e) r3     // Catch:{ IOException -> 0x0304 }
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey     // Catch:{ IOException -> 0x0304 }
            int r7 = r3.f164047d     // Catch:{ IOException -> 0x0304 }
            int r10 = r3.f164048e     // Catch:{ IOException -> 0x0304 }
            int r12 = r3.f164049f     // Catch:{ IOException -> 0x0304 }
            r4.<init>((int) r7, (int) r10, (int) r12)     // Catch:{ IOException -> 0x0304 }
            boolean r7 = r3.f164050g     // Catch:{ IOException -> 0x0304 }
            r2.add(r4)     // Catch:{ IOException -> 0x0304 }
            java.lang.String r4 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0304 }
            r10.<init>()     // Catch:{ IOException -> 0x0304 }
            java.lang.String r12 = "loadFilesToReport, idkeyGroupStat, id:"
            r10.append(r12)     // Catch:{ IOException -> 0x0304 }
            int r12 = r3.f164047d     // Catch:{ IOException -> 0x0304 }
            r10.append(r12)     // Catch:{ IOException -> 0x0304 }
            java.lang.String r12 = ", key:"
            r10.append(r12)     // Catch:{ IOException -> 0x0304 }
            int r12 = r3.f164048e     // Catch:{ IOException -> 0x0304 }
            r10.append(r12)     // Catch:{ IOException -> 0x0304 }
            java.lang.String r12 = ", value:"
            r10.append(r12)     // Catch:{ IOException -> 0x0304 }
            int r3 = r3.f164049f     // Catch:{ IOException -> 0x0304 }
            r10.append(r3)     // Catch:{ IOException -> 0x0304 }
            java.lang.String r3 = ", isImportant"
            r10.append(r3)     // Catch:{ IOException -> 0x0304 }
            r10.append(r7)     // Catch:{ IOException -> 0x0304 }
            java.lang.String r3 = r10.toString()     // Catch:{ IOException -> 0x0304 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ IOException -> 0x0304 }
            r3 = r7
            goto L_0x0294
        L_0x02e7:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ IOException -> 0x0304 }
            r0.mo160124a(r2, r3)     // Catch:{ IOException -> 0x0304 }
        L_0x02ec:
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r2.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r3 = "loadFilesToReport, curLen:"
            r2.append(r3)     // Catch:{ all -> 0x036e }
            r2.append(r9)     // Catch:{ all -> 0x036e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ all -> 0x036e }
            goto L_0x0339
        L_0x0304:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r3.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r4 = "loadFilesToReport(idkey), objLen = "
            r3.append(r4)     // Catch:{ all -> 0x036e }
            r3.append(r11)     // Catch:{ all -> 0x036e }
            java.lang.String r4 = ", IOException:"
            r3.append(r4)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036e }
            r3.append(r0)     // Catch:{ all -> 0x036e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x036e }
            if (r11 == 0) goto L_0x0340
            com.tencent.mm.matrix.a r0 = com.tencent.p014mm.matrix.C55262j.f157382a     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x0330
            r0 = 0
            goto L_0x0336
        L_0x0330:
            r2 = 83
            boolean r0 = r0.mo76562e2(r2)     // Catch:{ all -> 0x036e }
        L_0x0336:
            if (r0 == 0) goto L_0x0339
            goto L_0x0340
        L_0x0339:
            r0 = r9
            r3 = r16
            r2 = r19
            goto L_0x0096
        L_0x0340:
            com.tencent.mm.matrix.a r0 = com.tencent.p014mm.matrix.C55262j.f157382a     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x0345
            goto L_0x0361
        L_0x0345:
            r2 = 83
            r0.mo76561bO(r2)     // Catch:{ all -> 0x036e }
            goto L_0x0361
        L_0x034b:
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036e }
            r2.<init>()     // Catch:{ all -> 0x036e }
            java.lang.String r3 = "invalid filename:"
            r2.append(r3)     // Catch:{ all -> 0x036e }
            r2.append(r6)     // Catch:{ all -> 0x036e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x036e }
        L_0x0361:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)     // Catch:{ all -> 0x036e }
        L_0x0364:
            int r5 = r5 + 1
            r3 = r16
            r2 = r19
            goto L_0x0055
        L_0x036c:
            monitor-exit(r1)     // Catch:{ all -> 0x036e }
            return
        L_0x036e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x036e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.C57276k.m66021c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0169, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66022d(int r4, int r5, java.lang.String r6, boolean r7, boolean r8, boolean r9) {
        /*
            java.lang.String r0 = f164057a
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveKVcommData, filepath:"
            r1.append(r2)
            java.lang.String r2 = f164057a
            r1.append(r2)
            java.lang.String r2 = " not exist , logId:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", type:"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ", val:"
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = ", isImportant:"
            r1.append(r4)
            r1.append(r8)
            java.lang.String r4 = ", reportnow:"
            r1.append(r4)
            r1.append(r7)
            java.lang.String r4 = ", ignoreFreqLimit:"
            r1.append(r4)
            r1.append(r9)
            java.lang.String r4 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            return
        L_0x0052:
            java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveKVcommData, logId:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", type:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ", val:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", isImportant:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", reportnow:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = ","
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = m66019a()
            java.lang.String r1 = "MM"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00e4
            java.lang.String r1 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error path, invalid processname:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", logId:"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ", type:"
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = ", val:"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = ", isImportant:"
            r2.append(r4)
            r2.append(r8)
            java.lang.String r4 = ", reportnow:"
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = ", ignoreFreqLimit:"
            r2.append(r4)
            r2.append(r9)
            java.lang.String r4 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
            return
        L_0x00e4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = f164057a
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ".statictis_new2"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.mm.plugin.report.service.h r1 = new com.tencent.mm.plugin.report.service.h
            r1.<init>()
            r1.f164051d = r4
            r1.f164055h = r5
            r1.f164052e = r6
            r1.f164054g = r8
            r1.f164053f = r7
            r1.f164056i = r9
            byte[] r4 = r1.toByteArray()     // Catch:{ IOException -> 0x016d }
            if (r4 != 0) goto L_0x011a
            java.lang.String r4 = "MicroMsg.ReportManagerKvCheck"
            java.lang.String r5 = "saveKVcommData, null == temp."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            return
        L_0x011a:
            java.lang.Byte r5 = f164058b
            monitor-enter(r5)
            int r6 = r4.length     // Catch:{ all -> 0x016a }
            byte[] r6 = m66020b(r6)     // Catch:{ all -> 0x016a }
            int r6 = com.tencent.p014mm.vfs.C86013q1.m106440a(r0, r6)     // Catch:{ all -> 0x016a }
            if (r6 == 0) goto L_0x0146
            java.lang.String r4 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016a }
            r6.<init>()     // Catch:{ all -> 0x016a }
            java.lang.String r7 = "saveKVcommData, write obj_len to file:"
            r6.append(r7)     // Catch:{ all -> 0x016a }
            r6.append(r0)     // Catch:{ all -> 0x016a }
            java.lang.String r7 = " fail."
            r6.append(r7)     // Catch:{ all -> 0x016a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x016a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)     // Catch:{ all -> 0x016a }
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            return
        L_0x0146:
            int r4 = com.tencent.p014mm.vfs.C86013q1.m106440a(r0, r4)     // Catch:{ all -> 0x016a }
            if (r4 == 0) goto L_0x0168
            java.lang.String r4 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016a }
            r6.<init>()     // Catch:{ all -> 0x016a }
            java.lang.String r7 = "saveKVcommData, write object to file:"
            r6.append(r7)     // Catch:{ all -> 0x016a }
            r6.append(r0)     // Catch:{ all -> 0x016a }
            java.lang.String r7 = " fail."
            r6.append(r7)     // Catch:{ all -> 0x016a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x016a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)     // Catch:{ all -> 0x016a }
        L_0x0168:
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            return
        L_0x016a:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            throw r4
        L_0x016d:
            r4 = move-exception
            java.lang.String r5 = "MicroMsg.ReportManagerKvCheck"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "saveIDKeyData, IOException, detail:"
            r6.append(r7)
            java.lang.String r4 = r4.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.C57276k.m66022d(int, int, java.lang.String, boolean, boolean, boolean):void");
    }
}
