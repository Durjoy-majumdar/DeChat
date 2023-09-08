package cj1;

import cl1.C55001u;
import dj1.C58289v0;

/* renamed from: cj1.w4 */
public final class C54844w4 implements C58289v0.C58290a {

    /* renamed from: a */
    public final /* synthetic */ C55001u f153749a;

    public C54844w4(C55001u uVar) {
        this.f153749a = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r2 = r2.f154420q;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75795a(int r7, int r8, java.lang.String r9, te3.C48674a71 r10) {
        /*
            r6 = this;
            java.lang.String r9 = "resp"
            gy3.C87412m.m108594g(r10, r9)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r9.getClass()
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleRefreshMicResp errCode:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", errType:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = ", curData:"
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r9.mo77630e(r0)
            cl1.u r2 = (cl1.C55001u) r2
            r3 = 0
            if (r2 == 0) goto L_0x003a
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x003a
            long r4 = r2.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x003b
        L_0x003a:
            r2 = r3
        L_0x003b:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 1
            r4 = 0
            if (r7 != 0) goto L_0x00de
            if (r8 != 0) goto L_0x00de
            te3.bq2 r7 = r10.f130339d
            if (r7 == 0) goto L_0x00de
            androidx.lifecycle.i0 r8 = r9.mo77630e(r0)
            cl1.u r8 = (cl1.C55001u) r8
            if (r8 != 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r8.f154419p = r7
        L_0x005c:
            java.lang.String r8 = "handleRefreshMicResp updatePrivateMapKey"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            c50.b r8 = c50.C54655b.f153178f1
            if (r8 == 0) goto L_0x0067
            r10 = 1
            goto L_0x0068
        L_0x0067:
            r10 = 0
        L_0x0068:
            if (r10 == 0) goto L_0x0082
            if (r8 != 0) goto L_0x0073
            c50.b r8 = new c50.b
            r8.<init>()
            c50.C54655b.f153178f1 = r8
        L_0x0073:
            c50.b r8 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r8)
            pe3.b r10 = r7.f182317i
            java.lang.String r10 = r10.mo123705h()
            r8.mo85237y0(r10)
            goto L_0x00c1
        L_0x0082:
            i50.a r8 = i50.C60251a.f171781k1
            if (r8 == 0) goto L_0x0088
            r10 = 1
            goto L_0x0089
        L_0x0088:
            r10 = 0
        L_0x0089:
            if (r10 == 0) goto L_0x00ac
            if (r8 != 0) goto L_0x009d
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r10 = "MicroMsg.LiveCoreSecondaryDevice"
            java.lang.String r2 = "createInstance"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r10, r2, r8)
            i50.a r8 = new i50.a
            r8.<init>()
            i50.C60251a.f171781k1 = r8
        L_0x009d:
            i50.a r8 = i50.C60251a.f171781k1
            gy3.C87412m.m108591d(r8)
            pe3.b r10 = r7.f182317i
            java.lang.String r10 = r10.mo123705h()
            r8.mo85237y0(r10)
            goto L_0x00c1
        L_0x00ac:
            p50.e r8 = r9.mo77631e0()
            if (r8 == 0) goto L_0x00c1
            p50.e r8 = r9.mo77631e0()
            if (r8 == 0) goto L_0x00c1
            pe3.b r10 = r7.f182317i
            java.lang.String r10 = r10.mo123705h()
            r8.mo85237y0(r10)
        L_0x00c1:
            androidx.lifecycle.i0 r8 = r9.mo77630e(r0)
            cl1.u r8 = (cl1.C55001u) r8
            if (r8 == 0) goto L_0x00cf
            d50.h r8 = r8.f154421r
            if (r8 == 0) goto L_0x00cf
            com.tencent.trtc.TRTCCloudDef$TRTCParams r3 = r8.f166250a
        L_0x00cf:
            if (r3 != 0) goto L_0x00d2
            goto L_0x00da
        L_0x00d2:
            pe3.b r8 = r7.f182317i
            java.lang.String r8 = r8.mo123705h()
            r3.privateMapKey = r8
        L_0x00da:
            r9.mo77628c0(r7)
            goto L_0x00df
        L_0x00de:
            r1 = 0
        L_0x00df:
            cj1.j6 r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159397y0
            if (r7 == 0) goto L_0x00e6
            r7.mo56065a()
        L_0x00e6:
            if (r1 == 0) goto L_0x0101
            cl1.u r7 = r6.f153749a
            te3.bq2 r7 = r7.f154419p
            long r7 = r7.f182321p
            r0 = 60
            long r7 = r7 - r0
            r10 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r10
            long r7 = r7 * r0
            r0 = 60000(0xea60, double:2.9644E-319)
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x00fe
            r7 = r0
        L_0x00fe:
            r9.mo77605F(r7)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54844w4.mo75795a(int, int, java.lang.String, te3.a71):void");
    }
}
