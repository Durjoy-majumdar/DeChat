package e11;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: e11.b */
public class C97572b {

    /* renamed from: a */
    public static final ThreadPoolExecutor f286287a = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m125735a(f11.C97792a r4, e11.C97571a r5, jp3.C9487b r6) {
        /*
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "MicroMsg.MsgFileMgr"
            java.lang.String r3 = "sumbit() item:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            int r1 = r4.mo137124h()
            if (r1 == r0) goto L_0x0031
            r0 = 2
            if (r1 == r0) goto L_0x002b
            r0 = 3
            if (r1 == r0) goto L_0x0025
            r0 = 4
            if (r1 == r0) goto L_0x001f
            r4 = 0
            goto L_0x0037
        L_0x001f:
            e11.d r0 = new e11.d
            r0.<init>(r4, r5, r6)
            goto L_0x0036
        L_0x0025:
            e11.g r0 = new e11.g
            r0.<init>(r4, r5, r6)
            goto L_0x0036
        L_0x002b:
            e11.f r0 = new e11.f
            r0.<init>(r4, r5, r6)
            goto L_0x0036
        L_0x0031:
            e11.e r0 = new e11.e
            r0.<init>(r4, r5, r6)
        L_0x0036:
            r4 = r0
        L_0x0037:
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "downloadTask is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            if (r5 == 0) goto L_0x0043
            r5.mo127399e()
        L_0x0043:
            return
        L_0x0044:
            boolean r6 = r4.mo136840g()
            if (r6 != 0) goto L_0x0055
            java.lang.String r4 = "downloadTask is invalid, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            if (r5 == 0) goto L_0x0054
            r5.mo127396b()
        L_0x0054:
            return
        L_0x0055:
            boolean r5 = r4.mo136839f()
            if (r5 != 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r5 = f286287a
            r5.submit(r4)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C97572b.m125735a(f11.a, e11.a, jp3.b):void");
    }
}
