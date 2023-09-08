package cj1;

import cl1.C55001u;
import hp3.C87581a;

/* renamed from: cj1.v4 */
public final class C54842v4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C55001u f153746a;

    public C54842v4(C55001u uVar) {
        this.f153746a = uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            ob0.b$c r1 = (ob0.C89132b.C89134c) r1
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            int r4 = r1.f256793a
            int r5 = r1.f256794b
            T r6 = r1.f256796d
            te3.xq0 r6 = (te3.C52005xq0) r6
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.String r8 = "resp"
            gy3.C87412m.m108593f(r6, r8)
            ob0.b r1 = r1.f256798f
            boolean r8 = r1 instanceof dj1.C58284o
            if (r8 == 0) goto L_0x0022
            dj1.o r1 = (dj1.C58284o) r1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = r1.f166893t
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            r7.getClass()
            java.lang.String r8 = ", resp.liveId:"
            r10 = -100038(0xfffffffffffe793a, float:NaN)
            r11 = 4
            java.lang.String r12 = "Finder.FinderLiveService"
            r15 = 1
            r9 = 0
            if (r5 != r10) goto L_0x0053
            androidx.lifecycle.i0 r1 = r7.mo77630e(r2)
            cl1.u r1 = (cl1.C55001u) r1
            if (r1 == 0) goto L_0x004c
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x0047
            r1.mo85697p0(r11)
        L_0x0047:
            cj1.y4 r1 = cj1.C54846y4.f153751d
            o40.C61926c.m72668M(r1)
        L_0x004c:
            java.lang.String r1 = "handleKeepAliveResp live has finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            goto L_0x019f
        L_0x0053:
            if (r4 != 0) goto L_0x019a
            if (r5 == 0) goto L_0x0059
            goto L_0x019a
        L_0x0059:
            boolean r10 = r7.mo77642p(r1)
            if (r10 == 0) goto L_0x00b4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "handleKeepAliveResp invalid live id, curData:"
            r10.append(r13)
            androidx.lifecycle.i0 r13 = r7.mo77630e(r2)
            cl1.u r13 = (cl1.C55001u) r13
            if (r13 == 0) goto L_0x0078
            te3.c21 r13 = r13.f154420q
            if (r13 == 0) goto L_0x0078
            long r13 = r13.f182392d
            goto L_0x007a
        L_0x0078:
            r13 = 0
        L_0x007a:
            r10.append(r13)
            r10.append(r8)
            te3.c21 r13 = r6.f144846f
            if (r13 == 0) goto L_0x008b
            long r13 = r13.f182392d
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x008c
        L_0x008b:
            r13 = 0
        L_0x008c:
            r10.append(r13)
            java.lang.String r13 = ", curUniqueId:"
            r10.append(r13)
            androidx.lifecycle.i0 r13 = r7.mo77630e(r2)
            cl1.u r13 = (cl1.C55001u) r13
            if (r13 == 0) goto L_0x009f
            java.lang.String r13 = r13.f154426w
            goto L_0x00a0
        L_0x009f:
            r13 = 0
        L_0x00a0:
            r10.append(r13)
            java.lang.String r13 = ", cgi.uniqueId:"
            r10.append(r13)
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            goto L_0x019f
        L_0x00b4:
            te3.bq2 r1 = r6.f144844e
            if (r1 == 0) goto L_0x0187
            androidx.lifecycle.i0 r10 = r7.mo77630e(r2)
            cl1.u r10 = (cl1.C55001u) r10
            if (r10 != 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10.f154419p = r1
        L_0x00c3:
            androidx.lifecycle.i0 r10 = r7.mo77630e(r2)
            cl1.u r10 = (cl1.C55001u) r10
            if (r10 == 0) goto L_0x00ce
            te3.c21 r10 = r10.f154420q
            goto L_0x00cf
        L_0x00ce:
            r10 = 0
        L_0x00cf:
            if (r10 != 0) goto L_0x00d2
            goto L_0x00dd
        L_0x00d2:
            te3.c21 r13 = r6.f144846f
            if (r13 == 0) goto L_0x00d9
            long r13 = r13.f182392d
            goto L_0x00db
        L_0x00d9:
            r13 = 0
        L_0x00db:
            r10.f182392d = r13
        L_0x00dd:
            java.lang.String r10 = "doKeepAlive updatePrivateMapKey"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            c50.b r10 = c50.C54655b.f153178f1
            if (r10 == 0) goto L_0x00e8
            r13 = 1
            goto L_0x00e9
        L_0x00e8:
            r13 = 0
        L_0x00e9:
            if (r13 == 0) goto L_0x0103
            if (r10 != 0) goto L_0x00f4
            c50.b r10 = new c50.b
            r10.<init>()
            c50.C54655b.f153178f1 = r10
        L_0x00f4:
            c50.b r10 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r10)
            pe3.b r13 = r1.f182317i
            java.lang.String r13 = r13.mo123705h()
            r10.mo85237y0(r13)
            goto L_0x0142
        L_0x0103:
            i50.a r10 = i50.C60251a.f171781k1
            if (r10 == 0) goto L_0x0109
            r13 = 1
            goto L_0x010a
        L_0x0109:
            r13 = 0
        L_0x010a:
            if (r13 == 0) goto L_0x012d
            if (r10 != 0) goto L_0x011e
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r13 = "MicroMsg.LiveCoreSecondaryDevice"
            java.lang.String r14 = "createInstance"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r13, r14, r10)
            i50.a r10 = new i50.a
            r10.<init>()
            i50.C60251a.f171781k1 = r10
        L_0x011e:
            i50.a r10 = i50.C60251a.f171781k1
            gy3.C87412m.m108591d(r10)
            pe3.b r13 = r1.f182317i
            java.lang.String r13 = r13.mo123705h()
            r10.mo85237y0(r13)
            goto L_0x0142
        L_0x012d:
            p50.e r10 = r7.mo77631e0()
            if (r10 == 0) goto L_0x0142
            p50.e r10 = r7.mo77631e0()
            if (r10 == 0) goto L_0x0142
            pe3.b r13 = r1.f182317i
            java.lang.String r13 = r13.mo123705h()
            r10.mo85237y0(r13)
        L_0x0142:
            androidx.lifecycle.i0 r10 = r7.mo77630e(r2)
            cl1.u r10 = (cl1.C55001u) r10
            if (r10 != 0) goto L_0x014b
            goto L_0x0156
        L_0x014b:
            pe3.b r13 = r6.f144842d
            if (r13 == 0) goto L_0x0152
            byte[] r13 = r13.f257327a
            goto L_0x0153
        L_0x0152:
            r13 = 0
        L_0x0153:
            r10.mo76041l3(r13)
        L_0x0156:
            androidx.lifecycle.i0 r10 = r7.mo77630e(r2)
            cl1.u r10 = (cl1.C55001u) r10
            if (r10 == 0) goto L_0x0165
            d50.h r10 = r10.f154421r
            if (r10 == 0) goto L_0x0165
            com.tencent.trtc.TRTCCloudDef$TRTCParams r10 = r10.f166250a
            goto L_0x0166
        L_0x0165:
            r10 = 0
        L_0x0166:
            if (r10 != 0) goto L_0x0169
            goto L_0x0171
        L_0x0169:
            pe3.b r13 = r1.f182317i
            java.lang.String r13 = r13.mo123705h()
            r10.privateMapKey = r13
        L_0x0171:
            r7.mo77628c0(r1)
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x0185
            b50.b r1 = r1.f173032r
            if (r1 == 0) goto L_0x0185
            boolean r10 = r7.mo77650x()
            b50.f r1 = (b50.C54412f) r1
            r1.mo75189c(r10)
        L_0x0185:
            r1 = 1
            goto L_0x0188
        L_0x0187:
            r1 = 0
        L_0x0188:
            com.tencent.mm.plugin.finder.live.view.b r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r10 == 0) goto L_0x01a0
            java.lang.Class<qj1.l0> r13 = qj1.C12490l0.class
            qj1.c r10 = r10.getPlugin(r13)
            qj1.l0 r10 = (qj1.C12490l0) r10
            if (r10 == 0) goto L_0x01a0
            r10.mo12143c1()
            goto L_0x01a0
        L_0x019a:
            java.lang.String r1 = "handleKeepAliveResp launch live room failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
        L_0x019f:
            r1 = 0
        L_0x01a0:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "handleKeepAliveResp result:"
            r10.append(r13)
            r10.append(r1)
            java.lang.String r13 = " errCode:"
            r10.append(r13)
            r10.append(r5)
            java.lang.String r13 = ", errType:"
            r10.append(r13)
            r10.append(r4)
            java.lang.String r13 = ", curData:"
            r10.append(r13)
            androidx.lifecycle.i0 r13 = r7.mo77630e(r2)
            cl1.u r13 = (cl1.C55001u) r13
            if (r13 == 0) goto L_0x01d5
            te3.c21 r13 = r13.f154420q
            if (r13 == 0) goto L_0x01d5
            long r13 = r13.f182392d
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x01d6
        L_0x01d5:
            r13 = 0
        L_0x01d6:
            r10.append(r13)
            r10.append(r8)
            te3.c21 r8 = r6.f144846f
            if (r8 == 0) goto L_0x01e7
            long r13 = r8.f182392d
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            goto L_0x01e8
        L_0x01e7:
            r8 = 0
        L_0x01e8:
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            cj1.j6 r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159395x0
            if (r8 == 0) goto L_0x01f9
            r8.mo56065a()
        L_0x01f9:
            r8 = -200200(0xfffffffffffcf1f8, float:NaN)
            if (r5 != r8) goto L_0x022a
            java.lang.String r1 = "[doKeepLive] svr said not need keepAlive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            androidx.lifecycle.i0 r1 = r7.mo77630e(r3)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 != 0) goto L_0x020c
            goto L_0x020f
        L_0x020c:
            r1.mo76028z4(r9)
        L_0x020f:
            androidx.lifecycle.i0 r1 = r7.mo77630e(r3)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 != 0) goto L_0x0219
            goto L_0x031d
        L_0x0219:
            boolean r2 = r1.f154317g1
            if (r2 == 0) goto L_0x0226
            java.lang.String r2 = r1.f154311f
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r4 = "keepAliveSwitch"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r2, r4, r3)
        L_0x0226:
            r1.f154317g1 = r9
            goto L_0x031d
        L_0x022a:
            gy3.e0 r8 = new gy3.e0
            r8.<init>()
            androidx.lifecycle.i0 r10 = r7.mo77630e(r2)
            cl1.u r10 = (cl1.C55001u) r10
            if (r10 == 0) goto L_0x023e
            te3.bq2 r10 = r10.f154419p
            if (r10 == 0) goto L_0x023e
            long r13 = r10.f182321p
            goto L_0x0240
        L_0x023e:
            r13 = 0
        L_0x0240:
            r16 = 60
            long r13 = r13 - r16
            r10 = 1000(0x3e8, float:1.401E-42)
            long r9 = (long) r10
            long r13 = r13 * r9
            r9 = 60000(0xea60, double:2.9644E-319)
            int r17 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r17 >= 0) goto L_0x0251
            r13 = r9
        L_0x0251:
            r8.f124000d = r13
            if (r4 != r11) goto L_0x0289
            if (r5 == 0) goto L_0x0289
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "[doKeepLive] keepAlive errCode:"
            r4.append(r11)
            r4.append(r5)
            java.lang.String r5 = ", stop getLiveMsg"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            androidx.lifecycle.i0 r4 = r7.mo77630e(r3)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 != 0) goto L_0x0279
            goto L_0x027d
        L_0x0279:
            r11 = 0
            r4.mo76028z4(r11)
        L_0x027d:
            int r4 = r6.f144826T0
            if (r4 <= 0) goto L_0x0286
            long r4 = (long) r4
            r9 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r4
        L_0x0286:
            r8.f124000d = r9
            goto L_0x02bb
        L_0x0289:
            r11 = 0
            if (r4 != 0) goto L_0x02bb
            if (r5 != 0) goto L_0x02bb
            androidx.lifecycle.i0 r4 = r7.mo77630e(r3)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 == 0) goto L_0x029c
            boolean r4 = r4.f154312f1
            if (r4 != 0) goto L_0x029c
            r9 = 1
            goto L_0x029d
        L_0x029c:
            r9 = 0
        L_0x029d:
            if (r9 == 0) goto L_0x02bb
            java.lang.String r4 = "[doKeepLive] keepAlive success, resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            androidx.lifecycle.i0 r4 = r7.mo77630e(r3)
            cl1.o r4 = (cl1.C54991o) r4
            if (r4 != 0) goto L_0x02ad
            goto L_0x02b0
        L_0x02ad:
            r4.mo76028z4(r15)
        L_0x02b0:
            cl1.u r4 = r0.f153746a
            te3.c21 r4 = r4.f154420q
            long r4 = r4.f182392d
            r9 = 0
            r7.mo77639m(r9, r4)
        L_0x02bb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[doKeepLive] delay next : "
            r4.append(r5)
            long r5 = r8.f124000d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            if (r1 == 0) goto L_0x02d9
            long r1 = r8.f124000d
            r7.mo77645s(r1)
            goto L_0x0315
        L_0x02d9:
            cl1.u r1 = r0.f153746a
            androidx.lifecycle.i0 r1 = r1.business(r3)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75997d4()
            if (r1 != 0) goto L_0x02ed
            long r1 = r8.f124000d
            r7.mo77645s(r1)
            goto L_0x0315
        L_0x02ed:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "handleKeepAliveResp result false and live is finished. localLiveId:"
            r1.append(r3)
            androidx.lifecycle.i0 r2 = r7.mo77630e(r2)
            cl1.u r2 = (cl1.C55001u) r2
            if (r2 == 0) goto L_0x030a
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x030a
            long r2 = r2.f182392d
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            goto L_0x030b
        L_0x030a:
            r9 = 0
        L_0x030b:
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
        L_0x0315:
            cj1.u4 r1 = new cj1.u4
            r1.<init>(r8)
            o40.C61926c.m72668M(r1)
        L_0x031d:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54842v4.call(java.lang.Object):java.lang.Object");
    }
}
