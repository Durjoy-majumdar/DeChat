package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import gt0.C87327c0;
import hp3.C87581a;

/* renamed from: gk0.m */
public final class C87248m<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f252951a;

    /* renamed from: b */
    public final /* synthetic */ C87237e f252952b;

    /* renamed from: c */
    public final /* synthetic */ C87327c0 f252953c;

    public C87248m(C83780d1 d1Var, C87237e eVar, C87327c0 c0Var) {
        this.f252951a = d1Var;
        this.f252952b = eVar;
        this.f252953c = c0Var;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            op3.b r1 = (op3.C117877b) r1
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r0.f252951a
            java.lang.String r3 = "component"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.Class<ik0.a$b> r3 = ik0.C87744a.C87747b.class
            ra.b r3 = r2.mo109668l(r3)
            ik0.a$b r3 = (ik0.C87744a.C87747b) r3
            if (r3 == 0) goto L_0x001d
            ik0.a r3 = r3.Bq0(r2)
            if (r3 != 0) goto L_0x0023
        L_0x001d:
            ik0.a$a$a r3 = ik0.C87744a.C87745a.f254040a
            ik0.a r3 = r3.Bq0(r2)
        L_0x0023:
            gk0.e r2 = r0.f252952b
            com.tencent.mm.plugin.appbrand.page.d1 r10 = r0.f252951a
            gt0.c0 r4 = r0.f252953c
            zq0.l0 r5 = zq0.C91893l0.f263119a
            java.lang.String r6 = r10.getAppId()
            java.lang.String r7 = "env.appId"
            gy3.C87412m.m108593f(r6, r7)
            zq0.k0 r11 = r5.mo125719a(r6)
            gk0.l r5 = new gk0.l
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r0.f252951a
            r5.<init>(r6)
            r2.getClass()
            java.lang.Class<wi0.l> r6 = wi0.C90988l.class
            r12 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.Object r7 = r1.mo182596a(r12)
            java.util.List r7 = (java.util.List) r7
            r14 = r7
            goto L_0x0050
        L_0x004f:
            r14 = 0
        L_0x0050:
            r15 = 1
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r1.mo182596a(r15)
            gk0.e$a r1 = (gk0.C87237e.C87238a) r1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            lp3.b r9 = lp3.C88643g.m110545c()
            gt0.o0 r7 = r10.getDialogContainer()
            if (r7 == 0) goto L_0x0068
            r7.mo121777a(r4)
        L_0x0068:
            com.tencent.mm.plugin.appbrand.jsapi.m r4 = r10.mo109671p(r6)
            wi0.l r4 = (wi0.C90988l) r4
            java.lang.String r4 = r4.f261061d
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x0075
            r4 = r7
        L_0x0075:
            r3.setAppBrandName(r4)
            com.tencent.mm.plugin.appbrand.jsapi.m r4 = r10.mo109671p(r6)
            wi0.l r4 = (wi0.C90988l) r4
            java.lang.String r4 = r4.f261063f
            if (r4 != 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r7 = r4
        L_0x0084:
            r3.setIconUrl(r7)
            if (r1 == 0) goto L_0x0094
            te3.rw3 r4 = r1.f252926a
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r4.f259827i
            if (r4 == 0) goto L_0x0094
            r3.setDialogSubDesc(r4)
        L_0x0094:
            if (r1 == 0) goto L_0x00a1
            te3.rw3 r4 = r1.f252926a
            if (r4 == 0) goto L_0x00a1
            java.lang.String r4 = r4.f259823e
            if (r4 == 0) goto L_0x00a1
            r3.setDialogRequestDesc(r4)
        L_0x00a1:
            if (r1 == 0) goto L_0x00aa
            java.lang.String r4 = r1.f252928c
            if (r4 == 0) goto L_0x00aa
            r3.setDialogApplyWording(r4)
        L_0x00aa:
            gk0.t r4 = new gk0.t
            r4.<init>(r11, r9)
            r3.setOnDeny(r4)
            gk0.u r4 = new gk0.u
            r4.<init>(r11, r9)
            r3.setOnCancel(r4)
            gk0.v r4 = new gk0.v
            r4.<init>(r5)
            r3.setOnAccept(r4)
            gk0.y r4 = new gk0.y
            r4.<init>(r11, r10, r3)
            r3.setOnAddPhoneNumber(r4)
            gk0.b0 r4 = new gk0.b0
            r4.<init>(r11, r10, r3)
            r3.setOnManagePhoneNumber(r4)
            gk0.d0 r8 = new gk0.d0
            r4 = r8
            r5 = r11
            r6 = r3
            r7 = r10
            r13 = r8
            r8 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r3.setOnPhoneItemSelect(r13)
            boolean r2 = r2.mo121654w(r10, r1)
            if (r2 == 0) goto L_0x00f2
            r3.mo121482E(r15)
            gk0.s r2 = new gk0.s
            r2.<init>(r11, r3, r10, r1)
            r3.setOnExplain(r2)
            goto L_0x00f5
        L_0x00f2:
            r3.mo121482E(r12)
        L_0x00f5:
            boolean r2 = r14 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00fd
            r13 = r14
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            goto L_0x00fe
        L_0x00fd:
            r13 = 0
        L_0x00fe:
            if (r13 != 0) goto L_0x0105
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0105:
            r3.setPhoneItems(r13)
            if (r1 == 0) goto L_0x0134
            te3.gp4 r1 = r1.f252929d
            if (r1 == 0) goto L_0x0134
            boolean r2 = r1.f183354d
            if (r2 == 0) goto L_0x0134
            java.lang.String r2 = r1.f183355e
            java.lang.String r4 = "privacyProtectInfo.wording"
            gy3.C87412m.m108593f(r2, r4)
            boolean r2 = z04.C112551y.m153811k(r2)
            r2 = r2 ^ r15
            if (r2 == 0) goto L_0x0134
            java.lang.String r1 = r1.f183355e
            gy3.C87412m.m108593f(r1, r4)
            r3.setUserAgreementCheckBoxWording(r1)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.j0> r1 = com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0.class
            ra.b r1 = r10.mo109668l(r1)
            com.tencent.mm.plugin.appbrand.jsapi.j0 r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0) r1
            r3.setIExternalToolsHelper(r1)
        L_0x0134:
            r3.mo121451o(r10)
            com.tencent.mm.plugin.appbrand.jsapi.p$a r1 = new com.tencent.mm.plugin.appbrand.jsapi.p$a
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.String r3 = "ok"
            r1.<init>((java.lang.String) r3, (java.lang.Object[]) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gk0.C87248m.call(java.lang.Object):java.lang.Object");
    }
}
