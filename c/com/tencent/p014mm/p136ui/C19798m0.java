package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import fy3.C32226l;
import ht1.C60200t1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.m0 */
public class C19798m0 implements C32226l<C2458a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderIconViewTipPreference f56330d;

    /* renamed from: e */
    public final /* synthetic */ C60200t1 f56331e;

    /* renamed from: f */
    public final /* synthetic */ FindMoreFriendsUI f56332f;

    public C19798m0(FindMoreFriendsUI findMoreFriendsUI, FinderIconViewTipPreference finderIconViewTipPreference, C60200t1 t1Var) {
        this.f56332f = findMoreFriendsUI;
        this.f56330d = finderIconViewTipPreference;
        this.f56331e = t1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            com.tencent.mm.plugin.finder.extension.reddot.a r1 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2458a) r1
            java.lang.Class<er.n> r2 = p151er.C75651n.class
            di3.d r3 = di3.C86312j.m106911c(r2)
            er.n r3 = (p151er.C75651n) r3
            int r3 = r3.sk0()
            if (r1 != 0) goto L_0x0018
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0228
        L_0x0018:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7 = 1
            r4[r7] = r6
            java.lang.String r6 = "MicroMsg.FindMoreFriendsUI"
            java.lang.String r8 = "[onChanged] result=%s testMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r4)
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.t1 r4 = (ht1.C60200t1) r4
            ht1.b4 r4 = r4.Nt0()
            java.lang.Class<ht1.v4> r8 = ht1.C8808v4.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ht1.v4 r8 = (ht1.C8808v4) r8
            boolean r8 = r8.mo9636zX()
            if (r8 == 0) goto L_0x006c
            com.tencent.mm.plugin.finder.extension.reddot.s0 r8 = r1.f12910c
            if (r8 == 0) goto L_0x006c
            te3.xi1 r8 = r8.field_ctrInfo
            int r8 = r8.f144670e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r4.mo77252X5(r8)
            if (r8 != 0) goto L_0x006c
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r5] = r1
            java.lang.String r1 = "[onChanged] result=%s, 青少年模式且只看关注的模式下只允许关注的红点展示"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r2)
            com.tencent.mm.ui.FinderIconViewTipPreference r1 = r0.f56330d
            if (r1 == 0) goto L_0x0068
            r1.mo25956f(r5)
        L_0x0068:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0228
        L_0x006c:
            java.lang.String r8 = eb0.C75592q0.m90778h()
            di3.d r2 = di3.C86312j.m106911c(r2)
            er.n r2 = (p151er.C75651n) r2
            int r2 = r2.mo55941Jm()
            if (r2 != r7) goto L_0x007e
            r2 = 1
            goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            java.lang.String r9 = r1.f12912e
            java.lang.String r10 = "FinderEntrance"
            boolean r9 = r10.equals(r9)
            r11 = 0
            java.lang.String r12 = "FinderMentionEntrance"
            if (r9 == 0) goto L_0x00a2
            boolean r9 = r1.f12908a
            te3.nn1 r13 = r1.f12909b
            if (r2 == 0) goto L_0x009f
            te3.nn1 r11 = r4.mo77246R5(r12)
            if (r11 == 0) goto L_0x009f
            int r2 = r11.f184503e
            if (r2 <= 0) goto L_0x009f
            r14 = r13
            r2 = 1
            goto L_0x00d1
        L_0x009f:
            r14 = r13
            r2 = 0
            goto L_0x00d1
        L_0x00a2:
            java.lang.String r9 = r1.f12912e
            boolean r9 = r12.equals(r9)
            if (r9 == 0) goto L_0x00cc
            if (r2 == 0) goto L_0x00bd
            boolean r2 = r1.f12908a
            if (r2 == 0) goto L_0x00bd
            te3.nn1 r2 = r1.f12909b
            if (r2 == 0) goto L_0x00bd
            int r9 = r2.f184503e
            if (r9 <= 0) goto L_0x00ba
            r9 = 1
            goto L_0x00bb
        L_0x00ba:
            r9 = 0
        L_0x00bb:
            r11 = r2
            goto L_0x00be
        L_0x00bd:
            r9 = 0
        L_0x00be:
            te3.nn1 r2 = r4.mo77246R5(r10)
            if (r2 == 0) goto L_0x00ce
            int r4 = r2.f184502d
            if (r4 <= 0) goto L_0x00ce
            r14 = r2
            r2 = r9
            r9 = 1
            goto L_0x00d1
        L_0x00cc:
            r2 = r11
            r9 = 0
        L_0x00ce:
            r14 = r2
            r2 = r9
            r9 = 0
        L_0x00d1:
            if (r9 == 0) goto L_0x010e
            com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = r1.f12910c
            if (r1 == 0) goto L_0x00f3
            int r2 = r1.field_ctrType
            r4 = 14
            if (r2 == r4) goto L_0x00e4
            r4 = 10
            if (r2 != r4) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r2 = 0
            goto L_0x00e5
        L_0x00e4:
            r2 = 1
        L_0x00e5:
            te3.yi1 r1 = r1.f158585F
            if (r1 == 0) goto L_0x00f4
            int r1 = r1.f186565z
            if (r1 != r7) goto L_0x00ee
            r5 = 1
        L_0x00ee:
            r16 = r2
            r18 = r5
            goto L_0x00f8
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            r16 = r2
            r18 = 0
        L_0x00f8:
            if (r3 != 0) goto L_0x016e
            com.tencent.mm.ui.FindMoreFriendsUI r13 = r0.f56332f
            com.tencent.mm.ui.FinderIconViewTipPreference r15 = r0.f56330d
            ht1.t1 r1 = r0.f56331e
            ht1.b4 r1 = r1.Nt0()
            boolean r17 = r1.mo77253Y5()
            r19 = r11
            r13.mo25896Y(r14, r15, r16, r17, r18, r19)
            goto L_0x016e
        L_0x010e:
            if (r2 == 0) goto L_0x011f
            te3.tg4 r1 = new te3.tg4
            r1.<init>()
            int r2 = r11.f184503e
            r1.f354435d = r2
            com.tencent.mm.ui.FinderIconViewTipPreference r2 = r0.f56330d
            r2.mo25958g(r7, r1)
            goto L_0x016e
        L_0x011f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "username not match finderEntry username: "
            r2.append(r4)
            java.lang.String r4 = r1.f12911d
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            java.lang.String r2 = r1.f12912e
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0155
            java.lang.String r2 = r1.f12911d
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0155
            java.lang.String r2 = "FINDER_MENTION_ENTRANCE showCounter false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            com.tencent.mm.ui.FinderIconViewTipPreference r2 = r0.f56330d
            te3.tg4 r4 = new te3.tg4
            r4.<init>()
            r2.mo25958g(r5, r4)
        L_0x0155:
            java.lang.String r1 = r1.f12912e
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0167
            java.lang.String r1 = "FINDER_ENTRANCE showRedPoint false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            com.tencent.mm.ui.FinderIconViewTipPreference r1 = r0.f56330d
            r1.mo25956f(r5)
        L_0x0167:
            com.tencent.mm.ui.FindMoreFriendsUI r1 = r0.f56332f
            java.lang.String r2 = "find_friends_by_finder"
            r1.mo25923t0(r2, r5)
        L_0x016e:
            if (r3 <= 0) goto L_0x0226
            com.tencent.mm.ui.FindMoreFriendsUI r1 = r0.f56332f
            com.tencent.mm.ui.FinderIconViewTipPreference r2 = r0.f56330d
            int r4 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.f55665Z0
            r4 = 5
            if (r3 < r4) goto L_0x0189
            r4 = 8
            if (r3 > r4) goto L_0x0189
            r8 = 22
            r9 = 0
            r10 = 0
            r6 = r1
            r7 = r2
            r6.mo25919r0(r7, r8, r9, r10)
            goto L_0x0226
        L_0x0189:
            r3 = 3
            r4 = 0
            r10 = 0
            r8 = 3
            r9 = 0
            r6 = r1
            r7 = r2
            r6.mo25919r0(r7, r8, r9, r10)
            r5 = 0
            r10 = 1500(0x5dc, double:7.41E-321)
            r12 = 0
            r8 = r3
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 1
            r10 = 3000(0xbb8, double:1.482E-320)
            r13 = 0
            r8 = 1
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 4500(0x1194, double:2.2233E-320)
            r14 = 0
            r8 = r3
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 7
            r10 = 6000(0x1770, double:2.9644E-320)
            r8 = 7
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 7500(0x1d4c, double:3.7055E-320)
            r8 = r3
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 11
            r10 = 9000(0x2328, double:4.4466E-320)
            r8 = 11
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 10500(0x2904, double:5.1877E-320)
            r8 = r3
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 2
            r10 = 12000(0x2ee0, double:5.929E-320)
            r8 = 2
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 13500(0x34bc, double:6.67E-320)
            r8 = r3
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 22
            r10 = 15000(0x3a98, double:7.411E-320)
            r8 = 22
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 16500(0x4074, double:8.152E-320)
            r8 = r3
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 13
            r10 = 18000(0x4650, double:8.893E-320)
            r8 = 13
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 19500(0x4c2c, double:9.6343E-320)
            r8 = r3
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 14
            r10 = 21000(0x5208, double:1.03754E-319)
            r8 = 14
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 22500(0x57e4, double:1.11165E-319)
            r8 = r3
            r9 = r4
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 12
            r10 = 24000(0x5dc0, double:1.18576E-319)
            r8 = 12
            r9 = r13
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 25500(0x639c, double:1.25987E-319)
            r8 = r3
            r9 = r14
            r6.mo25919r0(r7, r8, r9, r10)
            r3 = 24
            r10 = 37000(0x9088, double:1.82804E-319)
            r8 = 24
            r9 = r12
            r6.mo25919r0(r7, r8, r9, r10)
            r10 = 38500(0x9664, double:1.90215E-319)
            r8 = r3
            r9 = r5
            r6.mo25919r0(r7, r8, r9, r10)
        L_0x0226:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0228:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C19798m0.invoke(java.lang.Object):java.lang.Object");
    }
}
