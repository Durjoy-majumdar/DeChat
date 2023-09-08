package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p200lx.C46900z;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$a */
public final /* synthetic */ class WebViewLongClickHelper$$a implements C46900z.C46901a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118420a;

    public /* synthetic */ WebViewLongClickHelper$$a(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118420a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public final void mo64788a() {
        WebViewLongClickHelper webViewLongClickHelper = this.f118420a;
        C77407n nVar = webViewLongClickHelper.f118397f;
        if (nVar != null && nVar.mo107563h()) {
            MMHandlerThread.postToMainThread(new C43845c1(webViewLongClickHelper));
        }
    }
}
