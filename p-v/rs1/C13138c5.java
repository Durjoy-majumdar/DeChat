package rs1;

import androidx.lifecycle.C0120a0;

/* renamed from: rs1.c5 */
public final class C13138c5<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C13392r4 f37380d;

    public C13138c5(C13392r4 r4Var) {
        this.f37380d = r4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        r3 = r1.f12910c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            com.tencent.mm.plugin.finder.extension.reddot.n0$a r1 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.C2480a) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            boolean r4 = r1.f12908a
            if (r4 != r2) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            r4 = 2131307201(0x7f092ac1, float:1.8232623E38)
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x00e6
            rs1.r4 r2 = r0.f37380d
            android.view.View r2 = r2.findViewById(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0060
        L_0x0020:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$registerRedDot$4"
            java.lang.String r9 = "onChanged"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r3 = r4.mo10231a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$registerRedDot$4"
            java.lang.String r8 = "onChanged"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x0060:
            r2 = 0
            if (r1 == 0) goto L_0x006a
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r1.f12910c
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = r3.field_tipsId
            goto L_0x006b
        L_0x006a:
            r3 = r2
        L_0x006b:
            if (r3 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r5 = r3
        L_0x006f:
            rs1.r4 r3 = r0.f37380d
            java.lang.String r3 = r3.f37943j
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 != 0) goto L_0x0132
            rs1.r4 r3 = r0.f37380d
            boolean r3 = r3.f37940g
            if (r3 == 0) goto L_0x0132
            java.lang.Class<dp1.y0> r3 = dp1.C58417y0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            java.lang.String r4 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            r6 = r3
            dp1.y0 r6 = (dp1.C58417y0) r6
            r8 = 3
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 0
            r14 = 0
            r15 = 0
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            rs1.r4 r4 = r0.f37380d
            androidx.appcompat.app.AppCompatActivity r4 = r4.getActivity()
            rs1.s8 r4 = r3.mo12873f(r4)
            if (r4 == 0) goto L_0x00aa
            te3.hj1 r4 = r4.mo12861q3()
            r17 = r4
            goto L_0x00ac
        L_0x00aa:
            r17 = r2
        L_0x00ac:
            r18 = 0
            r19 = 0
            r20 = 3456(0xd80, float:4.843E-42)
            r21 = 0
            java.lang.String r7 = "2"
            r13 = r5
            dp1.C58417y0.Nx0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            rs1.r4 r4 = r0.f37380d
            r4.f37943j = r5
            com.tencent.mm.plugin.finder.extension.reddot.s0 r8 = r1.f12910c
            te3.nn1 r9 = r1.f12909b
            if (r8 == 0) goto L_0x0132
            if (r9 == 0) goto L_0x0132
            dp1.v0 r6 = dp1.C58413v0.f167346a
            r10 = 1
            androidx.appcompat.app.AppCompatActivity r1 = r4.getActivity()
            rs1.s8 r1 = r3.mo12873f(r1)
            if (r1 == 0) goto L_0x00d7
            te3.hj1 r2 = r1.mo12861q3()
        L_0x00d7:
            r11 = r2
            r12 = 0
            r13 = 0
            r14 = 2
            r15 = 0
            r16 = 352(0x160, float:4.93E-43)
            r17 = 0
            java.lang.String r7 = "2"
            dp1.C58413v0.m67781i(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0132
        L_0x00e6:
            rs1.r4 r1 = r0.f37380d
            r1.f37943j = r5
            android.view.View r1 = r1.findViewById(r4)
            if (r1 != 0) goto L_0x00f1
            goto L_0x0132
        L_0x00f1:
            r2 = 4
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r2)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$registerRedDot$4"
            java.lang.String r9 = "onChanged"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r4.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$registerRedDot$4"
            java.lang.String r8 = "onChanged"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13138c5.onChanged(java.lang.Object):void");
    }
}
