package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$q */
public class WebViewUI$$q implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118650d;

    public WebViewUI$$q(WebViewUI webViewUI) {
        this.f118650d = webViewUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLongClick(android.view.View r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r15)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$30"
            java.lang.String r2 = "android/view/View$OnLongClickListener"
            java.lang.String r3 = "onLongClick"
            java.lang.String r4 = "(Landroid/view/View;)Z"
            r5 = r14
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r15 = r14.f118650d
            android.content.Intent r15 = r15.getIntent()
            java.lang.String r0 = "show_long_click_popup_menu"
            r1 = 1
            boolean r15 = r15.getBooleanExtra(r0, r1)
            if (r15 == 0) goto L_0x00d3
            java.lang.String r15 = "MicroMsg.WebViewUI"
            r0 = 0
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r14.f118650d     // Catch:{ Exception -> 0x0036 }
            com.tencent.mm.ui.widget.MMWebView r2 = r2.f118523f     // Catch:{ Exception -> 0x0036 }
            com.tencent.xweb.WebView$HitTestResult r2 = r2.getHitTestResult()     // Catch:{ Exception -> 0x0036 }
            goto L_0x0045
        L_0x0036:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r3[r0] = r2
            java.lang.String r2 = "getHitTestResult exp %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r3)
            r2 = 0
        L_0x0045:
            if (r2 == 0) goto L_0x00c0
            java.lang.String r3 = r2.getExtra()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0053
            goto L_0x00c0
        L_0x0053:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r14.f118650d     // Catch:{ Exception -> 0x0075 }
            com.tencent.mm.plugin.webview.stub.l r3 = r3.f118511a1     // Catch:{ Exception -> 0x0075 }
            java.lang.String r4 = r2.getExtra()     // Catch:{ Exception -> 0x0075 }
            boolean r3 = r3.mo68112U0(r4)     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0090
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r14.f118650d     // Catch:{ Exception -> 0x0073 }
            com.tencent.mm.plugin.webview.stub.l r4 = r4.f118511a1     // Catch:{ Exception -> 0x0073 }
            java.lang.String r5 = r2.getExtra()     // Catch:{ Exception -> 0x0073 }
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = r14.f118650d     // Catch:{ Exception -> 0x0073 }
            int r6 = r6.mo68267Y7()     // Catch:{ Exception -> 0x0073 }
            r4.mo68096Hz(r5, r6)     // Catch:{ Exception -> 0x0073 }
            goto L_0x0090
        L_0x0073:
            r4 = move-exception
            goto L_0x0078
        L_0x0075:
            r3 = move-exception
            r4 = r3
            r3 = 1
        L_0x0078:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "postBinded, handleEvents, ex = "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r4)
        L_0x0090:
            if (r3 != 0) goto L_0x00bd
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r15 = r14.f118650d
            java.lang.String r2 = r2.getExtra()
            android.webkit.WebSettings$RenderPriority r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.f118442D2
            r15.getClass()
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 2131834299(0x7f1135bb, float:1.9301704E38)
            java.lang.String r4 = kg3.C76577a.m92166q(r15, r4)
            r3[r0] = r4
            r0 = 2131834288(0x7f1135b0, float:1.9301682E38)
            java.lang.String r0 = kg3.C76577a.m92166q(r15, r0)
            r3[r1] = r0
            com.tencent.mm.plugin.webview.ui.tools.y1 r0 = new com.tencent.mm.plugin.webview.ui.tools.y1
            r0.<init>(r15, r2)
            java.lang.String r4 = ""
            nj3.C76879j.m92736g(r15, r2, r3, r4, r0)
            goto L_0x00be
        L_0x00bd:
            r1 = r3
        L_0x00be:
            r0 = r1
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r1 = "hittestresult getExtra is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
        L_0x00c5:
            java.lang.String r4 = "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$30"
            java.lang.String r5 = "android/view/View$OnLongClickListener"
            java.lang.String r6 = "onLongClick"
            java.lang.String r7 = "(Landroid/view/View;)Z"
            r2 = r0
            r3 = r14
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x00d3:
            r8 = 1
            java.lang.String r10 = "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$30"
            java.lang.String r11 = "android/view/View$OnLongClickListener"
            java.lang.String r12 = "onLongClick"
            java.lang.String r13 = "(Landroid/view/View;)Z"
            r9 = r14
            j20.C117292a.m165362h(r8, r9, r10, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$q.onLongClick(android.view.View):boolean");
    }
}
