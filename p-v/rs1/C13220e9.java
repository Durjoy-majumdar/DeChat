package rs1;

import com.tencent.p014mm.plugin.finder.extension.reddot.C2492u0;

/* renamed from: rs1.e9 */
public final class C13220e9 extends C2492u0 {

    /* renamed from: e */
    public final /* synthetic */ C13146c9 f37557e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13220e9(C13146c9 c9Var) {
        super(true);
        this.f37557e = c9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2472a(com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.C2480a r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[finderMessage] red="
            r3.append(r4)
            r4 = 1
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r1 == 0) goto L_0x001e
            boolean r7 = r1.f12908a
            if (r7 != r4) goto L_0x001e
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            r3.append(r7)
            java.lang.String r7 = " ctrlType="
            r3.append(r7)
            r7 = 0
            if (r1 == 0) goto L_0x0037
            com.tencent.mm.plugin.finder.extension.reddot.s0 r8 = r1.f12910c
            if (r8 == 0) goto L_0x0037
            te3.xi1 r8 = r8.field_ctrInfo
            int r8 = r8.f144670e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0038
        L_0x0037:
            r8 = r7
        L_0x0038:
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r8 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            if (r1 == 0) goto L_0x004f
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r1.f12910c
            if (r3 == 0) goto L_0x004f
            te3.xi1 r3 = r3.field_ctrInfo
            int r3 = r3.f144670e
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            r9 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r10 = ""
            r11 = 2131302922(0x7f091a0a, float:1.8223944E38)
            java.lang.String r12 = "finder_private_msg_entrance"
            r13 = 8
            r14 = 2131304763(0x7f09213b, float:1.8227678E38)
            if (r3 != r9) goto L_0x0146
            if (r1 == 0) goto L_0x0067
            boolean r3 = r1.f12908a
            if (r3 != r4) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            if (r4 == 0) goto L_0x0146
            rs1.c9 r2 = r0.f37557e
            android.view.View r2 = r2.findViewById(r14)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3.mo10233c(r4)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r18 = "onRedDotChanged"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r17 = "onRedDotChanged"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            rs1.c9 r2 = r0.f37557e
            android.view.View r2 = r2.findViewById(r11)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r6)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r18 = "onRedDotChanged"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r17 = "onRedDotChanged"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x00f5
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r1.f12910c
            goto L_0x00f6
        L_0x00f5:
            r2 = r7
        L_0x00f6:
            gy3.C87412m.m108591d(r2)
            te3.nn1 r18 = r2.mo77308o2(r12)
            if (r18 == 0) goto L_0x0382
            te3.xi1 r3 = r2.field_ctrInfo
            java.lang.String r3 = r3.f144673h
            if (r3 != 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r10 = r3
        L_0x0107:
            rs1.c9 r3 = r0.f37557e
            java.lang.String r3 = r3.f37397B
            boolean r3 = gy3.C87412m.m108589b(r10, r3)
            if (r3 == 0) goto L_0x0112
            return
        L_0x0112:
            rs1.c9 r3 = r0.f37557e
            r3.getClass()
            r3.f37397B = r10
            dp1.v0 r15 = dp1.C58413v0.f167346a
            r19 = 1
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            rs1.c9 r4 = r0.f37557e
            androidx.appcompat.app.AppCompatActivity r4 = r4.getActivity()
            rs1.s8 r3 = r3.mo12873f(r4)
            if (r3 == 0) goto L_0x012f
            te3.hj1 r7 = r3.mo12861q3()
        L_0x012f:
            r20 = r7
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 480(0x1e0, float:6.73E-43)
            r26 = 0
            java.lang.String r16 = "4"
            r17 = r2
            dp1.C58413v0.m67781i(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0382
        L_0x0146:
            if (r1 == 0) goto L_0x014b
            java.lang.String r3 = r1.f12912e
            goto L_0x014c
        L_0x014b:
            r3 = r7
        L_0x014c:
            boolean r3 = gy3.C87412m.m108589b(r3, r12)
            if (r3 == 0) goto L_0x02f8
            boolean r3 = r1.f12908a
            if (r3 == 0) goto L_0x02f8
            rs1.c9 r3 = r0.f37557e
            android.view.View r3 = r3.findViewById(r11)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r4.mo10233c(r9)
            java.lang.Object[] r16 = r4.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r18 = "onRedDotChanged"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r3
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r17 = "onRedDotChanged"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            te3.nn1 r3 = r1.f12909b
            if (r3 == 0) goto L_0x01a3
            int r3 = r3.f184503e
            goto L_0x01a4
        L_0x01a3:
            r3 = 0
        L_0x01a4:
            if (r3 <= 0) goto L_0x029e
            rs1.c9 r4 = r0.f37557e
            android.view.View r4 = r4.findViewById(r14)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r6)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r18 = "onRedDotChanged"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r17 = "onRedDotChanged"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            rs1.c9 r4 = r0.f37557e
            android.view.View r4 = r4.findViewById(r14)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r8 = 999(0x3e7, float:1.4E-42)
            if (r3 <= r8) goto L_0x01f6
            java.lang.String r8 = "· · ·"
            goto L_0x01fa
        L_0x01f6:
            java.lang.String r8 = java.lang.String.valueOf(r3)
        L_0x01fa:
            r4.setText(r8)
            rs1.c9 r4 = r0.f37557e
            android.view.View r4 = r4.findViewById(r14)
            android.widget.TextView r4 = (android.widget.TextView) r4
            rs1.c9 r8 = r0.f37557e
            android.app.Activity r8 = r8.getContext()
            int r3 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r8, r3)
            r4.setBackgroundResource(r3)
            rs1.c9 r3 = r0.f37557e
            android.view.View r3 = r3.findViewById(r14)
            android.widget.TextView r3 = (android.widget.TextView) r3
            rs1.c9 r4 = r0.f37557e
            android.app.Activity r4 = r4.getContext()
            r8 = 2131167343(0x7f07086f, float:1.7948957E38)
            int r4 = kg3.C76577a.m92155f(r4, r8)
            float r4 = (float) r4
            rs1.c9 r8 = r0.f37557e
            android.app.Activity r8 = r8.getContext()
            float r8 = kg3.C76577a.m92161l(r8)
            float r4 = r4 * r8
            r3.setTextSize(r5, r4)
            di3.d r3 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r3 = r3.Nt0()
            te3.nn1 r18 = r3.mo77246R5(r12)
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r2.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r2.mo77227G5(r12)
            if (r18 == 0) goto L_0x0382
            if (r2 == 0) goto L_0x0382
            te3.xi1 r3 = r2.field_ctrInfo
            java.lang.String r3 = r3.f144673h
            if (r3 != 0) goto L_0x025e
            goto L_0x025f
        L_0x025e:
            r10 = r3
        L_0x025f:
            rs1.c9 r3 = r0.f37557e
            java.lang.String r3 = r3.f37396A
            boolean r3 = gy3.C87412m.m108589b(r10, r3)
            if (r3 == 0) goto L_0x026a
            return
        L_0x026a:
            rs1.c9 r3 = r0.f37557e
            r3.getClass()
            r3.f37396A = r10
            dp1.v0 r15 = dp1.C58413v0.f167346a
            r19 = 1
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            rs1.c9 r4 = r0.f37557e
            androidx.appcompat.app.AppCompatActivity r4 = r4.getActivity()
            rs1.s8 r3 = r3.mo12873f(r4)
            if (r3 == 0) goto L_0x0287
            te3.hj1 r7 = r3.mo12861q3()
        L_0x0287:
            r20 = r7
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 480(0x1e0, float:6.73E-43)
            r26 = 0
            java.lang.String r16 = "4"
            r17 = r2
            dp1.C58413v0.m67781i(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0382
        L_0x029e:
            rs1.c9 r3 = r0.f37557e
            android.view.View r3 = r3.findViewById(r14)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r4.mo10233c(r7)
            java.lang.Object[] r16 = r4.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r18 = "onRedDotChanged"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r3
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r17 = "onRedDotChanged"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "LOCAL_FINDER_MESSAGE is show,but count is zero."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r2.Nt0()
            java.lang.String r3 = "FinderMessageConversation"
            r2.mo77239M5(r3)
            goto L_0x0382
        L_0x02f8:
            rs1.c9 r2 = r0.f37557e
            android.view.View r2 = r2.findViewById(r14)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3.mo10233c(r4)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r18 = "onRedDotChanged"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r17 = "onRedDotChanged"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            rs1.c9 r2 = r0.f37557e
            android.view.View r2 = r2.findViewById(r11)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3.mo10233c(r4)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r18 = "onRedDotChanged"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$10"
            java.lang.String r17 = "onRedDotChanged"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x0382:
            rs1.c9 r2 = r0.f37557e
            android.view.View r2 = r2.findViewById(r14)
            int r2 = r2.getVisibility()
            r3 = 2131302572(0x7f0918ac, float:1.8223234E38)
            r4 = 2131313164(0x7f09420c, float:1.8244717E38)
            if (r2 == 0) goto L_0x03ad
            rs1.c9 r2 = r0.f37557e
            android.view.View r2 = r2.findViewById(r11)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x03a1
            goto L_0x03ad
        L_0x03a1:
            rs1.c9 r1 = r0.f37557e
            android.view.View r1 = r1.findViewById(r4)
            if (r1 == 0) goto L_0x03c4
            r1.setTag(r3, r6)
            goto L_0x03c4
        L_0x03ad:
            rs1.c9 r2 = r0.f37557e
            android.view.View r2 = r2.findViewById(r4)
            if (r2 == 0) goto L_0x03c4
            if (r1 == 0) goto L_0x03bd
            te3.nn1 r1 = r1.f12909b
            if (r1 == 0) goto L_0x03bd
            int r5 = r1.f184503e
        L_0x03bd:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.setTag(r3, r1)
        L_0x03c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13220e9.mo2472a(com.tencent.mm.plugin.finder.extension.reddot.n0$a):void");
    }
}
