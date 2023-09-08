package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$m */
public class WebViewUI$$m implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118647d;

    public WebViewUI$$m(WebViewUI webViewUI) {
        this.f118647d = webViewUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f118647d.getIntent().getBooleanExtra("hide_close_btn", false)) {
            return true;
        }
        this.f118647d.hideVKB();
        this.f118647d.mo68262V8();
        Log.m105924i("MicroMsg.WebViewUI", "on back btn press");
        return true;
    }
}
