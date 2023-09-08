package com.tencent.p014mm.plugin.finder.webview;

import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.webview.c0 */
public class C41627c0 implements C75018a.C75024d {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f112067a;

    public C41627c0(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112067a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7429a() {
        try {
            this.f112067a.mo64769f().getInvoke().favEditTag();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "favorite edittag fail, ex = " + e.getMessage());
        }
    }
}
