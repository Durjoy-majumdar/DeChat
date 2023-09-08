package com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.b */
public class C94700b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C94696a f274083d;

    public C94700b(C94696a aVar) {
        this.f274083d = aVar;
    }

    public void onAnimationCancel(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0362  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r27) {
        /*
            r26 = this;
            r0 = r26
            java.lang.String r1 = "onAnimationEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r3 = r0.f274083d
            java.lang.String r4 = "access$100"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a$c r3 = r3.f274080h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r8 = 1
            if (r3 == 0) goto L_0x0429
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r3 = r0.f274083d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a$c r3 = r3.f274080h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r4 = r0.f274083d
            java.lang.String r9 = "access$200"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer r4 = r4.f274074b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
            com.tencent.mm.plugin.sns.ui.j3 r3 = (com.tencent.p014mm.plugin.sns.p106ui.C95971j3) r3
            r3.getClass()
            java.lang.String r9 = "onEnterAnimEnd"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$9"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r11 = r3.f280241a
            r11.mo132503L8()
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r11 = r3.f280241a
            r11.mo132524Z8()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r4.getLocalVisibleRect(r11)
            int r12 = r11.bottom
            int r11 = r11.top
            int r12 = r12 - r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "--Ad HalfContainerH="
            r11.append(r13)
            r11.append(r12)
            java.lang.String r13 = ", view.h="
            r11.append(r13)
            int r4 = r4.getHeight()
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            java.lang.String r11 = "MicroMsg.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r4 = r3.f280241a
            java.lang.String r11 = "access$500"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r4 = r4.f277519I1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            if (r4 == 0) goto L_0x041e
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r4 = r3.f280241a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r4 = r4.f277519I1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r11 = r3.f280241a
            qs2.i0 r11 = r11.mo132541n8()
            java.lang.String r11 = r11.mo140739f()
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r13 = r3.f280241a
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r13 = r13.mo132540m8()
            r4.getClass()
            java.lang.String r14 = "checkShowHalfEggCard"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            java.lang.String r7 = "findHalfEggCardComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r15)
            r16 = 0
            if (r13 != 0) goto L_0x00b8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r15)
            goto L_0x00db
        L_0x00b8:
            java.util.Collection r13 = r13.mo131807R()
            java.util.Iterator r13 = r13.iterator()
        L_0x00c0:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x00d8
            java.lang.Object r17 = r13.next()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r17 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z) r17
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v r17 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119902m(r17)
            if (r17 == 0) goto L_0x00c0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r15)
            r7 = r17
            goto L_0x00dd
        L_0x00d8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r15)
        L_0x00db:
            r7 = r16
        L_0x00dd:
            java.lang.String r13 = "AdLandingPageEggCardHelper"
            if (r7 == 0) goto L_0x03d8
            r4.f274089F = r7
            r4.f274088E = r8
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = r1
            r1 = 1970(0x7b2, float:2.76E-42)
            r6.mo175911u(r1, r8)
            java.lang.String r1 = "adapterContentLayout"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            r19 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "adapterContentLayout, h="
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "AdLandingHalfEggCardComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.view.View r0 = r7.f276586n
            if (r0 != 0) goto L_0x0117
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            r20 = r9
            goto L_0x0175
        L_0x0117:
            if (r12 > 0) goto L_0x0138
            int r0 = r7.f276589q
            float r0 = (float) r0
            r12 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 * r12
            int r12 = (int) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r20 = r9
            java.lang.String r9 = "adapterContentLayout, use default, h="
            r0.append(r9)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x013a
        L_0x0138:
            r20 = r9
        L_0x013a:
            android.widget.FrameLayout r0 = r7.f273996t
            java.lang.String r9 = "mRoot"
            if (r0 == 0) goto L_0x03d2
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r12
            r0 = 36
            int r0 = vr2.C102260r.m134874n(r0)
            int r12 = r12 - r0
            float r0 = (float) r12
            r12 = 1141850112(0x440f4000, float:573.0)
            float r0 = r0 / r12
            r7.f273989J = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "disFactor="
            r0.append(r12)
            float r12 = r7.f273989J
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            float r0 = r7.f273989J
            r12 = 0
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x017d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
        L_0x0175:
            r24 = r3
            r22 = r5
            r21 = r10
            goto L_0x02d0
        L_0x017d:
            so2.m r0 = r7.f273995s
            r0.getClass()
            java.lang.String r12 = "getBackgroundImgW"
            r21 = r10
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            int r0 = r0.f297656C
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            if (r0 <= 0) goto L_0x01e7
            so2.m r0 = r7.f273995s
            r0.getClass()
            r22 = r5
            java.lang.String r5 = "getBackgroundImgH"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
            int r0 = r0.f297657D
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
            if (r0 <= 0) goto L_0x01e4
            android.widget.ImageView r0 = r7.f273997u
            java.lang.String r23 = "mBgView"
            if (r0 == 0) goto L_0x01e0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r24 = r3
            android.widget.ImageView r3 = r7.f273997u
            if (r3 == 0) goto L_0x01dc
            int r3 = r3.getWidth()
            r25 = r9
            so2.m r9 = r7.f273995s
            r9.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
            int r9 = r9.f297657D
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
            int r3 = r3 * r9
            so2.m r5 = r7.f273995s
            r5.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            int r5 = r5.f297656C
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            int r3 = r3 / r5
            r0.height = r3
            goto L_0x01ed
        L_0x01dc:
            gy3.C87412m.m108603p(r23)
            throw r16
        L_0x01e0:
            gy3.C87412m.m108603p(r23)
            throw r16
        L_0x01e4:
            r24 = r3
            goto L_0x01eb
        L_0x01e7:
            r24 = r3
            r22 = r5
        L_0x01eb:
            r25 = r9
        L_0x01ed:
            android.widget.TextView r0 = r7.f273998v
            java.lang.String r3 = "mTopTitleView"
            if (r0 == 0) goto L_0x03ce
            r5 = 1098907648(0x41800000, float:16.0)
            r7.mo130276O(r0, r5)
            android.widget.TextView r0 = r7.f273998v
            if (r0 == 0) goto L_0x03ca
            r3 = 1099431936(0x41880000, float:17.0)
            r7.mo130275N(r0, r3)
            android.widget.TextView r0 = r7.f273999w
            java.lang.String r3 = "mTitleView"
            if (r0 == 0) goto L_0x03c6
            r5 = 1103101952(0x41c00000, float:24.0)
            r7.mo130276O(r0, r5)
            android.widget.TextView r0 = r7.f273999w
            if (r0 == 0) goto L_0x03c2
            r3 = 1102053376(0x41b00000, float:22.0)
            r7.mo130275N(r0, r3)
            android.widget.TextView r0 = r7.f274000x
            java.lang.String r3 = "mDescView"
            if (r0 == 0) goto L_0x03be
            r5 = 1090519040(0x41000000, float:8.0)
            r7.mo130276O(r0, r5)
            android.widget.TextView r0 = r7.f274000x
            if (r0 == 0) goto L_0x03ba
            r3 = 1097859072(0x41700000, float:15.0)
            r7.mo130275N(r0, r3)
            android.widget.FrameLayout r0 = r7.f274001y
            java.lang.String r3 = "mCenterContainer"
            if (r0 == 0) goto L_0x03b6
            r5 = 1107296256(0x42000000, float:32.0)
            r7.mo130276O(r0, r5)
            android.widget.FrameLayout r0 = r7.f274001y
            if (r0 == 0) goto L_0x03b2
            java.lang.String r5 = "relativeLayoutParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0258
            r9 = 1127481344(0x43340000, float:180.0)
            int r9 = r7.mo130273K(r9)
            r0.width = r9
            r9 = 1131413504(0x43700000, float:240.0)
            int r9 = r7.mo130273K(r9)
            r0.height = r9
        L_0x0258:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            r0 = 1058013184(0x3f100000, float:0.5625)
            so2.m r5 = r7.f273995s
            so2.m$b r5 = r5.mo141127b()
            r5.getClass()
            java.lang.String r9 = "getImgWidth"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            int r5 = r5.f297670c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            if (r5 <= 0) goto L_0x02b2
            so2.m r5 = r7.f273995s
            so2.m$b r5 = r5.mo141127b()
            r5.getClass()
            java.lang.String r12 = "getImgHeight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            int r5 = r5.f297671d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            if (r5 <= 0) goto L_0x02b2
            so2.m r0 = r7.f273995s
            so2.m$b r0 = r0.mo141127b()
            r0.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            int r0 = r0.f297670c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            float r0 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r5
            so2.m r5 = r7.f273995s
            so2.m$b r5 = r5.mo141127b()
            r5.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            int r5 = r5.f297671d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            float r5 = (float) r5
            float r0 = r0 / r5
        L_0x02b2:
            android.widget.FrameLayout r5 = r7.f274001y
            if (r5 == 0) goto L_0x03ae
            android.widget.ImageView r3 = r7.f273981B
            if (r3 == 0) goto L_0x03a7
            r7.mo130271I(r5, r3, r0)
            android.widget.FrameLayout r0 = r7.f273980A
            if (r0 == 0) goto L_0x03a0
            r3 = 1109393408(0x42200000, float:40.0)
            r7.mo130276O(r0, r3)
            android.widget.FrameLayout r0 = r7.f273996t
            if (r0 == 0) goto L_0x039c
            r0.requestLayout()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
        L_0x02d0:
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper.m119904o(r11)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0362
            java.lang.String r1 = "showLocalCardAnim"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            android.view.View r3 = r7.f276586n
            if (r3 != 0) goto L_0x02e8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            goto L_0x033f
        L_0x02e8:
            r7.mo130274M()
            r7.mo130279R(r0)
            java.lang.String r3 = "isAutoJumpH5"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r8)
            boolean r4 = r7.f273993N
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
            java.lang.String r3 = "showLocalCardAnim, cardId="
            if (r4 == 0) goto L_0x0321
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = ", autoJumpH5=true"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r4 = 1
            r7.mo130281V(r4)
            qs2.i0 r2 = r7.mo131854m()
            r7.mo130277P(r2, r0, r4)
            goto L_0x033c
        L_0x0321:
            r4 = 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = ", false=true"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r7.mo130280U(r4)
        L_0x033c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
        L_0x033f:
            r1 = 2
            r2 = 1970(0x7b2, float:2.76E-42)
            r6.mo175911u(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkShowHalfEggCard pageId="
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ", localCardId="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x0397
        L_0x0362:
            long r0 = java.lang.System.currentTimeMillis()
            r4.mo130363u()
            r3 = 3
            r5 = 1970(0x7b2, float:2.76E-42)
            r6.mo175911u(r5, r3)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.d r3 = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.d
            r3.<init>(r4, r11, r0)
            java.lang.String r0 = "showReqCardAnim"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.view.View r1 = r7.f276586n
            if (r1 != 0) goto L_0x0385
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            goto L_0x0397
        L_0x0385:
            r7.f273988I = r3
            r7.mo130274M()
            android.os.Handler r1 = r7.f273991L
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y r2 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.y
            r2.<init>(r7)
            r1.post(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
        L_0x0397:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            r0 = 1
            goto L_0x03f0
        L_0x039c:
            gy3.C87412m.m108603p(r25)
            throw r16
        L_0x03a0:
            java.lang.String r0 = "mBtnCompContainer"
            gy3.C87412m.m108603p(r0)
            throw r16
        L_0x03a7:
            java.lang.String r0 = "mAnimView"
            gy3.C87412m.m108603p(r0)
            throw r16
        L_0x03ae:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03b2:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03b6:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03ba:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03be:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03c2:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03c6:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03ca:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03ce:
            gy3.C87412m.m108603p(r3)
            throw r16
        L_0x03d2:
            r25 = r9
            gy3.C87412m.m108603p(r25)
            throw r16
        L_0x03d8:
            r18 = r1
            r19 = r2
            r24 = r3
            r22 = r5
            r20 = r9
            r21 = r10
            r0 = 0
            r4.f274088E = r0
            java.lang.String r0 = "checkShowHalfEggCard failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            r0 = 0
        L_0x03f0:
            if (r0 == 0) goto L_0x0417
            r3 = r24
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r3.f280241a
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121812S7(r0)
            r0.getClass()
            java.lang.String r1 = "setEnableSlideToTop"
            r2 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "AdHalfScreenLandingPageHelper"
            java.lang.String r4 = "setEnableSlideToTop, enable=false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer r0 = r0.f274074b
            r3 = 0
            r0.setEnableSlideToTop(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x0419
        L_0x0417:
            r2 = r22
        L_0x0419:
            r0 = r20
            r1 = r21
            goto L_0x0425
        L_0x041e:
            r18 = r1
            r19 = r2
            r2 = r5
            r0 = r9
            r1 = r10
        L_0x0425:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x042e
        L_0x0429:
            r18 = r1
            r19 = r2
            r2 = r5
        L_0x042e:
            boolean r0 = vo2.C65833d.m77546a()
            if (r0 == 0) goto L_0x0456
            r0 = r26
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r1 = r0.f274083d
            java.lang.String r3 = "access$300"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            boolean r1 = r1.f274078f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            if (r1 != 0) goto L_0x0458
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r1 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            r2 = 0
            r1.onHalfScreenHeightChange(r2)
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r1 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            r2 = 0
            r3 = 1
            r1.onHalfScreenAnimationChange(r3, r2)
            goto L_0x0458
        L_0x0456:
            r0 = r26
        L_0x0458:
            r1 = r18
            r2 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94700b.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationRepeat(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$3");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$3");
    }
}
