package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import java.util.HashMap;
import nj3.C11184p0;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.h */
public final class C44261h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BaseWebViewController f119943d;

    public C44261h(BaseWebViewController baseWebViewController) {
        this.f119943d = baseWebViewController;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C48590l g0;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C48590l g05 = this.f119943d.mo67720g0();
            if (g05 != null) {
                g05.mo73243l("sendAppMessage", true);
                g05.mo73237f0((HashMap<String, String>) null, 0);
            }
        } else if (itemId == 2 && (g0 = this.f119943d.mo67720g0()) != null) {
            g0.mo73243l(C82980n.NAME, true);
            g0.mo73238g0(0, (HashMap<String, String>) null, 0);
        }
    }
}
