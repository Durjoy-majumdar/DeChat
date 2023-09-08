package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import ob0.C11385n;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.y */
public class C6341y implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23234d;

    /* renamed from: e */
    public final /* synthetic */ String f23235e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23236f;

    public C6341y(MsgHandler msgHandler, C13851h1 h1Var, String str) {
        this.f23236f = msgHandler;
        this.f23234d = h1Var;
        this.f23235e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r26, int r27, java.lang.String r28, ob0.C117747y r29) {
        /*
            r25 = this;
            r0 = r25
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r1 = r0.f23236f
            android.app.ProgressDialog r1 = r1.f22700g
            r2 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x001a
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r1 = r0.f23236f
            android.app.ProgressDialog r1 = r1.f22700g
            r1.dismiss()
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r1 = r0.f23236f
            r1.f22700g = r2
        L_0x001a:
            java.lang.String r1 = "sendAppMessageToSpecifiedContact:fail"
            java.lang.String r3 = "MicroMsg.MsgHandler"
            if (r26 != 0) goto L_0x011a
            if (r27 != 0) goto L_0x011a
            r4 = r29
            com.tencent.mm.plugin.webview.model.m0 r4 = (com.tencent.p014mm.plugin.webview.model.C6047m0) r4
            ob0.c r4 = r4.f22341e
            if (r4 != 0) goto L_0x002d
            r4 = r2
            goto L_0x0033
        L_0x002d:
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            te3.mi4 r4 = (te3.mi4) r4
        L_0x0033:
            if (r4 == 0) goto L_0x0114
            java.lang.String r9 = r4.f138057e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r4 != 0) goto L_0x010e
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r0.f23236f
            android.content.Context r4 = r4.f22697d
            boolean r4 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r4 == 0) goto L_0x011f
            t83.h1 r4 = r0.f23234d
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f38983a
            java.lang.String r5 = "img_url"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            t83.h1 r5 = r0.f23234d
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f38983a
            java.lang.String r6 = "desc"
            java.lang.Object r5 = r5.get(r6)
            r17 = r5
            java.lang.String r17 = (java.lang.String) r17
            t83.h1 r5 = r0.f23234d
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f38983a
            java.lang.String r6 = "src_username"
            java.lang.Object r5 = r5.get(r6)
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11
            t83.h1 r5 = r0.f23234d
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f38983a
            java.lang.String r6 = "src_displayname"
            java.lang.Object r5 = r5.get(r6)
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            t83.h1 r5 = r0.f23234d
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f38983a
            java.lang.String r6 = "title"
            java.lang.Object r5 = r5.get(r6)
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r6 = r0.f23236f
            java.lang.String r8 = r0.f23235e
            r14 = 1
            android.content.Context r5 = r6.f22697d
            if (r5 == 0) goto L_0x00f6
            android.content.res.Resources r5 = r5.getResources()
            if (r5 != 0) goto L_0x009a
            goto L_0x00f6
        L_0x009a:
            android.content.Context r5 = r6.f22697d
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 != 0) goto L_0x00a7
            java.lang.String r4 = "showsSendAppMsgDialog fail, context is not activity"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            goto L_0x00fc
        L_0x00a7:
            java.lang.String r13 = r6.mo7218o6()
            java.lang.Class<ym.l> r5 = p763ym.C79138l.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ym.l r5 = (p763ym.C79138l) r5
            com.tencent.mm.pluginsdk.model.app.j r7 = r5.getAppInfo(r8)
            wd3.g1 r19 = wd3.C15148g1.C15149a.f41275a
            android.content.Context r5 = r6.f22697d
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            com.tencent.mm.ui.MMActivityController r20 = r5.getController()
            r21 = 0
            r22 = 1
            android.content.Context r5 = r6.f22697d
            android.content.res.Resources r5 = lg3.C76697h.m92348a(r5)
            r10 = 2131821677(0x7f11046d, float:1.9276104E38)
            java.lang.String r23 = r5.getString(r10)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.a0 r24 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.a0
            java.lang.String r15 = "sendAppMessageToSpecifiedContact:ok"
            java.lang.String r16 = "sendAppMessageToSpecifiedContact:fail"
            r5 = r24
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r10 = r19
            r11 = r20
            r12 = r18
            r13 = r4
            r14 = r17
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r24
            qo3.g r4 = r10.Sk0(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00fd
        L_0x00f6:
            java.lang.String r4 = "showSendAppMsgDialog fail, context or context.getResources() is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
        L_0x00fc:
            r4 = r2
        L_0x00fd:
            if (r4 != 0) goto L_0x010d
            java.lang.String r4 = "sendAppMessageToSpecifiedContact fail, cannot show dialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = r0.f23236f
            t83.h1 r4 = r0.f23234d
            r3.mo7210k5(r4, r1, r2)
            goto L_0x011f
        L_0x010d:
            return
        L_0x010e:
            java.lang.String r4 = "doSendAppMsgToSpecifiedContact request userName is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            goto L_0x011f
        L_0x0114:
            java.lang.String r4 = "TransIdResponse response is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            goto L_0x011f
        L_0x011a:
            java.lang.String r4 = "doSendAppMsgToSpecifiedContact request error is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
        L_0x011f:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = r0.f23236f
            t83.h1 r4 = r0.f23234d
            r3.mo7210k5(r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6341y.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
