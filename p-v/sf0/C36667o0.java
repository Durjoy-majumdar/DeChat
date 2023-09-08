package sf0;

import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: sf0.o0 */
public final class C36667o0 {

    /* renamed from: b */
    public static final C36668a f97456b = new C36668a((C8480h) null);

    /* renamed from: a */
    public final String f97457a;

    /* renamed from: sf0.o0$a */
    public static final class C36668a {
        public C36668a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo60791a(java.lang.String r6) {
            /*
                r5 = this;
                java.lang.String r0 = "expt"
                gy3.C87412m.m108594g(r6, r0)
                oa1.d r0 = oa1.C117731d.m166007c()
                r1 = 0
                int r0 = r0.mo182443e(r6, r1, r1, r1)
                r2 = 1
                if (r0 == r2) goto L_0x0039
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 != 0) goto L_0x0033
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r0 != 0) goto L_0x0027
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r0 != 0) goto L_0x0027
                int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                r3 = 788529167(0x2f00000f, float:1.1641553E-10)
                if (r0 != r3) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r0 = 0
                goto L_0x0028
            L_0x0027:
                r0 = 1
            L_0x0028:
                if (r0 != 0) goto L_0x0033
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r0 = 0
                goto L_0x0034
            L_0x0033:
                r0 = 1
            L_0x0034:
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = 0
                goto L_0x003a
            L_0x0039:
                r0 = 1
            L_0x003a:
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                r3[r1] = r4
                r3[r2] = r6
                java.lang.String r6 = "MicroMsg.NetThreadWorker"
                java.lang.String r1 = "enableThreadPool:%b expt:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sf0.C36667o0.C36668a.mo60791a(java.lang.String):boolean");
        }
    }

    public C36667o0(String str) {
        C87412m.m108594g(str, "expt");
        this.f97457a = str;
    }

    /* renamed from: a */
    public final void mo60790a(Runnable runnable, long j, boolean z) {
        C87412m.m108594g(runnable, "runnable");
        if (!z || !f97456b.mo60791a(this.f97457a)) {
            C86709a0.m107525e().postToWorkerDelayed(runnable, j);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183879j(runnable, j, this.f97457a);
    }
}
