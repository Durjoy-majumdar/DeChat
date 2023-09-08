package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.MenuItem;
import fk3.C59141h;

/* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI$$d */
public class MediaHistoryGalleryUI$$d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MediaHistoryGalleryUI f284635d;

    public MediaHistoryGalleryUI$$d(MediaHistoryGalleryUI mediaHistoryGalleryUI) {
        this.f284635d = mediaHistoryGalleryUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C59141h hVar = this.f284635d.f284625t;
        if (hVar != null) {
            hVar.mo84355b();
        }
        this.f284635d.finish();
        return true;
    }
}
