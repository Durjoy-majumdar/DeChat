package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18326p0;
import com.tencent.p014mm.storage.C19623o0;
import te3.C22493dh;
import te3.C22495eh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.k0 */
public final class C18305k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18326p0.C18327a f50643d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50644e;

    /* renamed from: f */
    public final /* synthetic */ C22495eh f50645f;

    /* renamed from: g */
    public final /* synthetic */ C22493dh f50646g;

    /* renamed from: h */
    public final /* synthetic */ int f50647h;

    public C18305k0(C18326p0.C18327a aVar, C19623o0 o0Var, C22495eh ehVar, C22493dh dhVar, int i) {
        this.f50643d = aVar;
        this.f50644e = o0Var;
        this.f50645f = ehVar;
        this.f50646g = dhVar;
        this.f50647h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r27) {
        /*
            r26 = this;
            r6 = r26
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r27
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot$refreshUI$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r26
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.p0$a r0 = r6.f50643d
            com.tencent.mm.storage.o0 r1 = r6.f50644e
            te3.eh r2 = r6.f50645f
            te3.dh r3 = r6.f50646g
            int r4 = r6.f50647h
            r0.getClass()
            java.lang.Class<ex0.d> r5 = ex0.C45696d.class
            java.lang.String r7 = "info"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.String r7 = "appMsgBizInfo"
            gy3.C87412m.m108594g(r2, r7)
            java.lang.String r7 = "MicroMsg.BizTimeLineItem"
            if (r3 == 0) goto L_0x0159
            te3.me4 r8 = r1.mo25773w2()
            if (r8 == 0) goto L_0x0159
            te3.me4 r8 = r1.mo25773w2()
            gy3.C87412m.m108591d(r8)
            te3.oe4 r8 = r8.f64240e
            if (r8 != 0) goto L_0x0050
            goto L_0x0159
        L_0x0050:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1149(0x47d, double:5.677E-321)
            r12 = 4
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r10 = r3.f63755i
            r11 = 0
            r9[r11] = r10
            java.lang.String r10 = "onClick jump to url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r9)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r10 = r3.f63755i
            r12 = 169(0xa9, float:2.37E-43)
            r13 = 10000(0x2710, float:1.4013E-41)
            long r14 = java.lang.System.currentTimeMillis()
            int r15 = (int) r14
            int r15 = r15 / 1000
            java.lang.String r10 = com.tencent.p014mm.message.C92721n.m116874b(r10, r12, r13, r15, r1)
            java.lang.String r12 = "rawUrl"
            r9.putExtra(r12, r10)
            r12 = 56
            java.lang.String r13 = "geta8key_scene"
            r9.putExtra(r13, r12)
            java.lang.String r12 = r2.f63794e
            java.lang.String r13 = "geta8key_username"
            r9.putExtra(r13, r12)
            java.lang.String r12 = r2.f63794e
            java.lang.String r13 = "srcUsername"
            r9.putExtra(r13, r12)
            java.lang.String r12 = r2.f63795f
            java.lang.String r13 = "srcDisplayname"
            r9.putExtra(r13, r12)
            java.lang.String r12 = "rec_card"
            java.lang.String r13 = "prePublishId"
            r9.putExtra(r13, r12)
            java.lang.String r13 = "KPublisherId"
            r9.putExtra(r13, r12)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.p0 r12 = r0.f50729H
            java.lang.String r13 = "PAUSE_FOR_RESUME"
            r12.mo22899h(r1, r13)
            k40.a r12 = f40.C86709a0.m107533q(r5)
            ex0.d r12 = (ex0.C45696d) r12
            boolean r8 = r12.mo70957E5(r8)
            if (r8 == 0) goto L_0x00e5
            k40.a r5 = f40.C86709a0.m107533q(r5)
            r12 = r5
            ex0.d r12 = (ex0.C45696d) r12
            android.content.Context r13 = r0.f50726E
            int r15 = r3.f63760q
            r16 = 0
            r17 = 169(0xa9, float:2.37E-43)
            r18 = 10000(0x2710, float:1.4013E-41)
            r14 = r10
            r19 = r9
            boolean r5 = r12.Ms0(r13, r14, r15, r16, r17, r18, r19)
            if (r5 == 0) goto L_0x00e5
            java.lang.String r5 = "jump to TmplWebview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            goto L_0x00f0
        L_0x00e5:
            android.content.Context r5 = r0.f50726E
            r7 = 0
            java.lang.String r8 = "webview"
            java.lang.String r12 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r5, r8, r12, r9, r7)
        L_0x00f0:
            te3.re4 r5 = r1.mo25774x2()
            if (r5 == 0) goto L_0x0153
            r7 = 0
            android.net.Uri r9 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r12 = "idx"
            java.lang.String r12 = r9.getQueryParameter(r12)     // Catch:{ Exception -> 0x0110 }
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r11)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r12 = "mid"
            java.lang.String r9 = r9.getQueryParameter(r12)     // Catch:{ Exception -> 0x0110 }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r7)     // Catch:{ Exception -> 0x0110 }
        L_0x0110:
            r24 = r7
            qx0.a$a r7 = qx0.C22136a.C22137a.CLICK_REC
            qx0.C22136a.f62624g = r1
            int r8 = qx0.C22136a.f62622e
            qx0.C22136a.f62623f = r8
            qx0.C22136a.f62625h = r10
            qx0.C22136a.f62626i = r7
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r7 = r0.f50725D
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r7 = r7.f51443n
            r7.mo22976c(r1, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r7 = r0.f50725D
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r7 = r7.f51443n
            java.lang.String r8 = r2.f63794e
            r12 = 15
            r13 = 0
            long r14 = r5.f64519h
            te3.hb0 r2 = r5.f64523o
            java.lang.String r9 = r2.f63909n
            r18 = r9
            java.lang.String r9 = r5.f64522n
            r19 = r9
            java.lang.String r2 = r2.f63908j
            r20 = r2
            int r2 = r3.f63747F
            r21 = r2
            int r2 = r5.f64521j
            r22 = r2
            java.lang.String r2 = r3.f63748G
            r23 = r2
            java.lang.String r16 = ""
            r9 = r24
            r17 = r4
            r7.mo22986m(r8, r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0153:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r0.f50725D
            r0.mo23141f(r1, r4)
            goto L_0x015e
        L_0x0159:
            java.lang.String r0 = "onAppMsgClick appMsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x015e:
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$BizRecCardCommonSlot$refreshUI$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18305k0.onClick(android.view.View):void");
    }
}
