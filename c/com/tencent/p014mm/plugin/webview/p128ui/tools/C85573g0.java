package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.g0 */
public class C85573g0 implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthUI f249454d;

    public C85573g0(SDKOAuthUI sDKOAuthUI) {
        this.f249454d = sDKOAuthUI;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        SDKOAuthUI sDKOAuthUI = this.f249454d;
        sDKOAuthUI.f249413f = i;
        int i2 = sDKOAuthUI.f249417j.getItem(i).f259829d;
        if (!(i2 == 0 || i2 == 1)) {
            SDKOAuthUI sDKOAuthUI2 = this.f249454d;
            sDKOAuthUI2.f249418n.mo108272g(view, i, j, sDKOAuthUI2, sDKOAuthUI2.f249410H, sDKOAuthUI2.f249414g, sDKOAuthUI2.f249415h);
        }
        return true;
    }
}
