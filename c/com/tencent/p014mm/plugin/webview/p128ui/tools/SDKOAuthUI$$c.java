package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import nj3.C11184p0;
import nj3.C76879j;
import ob0.C117747y;
import p154fy.C87121j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$c */
public class SDKOAuthUI$$c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthUI f249433d;

    public SDKOAuthUI$$c(SDKOAuthUI sDKOAuthUI) {
        this.f249433d = sDKOAuthUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SDKOAuthUI sDKOAuthUI = this.f249433d;
        Log.m105925i("MicroMsg.SdkOAuthUI", "doDelAvatar appid: %s", sDKOAuthUI.f249411d);
        sDKOAuthUI.mo118958K7();
        sDKOAuthUI.f249416i = C76879j.m92723Q(sDKOAuthUI, (String) null, sDKOAuthUI.getString(C0966R.string.a4d), true, true, new C85575i0(sDKOAuthUI));
        C86709a0.m107524d().mo123460f((C117747y) ((C87121j) C86312j.m106911c(C87121j.class)).ch0(sDKOAuthUI.f249417j.getItem(sDKOAuthUI.f249413f).f259829d));
    }
}
