package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.storage.C19623o0;
import te3.ne4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.f2 */
public class C18243f2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50448d;

    /* renamed from: e */
    public final /* synthetic */ ne4 f50449e;

    /* renamed from: f */
    public final /* synthetic */ C18286h2 f50450f;

    public C18243f2(C18286h2 h2Var, C19623o0 o0Var, ne4 ne4) {
        this.f50450f = h2Var;
        this.f50448d = o0Var;
        this.f50449e = ne4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r23) {
        /*
            r22 = this;
            r6 = r22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r23
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r22
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.h2 r0 = r6.f50450f
            com.tencent.mm.storage.o0 r1 = r6.f50448d
            te3.ne4 r2 = r6.f50449e
            r0.getClass()
            java.lang.Class<ex0.d> r3 = ex0.C45696d.class
            java.lang.String r4 = "MicroMsg.BizTimeLineItem"
            if (r2 == 0) goto L_0x011c
            te3.me4 r5 = r1.mo25773w2()
            if (r5 == 0) goto L_0x011c
            te3.me4 r5 = r1.mo25773w2()
            te3.oe4 r5 = r5.f64240e
            if (r5 != 0) goto L_0x003f
            goto L_0x011c
        L_0x003f:
            te3.me4 r5 = r1.mo25773w2()
            te3.oe4 r5 = r5.f64240e
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1149(0x47d, double:5.677E-321)
            r10 = 4
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = r2.f64284g
            r10 = 0
            r8[r10] = r9
            java.lang.String r9 = "onClick jump to url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r8)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = r2.f64284g
            r11 = 138(0x8a, float:1.93E-43)
            r12 = 10000(0x2710, float:1.4013E-41)
            long r13 = java.lang.System.currentTimeMillis()
            int r14 = (int) r13
            int r14 = r14 / 1000
            java.lang.String r9 = com.tencent.p014mm.message.C92721n.m116873a(r9, r11, r12, r14)
            java.lang.String r11 = "rawUrl"
            r8.putExtra(r11, r9)
            r11 = 56
            java.lang.String r12 = "geta8key_scene"
            r8.putExtra(r12, r11)
            java.lang.String r11 = r5.f64334d
            java.lang.String r12 = "geta8key_username"
            r8.putExtra(r12, r11)
            java.lang.String r11 = r5.f64334d
            java.lang.String r12 = "srcUsername"
            r8.putExtra(r12, r11)
            java.lang.String r5 = r5.f64335e
            java.lang.String r11 = "srcDisplayname"
            r8.putExtra(r11, r5)
            java.lang.String r5 = "rec_card"
            java.lang.String r11 = "prePublishId"
            r8.putExtra(r11, r5)
            java.lang.String r11 = "KPublisherId"
            r8.putExtra(r11, r5)
            k40.a r5 = f40.C86709a0.m107533q(r3)
            ex0.d r5 = (ex0.C45696d) r5
            boolean r5 = r5.mo70957E5(r7)
            if (r5 == 0) goto L_0x00d1
            k40.a r3 = f40.C86709a0.m107533q(r3)
            r11 = r3
            ex0.d r11 = (ex0.C45696d) r11
            android.content.Context r12 = r0.f50824c
            int r14 = r2.f64288n
            r15 = 0
            r16 = 138(0x8a, float:1.93E-43)
            r17 = 10000(0x2710, float:1.4013E-41)
            r13 = r9
            r18 = r8
            boolean r2 = r11.Ms0(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x00d1
            java.lang.String r2 = "jump to TmplWebview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            goto L_0x00dc
        L_0x00d1:
            android.content.Context r2 = r0.f50824c
            r3 = 0
            java.lang.String r4 = "webview"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r2, r4, r5, r8, r3)
        L_0x00dc:
            te3.re4 r2 = r1.mo25774x2()
            if (r2 == 0) goto L_0x0116
            r3 = 0
            android.net.Uri r5 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r7 = "idx"
            java.lang.String r7 = r5.getQueryParameter(r7)     // Catch:{ Exception -> 0x00ff }
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r10)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r8 = "mid"
            java.lang.String r5 = r5.getQueryParameter(r8)     // Catch:{ Exception -> 0x00fc }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r3)     // Catch:{ Exception -> 0x00fc }
        L_0x00fc:
            r13 = r3
            r15 = r7
            goto L_0x0101
        L_0x00ff:
            r13 = r3
            r15 = 0
        L_0x0101:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r3 = r0.f50825d
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r11 = r3.f51443n
            java.lang.String r12 = r1.field_talker
            r16 = 15
            r17 = 0
            long r2 = r2.f64519h
            r20 = 1
            r21 = 0
            r18 = r2
            r11.mo22985l(r12, r13, r15, r16, r17, r18, r20, r21)
        L_0x0116:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r0.f50825d
            r0.mo23141f(r1, r10)
            goto L_0x0121
        L_0x011c:
            java.lang.String r0 = "onAppMsgClick appMsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x0121:
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18243f2.onClick(android.view.View):void");
    }
}
