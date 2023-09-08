package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import ea3.C45591h;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$c */
public class WebViewLongClickHelper$$c implements C45591h.C45595d {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118422a;

    public WebViewLongClickHelper$$c(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118422a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo64787a(String str) {
        if (!this.f118422a.mo68199m()) {
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "onCaptureFinish:" + str);
            long currentTimeMillis = System.currentTimeMillis();
            WebViewLongClickHelper.f118390t = currentTimeMillis;
            this.f118422a.f118401j.put(str, Long.valueOf(currentTimeMillis));
            MMWebView mMWebView = this.f118422a.f118406o.getController().f117553a;
            if (mMWebView == null) {
                Log.m105928w("MicroMsg.WebViewLongClickHelper", "onCaptureFinish webView is null");
                return;
            }
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new WebViewLongClickHelper.ScanImageData(str, WebViewLongClickHelper.f118390t, (float) this.f118422a.f118406o.mo68336c(), (float) this.f118422a.f118406o.mo68335b(), mMWebView.getMeasuredWidth(), mMWebView.getMeasuredHeight()), WebViewLongClickHelper$$j.class, new WebViewLongClickHelper$$i(new WeakReference(this.f118422a), str));
            this.f118422a.f118404m = Long.valueOf(System.currentTimeMillis());
        }
    }
}
