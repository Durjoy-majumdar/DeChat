package hl1;

import dj1.C45346d;

/* renamed from: hl1.n3 */
public final class C60019n3 implements C45346d.C45347a {

    /* renamed from: a */
    public final /* synthetic */ C59988k f171310a;

    /* renamed from: b */
    public final /* synthetic */ int f171311b;

    public C60019n3(C59988k kVar, int i) {
        this.f171310a = kVar;
        this.f171311b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70886a(int r28, int r29, java.lang.String r30, te3.C50598nv0 r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            java.lang.String r4 = "resp"
            gy3.C87412m.m108594g(r3, r4)
            hl1.k r4 = r0.f171310a
            java.lang.String r4 = r4.f171222i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ApplyLinkMic errCode:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " errType:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "  errMsg:"
            r5.append(r6)
            r6 = r30
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            hl1.k r4 = r0.f171310a
            int r5 = r0.f171311b
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            java.lang.Class<cl1.d0> r8 = cl1.C54963d0.class
            java.lang.Class<ak1.w> r9 = ak1.C54116w.class
            java.lang.String r10 = r4.f171222i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "[linkApplyMic result] "
            r11.append(r12)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            java.lang.String r10 = r3.f138795d
            r11 = -1
            r12 = 1
            r13 = 2
            if (r1 != 0) goto L_0x00ac
            if (r2 != 0) goto L_0x00ac
            er1.g5 r1 = er1.C58730g5.f168158a
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r6 = er1.C58730g5.f168165h
            r9 = 70
            r1.mo175912v(r6, r9)
            androidx.lifecycle.i0 r1 = r4.mo83051g(r8)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r5 != r12) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r12 = 2
        L_0x0075:
            r1.f154078u = r12
            qj1.gh r1 = r4.f171214d1
            if (r1 == 0) goto L_0x0083
            qj1.mh r2 = new qj1.mh
            r2.<init>(r1)
            o40.C61926c.m72668M(r2)
        L_0x0083:
            qj1.dg r1 = r4.f171228m1
            if (r1 == 0) goto L_0x008a
            r1.mo87748a1()
        L_0x008a:
            androidx.lifecycle.i0 r1 = r4.mo83051g(r8)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.lang.String r2 = r3.f138797f
            if (r2 != 0) goto L_0x0096
            java.lang.String r2 = ""
        L_0x0096:
            r1.f154070j = r2
            ij1.b r1 = ij1.C60299b.f171929a
            r1 = 60000(0xea60, double:2.9644E-319)
            java.lang.String r3 = "Finder.LinkMicTimeoutTimer"
            java.lang.String r5 = "startApplyMicTimer delay:60000"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            ij1.b$c r3 = ij1.C60299b.f171930b
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r1)
            goto L_0x02e2
        L_0x00ac:
            r3 = -200016(0xfffffffffffcf2b0, float:NaN)
            if (r2 != r3) goto L_0x00e6
            java.lang.String r1 = r4.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[linkApplyMic Err] need realname, url:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r10 == 0) goto L_0x02e2
            vk1.c r1 = r4.f166848f
            if (r1 == 0) goto L_0x02e2
            r1.forceScreenToPortrait()
            qj1.z5 r2 = new qj1.z5
            com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel r3 = new com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel
            androidx.appcompat.app.AppCompatActivity r5 = r4.f166847e
            r3.<init>(r5)
            r2.<init>(r3, r1)
            hl1.v r1 = new hl1.v
            r1.<init>(r4)
            r2.mo12316Z0(r10, r1)
            goto L_0x02e2
        L_0x00e6:
            r3 = -200009(0xfffffffffffcf2b7, float:NaN)
            r5 = 2131821556(0x7f1103f4, float:1.9275859E38)
            if (r2 == r3) goto L_0x02b3
            r3 = -100064(0xfffffffffffe7920, float:NaN)
            if (r2 != r3) goto L_0x00f5
            goto L_0x02b3
        L_0x00f5:
            r3 = -200018(0xfffffffffffcf2ae, float:NaN)
            if (r2 != r3) goto L_0x012b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r1 == 0) goto L_0x010e
            androidx.appcompat.app.AppCompatActivity r1 = r4.f166847e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131827703(0x7f111bf7, float:1.9288326E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x010f
        L_0x010e:
            r1 = r6
        L_0x010f:
            qo3.q r2 = new qo3.q
            androidx.appcompat.app.AppCompatActivity r3 = r4.f166847e
            r2.<init>(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r4.f166847e
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r5)
            r2.mo107602n(r3)
            r2.mo107595g(r1)
            r2.mo107603o()
            goto L_0x02e2
        L_0x012b:
            r3 = -200010(0xfffffffffffcf2b6, float:NaN)
            if (r2 == r3) goto L_0x0283
            r3 = -200017(0xfffffffffffcf2af, float:NaN)
            if (r2 != r3) goto L_0x0137
            goto L_0x0283
        L_0x0137:
            r3 = -200104(0xfffffffffffcf258, float:NaN)
            java.lang.String r5 = "getService(HellLiveVisitorReoprter::class.java)"
            if (r2 != r3) goto L_0x0170
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r1 == 0) goto L_0x0152
            androidx.appcompat.app.AppCompatActivity r1 = r4.f166847e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828024(0x7f111d38, float:1.9288977E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0153
        L_0x0152:
            r1 = r6
        L_0x0153:
            androidx.appcompat.app.AppCompatActivity r2 = r4.f166847e
            nj3.C76912y0.m92767f(r2, r1)
            di3.d r1 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r1, r5)
            r12 = r1
            ak1.w r12 = (ak1.C54116w) r12
            ak1.f0$u0 r13 = ak1.C54067f0.C54085u0.FAIL_BY_REWARD_SETTING
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            ak1.C54116w.oy0(r12, r13, r14, r15, r16, r17)
            r12 = 0
            goto L_0x02e3
        L_0x0170:
            r3 = -200105(0xfffffffffffcf257, float:NaN)
            if (r2 != r3) goto L_0x01c6
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r1 == 0) goto L_0x0189
            androidx.appcompat.app.AppCompatActivity r1 = r4.f166847e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828021(0x7f111d35, float:1.9288971E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x018a
        L_0x0189:
            r1 = r6
        L_0x018a:
            androidx.appcompat.app.AppCompatActivity r2 = r4.f166847e
            nj3.C76912y0.m92767f(r2, r1)
            di3.d r1 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r1, r5)
            r13 = r1
            ak1.w r13 = (ak1.C54116w) r13
            ak1.f0$u0 r14 = ak1.C54067f0.C54085u0.FAIL_BY_FOLLOW_SETTING
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            ak1.C54116w.oy0(r13, r14, r15, r16, r17, r18)
            vk1.c r1 = r4.f166848f
            if (r1 == 0) goto L_0x02e3
            cj1.h5 r19 = cj1.C0548h5.f1327a
            androidx.lifecycle.i0 r2 = r4.mo83051g(r7)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            cj1.h5$b r23 = cj1.C0548h5.C0550b.Default
            r24 = 0
            r25 = 8
            r26 = 0
            r20 = r1
            r21 = r2
            cj1.C0548h5.m491b(r19, r20, r21, r23, r24, r25, r26)
            goto L_0x02e3
        L_0x01c6:
            r3 = -200108(0xfffffffffffcf254, float:NaN)
            if (r2 != r3) goto L_0x01ff
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r1 == 0) goto L_0x01df
            androidx.appcompat.app.AppCompatActivity r1 = r4.f166847e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828019(0x7f111d33, float:1.9288967E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x01e0
        L_0x01df:
            r1 = r6
        L_0x01e0:
            androidx.appcompat.app.AppCompatActivity r2 = r4.f166847e
            nj3.C76912y0.m92767f(r2, r1)
            di3.d r1 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r1, r5)
            r14 = r1
            ak1.w r14 = (ak1.C54116w) r14
            ak1.f0$u0 r15 = ak1.C54067f0.C54085u0.FAIL_BY_BUY_PRODUCT_SETTING
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            ak1.C54116w.oy0(r14, r15, r16, r17, r18, r19)
            r12 = 2
            goto L_0x02e3
        L_0x01ff:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r3 == 0) goto L_0x0213
            androidx.appcompat.app.AppCompatActivity r3 = r4.f166847e
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131828026(0x7f111d3a, float:1.9288981E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0214
        L_0x0213:
            r3 = r6
        L_0x0214:
            androidx.appcompat.app.AppCompatActivity r5 = r4.f166847e
            nj3.C76912y0.m92767f(r5, r3)
            androidx.lifecycle.i0 r3 = r4.mo83051g(r7)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r5 = r3.f182392d
            er1.g5 r3 = er1.C58730g5.f168158a
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r7 = er1.C58730g5.f168165h
            r9 = 71
            r3.mo175912v(r7, r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "onVisitorApplyMicFail errCode: "
            r3.append(r7)
            r3.append(r2)
            java.lang.String r7 = " errType: "
            r3.append(r7)
            r3.append(r1)
            java.lang.String r7 = " liveId: "
            r3.append(r7)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "FinderLiveMicWatcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            ft1.a r12 = ft1.C59319a.f169618b
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            cj1.u3 r3 = new cj1.u3
            r3.<init>(r2, r1, r5)
            r19 = 28
            r20 = 0
            java.lang.String r13 = "mic_visitorApplyMicFail"
            r18 = r3
            o40.C11348f.C11349a.m11178b(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r4.f171222i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "[linkApplyMic Err] unkonwn errCode:$"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x02e2
        L_0x0283:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r1 == 0) goto L_0x0297
            androidx.appcompat.app.AppCompatActivity r1 = r4.f166847e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131827704(0x7f111bf8, float:1.9288328E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0298
        L_0x0297:
            r1 = r6
        L_0x0298:
            qo3.q r2 = new qo3.q
            androidx.appcompat.app.AppCompatActivity r3 = r4.f166847e
            r2.<init>(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r4.f166847e
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r5)
            r2.mo107602n(r3)
            r2.mo107595g(r1)
            r2.mo107603o()
            goto L_0x02e2
        L_0x02b3:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r1 == 0) goto L_0x02c7
            androidx.appcompat.app.AppCompatActivity r1 = r4.f166847e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131827705(0x7f111bf9, float:1.928833E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x02c8
        L_0x02c7:
            r1 = r6
        L_0x02c8:
            qo3.q r2 = new qo3.q
            androidx.appcompat.app.AppCompatActivity r3 = r4.f166847e
            r2.<init>(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r4.f166847e
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r5)
            r2.mo107602n(r3)
            r2.mo107595g(r1)
            r2.mo107603o()
        L_0x02e2:
            r12 = -1
        L_0x02e3:
            if (r12 == r11) goto L_0x0305
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            vk1.c r2 = r4.f166848f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            rx3.l r4 = new rx3.l
            java.lang.String r5 = "link_err_type"
            r4.<init>(r5, r3)
            java.util.Map r3 = sx3.C90363p0.m113143b(r4)
            r4 = 25561(0x63d9, float:3.5819E-41)
            java.lang.String r5 = "finder_live_link_err_event"
            r1.mo86153W7(r5, r2, r3, r4)
        L_0x0305:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C60019n3.mo70886a(int, int, java.lang.String, te3.nv0):void");
    }
}
