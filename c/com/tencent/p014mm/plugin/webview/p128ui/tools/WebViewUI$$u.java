package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85878m2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$u */
public class WebViewUI$$u implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118656d;

    public WebViewUI$$u(WebViewUI webViewUI) {
        this.f118656d = webViewUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C85878m2.m106216e(this.f118656d.getTaskId(), (C85878m2.C85879a) null);
        C85861e4.m106119f(this.f118656d, true, true, (C85861e4.C85862a) null);
        return true;
    }
}
