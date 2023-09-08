package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea3.C7608b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$a */
public final /* synthetic */ class SDKOAuthUI$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthUI f249431d;

    public /* synthetic */ SDKOAuthUI$$a(SDKOAuthUI sDKOAuthUI) {
        this.f249431d = sDKOAuthUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        SDKOAuthUI sDKOAuthUI = this.f249431d;
        int i = SDKOAuthUI.f249402I;
        sDKOAuthUI.getClass();
        Log.m105924i("MicroMsg.SdkOAuthUI", "checkNeedFaceDetect BackBtn click");
        C7608b.INSTANCE.mo8744a(sDKOAuthUI.f249411d, sDKOAuthUI.f249424t, 0, sDKOAuthUI.f249429y, sDKOAuthUI.mo118961N7(), 1, 0);
        sDKOAuthUI.mo118956I7(-2);
        sDKOAuthUI.finish();
        return true;
    }
}
