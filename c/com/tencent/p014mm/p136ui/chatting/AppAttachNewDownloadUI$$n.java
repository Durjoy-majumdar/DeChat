package com.tencent.p014mm.p136ui.chatting;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C11184p0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$n */
public class AppAttachNewDownloadUI$$n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f215149d;

    public AppAttachNewDownloadUI$$n(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f215149d = appAttachNewDownloadUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, this.f215149d.f55985A.equals("") ? this.f215149d.getString(C0966R.string.hfk) : this.f215149d.f55985A);
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f215149d;
        C76879j.m92726T(appAttachNewDownloadUI, appAttachNewDownloadUI.getString(C0966R.string.f7938wv));
    }
}
