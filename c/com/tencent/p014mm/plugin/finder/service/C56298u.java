package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import ht1.C60179k4;
import rx3.C13601g;
import rx3.C36568h;
import up1.C65413c0;
import up1.C65414d0;

/* renamed from: com.tencent.mm.plugin.finder.service.u */
public final class C56298u implements C44668u3.C44670b {

    /* renamed from: d */
    public final C13601g f160904d = C36568h.m40985a(C56300b.f160907d);

    /* renamed from: e */
    public final C13601g f160905e = C36568h.m40985a(C56299a.f160906d);

    /* renamed from: com.tencent.mm.plugin.finder.service.u$a */
    public static final class C56299a extends C87413o implements C32224a<C65413c0> {

        /* renamed from: d */
        public static final C56299a f160906d = new C56299a();

        public C56299a() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Jx0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.u$b */
    public static final class C56300b extends C87413o implements C32224a<C65414d0> {

        /* renamed from: d */
        public static final C56300b f160907d = new C56300b();

        public C56300b() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Kx0();
        }
    }

    /* renamed from: J1 */
    public void mo433J1(C44668u3 u3Var, C72996z1 z1Var) {
    }

    /* renamed from: K4 */
    public int mo434K4(C72996z1 z1Var, boolean z) {
        if (z1Var == null) {
            return -1;
        }
        String username = z1Var.getUsername();
        boolean z2 = false;
        if (username == null || username.length() == 0) {
            return -1;
        }
        if (C72996z1.m85825X4(username)) {
            username = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(username);
        }
        if (z1Var.f149524Y == 2 || C72996z1.m85823W4(username) || C72996z1.m85817T4(username)) {
            z2 = true;
        }
        return !z2 ? -1 : 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r1 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.storage.C72996z1 get(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x000d
            int r2 = r8.length()
            if (r2 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            r3 = 0
            if (r2 == 0) goto L_0x0012
            return r3
        L_0x0012:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85825X4(r8)
            if (r2 == 0) goto L_0x0025
            java.lang.Class<ht1.k4> r2 = ht1.C60179k4.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.k4 r2 = (ht1.C60179k4) r2
            java.lang.String r2 = r2.mo78770n(r8)
            goto L_0x0026
        L_0x0025:
            r2 = r8
        L_0x0026:
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85823W4(r2)
            if (r4 != 0) goto L_0x003b
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85817T4(r2)
            if (r4 != 0) goto L_0x003b
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85821V4(r2)
            if (r4 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r4 = 0
            goto L_0x003c
        L_0x003b:
            r4 = 1
        L_0x003c:
            if (r4 != 0) goto L_0x003f
            return r3
        L_0x003f:
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85817T4(r2)
            java.lang.String r5 = "talker"
            if (r4 == 0) goto L_0x0057
            fe1.d$b r4 = fe1.C58961d.f168673a
            fe1.q r4 = r4.mo84155b(r2)
            if (r4 == 0) goto L_0x0055
            com.tencent.mm.storage.z1 r4 = fe1.C58969q.m68863s2(r4, r3, r1, r3)
            goto L_0x0092
        L_0x0055:
            r4 = r3
            goto L_0x0092
        L_0x0057:
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85823W4(r2)
            if (r4 == 0) goto L_0x0075
            rx3.g r4 = r7.f160904d
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            up1.d0 r4 = (up1.C65414d0) r4
            gy3.C87412m.m108593f(r2, r5)
            fe1.q r4 = r4.mo89501jo(r2)
            if (r4 == 0) goto L_0x0055
            com.tencent.mm.storage.z1 r4 = fe1.C58969q.m68863s2(r4, r3, r1, r3)
            goto L_0x0092
        L_0x0075:
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85821V4(r2)
            if (r4 == 0) goto L_0x0055
            rx3.g r4 = r7.f160905e
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            up1.c0 r4 = (up1.C65413c0) r4
            gy3.C87412m.m108593f(r2, r5)
            fe1.q r4 = r4.mo89497jo(r2)
            if (r4 == 0) goto L_0x0055
            com.tencent.mm.storage.z1 r4 = fe1.C58969q.m68863s2(r4, r3, r1, r3)
        L_0x0092:
            if (r4 == 0) goto L_0x00a4
            java.lang.String r6 = r4.getNickname()
            if (r6 == 0) goto L_0x00a2
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            if (r1 == 0) goto L_0x0103
        L_0x00a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "[get] contact is null or nickname is empty. nickname="
            r1.append(r6)
            if (r4 == 0) goto L_0x00b4
            java.lang.String r3 = r4.getNickname()
        L_0x00b4:
            r1.append(r3)
            java.lang.String r3 = " talker="
            r1.append(r3)
            gy3.C87412m.m108593f(r2, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 12
            java.lang.CharSequence r4 = r2.subSequence(r0, r4)
            r3.append(r4)
            java.lang.String r4 = "..."
            r3.append(r4)
            int r4 = r2.length()
            int r4 = r4 + -24
            int r5 = r2.length()
            java.lang.CharSequence r4 = r2.subSequence(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.ContactService"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            java.lang.Class<com.tencent.mm.plugin.finder.service.FinderContactService> r1 = com.tencent.p014mm.plugin.finder.service.FinderContactService.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.finder.service.FinderContactService r1 = (com.tencent.p014mm.plugin.finder.service.FinderContactService) r1
            r1.vx0(r2, r0)
            com.tencent.mm.storage.z1 r4 = new com.tencent.mm.storage.z1
            r4.<init>(r8)
        L_0x0103:
            r4.setUsername(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C56298u.get(java.lang.String):com.tencent.mm.storage.z1");
    }
}
