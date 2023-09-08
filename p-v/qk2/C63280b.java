package qk2;

import android.content.Context;
import java.lang.Thread;

/* renamed from: qk2.b */
public class C63280b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public String f179595a = "";

    /* renamed from: b */
    public String f179596b = "";

    /* renamed from: c */
    public Context f179597c;

    public C63280b(Context context) {
        this.f179597c = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00a6 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00a6 A[LOOP:1: B:8:0x00a6->B:9:?, LOOP_START, SYNTHETIC, Splitter:B:8:0x00a6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r11, java.lang.Throwable r12) {
        /*
            r10 = this;
            java.lang.String r11 = r11.getName()
            r10.f179596b = r11
            java.io.StringWriter r11 = new java.io.StringWriter
            r11.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r11)
            r12.printStackTrace(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = r11.toString()
            r12.append(r11)
            java.lang.String r11 = "\n"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.f179595a = r11
            int r11 = r11.length()
            int r11 = r11 / 512
            r12 = 1
            int r11 = r11 + r12
            long r0 = java.lang.System.nanoTime()
            r2 = 0
            r3 = 0
        L_0x0038:
            if (r3 >= r11) goto L_0x0098
            int r4 = r3 + 1
            int r5 = r4 * 512
            java.lang.String r6 = r10.f179595a
            int r6 = r6.length()
            if (r5 >= r6) goto L_0x004f
            java.lang.String r6 = r10.f179595a
            int r3 = r3 * 512
            java.lang.String r3 = r6.substring(r3, r5)
            goto L_0x0057
        L_0x004f:
            java.lang.String r5 = r10.f179595a
            int r3 = r3 * 512
            java.lang.String r3 = r5.substring(r3)
        L_0x0057:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 17910(0x45f6, float:2.5097E-41)
            r7 = 9
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = a70.C79471a.f233015c
            r7[r2] = r8
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            r7[r12] = r8
            r8 = 2
            java.lang.String r9 = r10.f179596b
            r7[r8] = r9
            r8 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r7[r8] = r9
            r8 = 4
            r7[r8] = r3
            r3 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r7[r3] = r8
            r3 = 6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r7[r3] = r8
            r3 = 7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7[r3] = r8
            r3 = 8
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r7[r3] = r8
            r5.mo160131h(r6, r7)
            r3 = r4
            goto L_0x0038
        L_0x0098:
            android.content.Context r11 = r10.f179597c
            android.content.Intent r12 = new android.content.Intent
            android.content.Context r0 = r10.f179597c
            java.lang.Class<com.tencent.mm.plugin.rubbishbin.RubbishBinServiceImpl> r1 = com.tencent.p014mm.plugin.rubbishbin.RubbishBinServiceImpl.class
            r12.<init>(r0, r1)
            r11.stopService(r12)
        L_0x00a6:
            android.os.Looper.loop()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: qk2.C63280b.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
