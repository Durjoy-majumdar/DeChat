package ch1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C66639f;

/* renamed from: ch1.j */
public final class C54723j extends C66639f {

    /* renamed from: a */
    public final C45795b f153364a;

    /* renamed from: b */
    public final String f153365b = "LiveMsgRespLayerInterceptor";

    public C54723j(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153364a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a0, code lost:
        r8 = r8.f172989A;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49b(yg1.C39014a.C39015a r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.String r2 = "respWrapper"
            gy3.C87412m.m108594g(r0, r2)
            te3.ao0 r0 = r0.f105072a
            r2 = 1
            if (r0 == 0) goto L_0x0211
            te3.c21 r0 = r0.f130678f
            if (r0 == 0) goto L_0x0211
            te3.l21 r3 = r0.f182360F
            if (r3 == 0) goto L_0x0211
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<cl1.b0> r5 = cl1.C54946b0.class
            ok1.e r6 = ok1.C62042e.f176370a
            java.lang.String r7 = r1.f153365b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "checkLayerShowInfo type:"
            r8.append(r9)
            int r9 = r3.f184023d
            r8.append(r9)
            java.lang.String r9 = ", time:"
            r8.append(r9)
            int r9 = r3.f184025f
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.mo86998D1(r7, r8)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r7.getClass()
            boolean r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            r14 = 2
            r15 = 0
            if (r8 == 0) goto L_0x0131
            int r9 = r3.f184023d
            r10 = 3
            if (r9 != r10) goto L_0x0131
            te3.k21 r0 = new te3.k21
            r0.<init>()
            pe3.b r6 = r3.f184024e
            r7 = 0
            if (r6 == 0) goto L_0x005f
            byte[] r6 = r6.mo123703f()
            goto L_0x0060
        L_0x005f:
            r6 = r7
        L_0x0060:
            if (r6 != 0) goto L_0x0063
            goto L_0x0074
        L_0x0063:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0075
        L_0x0067:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r15] = r6
            java.lang.String r6 = "safeParser"
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r8, r0)
        L_0x0074:
            r0 = r7
        L_0x0075:
            if (r0 != 0) goto L_0x0079
            goto L_0x0211
        L_0x0079:
            java.lang.String r6 = r1.f153365b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onAnchorVerificationRequired: show_type:"
            r8.append(r9)
            int r3 = r3.f184023d
            r8.append(r3)
            java.lang.String r3 = ", verify_mode:"
            r8.append(r3)
            int r3 = r0.f183860d
            r8.append(r3)
            java.lang.String r3 = ", verification_id:"
            r8.append(r3)
            java.lang.String r3 = r0.f183862f
            r8.append(r3)
            java.lang.String r3 = ", remaining_seconds:"
            r8.append(r3)
            int r3 = r0.f183863g
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r16 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r16.getClass()
            fj1.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r3 == 0) goto L_0x0211
            androidx.lifecycle.i0 r6 = r3.mo71262a(r5)
            cl1.b0 r6 = (cl1.C54946b0) r6
            r6.f153982f = r0
            androidx.lifecycle.i0 r6 = r3.mo71262a(r5)
            cl1.b0 r6 = (cl1.C54946b0) r6
            boolean r6 = r6.f153983g
            if (r6 == 0) goto L_0x00ee
            androidx.lifecycle.i0 r6 = r3.mo71262a(r5)
            cl1.b0 r6 = (cl1.C54946b0) r6
            int r6 = r6.f153984h
            int r8 = r0.f183860d
            if (r6 == r8) goto L_0x00ee
            com.tencent.mm.plugin.finder.live.view.b r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r6 == 0) goto L_0x00e2
            boolean r6 = r6.isDestroyed()
            if (r6 != r2) goto L_0x00e2
            r6 = 1
            goto L_0x00e3
        L_0x00e2:
            r6 = 0
        L_0x00e3:
            if (r6 != 0) goto L_0x00ee
            com.tencent.mm.plugin.finder.live.view.b r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r6 == 0) goto L_0x00ee
            d60.b$b r8 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_VERIFICATION_END
            d60.C58124b.C7172a.m7372a(r6, r8, r7, r14, r7)
        L_0x00ee:
            androidx.lifecycle.i0 r5 = r3.mo71262a(r5)
            cl1.b0 r5 = (cl1.C54946b0) r5
            int r0 = r0.f183860d
            r5.f153984h = r0
            com.tencent.mm.plugin.finder.live.view.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r0 == 0) goto L_0x0104
            boolean r0 = r0.isDestroyed()
            if (r0 != r2) goto L_0x0104
            r0 = 1
            goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            if (r0 != 0) goto L_0x0111
            com.tencent.mm.plugin.finder.live.view.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r0 == 0) goto L_0x0128
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_VERIFICATION_START
            d60.C58124b.C7172a.m7372a(r0, r3, r7, r14, r7)
            goto L_0x0128
        L_0x0111:
            r18 = 1
            d60.b$b r19 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_VERIFICATION_START
            r20 = 0
            androidx.lifecycle.i0 r0 = r3.mo71262a(r4)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r4 = r0.f182392d
            r17 = r3
            r21 = r4
            r16.mo77623Z(r17, r18, r19, r20, r21)
        L_0x0128:
            cj1.i r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159384o
            if (r0 == 0) goto L_0x0211
            r0.mo75676e(r15)
            goto L_0x0211
        L_0x0131:
            fj1.b r13 = r1.f153364a
            if (r8 == 0) goto L_0x01ce
            androidx.lifecycle.i0 r8 = r13.mo71262a(r5)
            cl1.b0 r8 = (cl1.C54946b0) r8
            boolean r8 = r8.f153983g
            if (r8 == 0) goto L_0x01ce
            int r8 = r3.f184023d
            if (r8 != 0) goto L_0x01ce
            r11 = 1
            d60.b$b r12 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_VERIFICATION_END
            r8 = 0
            androidx.lifecycle.i0 r4 = r13.mo71262a(r4)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            long r9 = r4.f182392d
            r16 = r9
            r9 = r7
            r10 = r13
            r4 = r13
            r13 = r8
            r8 = 2
            r14 = r16
            r9.mo77623Z(r10, r11, r12, r13, r14)
            cj1.i r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159384o
            if (r9 == 0) goto L_0x01bf
            fj1.b r10 = r9.f153503a
            androidx.lifecycle.i0 r10 = r10.mo71262a(r5)
            cl1.b0 r10 = (cl1.C54946b0) r10
            boolean r10 = r10.f153983g
            if (r10 == 0) goto L_0x01bf
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "checkAnchorVerify: verification finish, currentVerifyMode:"
            r10.append(r11)
            int r11 = r9.f153505c
            r10.append(r11)
            java.lang.String r11 = ", currentVerifyId:"
            r10.append(r11)
            java.lang.String r11 = r9.f153506d
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "Finder.FinderLiveAnchorVerifyManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            int r10 = r9.f153505c
            if (r10 == r8) goto L_0x01b7
            r8 = 5
            if (r10 != r8) goto L_0x0197
            goto L_0x01b7
        L_0x0197:
            r9.mo75677f()
            c50.b r8 = r7.mo77626b()
            if (r8 == 0) goto L_0x01aa
            d50.i r8 = r8.f172989A
            if (r8 == 0) goto L_0x01aa
            boolean r8 = r8.f166263j
            if (r8 != r2) goto L_0x01aa
            r15 = 1
            goto L_0x01ab
        L_0x01aa:
            r15 = 0
        L_0x01ab:
            if (r15 == 0) goto L_0x01bf
            c50.b r7 = r7.mo77626b()
            if (r7 == 0) goto L_0x01bf
            r7.mo85695n0()
            goto L_0x01bf
        L_0x01b7:
            cj1.j r7 = new cj1.j
            r7.<init>(r9)
            o40.C61926c.m72668M(r7)
        L_0x01bf:
            androidx.lifecycle.i0 r5 = r4.mo71262a(r5)
            cl1.b0 r5 = (cl1.C54946b0) r5
            r5.onCleared()
            jp3.c<jp3.a> r5 = r5.f107147e
            r5.dead()
            goto L_0x01cf
        L_0x01ce:
            r4 = r13
        L_0x01cf:
            boolean r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r5 == 0) goto L_0x01e5
            androidx.lifecycle.i0 r5 = r4.mo71262a(r0)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154301c3
            if (r5 == 0) goto L_0x01e5
            java.lang.String r0 = r1.f153365b
            java.lang.String r3 = "checkLayerShowInfo: it's externalPost"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x0211
        L_0x01e5:
            boolean r5 = r6.mo87030O0()
            if (r5 == 0) goto L_0x0202
            int r5 = r3.f184023d
            androidx.lifecycle.i0 r6 = r4.mo71262a(r0)
            cl1.o r6 = (cl1.C54991o) r6
            int r6 = r6.f154289Z2
            if (r5 != r6) goto L_0x0211
            androidx.lifecycle.i0 r0 = r4.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            int r3 = r3.f184025f
            r0.f154284Y2 = r3
            goto L_0x0211
        L_0x0202:
            androidx.lifecycle.i0 r0 = r4.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            ch1.i r5 = new ch1.i
            r5.<init>(r4)
            r4 = 0
            r0.mo75978P4(r3, r4, r5)
        L_0x0211:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.C54723j.mo49b(yg1.a$a):boolean");
    }
}
