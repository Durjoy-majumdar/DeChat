package com.tencent.p014mm.lib.riskscanner;

import com.tencent.p014mm.util.HotpotService;

/* renamed from: com.tencent.mm.lib.riskscanner.RiskScannerReqBufferService */
public class RiskScannerReqBufferService extends HotpotService {

    /* renamed from: f */
    public static final /* synthetic */ int f343955f = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.io.StringWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.PrintWriter} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa A[SYNTHETIC, Splitter:B:22:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo118517b(int r12, android.os.Bundle r13, android.os.Bundle r14) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != r0) goto L_0x00b5
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2 = 0
            r1[r2] = r12
            r1[r0] = r13
            java.lang.String r12 = "MicroMsg.RiskScannerReqBufferService"
            java.lang.String r13 = "invoke with op: %s, with arg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r1)
            android.content.Context r12 = r11.getApplicationContext()
            java.lang.String r13 = "MicroMsg.RiskScannerReportService"
            java.lang.ThreadLocal<java.lang.Long> r1 = s40.C118270a.f353488a     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "Report scan triggering."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)     // Catch:{ all -> 0x0046 }
            kj2.d r3 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0046 }
            r4 = 590(0x24e, double:2.915E-321)
            r6 = 0
            r8 = 1
            r10 = 1
            r3.idkeyStat(r4, r6, r8, r10)     // Catch:{ all -> 0x0046 }
            java.lang.ThreadLocal<java.lang.Long> r1 = s40.C118270a.f353488a     // Catch:{ all -> 0x0046 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x0046 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0046 }
            r1.set(r3)     // Catch:{ all -> 0x0046 }
            s40.b r1 = new s40.b     // Catch:{ all -> 0x0046 }
            r1.<init>(r11, r14)     // Catch:{ all -> 0x0046 }
            ts3.C118508c.m167173a(r12, r1)     // Catch:{ all -> 0x0046 }
            goto L_0x00b5
        L_0x0046:
            r12 = move-exception
            java.lang.ThreadLocal<java.lang.Long> r14 = s40.C118270a.f353488a
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String r1 = r12.getMessage()
            r14[r2] = r1
            java.lang.String r1 = "Report an exception with message: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r14)
            java.lang.ThreadLocal<java.lang.Long> r13 = s40.C118270a.f353488a
            r13.remove()
            kj2.d r13 = kj2.C117407d.INSTANCE
            r4 = 590(0x24e, double:2.915E-321)
            r6 = 4
            r8 = 1
            r10 = 1
            r3 = r13
            r3.idkeyStat(r4, r6, r8, r10)
            r14 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x00a2 }
            r3.<init>(r1)     // Catch:{ all -> 0x00a2 }
            r12.printStackTrace(r3)     // Catch:{ all -> 0x009f }
            r3.flush()     // Catch:{ all -> 0x009f }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x009f }
            java.lang.String r14 = ","
            java.lang.String r4 = "##"
            java.lang.String r12 = r12.replace(r14, r4)     // Catch:{ all -> 0x009f }
            r14 = 14177(0x3761, float:1.9866E-41)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r4.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = "-1,"
            r4.append(r5)     // Catch:{ all -> 0x009f }
            r4.append(r12)     // Catch:{ all -> 0x009f }
            java.lang.String r12 = r4.toString()     // Catch:{ all -> 0x009f }
            r13.mo160126c(r14, r12, r2, r0)     // Catch:{ all -> 0x009f }
            r1.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b2
        L_0x009f:
            r14 = r3
            goto L_0x00a3
        L_0x00a2:
        L_0x00a3:
            r12 = r14
            r14 = r1
            goto L_0x00a8
        L_0x00a6:
            r12 = r14
        L_0x00a8:
            if (r14 == 0) goto L_0x00af
            r14.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00af
        L_0x00ae:
        L_0x00af:
            if (r12 == 0) goto L_0x00b5
            r3 = r12
        L_0x00b2:
            r3.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.lib.riskscanner.RiskScannerReqBufferService.mo118517b(int, android.os.Bundle, android.os.Bundle):void");
    }
}
