package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$v */
public class WebViewUI$$v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118657d;

    public WebViewUI$$v(WebViewUI webViewUI) {
        this.f118657d = webViewUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.setClassName(this.f118657d, "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI");
        intent.putExtra("entry_fix_tools", 1);
        WebViewUI webViewUI = this.f118657d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        WebViewUI webViewUI2 = webViewUI;
        C117292a.m165358d(webViewUI2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$36", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        webViewUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(webViewUI2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$36", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
