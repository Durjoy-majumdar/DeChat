package xb3;

import com.tencent.p014mm.network.C1311n;
import eb0.C116724d4;
import ob0.C117747y;

/* renamed from: xb3.i */
public final class C15636i implements C116724d4.C116726b {

    /* renamed from: xb3.i$a */
    public static final class C15637a implements C1311n {

        /* renamed from: d */
        public final C1311n f42266d;

        /* renamed from: e */
        public final C117747y f42267e;

        public C15637a(C1311n nVar, C117747y yVar) {
            this.f42266d = nVar;
            this.f42267e = yVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
            r0 = r12.getUri();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onGYNetEnd(int r8, int r9, int r10, java.lang.String r11, com.tencent.p014mm.network.C114799u r12, byte[] r13) {
            /*
                r7 = this;
                com.tencent.mm.network.n r0 = r7.f42266d
                if (r0 == 0) goto L_0x000d
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.onGYNetEnd(r1, r2, r3, r4, r5, r6)
            L_0x000d:
                r8 = 1
                r13 = 0
                if (r12 == 0) goto L_0x0021
                java.lang.String r0 = r12.getUri()
                if (r0 == 0) goto L_0x0021
                java.lang.String r1 = "mmpay-bin"
                boolean r0 = z04.C112550d0.m153801u(r0, r1, r13)
                if (r0 != r8) goto L_0x0021
                r0 = 1
                goto L_0x0022
            L_0x0021:
                r0 = 0
            L_0x0022:
                if (r0 == 0) goto L_0x00d9
                if (r9 == 0) goto L_0x00d9
                if (r10 == 0) goto L_0x00d9
                if (r12 == 0) goto L_0x003a
                java.lang.String r0 = r12.getUri()
                if (r0 == 0) goto L_0x003a
                java.lang.String r1 = "/cgi-bin/mmpay-bin/cpucardgetconfig2"
                boolean r0 = r0.equals(r1)
                if (r0 != r8) goto L_0x003a
                r0 = 1
                goto L_0x003b
            L_0x003a:
                r0 = 0
            L_0x003b:
                java.lang.String r1 = "WcPayReport"
                if (r0 == 0) goto L_0x004d
                java.lang.String r0 = "autoauth_errmsg_"
                boolean r0 = gy3.C87412m.m108589b(r0, r11)
                if (r0 == 0) goto L_0x004d
                java.lang.String r8 = "ignore bad case"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)
                return
            L_0x004d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "report pay cgi error: "
                r0.append(r2)
                java.lang.String r2 = r12.getUri()
                r0.append(r2)
                java.lang.String r2 = ", errCode: "
                r0.append(r2)
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                java.lang.String r12 = r12.getUri()
                java.lang.String r0 = "rr.uri"
                gy3.C87412m.m108593f(r12, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r9)
                r9 = 58
                r0.append(r9)
                r0.append(r10)
                java.lang.String r9 = r0.toString()
                java.lang.String r10 = "errorCode"
                gy3.C87412m.m108594g(r9, r10)
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r0 = 8
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "1"
                r0[r13] = r1
                r0[r8] = r12
                r12 = 2
                r0[r12] = r9
                r9 = 3
                r0[r9] = r11
                r9 = 4
                java.lang.String r11 = ""
                r0[r9] = r11
                boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r11 = 5
                r0[r11] = r9
                r9 = 6
                boolean r11 = lg3.C76695c.m92341b()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r0[r9] = r11
                r9 = 7
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                float r11 = kg3.C76577a.m92165p(r11)
                r12 = 1065353216(0x3f800000, float:1.0)
                int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                if (r11 <= 0) goto L_0x00cd
                goto L_0x00ce
            L_0x00cd:
                r8 = 0
            L_0x00ce:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r9] = r8
                r8 = 24610(0x6022, float:3.4486E-41)
                r10.mo160131h(r8, r0)
            L_0x00d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xb3.C15636i.C15637a.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
        }
    }

    /* renamed from: j2 */
    public C1311n mo14382j2(C1311n nVar, C117747y yVar) {
        return new C15637a(nVar, yVar);
    }

    /* renamed from: s4 */
    public int mo14383s4(C117747y yVar) {
        return 0;
    }
}
