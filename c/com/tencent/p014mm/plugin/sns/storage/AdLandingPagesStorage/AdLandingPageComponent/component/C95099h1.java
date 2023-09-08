package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import qs2.C101279m;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h1 */
public class C95099h1 extends C95108i0 {
    public C95099h1(Context context, C101279m mVar, ViewGroup viewGroup) {
        super(context, mVar, viewGroup);
        this.f276010t.mo90729c("canvasId", mVar.f296656Z);
        this.f276010t.mo90729c("canvasExt", mVar.f296657a0);
        if (mVar.f296712X) {
            this.f276010t.mo90728b("isJumpInHalfScreenStyle", 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0224  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130182P() {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "onBtnClick"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenCanvasBtnComp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            qs2.r r3 = r20.mo131626O()
            qs2.m r3 = (qs2.C101279m) r3
            java.lang.String r4 = "isAutoJump"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            boolean r6 = r0.f276029x
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r6 == 0) goto L_0x0022
            r4 = 20
            goto L_0x0024
        L_0x0022:
            r4 = 14
        L_0x0024:
            android.content.Context r6 = r0.f276579d
            java.lang.String r7 = r3.f296656Z
            java.lang.String r8 = r3.f296657a0
            int r3 = r3.f296658b0
            java.lang.String r9 = "openCanvas"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r2)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r11 = "sns_landig_pages_from_source"
            r10.putExtra(r11, r4)
            qs2.i0 r4 = r20.mo131854m()
            int r4 = r4.mo140738e()
            java.lang.String r11 = "sns_landig_pages_origin_from_source"
            r10.putExtra(r11, r4)
            java.lang.String r4 = ""
            java.lang.String r11 = "sns_landing_pages_xml"
            r10.putExtra(r11, r4)
            java.lang.String r11 = "getCanvasFromUx"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)
            qs2.r r12 = r20.mo131626O()
            qs2.m r12 = (qs2.C101279m) r12
            int r12 = r12.f296660d0
            r13 = 0
            r14 = 1
            if (r12 != r14) goto L_0x0069
            r12 = 1
            goto L_0x006a
        L_0x0069:
            r12 = 0
        L_0x006a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            if (r12 == 0) goto L_0x007c
            java.lang.String r12 = "sns_landing_pages_canvasid"
            r10.putExtra(r12, r7)
            java.lang.String r7 = "sns_landing_pages_canvas_ext"
            r10.putExtra(r7, r8)
            goto L_0x0086
        L_0x007c:
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r7)
            java.lang.String r12 = "sns_landing_pages_pageid"
            r10.putExtra(r12, r7)
        L_0x0086:
            java.lang.String r7 = "getNeedEnterAndExitAnimation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            qs2.r r8 = r20.mo131626O()
            qs2.m r8 = (qs2.C101279m) r8
            int r8 = r8.f296659c0
            if (r8 != r14) goto L_0x0097
            r8 = 1
            goto L_0x0098
        L_0x0097:
            r8 = 0
        L_0x0098:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            r12 = 2
            if (r8 == 0) goto L_0x00c9
            int[] r8 = new int[r12]
            android.widget.Button r15 = r0.f276027v
            r15.getLocationOnScreen(r8)
            r15 = r8[r14]
            java.lang.String r12 = "img_gallery_top"
            r10.putExtra(r12, r15)
            r8 = r8[r13]
            java.lang.String r12 = "img_gallery_left"
            r10.putExtra(r12, r8)
            android.widget.Button r8 = r0.f276027v
            int r8 = r8.getWidth()
            java.lang.String r12 = "img_gallery_width"
            r10.putExtra(r12, r8)
            android.widget.Button r8 = r0.f276027v
            int r8 = r8.getHeight()
            java.lang.String r12 = "img_gallery_height"
            r10.putExtra(r12, r8)
        L_0x00c9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            qs2.r r8 = r20.mo131626O()
            qs2.m r8 = (qs2.C101279m) r8
            int r8 = r8.f296659c0
            if (r8 != r14) goto L_0x00d8
            r8 = 1
            goto L_0x00d9
        L_0x00d8:
            r8 = 0
        L_0x00d9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            java.lang.String r7 = "sns_landing_pages_need_enter_and_exit_animation"
            r10.putExtra(r7, r8)
            java.lang.String r8 = "sns_landing_pages_extra"
            r10.putExtra(r8, r4)
            java.lang.String r8 = "sns_landing_pages_no_store"
            r10.putExtra(r8, r3)
            qs2.i0 r3 = r20.mo131854m()
            java.lang.String r3 = r3.mo140745l()
            java.lang.String r8 = "sns_landing_pages_ux_info"
            r10.putExtra(r8, r3)
            qs2.i0 r3 = r20.mo131854m()
            r3.getClass()
            java.lang.String r8 = "isNativeAd"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r12)
            boolean r3 = r3.f296618c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r12)
            java.lang.String r8 = "sns_landing_is_native_sight_ad"
            r10.putExtra(r8, r3)
            boolean r3 = r6 instanceof android.app.Activity
            if (r3 == 0) goto L_0x01a8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)
            qs2.r r8 = r20.mo131626O()
            qs2.m r8 = (qs2.C101279m) r8
            int r8 = r8.f296660d0
            if (r8 != r14) goto L_0x0129
            r8 = 1
            goto L_0x012a
        L_0x0129:
            r8 = 0
        L_0x012a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            if (r8 == 0) goto L_0x01a8
            qs2.i0 r8 = r20.mo131854m()
            int r8 = r8.mo140736c()
            r11 = 2
            if (r8 != r11) goto L_0x01a8
            r8 = r6
            android.app.Activity r8 = (android.app.Activity) r8
            android.content.Intent r11 = r8.getIntent()
            java.lang.String r12 = "sns_landing_pages_sessionId"
            java.lang.String r11 = r11.getStringExtra(r12)
            android.content.Intent r8 = r8.getIntent()
            java.lang.String r15 = "sns_landing_pages_ad_buffer"
            java.lang.String r8 = r8.getStringExtra(r15)
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r16 != 0) goto L_0x01a8
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r18
            java.lang.String r13 = java.lang.String.valueOf(r16)
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            r17 = r4
            java.lang.String r4 = "sessionId"
            r14.put(r4, r13)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r4 = "cid"
            r19 = r1
            qs2.r r1 = r20.mo131626O()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r1 = r1.f296495a     // Catch:{ Exception -> 0x0197 }
            r14.put(r4, r1)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r1 = "adBuffer"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x0197 }
            if (r4 != 0) goto L_0x0189
            r4 = r8
            goto L_0x018b
        L_0x0189:
            r4 = r17
        L_0x018b:
            r14.put(r1, r4)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r1 = "preSessionId"
            r14.put(r1, r11)     // Catch:{ Exception -> 0x0197 }
            goto L_0x0197
        L_0x0195:
            r19 = r1
        L_0x0197:
            java.lang.String r1 = r14.toString()
            java.lang.String r4 = "sns_landing_pages_search_extra"
            r10.putExtra(r4, r1)
            r10.putExtra(r12, r13)
            r10.putExtra(r15, r8)
            goto L_0x01aa
        L_0x01a8:
            r19 = r1
        L_0x01aa:
            if (r3 == 0) goto L_0x01cb
            r1 = r6
            android.app.Activity r1 = (android.app.Activity) r1
            android.content.Intent r4 = r1.getIntent()
            java.lang.String r8 = "sns_landing_pages_rawSnsId"
            java.lang.String r4 = r4.getStringExtra(r8)
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r11 = "sns_landing_pages_share_sns_id"
            java.lang.String r1 = r1.getStringExtra(r11)
            r10.putExtra(r8, r4)
            r10.putExtra(r11, r1)
        L_0x01cb:
            java.lang.String r1 = "isInFloatJumpComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            boolean r4 = r0.f276030y
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            if (r4 == 0) goto L_0x01e1
            if (r3 == 0) goto L_0x01e1
            java.lang.String r1 = "sns_landing_page_from_bonus"
            r4 = 1
            r10.putExtra(r1, r4)
        L_0x01e1:
            qs2.r r1 = r20.mo131626O()
            qs2.m r1 = (qs2.C101279m) r1
            if (r1 == 0) goto L_0x01f9
            boolean r4 = r1.f296712X
            if (r4 == 0) goto L_0x01f9
            r4 = 0
            r10.putExtra(r7, r4)
            java.lang.String r4 = "sns_landing_page_half_screen_mode"
            r5 = 1
            r10.putExtra(r4, r5)
            goto L_0x01fa
        L_0x01f9:
            r5 = 1
        L_0x01fa:
            qs2.i0 r4 = r20.mo131854m()
            boolean r4 = r4.mo140747n()
            if (r4 == 0) goto L_0x020a
            java.lang.String r4 = "sns_landing_page_open_from_half_screen_mode"
            r10.putExtra(r4, r5)
        L_0x020a:
            r4 = 0
            java.lang.String r5 = "sns"
            java.lang.String r7 = ".ui.SnsAdNativeLandingPagesPreviewUI"
            ke3.C88144b.m109791i(r6, r5, r7, r10, r4)
            if (r1 == 0) goto L_0x0224
            boolean r1 = r1.f296712X
            if (r1 == 0) goto L_0x0224
            if (r3 == 0) goto L_0x0227
            android.app.Activity r6 = (android.app.Activity) r6
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            r6.overridePendingTransition(r1, r1)
            goto L_0x0227
        L_0x0224:
            r20.mo131627Q()
        L_0x0227:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)
            r20.mo131613G()
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95099h1.mo130182P():void");
    }
}
