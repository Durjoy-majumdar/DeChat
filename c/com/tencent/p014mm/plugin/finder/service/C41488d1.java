package com.tencent.p014mm.plugin.finder.service;

import fy3.C32229r;
import hp3.C87581a;
import ht1.C46111l4;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.service.d1 */
public final class C41488d1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C56303z0 f111730a;

    /* renamed from: b */
    public final /* synthetic */ int f111731b;

    /* renamed from: c */
    public final /* synthetic */ String f111732c;

    /* renamed from: d */
    public final /* synthetic */ String f111733d;

    /* renamed from: e */
    public final /* synthetic */ long f111734e;

    /* renamed from: f */
    public final /* synthetic */ long f111735f;

    /* renamed from: g */
    public final /* synthetic */ C46111l4.C33059a f111736g;

    /* renamed from: h */
    public final /* synthetic */ C32229r<String, Integer, Integer, String, C13598b0> f111737h;

    public C41488d1(C56303z0 z0Var, int i, String str, String str2, long j, long j2, C46111l4.C33059a aVar, C32229r<? super String, ? super Integer, ? super Integer, ? super String, C13598b0> rVar) {
        this.f111730a = z0Var;
        this.f111731b = i;
        this.f111732c = str;
        this.f111733d = str2;
        this.f111734e = j;
        this.f111735f = j2;
        this.f111736g = aVar;
        this.f111737h = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = r0.f140840e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r15) {
        /*
            r14 = this;
            ob0.b$c r15 = (ob0.C89132b.C89134c) r15
            int r0 = r15.f256793a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0167
            int r2 = r15.f256794b
            if (r2 != 0) goto L_0x0167
            T r0 = r15.f256796d
            te3.yo0 r0 = (te3.C52144yo0) r0
            te3.rd1 r0 = r0.f145433g
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r0.f140840e
            if (r0 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = r0
            goto L_0x001c
        L_0x001b:
            r3 = r1
        L_0x001c:
            te3.tg1 r0 = new te3.tg1
            r0.<init>()
            T r2 = r15.f256796d
            te3.yo0 r2 = (te3.C52144yo0) r2
            te3.rd1 r2 = r2.f145433g
            if (r2 == 0) goto L_0x0036
            pe3.b r2 = r2.f140843h
            if (r2 == 0) goto L_0x0036
            byte[] r2 = r2.mo123703f()
            pe3.a r2 = r0.parseFrom(r2)
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            java.lang.String r4 = "Finder.SessionInfoService"
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "extInfo is null! "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
        L_0x0040:
            int r2 = r0.f142212e
            r5 = 1
            r2 = r2 & r5
            r6 = 0
            if (r2 <= 0) goto L_0x0049
            r7 = 1
            goto L_0x004a
        L_0x0049:
            r7 = 0
        L_0x004a:
            T r2 = r15.f256796d
            te3.yo0 r2 = (te3.C52144yo0) r2
            te3.rd1 r2 = r2.f145433g
            if (r2 == 0) goto L_0x0056
            java.lang.String r8 = r2.f140839d
            if (r8 != 0) goto L_0x0057
        L_0x0056:
            r8 = r1
        L_0x0057:
            if (r2 == 0) goto L_0x005d
            int r2 = r2.f140844i
            r11 = r2
            goto L_0x005e
        L_0x005d:
            r11 = 0
        L_0x005e:
            int r2 = r14.f111731b
            r9 = 2
            r10 = 3
            if (r2 == r5) goto L_0x0079
            if (r2 == r9) goto L_0x0074
            if (r2 == r10) goto L_0x006d
            java.lang.String r2 = eb0.C75592q0.m90789s()
            goto L_0x007f
        L_0x006d:
            java.lang.String r2 = eb0.C75592q0.m90782l()
            r10 = r2
            r9 = 3
            goto L_0x0080
        L_0x0074:
            java.lang.String r2 = eb0.C75592q0.m90789s()
            goto L_0x007f
        L_0x0079:
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
        L_0x007f:
            r10 = r2
        L_0x0080:
            int r0 = r0.f142212e
            r0 = r0 & 4
            if (r0 <= 0) goto L_0x0088
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "[getSessionId] "
            r2.append(r12)
            java.lang.String r12 = r14.f111732c
            r2.append(r12)
            r12 = 44
            r2.append(r12)
            java.lang.String r13 = r14.f111733d
            r2.append(r13)
            r2.append(r12)
            long r12 = r14.f111734e
            r2.append(r12)
            r12 = 35
            r2.append(r12)
            long r12 = r14.f111735f
            r2.append(r12)
            java.lang.String r12 = " => "
            r2.append(r12)
            r2.append(r3)
            java.lang.String r12 = " enableAction="
            r2.append(r12)
            r2.append(r7)
            java.lang.String r12 = " from server. username is equal?"
            r2.append(r12)
            java.lang.String r12 = r14.f111732c
            boolean r12 = gy3.C87412m.m108589b(r8, r12)
            r2.append(r12)
            java.lang.String r12 = " followFlag="
            r2.append(r12)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            if (r2 == 0) goto L_0x0145
            int r2 = r8.length()
            if (r2 <= 0) goto L_0x00f4
            r2 = 1
            goto L_0x00f5
        L_0x00f4:
            r2 = 0
        L_0x00f5:
            if (r2 == 0) goto L_0x0145
            int r2 = r14.f111731b
            if (r2 != r5) goto L_0x012e
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85796D5(r8)
            if (r2 == 0) goto L_0x012e
            com.tencent.mm.plugin.finder.service.z0 r2 = r14.f111730a
            up1.l0 r2 = r2.wx0()
            java.lang.String r2 = r2.mo73556Lo(r8, r5)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0113
            r2 = 1
            goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            if (r2 == 0) goto L_0x012e
            java.lang.String r2 = "build session to alias, but local has save sessionId, the talker has rebuild alias , so delete old sessionInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.plugin.finder.service.z0 r2 = r14.f111730a
            up1.l0 r2 = r2.wx0()
            com.tencent.mm.plugin.finder.service.z0 r4 = r14.f111730a
            up1.l0 r4 = r4.wx0()
            java.lang.String r4 = r4.mo73556Lo(r8, r5)
            r2.mo73559jo(r4, r6)
        L_0x012e:
            com.tencent.mm.plugin.finder.service.z0 r2 = r14.f111730a
            up1.l0 r2 = r2.wx0()
            ht1.l4$a r12 = r14.f111736g
            r13 = 0
            java.lang.String r4 = "myUserName"
            gy3.C87412m.m108593f(r10, r4)
            r4 = r8
            r5 = r9
            r6 = r7
            r7 = r12
            r8 = r0
            r9 = r13
            r2.mo73558Yt(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0145:
            fy3.r<java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, rx3.b0> r0 = r14.f111737h
            T r2 = r15.f256796d
            te3.yo0 r2 = (te3.C52144yo0) r2
            te3.rd1 r2 = r2.f145433g
            if (r2 == 0) goto L_0x0155
            java.lang.String r2 = r2.f140840e
            if (r2 != 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r1 = r2
        L_0x0155:
            int r2 = r15.f256793a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r15.f256794b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r15 = r15.f256795c
            r0.mo162I(r1, r2, r3, r15)
            goto L_0x0178
        L_0x0167:
            fy3.r<java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, rx3.b0> r2 = r14.f111737h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r15.f256794b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r15 = r15.f256795c
            r2.mo162I(r1, r0, r3, r15)
        L_0x0178:
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C41488d1.call(java.lang.Object):java.lang.Object");
    }
}
