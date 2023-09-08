package com.tencent.p014mm.app;

import com.tencent.p014mm.app.C80637z0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.app.a1 */
public class C80583a1 extends C80637z0.C80643f {

    /* renamed from: d */
    public final /* synthetic */ String f235750d;

    /* renamed from: e */
    public final /* synthetic */ boolean f235751e;

    /* renamed from: f */
    public final /* synthetic */ boolean f235752f;

    /* renamed from: g */
    public final /* synthetic */ C80637z0 f235753g;

    /* renamed from: com.tencent.mm.app.a1$a */
    public class C80584a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f235754d;

        /* renamed from: e */
        public final /* synthetic */ long f235755e;

        /* renamed from: f */
        public final /* synthetic */ long f235756f;

        /* renamed from: com.tencent.mm.app.a1$a$a */
        public class C80585a implements Runnable {
            public C80585a() {
            }

            public void run() {
                C80637z0 z0Var = C80583a1.this.f235753g;
                if (!z0Var.f235914D) {
                    z0Var.f235914D = true;
                    ((C119157j) C119157j.f356862d).mo183875f(z0Var.f235921K);
                }
            }
        }

        public C80584a(boolean z, long j, long j2) {
            this.f235754d = z;
            this.f235755e = j;
            this.f235756f = j2;
        }

        public void run() {
            C80583a1 a1Var;
            C80637z0 z0Var;
            long j;
            long j2;
            synchronized (C80583a1.this.f235753g.f235944z) {
                a1Var = C80583a1.this;
                z0Var = a1Var.f235753g;
                z0Var.f235944z[0] = this.f235754d;
            }
            if (a1Var.f235751e) {
                synchronized (z0Var.f235940v) {
                    C80583a1 a1Var2 = C80583a1.this;
                    C80637z0 z0Var2 = a1Var2.f235753g;
                    z0Var2.f235941w = a1Var2.f235752f;
                    j2 = this.f235755e;
                    z0Var2.f235942x = j2;
                    z0Var2.f235943y = this.f235756f;
                }
                C80611s0.m98247e("MicroMsg.StartupCostReporter", "[tomys] cold startup, tinkerLoadCost:%s, startupCost:%s", Long.valueOf(j2), Long.valueOf(this.f235756f));
            } else {
                synchronized (z0Var.f235911A) {
                    C80583a1 a1Var3 = C80583a1.this;
                    C80637z0 z0Var3 = a1Var3.f235753g;
                    z0Var3.f235912B = a1Var3.f235752f;
                    j = this.f235756f;
                    z0Var3.f235913C = j;
                }
                C80611s0.m98247e("MicroMsg.StartupCostReporter", "[tomys] hot startup, startupCost:%s", Long.valueOf(j));
            }
            C80583a1.this.f235753g.f235925d.post(new C80585a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80583a1(C80637z0 z0Var, String str, boolean z, boolean z2) {
        super((C80637z0.C80638a) null);
        this.f235753g = z0Var;
        this.f235750d = str;
        this.f235751e = z;
        this.f235752f = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112273b(android.view.View r14) {
        /*
            r13 = this;
            java.lang.String r0 = r13.f235750d
            java.lang.String r1 = "com.tencent.mm.ui.LauncherUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0011
            com.tencent.mm.app.z0 r0 = r13.f235753g
            com.tencent.mm.app.z0$h r1 = com.tencent.p014mm.app.C80637z0.C80646h.UNTIL_LAUNCHER_UI_FIRST_FRAME_END
            r0.mo112374e(r1)
        L_0x0011:
            com.tencent.mm.app.z0 r0 = r13.f235753g
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = android.os.SystemClock.uptimeMillis()
            boolean r4 = r13.f235751e
            com.tencent.mm.app.z0 r5 = r13.f235753g
            if (r4 == 0) goto L_0x0027
            long r5 = r5.f235929h
            goto L_0x0029
        L_0x0027:
            long r5 = r5.f235931j
        L_0x0029:
            if (r4 == 0) goto L_0x0033
            com.tencent.mm.app.z0 r4 = r13.f235753g
            long r8 = r4.f235929h
            long r10 = r4.f235928g
            long r8 = r8 - r10
            goto L_0x0035
        L_0x0033:
            r8 = 0
        L_0x0035:
            long r6 = r0 - r5
            com.tencent.mm.app.z0 r0 = r13.f235753g
            com.tencent.mm.app.z0$g r0 = r0.f235916F
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0064
            com.tencent.mm.app.e0 r0 = (com.tencent.p014mm.app.C28677e0) r0
            r0.getClass()
            f40.k0 r0 = f40.C31887k0.INSTANCE
            boolean[] r5 = r0.f84959d
            monitor-enter(r5)
            boolean[] r0 = r0.f84959d     // Catch:{ all -> 0x0061 }
            boolean r0 = r0[r4]     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = "MicroMsg.InfoCollectorForStartupCostReport"
            java.lang.String r10 = "isFirstStartup, result: %s"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            r11[r4] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r10, r11)
            if (r0 == 0) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x0064:
            r0 = 0
        L_0x0065:
            com.tencent.mm.app.z0 r5 = r13.f235753g
            r5.f235939u = r1
            com.tencent.mm.app.z0 r5 = r13.f235753g
            r5.f235938t = r1
            r5.f235937s = r4
            boolean r1 = r13.f235751e
            if (r1 == 0) goto L_0x0088
            long r10 = r5.f235930i
            long r2 = r2 - r10
            long r1 = r6 - r2
            r10 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0088
            java.lang.String r0 = "MicroMsg.StartupCostReporter"
            java.lang.String r1 = "[tomys] Hibernate happened during startup, ignore report this time."
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.tencent.p014mm.app.C80611s0.m98248f(r0, r1, r2)
            return
        L_0x0088:
            zt3.t r10 = zt3.C119157j.f356862d
            com.tencent.mm.app.a1$a r11 = new com.tencent.mm.app.a1$a
            r1 = r11
            r2 = r13
            r3 = r0
            r4 = r8
            r1.<init>(r3, r4, r6)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMillis(r1)
            zt3.j r10 = (zt3.C119157j) r10
            r10.mo183878i(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80583a1.mo112273b(android.view.View):void");
    }
}
