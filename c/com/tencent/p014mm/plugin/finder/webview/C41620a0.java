package com.tencent.p014mm.plugin.finder.webview;

import android.app.Activity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import pb1.C47453t0;

/* renamed from: com.tencent.mm.plugin.finder.webview.a0 */
public class C41620a0 implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f112038a;

    public C41620a0(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112038a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7610a(String str) {
        WebViewLongClickHelper webViewLongClickHelper = this.f112038a;
        if (!webViewLongClickHelper.mo64771h()) {
            try {
                ((C47453t0) C86312j.m106911c(C47453t0.class)).mo72473I2(webViewLongClickHelper.mo64769f().getInvoke().mo68120aI(str), 34, (Activity) webViewLongClickHelper.mo64767d(), new C41627c0(webViewLongClickHelper));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "favoriteUrl fail, ex = " + e.getMessage());
            }
        }
    }
}
