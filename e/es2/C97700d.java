package es2;

import com.tencent.p014mm.network.C81034b0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import es2.C97696c;
import vr2.C102236a0;

/* renamed from: es2.d */
public class C97700d extends C97695b {

    /* renamed from: O */
    public int f286602O = 0;

    public C97700d(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
    }

    /* renamed from: h */
    public String mo136971h(String str) {
        SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return str;
    }

    /* renamed from: l */
    public int mo136974l() {
        SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return 4;
    }

    /* renamed from: o */
    public boolean mo136962o() {
        SnsMethodCalculate.markStartTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        SnsMethodCalculate.markEndTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return false;
    }

    /* renamed from: q */
    public boolean mo136976q() {
        SnsMethodCalculate.markStartTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        long l = C86013q1.m106451l(this.f286573o.mo136951c() + this.f286573o.mo136954f());
        Log.m105924i("MicroMsg.SnsDownloadAdSight", "preceeData  downloadLen " + l + " " + this.f286568K);
        if (l < ((long) this.f286568K) + 0) {
            SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
            return false;
        }
        C86013q1.m106435Q(this.f286573o.mo136951c(), this.f286573o.mo136954f(), C102236a0.m134716K(this.f286574p));
        SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return true;
    }

    /* renamed from: t */
    public C81034b0 mo136965t(C81034b0 b0Var) {
        SnsMethodCalculate.markStartTimeMs("appendHttpArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        SnsMethodCalculate.markEndTimeMs("appendHttpArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return b0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e7, code lost:
        if (r14 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        mo136967v(r1.f286570M, 0, r1.f286560C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SnsDownloadAdSight", "getdataend2  " + com.tencent.p014mm.vfs.C86013q1.m106451l(r1.f286573o.mo136951c() + r1.f286573o.mo136954f()));
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0127, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0158 A[SYNTHETIC, Splitter:B:50:0x0158] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016b A[SYNTHETIC, Splitter:B:59:0x016b] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136969x(java.io.InputStream r18, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = ""
            java.lang.String r3 = "MicroMsg.SnsDownloadAdSight"
            java.lang.String r4 = "getDataFromNet"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            r8.<init>()     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            es2.a r9 = r1.f286573o     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            java.lang.String r9 = r9.mo136951c()     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            r8.append(r9)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            es2.a r9 = r1.f286573o     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            java.lang.String r9 = r9.mo136954f()     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            r8.append(r9)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            r11.<init>()     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            java.lang.String r12 = "getdatabegin "
            r11.append(r12)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            r11.append(r9)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            r9 = 1
            java.io.OutputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106429K(r8, r9)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            com.tencent.mm.pointers.PString r13 = r1.f286560C     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r13.value = r2     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r13 = r18
            r14 = 0
            r15 = 1
        L_0x0055:
            int r6 = r13.read(r0)     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r9 = -1
            r16 = r8
            r7 = 0
            if (r6 == r9) goto L_0x00e4
            long r13 = r1.f286563F     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x006e
            long r7 = r1.f286564G     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r7)     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r1.f286563F = r7     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
        L_0x006e:
            int r7 = r1.f286561D     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            if (r6 <= r7) goto L_0x007a
            r1.f286561D = r6     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r1.f286562E = r7     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
        L_0x007a:
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.xx0()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            boolean r7 = vr2.C102236a0.m134751j0(r7)     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            if (r7 != 0) goto L_0x00a1
            java.lang.String r0 = "read data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r10.close()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r18.close()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r10.close()     // Catch:{ IOException -> 0x0095 }
            r7 = 0
            goto L_0x009d
        L_0x0095:
            r0 = move-exception
            r6 = r0
            r7 = 0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r2, r0)
        L_0x009d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r7
        L_0x00a1:
            r7 = 0
            r10.write(r0, r7, r6)     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            int r7 = r1.f286570M     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            int r7 = r7 + r6
            r1.f286570M = r7     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            int r6 = r1.f286602O     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            int r7 = r7 - r6
            r6 = 409600(0x64000, float:5.73972E-40)
            int r6 = r6 * r15
            if (r7 <= r6) goto L_0x00c8
            com.tencent.mm.plugin.sns.model.e r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            es2.a r7 = r1.f286573o     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            java.lang.String r7 = r7.f286538b     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r8 = r16
            r6.mo130995t(r7, r8)     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            int r6 = r1.f286570M     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r1.f286602O = r6     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            int r15 = r15 + 1
            goto L_0x00ca
        L_0x00c8:
            r8 = r16
        L_0x00ca:
            int r6 = r1.f286570M     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            com.tencent.mm.pointers.PString r7 = r1.f286560C     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            boolean r6 = r1.mo136967v(r6, r11, r7)     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            if (r6 == 0) goto L_0x00de
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            r13 = r18
            r9 = 1
            r14 = 0
            goto L_0x0055
        L_0x00de:
            r13 = r18
            r9 = 1
            r14 = 1
            goto L_0x0055
        L_0x00e4:
            r10.close()     // Catch:{ Exception -> 0x012c, all -> 0x0128 }
            if (r14 == 0) goto L_0x00f0
            int r0 = r1.f286570M     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            com.tencent.mm.pointers.PString r6 = r1.f286560C     // Catch:{ Exception -> 0x0133, all -> 0x012f }
            r1.mo136967v(r0, r7, r6)     // Catch:{ Exception -> 0x0133, all -> 0x012f }
        L_0x00f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            es2.a r2 = r1.f286573o
            java.lang.String r2 = r2.mo136951c()
            r0.append(r2)
            es2.a r2 = r1.f286573o
            java.lang.String r2 = r2.mo136954f()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getdataend2  "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r0 = 1
            return r0
        L_0x0128:
            r0 = move-exception
            r7 = r0
            r6 = r10
            goto L_0x0169
        L_0x012c:
            r0 = move-exception
            r6 = r10
            goto L_0x0135
        L_0x012f:
            r0 = move-exception
            r7 = r0
            r6 = 0
            goto L_0x0169
        L_0x0133:
            r0 = move-exception
            r6 = 0
        L_0x0135:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0167 }
            r7.<init>()     // Catch:{ all -> 0x0167 }
            java.lang.String r8 = "snscdndownload fail : "
            r7.append(r8)     // Catch:{ all -> 0x0167 }
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x0167 }
            r7.append(r8)     // Catch:{ all -> 0x0167 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0167 }
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0167 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r7, r9)     // Catch:{ all -> 0x0167 }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x0167 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r7)     // Catch:{ all -> 0x0167 }
            if (r6 == 0) goto L_0x0163
            r6.close()     // Catch:{ IOException -> 0x015c }
            goto L_0x0163
        L_0x015c:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r2, r0)
        L_0x0163:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r8
        L_0x0167:
            r0 = move-exception
            r7 = r0
        L_0x0169:
            if (r6 == 0) goto L_0x0177
            r6.close()     // Catch:{ IOException -> 0x016f }
            goto L_0x0177
        L_0x016f:
            r0 = move-exception
            r6 = r0
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r2, r0)
        L_0x0177:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.C97700d.mo136969x(java.io.InputStream, java.util.Map):boolean");
    }
}
