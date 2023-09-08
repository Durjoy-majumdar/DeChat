package p212oe;

import android.content.Context;

/* renamed from: oe.q$$r */
public final /* synthetic */ class q$$r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f352256d;

    public /* synthetic */ q$$r(Context context) {
        this.f352256d = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:21|9|13|14|15|16|17|19) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            android.content.Context r0 = r13.f352256d
            java.lang.String r1 = "test"
            java.lang.String r2 = "framework"
            java.lang.String r3 = "custom"
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            oe.x r5 = new oe.x
            r5.<init>()
            r6 = 0
            java.lang.String r7 = "CUST_POLICY_DIRS"
            java.lang.String r7 = android.system.Os.getenv(r7)     // Catch:{ Exception -> 0x004f }
            java.lang.String r8 = ":"
            java.lang.String[] r7 = r7.split(r8)     // Catch:{ Exception -> 0x004f }
            int r8 = r7.length     // Catch:{ Exception -> 0x004f }
            r9 = 0
        L_0x0021:
            java.lang.String r10 = "/xml/power_profile.xml"
            if (r9 >= r8) goto L_0x0049
            r11 = r7[r9]     // Catch:{ Exception -> 0x004f }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x004f }
            r12.<init>(r11, r10)     // Catch:{ Exception -> 0x004f }
            boolean r10 = r12.exists()     // Catch:{ Exception -> 0x004f }
            if (r10 == 0) goto L_0x0046
            boolean r10 = r12.canRead()     // Catch:{ Exception -> 0x004f }
            if (r10 == 0) goto L_0x0046
            r5.mo182540e(r0, r12)     // Catch:{ Exception -> 0x004f }
            r5.mo182539d()     // Catch:{ Exception -> 0x004f }
            java.util.Map r7 = p212oe.C117774q.m166120c(r3, r5)     // Catch:{ Exception -> 0x004f }
            r4.put(r3, r7)     // Catch:{ Exception -> 0x004f }
            goto L_0x004f
        L_0x0046:
            int r9 = r9 + 1
            goto L_0x0021
        L_0x0049:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x004f }
            r3.<init>(r10)     // Catch:{ Exception -> 0x004f }
            throw r3     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            java.util.HashMap<java.lang.String, java.lang.Double> r3 = p212oe.C117781x.f352296b     // Catch:{ Exception -> 0x0068 }
            r3.clear()     // Catch:{ Exception -> 0x0068 }
            java.util.HashMap<java.lang.String, java.lang.Double[]> r3 = p212oe.C117781x.f352297c     // Catch:{ Exception -> 0x0068 }
            r3.clear()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "power_profile"
            r5.mo182541f(r0, r3)     // Catch:{ Exception -> 0x0068 }
            r5.mo182539d()     // Catch:{ Exception -> 0x0068 }
            java.util.Map r3 = p212oe.C117774q.m166120c(r2, r5)     // Catch:{ Exception -> 0x0068 }
            r4.put(r2, r3)     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            java.util.HashMap<java.lang.String, java.lang.Double> r2 = p212oe.C117781x.f352296b     // Catch:{ Exception -> 0x0081 }
            r2.clear()     // Catch:{ Exception -> 0x0081 }
            java.util.HashMap<java.lang.String, java.lang.Double[]> r2 = p212oe.C117781x.f352297c     // Catch:{ Exception -> 0x0081 }
            r2.clear()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "power_profile_test"
            r5.mo182541f(r0, r2)     // Catch:{ Exception -> 0x0081 }
            r5.mo182539d()     // Catch:{ Exception -> 0x0081 }
            java.util.Map r0 = p212oe.C117774q.m166120c(r1, r5)     // Catch:{ Exception -> 0x0081 }
            r4.put(r1, r0)     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r2 = "powerProfWatt"
            p988jj.C87968a.C87969a.C87970a.m109467a(r2, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.q$$r.run():void");
    }
}
