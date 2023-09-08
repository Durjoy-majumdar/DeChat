package bh1;

import fy3.C32224a;
import gy3.C87413o;
import te3.C64273c21;
import yg1.C39016i;

/* renamed from: bh1.a */
public final class C28315a implements C39016i {

    /* renamed from: bh1.a$a */
    public static final class C28316a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ int f77921d;

        /* renamed from: e */
        public final /* synthetic */ int f77922e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28316a(int i, int i2) {
            super(0);
            this.f77921d = i;
            this.f77922e = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002a, code lost:
            r1 = r1.f154420q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "errCode:"
                r0.append(r1)
                int r1 = r3.f77921d
                r0.append(r1)
                java.lang.String r1 = " errType:"
                r0.append(r1)
                int r1 = r3.f77922e
                r0.append(r1)
                java.lang.String r1 = " localId:"
                r0.append(r1)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.u> r2 = cl1.C55001u.class
                androidx.lifecycle.i0 r1 = r1.mo77630e(r2)
                cl1.u r1 = (cl1.C55001u) r1
                if (r1 == 0) goto L_0x0035
                te3.c21 r1 = r1.f154420q
                if (r1 == 0) goto L_0x0035
                long r1 = r1.f182392d
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                goto L_0x0036
            L_0x0035:
                r1 = 0
            L_0x0036:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bh1.C28315a.C28316a.invoke():java.lang.Object");
        }
    }

    /* renamed from: bh1.a$b */
    public static final class C28317b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ int f77923d;

        /* renamed from: e */
        public final /* synthetic */ int f77924e;

        /* renamed from: f */
        public final /* synthetic */ C64273c21 f77925f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28317b(int i, int i2, C64273c21 c212) {
            super(0);
            this.f77923d = i;
            this.f77924e = i2;
            this.f77925f = c212;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("errCode:");
            sb.append(this.f77923d);
            sb.append(" errType:");
            sb.append(this.f77924e);
            sb.append(" svrId:");
            C64273c21 c212 = this.f77925f;
            sb.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
            return sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = r0.f105072a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo55917a(yg1.C39014a r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "cgiResp"
            gy3.C87412m.m108594g(r0, r1)
            int r1 = r0.f105068a
            int r2 = r0.f105069b
            yg1.a$a r0 = r0.f105070c
            if (r0 == 0) goto L_0x0016
            te3.ao0 r0 = r0.f105072a
            if (r0 == 0) goto L_0x0016
            te3.c21 r0 = r0.f130678f
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            ft1.a r12 = ft1.C59319a.f169618b
            r13 = 0
            if (r0 == 0) goto L_0x0020
            long r3 = r0.f182392d
            goto L_0x0021
        L_0x0020:
            r3 = r13
        L_0x0021:
            r15 = 0
            r16 = 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r6 = 0
            r7 = 0
            r8 = 0
            bh1.a$a r9 = new bh1.a$a
            r9.<init>(r1, r2)
            r10 = 28
            r11 = 0
            java.lang.String r4 = "liveHeartBeatSvrErr"
            r3 = r12
            o40.C11348f.C11349a.m11178b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r3.mo77630e(r4)
            cl1.u r3 = (cl1.C55001u) r3
            if (r3 == 0) goto L_0x004f
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x004f
            long r3 = r3.f182392d
            goto L_0x0050
        L_0x004f:
            r3 = r13
        L_0x0050:
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r6 = 0
            r7 = 0
            r8 = 0
            bh1.a$b r9 = new bh1.a$b
            r9.<init>(r1, r2, r0)
            r10 = 28
            r11 = 0
            java.lang.String r4 = "liveHeartBeatLocalErr"
            r3 = r12
            o40.C11348f.C11349a.m11178b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: bh1.C28315a.mo55917a(yg1.a):boolean");
    }
}
