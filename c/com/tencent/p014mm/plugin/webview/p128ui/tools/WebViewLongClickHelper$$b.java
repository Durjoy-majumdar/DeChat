package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$b */
public class WebViewLongClickHelper$$b implements C75018a.C75024d {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118421a;

    public WebViewLongClickHelper$$b(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118421a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7429a() {
        try {
            this.f118421a.f118406o.getController().f117601y.favEditTag();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "favorite edittag fail, ex = " + e.getMessage());
        }
    }
}
