package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43860c;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C6160a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.k2 */
public class C44042k2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f119322d;

    public C44042k2(WebViewUI webViewUI) {
        this.f119322d = webViewUI;
    }

    public void run() {
        WebViewUI webViewUI = this.f119322d;
        webViewUI.f118513b1.mo67679J(webViewUI.f118578x2);
        WebViewUI webViewUI2 = this.f119322d;
        webViewUI2.getClass();
        Log.m105924i("MicroMsg.WebViewUI", "resetFloatBallInfo");
        C48590l lVar = webViewUI2.f118508Z;
        if (lVar != null && lVar.f130003h) {
            webViewUI2.mo68304q9(true, true);
        }
        webViewUI2.f118531h2.mo68761f(webViewUI2.f118513b1.getCurrentUrl());
        C43860c cVar = webViewUI2.f118513b1.f117678R0;
        if (!Util.isNullOrNil(cVar.f118781b)) {
            webViewUI2.setMMTitle(cVar.f118781b);
        }
        WebViewUIStyleHelper webViewUIStyleHelper = webViewUI2.f118477N1;
        if (webViewUIStyleHelper != null) {
            webViewUIStyleHelper.mo68381m();
        }
        try {
            cVar.f118780a = false;
            Iterator<C6160a> it = cVar.f118782c.iterator();
            while (it.hasNext()) {
                C6160a next = it.next();
                ((C44132q1) webViewUI2.f118492T1).mo7031V5(next.f22627a, next.f22628b);
            }
            cVar.f118780a = true;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.WebViewUI", "resetFloatBallInfo ex = %s ", e.getMessage());
        }
    }
}
