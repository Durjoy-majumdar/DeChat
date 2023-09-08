package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r */
public class C94668r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94651l f273944d;

    public C94668r(C94651l lVar) {
        this.f273944d = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0289  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r30) {
        /*
            r29 = this;
            r6 = r29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r30
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$9"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r29
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "onClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$9"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r2 = r6.f273944d
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r2 = r2.f273886D
            r2.getClass()
            java.lang.String r3 = "isFullScreen"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r2 = r2.f274352h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent"
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x02d5
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r2 = r6.f273944d
            com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l.m119778R(r2, r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r2 = r6.f273944d
            java.lang.String r7 = "access$1600"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            android.content.Context r2 = r2.f276579d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r2
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r7 = r6.f273944d
            qs2.f r7 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l.m119777Q(r7)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r8 = r6.f273944d
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r8 = r8.f273883A
            r2.getClass()
            java.lang.String r9 = "enterFullScreenVideo"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            if (r7 == 0) goto L_0x02b0
            if (r8 != 0) goto L_0x0070
            goto L_0x02b0
        L_0x0070:
            r2.f277529N1 = r4
            r2.f277527M1 = r8
            r8.setFullScreen(r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r8 = r2.f277527M1
            android.view.ViewGroup r8 = r8.getVideoCompContainer()
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r11 = r2.f277527M1
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r11 = r11.getToolBar()
            r11.mo130493b(r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r12 = r2.f277527M1
            r8.removeView(r12)
            r8.removeView(r11)
            android.widget.FrameLayout r8 = new android.widget.FrameLayout
            r8.<init>(r2)
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8.setBackgroundColor(r12)
            r8.setClipChildren(r5)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r13 = -1
            r12.<init>(r13, r13)
            android.widget.FrameLayout r14 = r2.f277565b1
            r14.addView(r8, r12)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r12 = r2.f277527M1
            qs2.l0 r14 = r7.f296587N
            android.widget.FrameLayout r15 = r2.f277565b1
            r12.getClass()
            java.lang.String r13 = "initFullScreenFloatBar"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r5)
            if (r14 == 0) goto L_0x0159
            if (r15 == 0) goto L_0x0159
            java.lang.String r4 = r14.f296655z
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x014f
            qs2.a0 r4 = r14.f296654C
            if (r4 != 0) goto L_0x00c8
            goto L_0x014f
        L_0x00c8:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h r4 = r12.f274025J
            r18 = r0
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp"
            if (r4 != 0) goto L_0x00e1
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h r4 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h
            r19 = r1
            android.content.Context r1 = r12.getContext()
            r20 = r3
            r3 = 1
            r4.<init>(r1, r14, r15, r3)
            r12.f274025J = r4
            goto L_0x013d
        L_0x00e1:
            r19 = r1
            r20 = r3
            java.lang.String r1 = "refreshView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r0)
            android.view.ViewGroup r3 = r4.f276003x
            android.view.View r14 = r4.f276000u
            r3.addView(r14)
            android.view.View r3 = r4.f276000u
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r14 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.mo10233c(r14)
            java.lang.Object[] r22 = r4.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp"
            java.lang.String r24 = "refreshView"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r3
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r14 = 0
            java.lang.Object r4 = r4.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r22 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp"
            java.lang.String r23 = "refreshView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r0)
        L_0x013d:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h r1 = r12.f274025J
            r1.getClass()
            java.lang.String r3 = "setVideoOrientation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r0)
            r4 = 0
            r1.f275996C = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
            goto L_0x015f
        L_0x014f:
            r18 = r0
            r19 = r1
            r20 = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r5)
            goto L_0x0162
        L_0x0159:
            r18 = r0
            r19 = r1
            r20 = r3
        L_0x015f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r5)
        L_0x0162:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r3 = 17
            r0.gravity = r3
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r3 = r2.f277527M1
            r8.addView(r3, r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r0.<init>(r1, r3)
            r1 = 80
            r0.gravity = r1
            r8.addView(r11, r0)
            java.lang.String r0 = r7.f296495a
            java.lang.String r1 = "landingPagesFullScreenPause"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r10)
            q3.a r3 = p1208q3.C118144a.m166672a(r2)
            android.content.BroadcastReceiver r4 = r2.f277586i2
            r3.mo182945d(r4)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent> r3 = r2.f277601o2
            r3.dead()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r3 = r2.f277610r1
            if (r3 == 0) goto L_0x01a3
            boolean r3 = r3.mo131508Q()
            if (r3 == 0) goto L_0x01a3
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r3 = r2.f277610r1
            r3.mo124361D()
        L_0x01a3:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 r3 = r2.f277544T1
            if (r3 == 0) goto L_0x01aa
            r3.mo124361D()
        L_0x01aa:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b0 r3 = r2.f277550V1
            if (r3 == 0) goto L_0x01b1
            r3.mo124361D()
        L_0x01b1:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r3 = r2.mo132540m8()
            r3.getClass()
            java.lang.String r4 = "fragmentFullScreenPause"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r8 = 0
            r3.f276499h = r8
            r11 = 1
            r3.f276513y = r11
            r3.f276514z = r0
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e r0 = r3.f276497f
            r0.mo131784c(r8)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e r0 = r3.f276497f
            if (r0 == 0) goto L_0x0258
            boolean r0 = r3.getUserVisibleHint()
            if (r0 == 0) goto L_0x0258
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e r0 = r3.f276497f
            ps2.l r8 = r3.f276482B
            java.lang.String r3 = r3.f276514z
            r0.getClass()
            java.lang.String r11 = "notifyOtherChildrenDisappear"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            androidx.recyclerview.widget.LinearLayoutManager r13 = r0.f276443c
            if (r13 == 0) goto L_0x0252
            int r13 = r13.mo16957C()
            androidx.recyclerview.widget.LinearLayoutManager r14 = r0.f276443c
            int r14 = r14.mo16959E()
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r21 = java.lang.Integer.valueOf(r13)
            r16 = 0
            r15[r16] = r21
            java.lang.Integer r21 = java.lang.Integer.valueOf(r14)
            r17 = 1
            r15[r17] = r21
            java.lang.String r6 = "RecyclerViewExposureMgr"
            r21 = r9
            java.lang.String r9 = "disappear [%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r15)
            if (r13 != r14) goto L_0x0220
            r9 = -1
            if (r13 != r9) goto L_0x0220
            java.lang.String r0 = "no exposuring child"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x025a
        L_0x0220:
            if (r13 > r14) goto L_0x0254
            java.util.LinkedList<qs2.a0> r6 = r8.f295429d
            java.lang.Object r6 = r6.get(r13)
            qs2.a0 r6 = (qs2.C101255a0) r6
            java.lang.String r6 = r6.f296495a
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0233
            goto L_0x024f
        L_0x0233:
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e$b> r6 = r0.f276442b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r9)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e$b r6 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95251e.C95253b) r6
            if (r6 == 0) goto L_0x024f
            boolean r9 = r6.f276446a
            if (r9 == 0) goto L_0x024f
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e$c r9 = r0.f276444d
            r9.mo131792l2(r13)
            r6.mo131788b()
        L_0x024f:
            int r13 = r13 + 1
            goto L_0x0220
        L_0x0252:
            r21 = r9
        L_0x0254:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x025a
        L_0x0258:
            r21 = r9
        L_0x025a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r10)
            com.tencent.mm.ui.widget.SwipeBackLayout r0 = r2.getSwipeBackLayout()
            r1 = 0
            r0.setEnableGesture(r1)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r2.f277527M1
            r3 = 1
            r0.mo130290d(r3)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r2.f277527M1
            r0.setAnimImmediately(r1)
            boolean r0 = r7.f296585L
            if (r0 == 0) goto L_0x0289
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r2.f277527M1
            r1 = 90
            r0.mo130308l(r1)
            com.tencent.mm.plugin.sns.ui.c3 r0 = new com.tencent.mm.plugin.sns.ui.c3
            r0.<init>(r2, r7)
            r1 = 5000(0x1388, double:2.4703E-320)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            goto L_0x02aa
        L_0x0289:
            zo2.a r0 = zo2.C103049a.m136281a()
            java.lang.String r1 = r7.f296495a
            r0.getClass()
            java.lang.String r2 = "start"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r0.f304039e = r1
            i72.d r1 = r0.f304040f
            if (r1 == 0) goto L_0x02a7
            r1.enable()
            i72.d r1 = r0.f304040f
            r1.f289116g = r0
        L_0x02a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x02aa:
            r0 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r10)
            goto L_0x02c1
        L_0x02b0:
            r18 = r0
            r19 = r1
            r20 = r3
            r0 = r9
            java.lang.String r1 = "MicroMsg.SnsAdNativeLandingPagesUI"
            java.lang.String r2 = "enterFullScreenVideo but info or videoViewWrapper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r10)
        L_0x02c1:
            r0 = r29
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r1 = r0.f273944d
            r2 = 0
            r1.mo130238U(r2)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1720(0x6b8, float:2.41E-42)
            r3 = 3
            r1.mo175911u(r2, r3)
            r3 = r20
            r2 = 1
            goto L_0x02f9
        L_0x02d5:
            r18 = r0
            r19 = r1
            r20 = r3
            r0 = r6
            r2 = 0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r1 = r0.f273944d
            com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l.m119778R(r1, r2)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r1 = r0.f273944d
            java.lang.String r2 = "access$1700"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.content.Context r1 = r1.f276579d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r1
            r1.mo132533e8()
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r1 = r0.f273944d
            r2 = 1
            r1.mo130238U(r2)
        L_0x02f9:
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r1 = r0.f273944d
            java.lang.String r4 = "access$1808"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            int r5 = r1.f273902T
            int r5 = r5 + r2
            r1.f273902T = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r1 = r18
            r2 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$9"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r0, r2, r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94668r.onClick(android.view.View):void");
    }
}
