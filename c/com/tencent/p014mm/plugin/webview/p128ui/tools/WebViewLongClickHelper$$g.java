package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$g */
public class WebViewLongClickHelper$$g implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118430a;

    public WebViewLongClickHelper$$g(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118430a = webViewLongClickHelper;
    }

    public void onDismiss() {
        WebViewLongClickHelper.m47786c(this.f118430a, 5, (ImageQBarDataBean) null);
        WebViewLongClickHelper webViewLongClickHelper = this.f118430a;
        if (webViewLongClickHelper.f118396e != null) {
            try {
                webViewLongClickHelper.f118392a.clear();
                ((ScanCodeSheetItemLogic) this.f118430a.f118398g).mo67083n();
                WebViewLongClickHelper webViewLongClickHelper2 = this.f118430a;
                WebViewLongClickHelper.m47787d(webViewLongClickHelper2, webViewLongClickHelper2.f118396e.f123310c);
                this.f118430a.f118396e.mo71114b();
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "cancel capture failed");
            }
        }
    }
}
