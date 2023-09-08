package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import pb1.C47453t0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.a1 */
public class C43831a1 implements C6686h2.C6687a {

    /* renamed from: a */
    public final /* synthetic */ WebViewLongClickHelper f118701a;

    public C43831a1(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118701a = webViewLongClickHelper;
    }

    /* renamed from: a */
    public void mo7610a(String str) {
        WebViewLongClickHelper webViewLongClickHelper = this.f118701a;
        if (!webViewLongClickHelper.mo68199m()) {
            try {
                ((C47453t0) C86312j.m106911c(C47453t0.class)).mo72473I2(webViewLongClickHelper.f118406o.getController().f117601y.mo68120aI(str), 34, webViewLongClickHelper.mo68194h(), webViewLongClickHelper.f118408q);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "favoriteUrl fail, ex = " + e.getMessage());
            }
        }
    }
}
