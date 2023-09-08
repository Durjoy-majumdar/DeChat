package bh1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C39016i;

/* renamed from: bh1.c */
public final class C28319c implements C39016i {

    /* renamed from: a */
    public final C45795b f77926a;

    /* renamed from: b */
    public final String f77927b = "LiveMsgRespLegalInterceptor";

    public C28319c(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f77926a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r4 = r2.f105072a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo55917a(yg1.C39014a r10) {
        /*
            r9 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.String r1 = "cgiResp"
            gy3.C87412m.m108594g(r10, r1)
            int r1 = r10.f105068a
            yg1.a$a r2 = r10.f105070c
            r3 = 0
            if (r2 == 0) goto L_0x0015
            te3.ao0 r4 = r2.f105072a
            if (r4 == 0) goto L_0x0015
            te3.c21 r4 = r4.f130678f
            goto L_0x0016
        L_0x0015:
            r4 = r3
        L_0x0016:
            java.lang.String r10 = r10.f105071d
            if (r2 == 0) goto L_0x0021
            int r2 = r2.f105073b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0022
        L_0x0021:
            r2 = r3
        L_0x0022:
            java.lang.String r5 = r9.f77927b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "handleLiveMsgResp errCode:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = " curData:"
            r6.append(r1)
            fj1.b r1 = r9.f77926a
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0049
            long r7 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            goto L_0x004a
        L_0x0049:
            r1 = r3
        L_0x004a:
            r6.append(r1)
            java.lang.String r1 = ", resp.liveId:"
            r6.append(r1)
            if (r4 == 0) goto L_0x005b
            long r7 = r4.f182392d
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x005c
        L_0x005b:
            r7 = r3
        L_0x005c:
            r6.append(r7)
            java.lang.String r7 = ",reqVisitorRoleType:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r4 == 0) goto L_0x0077
            long r5 = r4.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            goto L_0x0078
        L_0x0077:
            r2 = r3
        L_0x0078:
            fj1.b r5 = r9.f77926a
            androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            if (r5 == 0) goto L_0x008b
            long r5 = r5.f182392d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x008c
        L_0x008b:
            r5 = r3
        L_0x008c:
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
            r5 = 0
            if (r2 != 0) goto L_0x00cc
            java.lang.String r10 = r9.f77927b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "handleLiveMsgResp invalid live resp, curData:"
            r2.append(r6)
            fj1.b r6 = r9.f77926a
            androidx.lifecycle.i0 r0 = r6.mo71262a(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            if (r0 == 0) goto L_0x00b2
            long r6 = r0.f182392d
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            goto L_0x00b3
        L_0x00b2:
            r0 = r3
        L_0x00b3:
            r2.append(r0)
            r2.append(r1)
            if (r4 == 0) goto L_0x00c1
            long r0 = r4.f182392d
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L_0x00c1:
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            return r5
        L_0x00cc:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r2 = r2.mo77630e(r0)
            cl1.u r2 = (cl1.C55001u) r2
            if (r2 == 0) goto L_0x00d9
            java.lang.String r2 = r2.f154426w
            goto L_0x00da
        L_0x00d9:
            r2 = r3
        L_0x00da:
            r6 = 1
            if (r10 == 0) goto L_0x00e6
            int r7 = r10.length()
            if (r7 != 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r7 = 0
            goto L_0x00e7
        L_0x00e6:
            r7 = 1
        L_0x00e7:
            if (r7 != 0) goto L_0x00f2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r2)
            if (r2 != 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r2 = 0
            goto L_0x00f3
        L_0x00f2:
            r2 = 1
        L_0x00f3:
            if (r2 == 0) goto L_0x0148
            java.lang.String r2 = r9.f77927b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "handleLiveMsgResp invalid live id, curData:"
            r6.append(r7)
            fj1.b r7 = r9.f77926a
            androidx.lifecycle.i0 r7 = r7.mo71262a(r0)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            if (r7 == 0) goto L_0x0114
            long r7 = r7.f182392d
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x0115
        L_0x0114:
            r7 = r3
        L_0x0115:
            r6.append(r7)
            r6.append(r1)
            if (r4 == 0) goto L_0x0123
            long r3 = r4.f182392d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0123:
            r6.append(r3)
            java.lang.String r1 = ", curUniqueId:"
            r6.append(r1)
            fj1.b r1 = r9.f77926a
            androidx.lifecycle.i0 r0 = r1.mo71262a(r0)
            cl1.u r0 = (cl1.C55001u) r0
            java.lang.String r0 = r0.f154426w
            r6.append(r0)
            java.lang.String r0 = ", cgi.uniqueId:"
            r6.append(r0)
            r6.append(r10)
            java.lang.String r10 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            return r5
        L_0x0148:
            fj1.b r10 = r9.f77926a
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r10 = r10.mo71262a(r0)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.mo75997d4()
            if (r10 != r6) goto L_0x015a
            r10 = 1
            goto L_0x015b
        L_0x015a:
            r10 = 0
        L_0x015b:
            if (r10 == 0) goto L_0x0165
            java.lang.String r10 = r9.f77927b
            java.lang.String r0 = "handleLiveMsgResp live has finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            return r5
        L_0x0165:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bh1.C28319c.mo55917a(yg1.a):boolean");
    }
}
