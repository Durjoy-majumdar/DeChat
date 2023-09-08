package com.tencent.p014mm.p136ui.chatting;

import android.view.MenuItem;
import eb0.C97625j3;
import k92.C108976d;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$g */
public class AppAttachDownloadUI$$g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f55958d;

    public AppAttachDownloadUI$$g(AppAttachDownloadUI appAttachDownloadUI) {
        this.f55958d = appAttachDownloadUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f55958d.f55942q != null) {
            C97625j3.m125815e().mo123458d(this.f55958d.f55942q);
        }
        C108976d dVar = this.f55958d.f55925U;
        if (dVar != null && dVar.mo67896U(1, false)) {
            return true;
        }
        this.f55958d.finish();
        return true;
    }
}
