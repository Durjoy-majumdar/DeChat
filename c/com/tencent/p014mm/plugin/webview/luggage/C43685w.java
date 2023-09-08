package com.tencent.p014mm.plugin.webview.luggage;

import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: com.tencent.mm.plugin.webview.luggage.w */
public class C43685w extends SyncTask<Integer> {

    /* renamed from: a */
    public final /* synthetic */ C43658n f118054a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43685w(C43658n nVar, long j, Integer num) {
        super(j, num);
        this.f118054a = nVar;
    }

    public Object run() {
        WebViewInputFooter webViewInputFooter = this.f118054a.f117953w;
        webViewInputFooter.setVisibility(0);
        LinearLayout linearLayout = webViewInputFooter.f119992q;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        webViewInputFooter.f119994s = true;
        webViewInputFooter.f119985g = 1;
        return Integer.valueOf(webViewInputFooter.mo68985c());
    }
}
