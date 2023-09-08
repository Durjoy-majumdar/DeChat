package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Callable;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$a0 */
public class WebViewUI$$a0 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ Callable f118588a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0 f118589b;

    public WebViewUI$$a0(WebViewUI webViewUI, Callable callable, C101218e0 e0Var) {
        this.f118588a = callable;
        this.f118589b = e0Var;
    }

    /* renamed from: a */
    public void mo2001a() {
        try {
            Log.m105924i("MicroMsg.WebViewUI", "notice button clicked!");
            this.f118588a.call();
            this.f118589b.mo140680z();
        } catch (Exception unused) {
        }
    }
}
