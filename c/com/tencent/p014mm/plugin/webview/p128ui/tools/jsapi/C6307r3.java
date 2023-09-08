package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import ob0.C11385n;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.r3 */
public class C6307r3 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23161d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23162e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23163f;

    public C6307r3(MsgHandler msgHandler, C13851h1 h1Var, MsgHandler msgHandler2) {
        this.f23163f = msgHandler;
        this.f23161d = h1Var;
        this.f23162e = msgHandler2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r3 = r3.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r3, int r4, java.lang.String r5, ob0.C117747y r6) {
        /*
            r2 = this;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r5 = r2.f23163f
            android.app.ProgressDialog r5 = r5.f22700g
            r0 = 0
            if (r5 == 0) goto L_0x0018
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L_0x0018
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r5 = r2.f23163f
            android.app.ProgressDialog r5 = r5.f22700g
            r5.dismiss()
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r5 = r2.f23163f
            r5.f22700g = r0
        L_0x0018:
            ob0.b0 r5 = f40.C86709a0.m107524d()
            r1 = 1393(0x571, float:1.952E-42)
            r5.mo123470p(r1, r2)
            r5 = -1
            java.lang.String r1 = "selectEnterpriseContact:fail"
            if (r3 != 0) goto L_0x0052
            if (r4 == 0) goto L_0x002a
            goto L_0x0052
        L_0x002a:
            com.tencent.mm.plugin.webview.model.y r6 = (com.tencent.p014mm.plugin.webview.model.C6066y) r6
            ob0.c r3 = r6.f22366e
            if (r3 == 0) goto L_0x0039
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x0039
            te3.hw1 r3 = (te3.C49761hw1) r3
            goto L_0x003a
        L_0x0039:
            r3 = r0
        L_0x003a:
            if (r3 == 0) goto L_0x0053
            te3.am3 r4 = r3.f134911d
            if (r4 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            int r5 = r4.f130638d
            java.lang.String r4 = r4.f130639e
            if (r4 == 0) goto L_0x0053
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0053
            te3.am3 r4 = r3.f134911d
            java.lang.String r1 = r4.f130639e
            goto L_0x0053
        L_0x0052:
            r3 = r0
        L_0x0053:
            if (r5 == 0) goto L_0x005d
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = r2.f23163f
            t83.h1 r4 = r2.f23161d
            r3.mo7210k5(r4, r1, r0)
            return
        L_0x005d:
            java.lang.String r3 = r3.f134912e
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "rawUrl"
            r4.putExtra(r5, r3)
            r3 = 1
            java.lang.String r5 = "useJs"
            r4.putExtra(r5, r3)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = r2.f23163f
            android.content.Context r3 = r3.f22697d
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r5 = r2.f23162e
            r3.mmSetOnActivityResultCallback(r5)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = r2.f23163f
            android.content.Context r3 = r3.f22697d
            r5 = 53
            java.lang.String r6 = "webview"
            java.lang.String r0 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109795m(r3, r6, r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6307r3.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
