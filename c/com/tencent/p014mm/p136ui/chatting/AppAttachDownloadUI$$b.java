package com.tencent.p014mm.p136ui.chatting;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C11184p0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$b */
public class AppAttachDownloadUI$$b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f121493d;

    public AppAttachDownloadUI$$b(AppAttachDownloadUI appAttachDownloadUI) {
        this.f121493d = appAttachDownloadUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, this.f121493d.f55902A.equals("") ? this.f121493d.getString(C0966R.string.hfk) : this.f121493d.f55902A);
        AppAttachDownloadUI appAttachDownloadUI = this.f121493d;
        C76879j.m92726T(appAttachDownloadUI, appAttachDownloadUI.getString(C0966R.string.f7938wv));
    }
}
