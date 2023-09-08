package rw1;

import ob0.l0$$e;

/* renamed from: rw1.b */
public final class C48094b implements l0$$e {

    /* renamed from: d */
    public static final C48094b f128948d = new C48094b();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r1 = (r1 = r6.f127583d).f127895d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1488a(int r6, int r7, java.lang.String r8, ob0.C47350c r9, ob0.C117747y r10) {
        /*
            r5 = this;
            java.lang.String r10 = "GameAccountManager"
            r0 = 0
            if (r6 != 0) goto L_0x00f2
            if (r7 != 0) goto L_0x00f2
            ob0.c$d r7 = r9.f127056b
            pe3.a r7 = r7.f127083a
            if (r7 == 0) goto L_0x00f2
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.game.protobuf.GetUserGameCenterAccountInfoResponse"
            gy3.C87412m.m108592e(r7, r6)
            py1.p2 r7 = (py1.C47648p2) r7
            py1.b r6 = r7.f127922d
            r8 = -1
            if (r6 == 0) goto L_0x0025
            py1.o r1 = r6.f127583d
            if (r1 == 0) goto L_0x0025
            py1.s r1 = r1.f127895d
            if (r1 == 0) goto L_0x0025
            long r1 = r1.f127986f
            goto L_0x0026
        L_0x0025:
            r1 = r8
        L_0x0026:
            py1.l3 r7 = r7.f127923e
            rw1.C48093a.f128947c = r7
            if (r6 == 0) goto L_0x0037
            py1.o r6 = r6.f127583d
            if (r6 == 0) goto L_0x0037
            py1.s r6 = r6.f127895d
            if (r6 == 0) goto L_0x0037
            int r6 = r6.f127985e
            goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "gamelog.account, manage , handleCgiAccountState state = "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            if (r6 == 0) goto L_0x00a3
            r1 = 1
            if (r6 == r1) goto L_0x0074
            r7 = 2
            r8 = 3
            if (r6 == r7) goto L_0x006d
            if (r6 == r8) goto L_0x006d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r6)
            goto L_0x010e
        L_0x006d:
            rw1.C48093a.m53461b()
            rw1.C48093a.f128946b = r8
            goto L_0x010e
        L_0x0074:
            rw1.C48093a.f128946b = r1
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            long r1 = r6.mo119673G(r7, r8)
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0088
            goto L_0x010e
        L_0x0088:
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r10
            long r8 = r8 / r1
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.mo119677K(r7, r8)
            rw1.C48093a.m53460a()
            goto L_0x010e
        L_0x00a3:
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x00d0
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            long r3 = r6.mo119673G(r7, r8)
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x00b8
            goto L_0x010e
        L_0x00b8:
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x00c0
            rw1.C48093a.m53461b()
            goto L_0x00ef
        L_0x00c0:
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.mo119677K(r7, r8)
            goto L_0x00ef
        L_0x00d0:
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            long r1 = r6.mo119673G(r7, r8)
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x00ef
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.mo119677K(r7, r8)
        L_0x00ef:
            rw1.C48093a.f128946b = r0
            goto L_0x010e
        L_0x00f2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "gamelog.cgi getusergamecenteraccountinfo CGI return, errType = "
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = ", errCode = "
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r6)
        L_0x010e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rw1.C48094b.mo1488a(int, int, java.lang.String, ob0.c, ob0.y):int");
    }
}
