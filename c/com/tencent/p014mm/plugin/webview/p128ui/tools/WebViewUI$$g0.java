package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.app.Activity;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import j93.C46450c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$g0 */
public class WebViewUI$$g0 implements C46450c {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118601a;

    public WebViewUI$$g0(WebViewUI webViewUI) {
        this.f118601a = webViewUI;
    }

    /* renamed from: a */
    public int mo68334a() {
        C43522y yVar = this.f118601a.f118513b1;
        if (yVar != null) {
            return yVar.mo67698U().f122692i;
        }
        return 0;
    }

    /* renamed from: b */
    public int mo68335b() {
        return this.f118601a.f118454C1;
    }

    /* renamed from: c */
    public int mo68336c() {
        return this.f118601a.f118451B1;
    }

    /* renamed from: d */
    public MultiCodeMaskView mo68337d() {
        return this.f118601a.f118544n;
    }

    public Activity getContext() {
        return this.f118601a;
    }

    public BaseWebViewController getController() {
        return this.f118601a.f118513b1;
    }

    public int getWVTopOffset() {
        return this.f118601a.mo68296n8();
    }
}
