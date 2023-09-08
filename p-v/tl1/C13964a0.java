package tl1;

import android.view.View;

/* renamed from: tl1.a0 */
public final class C13964a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13966b0 f39212d;

    public C13964a0(C13966b0 b0Var) {
        this.f39212d = b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r6 = r19
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r20
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$initRunningView$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r19
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            tl1.b0 r0 = r6.f39212d
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            java.lang.Class<rl1.d0> r2 = rl1.C13022d0.class
            tl1.p r3 = r0.f39214a
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r2)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x00af
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x00af
            te3.c31 r3 = r3.f145652s
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f131479f
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = r3.f131478e
            if (r7 == 0) goto L_0x004d
            int r7 = r7.length()
            if (r7 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r7 = 0
            goto L_0x004e
        L_0x004d:
            r7 = 1
        L_0x004e:
            if (r7 == 0) goto L_0x0062
            android.view.ViewGroup r3 = r0.f39215b
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r7 = 2131827901(0x7f111cbd, float:1.9288728E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0064
        L_0x0062:
            java.lang.String r3 = r3.f131478e
        L_0x0064:
            android.view.ViewGroup r7 = r0.f39215b
            android.content.Context r7 = r7.getContext()
            nj3.C76912y0.m92773l(r7, r3)
            java.lang.String r3 = r0.f39218e
            java.lang.String r7 = "checkParticipability client_version_not_support!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            goto L_0x00ad
        L_0x0075:
            boolean r7 = r3.f131477d
            if (r7 != 0) goto L_0x00b6
            java.lang.String r7 = r3.f131478e
            if (r7 == 0) goto L_0x0086
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r7 = 0
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            if (r7 == 0) goto L_0x009b
            android.view.ViewGroup r3 = r0.f39215b
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r7 = 2131827820(0x7f111c6c, float:1.9288563E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x009d
        L_0x009b:
            java.lang.String r3 = r3.f131478e
        L_0x009d:
            android.view.ViewGroup r7 = r0.f39215b
            android.content.Context r7 = r7.getContext()
            nj3.C76912y0.m92773l(r7, r3)
            java.lang.String r3 = r0.f39218e
            java.lang.String r7 = "checkParticipability is_participable false!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
        L_0x00ad:
            r3 = 0
            goto L_0x00b7
        L_0x00af:
            java.lang.String r3 = r0.f39218e
            java.lang.String r7 = "checkParticipability participability is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
        L_0x00b6:
            r3 = 1
        L_0x00b7:
            if (r3 != 0) goto L_0x00bb
            goto L_0x0272
        L_0x00bb:
            tl1.p r3 = r0.f39214a
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r2)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            r7 = 0
            if (r3 == 0) goto L_0x00d7
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x00d7
            te3.u21 r3 = r3.f145645i
            if (r3 == 0) goto L_0x00d7
            int r3 = r3.f142563d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00d8
        L_0x00d7:
            r3 = r7
        L_0x00d8:
            r8 = 3
            if (r3 != 0) goto L_0x00dc
            goto L_0x00e3
        L_0x00dc:
            int r9 = r3.intValue()
            if (r9 != r5) goto L_0x00e3
            goto L_0x00ec
        L_0x00e3:
            if (r3 != 0) goto L_0x00e6
            goto L_0x00ee
        L_0x00e6:
            int r9 = r3.intValue()
            if (r9 != r8) goto L_0x00ee
        L_0x00ec:
            r9 = 1
            goto L_0x00ef
        L_0x00ee:
            r9 = 0
        L_0x00ef:
            r10 = 8
            r11 = 4
            r12 = 2
            if (r9 == 0) goto L_0x016a
            tl1.p r3 = r0.f39214a
            r3.mo10792g(r10)
            tl1.p r3 = r0.f39214a
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r1)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.f154370u
            if (r3 == 0) goto L_0x0150
            tl1.p r3 = r0.f39214a
            androidx.lifecycle.i0 r1 = r3.mo87696x0(r1)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154366t
            if (r1 != 0) goto L_0x0113
            goto L_0x0150
        L_0x0113:
            tl1.p r1 = r0.f39214a
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
            rl1.d0 r1 = (rl1.C13022d0) r1
            al1.q r1 = r1.f37098n
            if (r1 == 0) goto L_0x012a
            te3.z21 r1 = r1.f509d
            if (r1 == 0) goto L_0x012a
            te3.u21 r1 = r1.f145645i
            if (r1 == 0) goto L_0x012a
            java.lang.String r1 = r1.f142564e
            goto L_0x012b
        L_0x012a:
            r1 = r7
        L_0x012b:
            if (r1 == 0) goto L_0x0143
            tl1.p r2 = r0.f39214a
            d60.b r2 = r2.f39314A
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_AUTO_INPUT_COMMENT
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "PARAM_FINDER_LIVE_AUTO_INPUT_MSG"
            r4.putString(r5, r1)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r2.statusChange(r3, r4)
            goto L_0x014c
        L_0x0143:
            tl1.p r2 = r0.f39214a
            d60.b r2 = r2.f39314A
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_AUTO_INPUT_COMMENT
            d60.C58124b.C7172a.m7372a(r2, r3, r7, r12, r7)
        L_0x014c:
            r7 = r1
            r4 = 2
            goto L_0x0248
        L_0x0150:
            android.view.ViewGroup r0 = r0.f39215b
            android.content.Context r0 = r0.getContext()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131827214(0x7f111a0e, float:1.9287334E38)
            java.lang.String r1 = r1.getString(r2)
            nj3.C76912y0.m92773l(r0, r1)
            goto L_0x0272
        L_0x016a:
            if (r3 != 0) goto L_0x016d
            goto L_0x01aa
        L_0x016d:
            int r9 = r3.intValue()
            if (r9 != r12) goto L_0x01aa
            tl1.p r2 = r0.f39214a
            r2.mo10792g(r10)
            tl1.p r2 = r0.f39214a
            androidx.lifecycle.i0 r1 = r2.mo87696x0(r1)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154178A
            if (r1 != 0) goto L_0x019e
            android.view.ViewGroup r0 = r0.f39215b
            android.content.Context r0 = r0.getContext()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131827645(0x7f111bbd, float:1.9288208E38)
            java.lang.String r1 = r1.getString(r2)
            nj3.C76912y0.m92773l(r0, r1)
            goto L_0x0272
        L_0x019e:
            tl1.p r1 = r0.f39214a
            d60.b r1 = r1.f39314A
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LIKE_SHAKE
            d60.C58124b.C7172a.m7372a(r1, r2, r7, r12, r7)
            r4 = 1
            goto L_0x0248
        L_0x01aa:
            if (r3 != 0) goto L_0x01ad
            goto L_0x01ee
        L_0x01ad:
            int r1 = r3.intValue()
            if (r1 != r11) goto L_0x01ee
            tl1.p r1 = r0.f39214a
            r1.mo10792g(r10)
            tl1.p r1 = r0.f39214a
            java.lang.Class<cl1.b> r2 = cl1.C0654b.class
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
            cl1.b r1 = (cl1.C0654b) r1
            boolean r1 = r1.mo623c3()
            if (r1 == 0) goto L_0x01d2
            tl1.p r1 = r0.f39214a
            d60.b r1 = r1.f39314A
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_REQUEST_ATTEND_LOTTERY
            d60.C58124b.C7172a.m7372a(r1, r2, r7, r12, r7)
            goto L_0x01ec
        L_0x01d2:
            cj1.h5 r13 = cj1.C0548h5.f1327a
            tl1.p r1 = r0.f39214a
            d60.b r14 = r1.f39314A
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r1 = r1.f182392d
            cj1.h5$b r17 = cj1.C0548h5.C0550b.Lottery
            r18 = 1
            r15 = r1
            r13.mo592a(r14, r15, r17, r18)
        L_0x01ec:
            r4 = 3
            goto L_0x0248
        L_0x01ee:
            r1 = 5
            if (r3 != 0) goto L_0x01f2
            goto L_0x0216
        L_0x01f2:
            int r3 = r3.intValue()
            if (r3 != r1) goto L_0x0216
            tl1.p r1 = r0.f39214a
            r1.mo10792g(r10)
            tl1.p r1 = r0.f39214a
            java.lang.Class<cl1.x> r2 = cl1.C0696x.class
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
            cl1.x r1 = (cl1.C0696x) r1
            boolean r1 = r1.f1643f
            if (r1 == 0) goto L_0x0214
            tl1.p r1 = r0.f39214a
            d60.b r1 = r1.f39314A
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_REQUEST_ATTEND_LOTTERY
            d60.C58124b.C7172a.m7372a(r1, r2, r7, r12, r7)
        L_0x0214:
            r4 = 4
            goto L_0x0248
        L_0x0216:
            java.lang.String r1 = r0.f39218e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "onAttendBtnClick type:"
            r3.append(r5)
            tl1.p r5 = r0.f39214a
            androidx.lifecycle.i0 r2 = r5.mo87696x0(r2)
            rl1.d0 r2 = (rl1.C13022d0) r2
            al1.q r2 = r2.f37098n
            if (r2 == 0) goto L_0x023d
            te3.z21 r2 = r2.f509d
            if (r2 == 0) goto L_0x023d
            te3.u21 r2 = r2.f145645i
            if (r2 == 0) goto L_0x023d
            int r2 = r2.f142563d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x023e
        L_0x023d:
            r2 = r7
        L_0x023e:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0248:
            tl1.p r0 = r0.f39214a
            d60.b r0 = r0.f39314A
            int r0 = r0.getLiveRole()
            if (r0 != 0) goto L_0x0272
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r8 = r0
            ak1.w r8 = (ak1.C54116w) r8
            ak1.f0$v0 r9 = ak1.C54067f0.C0071v0.CLICK_JOIN_LOTTERY
            java.lang.String r10 = java.lang.String.valueOf(r4)
            if (r7 != 0) goto L_0x026a
            java.lang.String r7 = ""
        L_0x026a:
            r11 = r7
            r12 = 0
            r13 = 8
            r14 = 0
            ak1.C54116w.my0(r8, r9, r10, r11, r12, r13, r14)
        L_0x0272:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$initRunningView$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13964a0.onClick(android.view.View):void");
    }
}
