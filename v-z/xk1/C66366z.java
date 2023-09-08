package xk1;

import hp3.C87581a;

/* renamed from: xk1.z */
public final class C66366z<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C66355w f191066a;

    public C66366z(C66355w wVar) {
        this.f191066a = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0064 A[EDGE_INSN: B:69:0x0064->B:23:0x0064 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            xk1.w r0 = r9.f191066a
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice> r2 = com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class
            androidx.lifecycle.i0 r1 = r1.mo77630e(r2)
            com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice r1 = (com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) r1
            r0.mo90454F3(r1)
            int r0 = r10.f256793a
            r1 = 2131827489(0x7f111b21, float:1.9287892E38)
            java.lang.String r2 = "CgiFinderLiveGetUserGameConfig error"
            r3 = 0
            if (r0 != 0) goto L_0x0141
            int r0 = r10.f256794b
            if (r0 != 0) goto L_0x0141
            T r10 = r10.f256796d
            te3.m11 r10 = (te3.C50336m11) r10
            java.util.LinkedList<te3.qs1> r10 = r10.f137744d
            java.lang.String r0 = "it.resp.game_user_info_list"
            gy3.C87412m.m108593f(r10, r0)
            xk1.w r0 = r9.f191066a
            java.util.Iterator r10 = r10.iterator()
        L_0x0030:
            boolean r4 = r10.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r10.next()
            r7 = r4
            te3.qs1 r7 = (te3.C51006qs1) r7
            te3.kr1 r8 = r7.f140523e
            if (r8 == 0) goto L_0x0046
            java.lang.String r8 = r8.f137001d
            goto L_0x0047
        L_0x0046:
            r8 = r6
        L_0x0047:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x005f
            te3.kr1 r7 = r7.f140523e
            if (r7 == 0) goto L_0x0054
            java.lang.String r7 = r7.f137001d
            goto L_0x0055
        L_0x0054:
            r7 = r6
        L_0x0055:
            java.lang.String r8 = r0.f191039u
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            if (r7 == 0) goto L_0x0030
            goto L_0x0064
        L_0x0063:
            r4 = r6
        L_0x0064:
            te3.qs1 r4 = (te3.C51006qs1) r4
            if (r4 != 0) goto L_0x0089
            xk1.w r10 = r9.f191066a
            java.lang.String r10 = r10.f191025d
            java.lang.String r0 = "no game match"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            xk1.w r10 = r9.f191066a
            java.lang.String r0 = r10.f191025d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.app.Activity r0 = r10.getContext()
            java.lang.String r10 = r10.getString(r1)
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r10, (int) r3)
            r10.show()
            goto L_0x0157
        L_0x0089:
            xk1.w r10 = r9.f191066a
            r10.getClass()
            te3.kr1 r0 = r4.f140523e
            r10.f191042x = r0
            te3.as1 r0 = r4.f140525g
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r0.f130749e
            goto L_0x009a
        L_0x0099:
            r0 = r6
        L_0x009a:
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x009f
            r0 = r1
        L_0x009f:
            r10.f191037s = r0
            il1.l r0 = r10.f191033o
            if (r0 == 0) goto L_0x013a
            r0.mo71673a(r4)
            r10.mo90458f3()
            xk1.w r10 = r9.f191066a
            il1.i r0 = r10.mo90460i3()
            java.lang.String r2 = r10.f191037s
            r0.mo85404a(r2)
            android.widget.TextView r0 = r10.f191027f
            if (r0 == 0) goto L_0x0133
            te3.kr1 r2 = r10.f191042x
            if (r2 == 0) goto L_0x00c4
            java.lang.String r2 = r2.f137002e
            if (r2 != 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r1 = r2
        L_0x00c4:
            r0.setText(r1)
            il1.t4 r0 = r10.mo90461j3()
            java.lang.String r1 = r10.f191039u
            boolean r2 = r10.mo90464m3()
            java.lang.String r4 = "appId"
            gy3.C87412m.m108594g(r1, r4)
            r0.f172511i = r1
            boolean r1 = r0.f172510h
            if (r1 == r2) goto L_0x00f5
            r0.f172510h = r2
            android.widget.TextView r1 = r0.f172509g
            er1.w0 r4 = er1.C58782w0.f168290a
            com.tencent.mm.ui.MMActivity r0 = r0.f172503a
            r7 = 2131827470(0x7f111b0e, float:1.9287854E38)
            android.text.SpannableString r0 = r4.mo83848g(r0, r7, r2)
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            r1.setText(r0)
        L_0x00f5:
            il1.t4 r0 = r10.mo90461j3()
            r0.mo85489a()
            il1.s4 r0 = r10.f191035q
            if (r0 == 0) goto L_0x012d
            boolean r1 = r10.mo90464m3()
            boolean r2 = r0.f172481h
            if (r2 == r1) goto L_0x0115
            r0.f172481h = r1
            android.widget.TextView r1 = r0.f172478e
            java.lang.String r2 = "tipTv"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo85481a(r1)
        L_0x0115:
            r10.mo90457e3()
            il1.k r0 = r10.f191036r
            if (r0 == 0) goto L_0x0157
            te3.kr1 r10 = r10.f191042x
            if (r10 == 0) goto L_0x0122
            java.lang.String r6 = r10.f137018x
        L_0x0122:
            if (r10 == 0) goto L_0x0129
            boolean r10 = r10.f137017w
            if (r10 != r5) goto L_0x0129
            r3 = 1
        L_0x0129:
            r0.mo85411a(r6, r3)
            goto L_0x0157
        L_0x012d:
            java.lang.String r10 = "licensePanelWidget"
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x0133:
            java.lang.String r10 = "titleTv"
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x013a:
            java.lang.String r10 = "taskWidget"
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x0141:
            xk1.w r10 = r9.f191066a
            java.lang.String r0 = r10.f191025d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.app.Activity r0 = r10.getContext()
            java.lang.String r10 = r10.getString(r1)
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r10, (int) r3)
            r10.show()
        L_0x0157:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66366z.call(java.lang.Object):java.lang.Object");
    }
}
