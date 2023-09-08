package iu1;

import p172io.flutter.plugin.report.FlutterAnrReport;

/* renamed from: iu1.a */
public class C117270a implements FlutterAnrReport.ReportCallback {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReport(java.lang.String r10, long r11) {
        /*
            r9 = this;
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.tencent.mm.autogen.mmdata.rpt.FlutterAnrReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FlutterAnrReportStruct
            r0.<init>()
            java.lang.String r1 = "StackTrace"
            r2 = 1
            java.lang.String r1 = r0.mo86045b(r1, r10, r2)
            r0.f343733d = r1
            r0.f343734e = r11
            com.tencent.mm.app.AppForegroundDelegate r11 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r11 = r11.f343454n
            if (r11 == 0) goto L_0x0020
            r11 = 1
            goto L_0x0022
        L_0x0020:
            r11 = 0
        L_0x0022:
            r0.f343735f = r11
            java.lang.String r11 = "1.0.0-5023-5ec677d6-wechat-2.10"
            int r11 = r11.length()
            if (r11 != 0) goto L_0x002e
            r11 = 1
            goto L_0x002f
        L_0x002e:
            r11 = 0
        L_0x002f:
            java.lang.String r12 = ""
            if (r11 == 0) goto L_0x0034
            goto L_0x0053
        L_0x0034:
            java.lang.String r11 = "-"
            java.lang.String[] r4 = new java.lang.String[]{r11}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.lang.String r3 = "1.0.0-5023-5ec677d6-wechat-2.10"
            java.util.List r11 = z04.C112550d0.m153785U(r3, r4, r5, r6, r7, r8)
            int r1 = r11.size()
            r3 = 3
            if (r1 <= r3) goto L_0x0053
            r12 = 2
            java.lang.Object r11 = r11.get(r12)
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
        L_0x0053:
            java.lang.String r11 = "Revision"
            java.lang.String r11 = r0.mo86045b(r11, r12, r2)
            r0.f343736g = r11
            r0.mo86054n()
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 30
            if (r11 < r12) goto L_0x0073
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r12 = "activity"
            java.lang.Object r11 = r11.getSystemService(r12)
            android.app.ActivityManager r11 = (android.app.ActivityManager) r11
            r11.appNotResponding(r10)
        L_0x0073:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "ANR happened\n"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "MicroMsg.FlutterAnrReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iu1.C117270a.onReport(java.lang.String, long):void");
    }
}
