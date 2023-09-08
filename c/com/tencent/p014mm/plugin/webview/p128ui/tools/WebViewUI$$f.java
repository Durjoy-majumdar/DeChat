package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.RemoteException;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$f */
public class WebViewUI$$f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118598d;

    public WebViewUI$$f(WebViewUI webViewUI) {
        this.f118598d = webViewUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            this.f118598d.mo68248O8(this.f118598d.f118511a1.Dj0((String) null), (Map<String, String>) null, false);
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.WebViewUI", e, "[oneliang]feedback exception:%s", e.getMessage());
        }
        return false;
    }
}
