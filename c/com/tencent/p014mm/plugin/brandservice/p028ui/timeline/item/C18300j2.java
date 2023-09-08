package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18321o2;
import com.tencent.p014mm.storage.C19623o0;
import te3.C22493dh;
import te3.C22495eh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.j2 */
public final class C18300j2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18321o2.C18322a f50615d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50616e;

    /* renamed from: f */
    public final /* synthetic */ C22495eh f50617f;

    /* renamed from: g */
    public final /* synthetic */ C22493dh f50618g;

    /* renamed from: h */
    public final /* synthetic */ int f50619h;

    public C18300j2(C18321o2.C18322a aVar, C19623o0 o0Var, C22495eh ehVar, C22493dh dhVar, int i) {
        this.f50615d = aVar;
        this.f50616e = o0Var;
        this.f50617f = ehVar;
        this.f50618g = dhVar;
        this.f50619h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r6 = r24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r25
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot$refreshUI$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r24
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.o2$a r0 = r6.f50615d
            com.tencent.mm.storage.o0 r1 = r6.f50616e
            te3.eh r2 = r6.f50617f
            te3.dh r3 = r6.f50618g
            int r4 = r6.f50619h
            r0.getClass()
            java.lang.Class<ex0.d> r5 = ex0.C45696d.class
            java.lang.String r7 = "info"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.String r7 = "appMsgBizInfo"
            gy3.C87412m.m108594g(r2, r7)
            java.lang.String r7 = "MicroMsg.BizTimeLineItem"
            if (r3 == 0) goto L_0x01c1
            te3.me4 r8 = r1.mo25773w2()
            if (r8 == 0) goto L_0x01c1
            te3.me4 r8 = r1.mo25773w2()
            gy3.C87412m.m108591d(r8)
            te3.oe4 r8 = r8.f64240e
            if (r8 != 0) goto L_0x0050
            goto L_0x01c1
        L_0x0050:
            java.lang.String r8 = r3.f63749H
            java.lang.String r9 = ""
            r10 = 0
            r11 = 0
            if (r8 == 0) goto L_0x009d
            java.lang.String r12 = "<finder_feed>"
            boolean r8 = z04.C112551y.m153819s(r8, r12, r11)
            if (r8 == 0) goto L_0x0069
            java.lang.String r8 = r3.f63749H
            java.lang.String r12 = "finder_feed"
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r12, r10)
            goto L_0x009e
        L_0x0069:
            java.lang.String r8 = r3.f63749H
            java.lang.String r12 = "appMsg.finderXmlContent"
            gy3.C87412m.m108593f(r8, r12)
            java.lang.String r12 = "~SEMI_XML~"
            boolean r8 = z04.C112551y.m153819s(r8, r12, r11)
            if (r8 == 0) goto L_0x009d
            java.lang.String r8 = r3.f63749H
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.SemiXml.decode(r8)
            if (r4 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            java.lang.String r9 = java.lang.String.valueOf(r4)
        L_0x0086:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = ".sysmsg.BizAccountRecommend.BizAccount"
            r12.append(r13)
            r12.append(r9)
            java.lang.String r9 = ".AppMsg"
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            goto L_0x009e
        L_0x009d:
            r8 = r10
        L_0x009e:
            if (r8 == 0) goto L_0x00ce
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ht1.t1 r12 = (ht1.C60200t1) r12
            r13 = 26
            r14 = 2
            r15 = 25
            java.lang.String r12 = r12.mo76842e7(r13, r14, r15, r10)
            java.lang.Class<ht1.p4> r13 = ht1.C60193p4.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ht1.p4 r13 = (ht1.C60193p4) r13
            android.content.Context r14 = r0.f50706E
            boolean r8 = r13.mo78731f7(r14, r9, r8, r12)
            if (r8 == 0) goto L_0x00ce
            java.lang.String r2 = "open finder success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r0.f50705D
            r0.mo23141f(r1, r4)
            goto L_0x01c6
        L_0x00ce:
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1149(0x47d, double:5.677E-321)
            r15 = 4
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r12 = r3.f63755i
            r9[r11] = r12
            java.lang.String r12 = "onClick jump to url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r9)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r12 = r3.f63755i
            r13 = 183(0xb7, float:2.56E-43)
            r14 = 10000(0x2710, float:1.4013E-41)
            long r10 = java.lang.System.currentTimeMillis()
            int r11 = (int) r10
            int r11 = r11 / 1000
            java.lang.String r10 = com.tencent.p014mm.message.C92721n.m116874b(r12, r13, r14, r11, r1)
            java.lang.String r11 = "rawUrl"
            r9.putExtra(r11, r10)
            r11 = 56
            java.lang.String r12 = "geta8key_scene"
            r9.putExtra(r12, r11)
            java.lang.String r11 = r2.f63794e
            java.lang.String r12 = "geta8key_username"
            r9.putExtra(r12, r11)
            java.lang.String r11 = r2.f63794e
            java.lang.String r12 = "srcUsername"
            r9.putExtra(r12, r11)
            java.lang.String r11 = r2.f63795f
            java.lang.String r12 = "srcDisplayname"
            r9.putExtra(r12, r11)
            java.lang.String r11 = "rec_card"
            java.lang.String r12 = "prePublishId"
            r9.putExtra(r12, r11)
            java.lang.String r12 = "KPublisherId"
            r9.putExtra(r12, r11)
            k40.a r11 = f40.C86709a0.m107533q(r5)
            ex0.d r11 = (ex0.C45696d) r11
            boolean r8 = r11.mo70957E5(r8)
            if (r8 == 0) goto L_0x015d
            k40.a r5 = f40.C86709a0.m107533q(r5)
            r13 = r5
            ex0.d r13 = (ex0.C45696d) r13
            android.content.Context r14 = r0.f50706E
            int r5 = r3.f63760q
            r17 = 0
            r18 = 183(0xb7, float:2.56E-43)
            r19 = 10000(0x2710, float:1.4013E-41)
            r15 = r10
            r16 = r5
            r20 = r9
            boolean r5 = r13.Ms0(r14, r15, r16, r17, r18, r19, r20)
            if (r5 == 0) goto L_0x015d
            java.lang.String r5 = "jump to TmplWebview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            goto L_0x0168
        L_0x015d:
            android.content.Context r5 = r0.f50706E
            java.lang.String r7 = "webview"
            java.lang.String r8 = ".ui.tools.WebViewUI"
            r11 = 0
            ke3.C88144b.m109791i(r5, r7, r8, r9, r11)
        L_0x0168:
            te3.re4 r5 = r1.mo25774x2()
            if (r5 == 0) goto L_0x01bb
            r7 = 0
            android.net.Uri r9 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x018b }
            java.lang.String r10 = "idx"
            java.lang.String r10 = r9.getQueryParameter(r10)     // Catch:{ Exception -> 0x018b }
            r11 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)     // Catch:{ Exception -> 0x018c }
            java.lang.String r11 = "mid"
            java.lang.String r9 = r9.getQueryParameter(r11)     // Catch:{ Exception -> 0x0189 }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r7)     // Catch:{ Exception -> 0x0189 }
        L_0x0189:
            r11 = r10
            goto L_0x018c
        L_0x018b:
            r11 = 0
        L_0x018c:
            r9 = r7
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r7 = r0.f50705D
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r7 = r7.f51443n
            java.lang.String r8 = r2.f63794e
            r12 = 15
            r13 = 0
            long r14 = r5.f64519h
            te3.hb0 r2 = r5.f64523o
            java.lang.String r12 = r2.f63909n
            r18 = r12
            java.lang.String r12 = r5.f64522n
            r19 = r12
            java.lang.String r2 = r2.f63908j
            r20 = r2
            int r2 = r3.f63747F
            r21 = r2
            int r2 = r5.f64521j
            r22 = r2
            java.lang.String r2 = r3.f63748G
            r23 = r2
            java.lang.String r16 = ""
            r17 = r4
            r12 = 15
            r7.mo22986m(r8, r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x01bb:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r0.f50705D
            r0.mo23141f(r1, r4)
            goto L_0x01c6
        L_0x01c1:
            java.lang.String r0 = "onAppMsgClick appMsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x01c6:
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot$refreshUI$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18300j2.onClick(android.view.View):void");
    }
}
