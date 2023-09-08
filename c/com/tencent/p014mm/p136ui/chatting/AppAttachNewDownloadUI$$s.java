package com.tencent.p014mm.p136ui.chatting;

import android.view.MenuItem;
import eb0.C97625j3;
import k92.C108976d;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$s */
public class AppAttachNewDownloadUI$$s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56061d;

    public AppAttachNewDownloadUI$$s(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56061d = appAttachNewDownloadUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f56061d.f56033p != null) {
            C97625j3.m125815e().mo123458d(this.f56061d.f56033p);
        }
        C108976d dVar = this.f56061d.f56016Y;
        if (dVar != null && dVar.mo67896U(1, false)) {
            return true;
        }
        this.f56061d.finish();
        return true;
    }
}
