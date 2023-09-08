package ca3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

/* renamed from: ca3.a0 */
public final class C16883a0 {

    /* renamed from: a */
    public final C16884a f45630a = new C16884a(this);

    /* renamed from: ca3.a0$a */
    public final class C16884a {

        /* renamed from: a */
        public long f45631a;

        /* renamed from: b */
        public long f45632b;

        /* renamed from: c */
        public long f45633c;

        /* renamed from: d */
        public long f45634d;

        /* renamed from: e */
        public long f45635e;

        /* renamed from: f */
        public long f45636f;

        /* renamed from: g */
        public int f45637g;

        /* renamed from: h */
        public long f45638h;

        /* renamed from: i */
        public long f45639i;

        /* renamed from: j */
        public long f45640j;

        /* renamed from: k */
        public long f45641k;

        /* renamed from: l */
        public long f45642l;

        /* renamed from: m */
        public int f45643m;

        /* renamed from: n */
        public int f45644n;

        /* renamed from: o */
        public String f45645o = "";

        /* renamed from: p */
        public String f45646p = "";

        public C16884a(C16883a0 a0Var) {
        }

        /* renamed from: a */
        public final void mo17953a() {
            mo17954b("");
            this.f45631a = 0;
            this.f45633c = 0;
            this.f45632b = 0;
            this.f45634d = 0;
            this.f45635e = 0;
            this.f45636f = 0;
            this.f45637g = 0;
            this.f45639i = 0;
            this.f45640j = 0;
            this.f45638h = 0;
            this.f45641k = 0;
            this.f45642l = 0;
            this.f45643m = 0;
            this.f45644n = 0;
            this.f45645o = "";
        }

        /* renamed from: b */
        public final void mo17954b(String str) {
            C87412m.m108594g(str, "value");
            if (Util.isNullOrNil(str)) {
                str = "";
            } else if (str.length() > 512) {
                str = str.substring(0, 512);
                C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            this.f45646p = str;
        }
    }

    /* renamed from: a */
    public final void mo17951a(long j, String str) {
        if (str != null) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(1379, 14, 1, false);
            if (j > 0) {
                nVar.idkeyStat(1379, 15, 1, false);
                long j2 = j / 1024;
                nVar.idkeyStat(1379, 16, j2, false);
                Log.m105919d("MicroMsg.WebViewVideoProfileReport", "onVideoPathChanged, cachedSize:%s, cachedSizeInKB:%s", Long.valueOf(j), Long.valueOf(j2));
            }
            this.f45630a.mo17954b(str);
            this.f45630a.f45632b = j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r6 == null) goto L_0x0047;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17952b(p830xc.C91165a r23, in0.C87760d r24, java.lang.String r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            ca3.a0$a r3 = r0.f45630a
            long r4 = r3.f45635e
            long r6 = r3.f45634d
            java.lang.String r3 = "MicroMsg.WebViewVideoProfileReport"
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x001d
            java.lang.String r1 = "reportVideoProfile, wired case, ignore reporting and reset data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            ca3.a0$a r1 = r0.f45630a
            r1.mo17953a()
            return
        L_0x001d:
            boolean r4 = r1 instanceof ca3.C39934d
            r5 = 0
            if (r4 == 0) goto L_0x0026
            r6 = r1
            ca3.d r6 = (ca3.C39934d) r6
            goto L_0x0027
        L_0x0026:
            r6 = r5
        L_0x0027:
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0047
            t83.h1 r8 = r6.f107068b
            android.os.Bundle r8 = r8.f38992e
            if (r8 == 0) goto L_0x0044
            java.lang.String r9 = "name"
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L_0x0044
            t83.h1 r6 = r6.f107068b
            android.os.Bundle r6 = r6.f38992e
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0045
        L_0x0044:
            r6 = r5
        L_0x0045:
            if (r6 != 0) goto L_0x0048
        L_0x0047:
            r6 = r7
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r5 = r1
            ca3.d r5 = (ca3.C39934d) r5
        L_0x004d:
            if (r5 == 0) goto L_0x0062
            t83.h1 r1 = r5.f107068b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f38983a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r4 = "url"
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r7 = r1
        L_0x0062:
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r7)
            ca3.a0$a r4 = r0.f45630a
            java.lang.String r4 = r4.f45646p
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r4)
            boolean r5 = ym0.C91515l.m114819c(r24)
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.video.player.exo.ExoMediaPlayer"
            r8 = 0
            if (r5 == 0) goto L_0x0082
            gy3.C87412m.m108592e(r2, r7)
            r5 = r2
            kn0.k r5 = (kn0.C21365k) r5
            int r5 = r5.f60451O
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            boolean r9 = ym0.C91515l.m114819c(r24)
            if (r9 == 0) goto L_0x0092
            gy3.C87412m.m108592e(r2, r7)
            r9 = r2
            kn0.k r9 = (kn0.C21365k) r9
            int r9 = r9.f60452P
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            boolean r10 = ym0.C91515l.m114819c(r24)
            if (r10 == 0) goto L_0x00a1
            gy3.C87412m.m108592e(r2, r7)
            kn0.k r2 = (kn0.C21365k) r2
            int r2 = r2.f60453Q
            goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            ym0.j r7 = ym0.C91512j.m114810c()
            boolean r7 = r7.f262321e
            r10 = 1
            if (r7 == 0) goto L_0x00b5
            ym0.j r7 = ym0.C91512j.m114810c()
            boolean r7 = r7.f262322f
            if (r7 == 0) goto L_0x00b5
            r7 = 1
            goto L_0x00b6
        L_0x00b5:
            r7 = 0
        L_0x00b6:
            r11 = 16
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r25
            r12[r10] = r6
            ym0.j r13 = ym0.C91512j.m114810c()
            boolean r13 = r13.f262321e
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r14 = 2
            r12[r14] = r13
            ca3.a0$a r13 = r0.f45630a
            long r14 = r13.f45631a
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r14 = 3
            r12[r14] = r13
            ca3.a0$a r13 = r0.f45630a
            java.lang.String r15 = r13.f45646p
            r16 = 4
            r12[r16] = r15
            long r14 = r13.f45632b
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r14 = 5
            r12[r14] = r13
            ca3.a0$a r13 = r0.f45630a
            long r14 = r13.f45633c
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r14 = 6
            r12[r14] = r13
            ca3.a0$a r13 = r0.f45630a
            long r14 = r13.f45636f
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r14 = 7
            r12[r14] = r13
            ca3.a0$a r13 = r0.f45630a
            int r13 = r13.f45637g
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 8
            r12[r15] = r13
            ca3.a0$a r13 = r0.f45630a
            long r14 = r13.f45638h
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r14 = 9
            r12[r14] = r13
            ca3.a0$a r13 = r0.f45630a
            int r13 = r13.f45643m
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 10
            r12[r15] = r13
            ca3.a0$a r13 = r0.f45630a
            int r13 = r13.f45644n
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r17 = 11
            r12[r17] = r13
            ca3.a0$a r13 = r0.f45630a
            java.lang.String r13 = r13.f45645o
            r18 = 12
            r12[r18] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r19 = 13
            r12[r19] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r20 = 14
            r12[r20] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r21 = 15
            r12[r21] = r13
            java.lang.String r13 = "reportVideoProfile:%s, webComptName:%s, proxy:%s, playerCreateTime:%s, videoPath:%s, cachedSize:%s, duration:%s, prepareTime:%s, bufferCount:%s, bufferTime:%s, error(%s, %s, %s), minBufferMs:%s, maxBufferMs:%s, bufferForPlaybackMs:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r12)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 20
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r8] = r6
            r12[r10] = r1
            r1 = 2
            r12[r1] = r4
            ca3.a0$a r1 = r0.f45630a
            long r14 = r1.f45634d
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r6 = 3
            r12[r6] = r1
            ca3.a0$a r1 = r0.f45630a
            long r13 = r1.f45635e
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r12[r16] = r1
            ca3.a0$a r1 = r0.f45630a
            long r13 = r1.f45636f
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r6 = 5
            r12[r6] = r1
            ca3.a0$a r1 = r0.f45630a
            long r13 = r1.f45631a
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r6 = 6
            r12[r6] = r1
            ca3.a0$a r1 = r0.f45630a
            long r13 = r1.f45633c
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r6 = 7
            r12[r6] = r1
            ca3.a0$a r1 = r0.f45630a
            long r13 = r1.f45632b
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r6 = 8
            r12[r6] = r1
            ca3.a0$a r1 = r0.f45630a
            int r1 = r1.f45643m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 9
            r12[r6] = r1
            ca3.a0$a r1 = r0.f45630a
            int r1 = r1.f45644n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 10
            r12[r4] = r1
            ca3.a0$a r1 = r0.f45630a
            java.lang.String r1 = r1.f45645o
            r12[r17] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r12[r18] = r1
            ca3.a0$a r1 = r0.f45630a
            int r1 = r1.f45637g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r19] = r1
            ca3.a0$a r1 = r0.f45630a
            long r6 = r1.f45638h
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r12[r20] = r1
            ca3.a0$a r1 = r0.f45630a
            long r6 = r1.f45641k
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r12[r21] = r1
            ca3.a0$a r1 = r0.f45630a
            long r6 = r1.f45642l
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r12[r11] = r1
            r1 = 17
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r12[r1] = r4
            r1 = 18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r12[r1] = r4
            r1 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r1] = r2
            r1 = 19953(0x4df1, float:2.796E-41)
            r3.mo160131h(r1, r12)
            ca3.a0$a r1 = r0.f45630a
            r1.mo17953a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca3.C16883a0.mo17952b(xc.a, in0.d, java.lang.String):void");
    }
}
