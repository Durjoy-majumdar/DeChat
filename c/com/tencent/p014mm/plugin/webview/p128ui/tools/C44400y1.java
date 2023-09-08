package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import nj3.C76879j;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.y1 */
public class C44400y1 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ String f120343a;

    /* renamed from: b */
    public final /* synthetic */ WebViewUI f120344b;

    public C44400y1(WebViewUI webViewUI, String str) {
        this.f120344b = webViewUI;
        this.f120343a = str;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            WebViewUI webViewUI = this.f120344b;
            if (!webViewUI.f118513b1.mo67682L(this.f120343a)) {
                Log.m105922f("MicroMsg.WebViewUI", "showLoadUrlMenu, canLoadUrl fail, url = " + this.f120343a);
                WebViewUI webViewUI2 = this.f120344b;
                webViewUI2.getClass();
                Log.m105924i("MicroMsg.WebViewUI", "forceQuit");
                C61926c.m72669N(new C44198t1(webViewUI2));
                return;
            }
            this.f120344b.mo68248O8(this.f120343a, (Map<String, String>) null, false);
        } else if (i == 1) {
            Context applicationContext = this.f120344b.getApplicationContext();
            String str = this.f120343a;
            ClipboardHelper.setText(applicationContext, str, str);
        }
    }
}
