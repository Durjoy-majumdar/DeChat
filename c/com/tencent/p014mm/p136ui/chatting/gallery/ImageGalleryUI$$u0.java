package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.view.MenuItem;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$u0 */
public class ImageGalleryUI$$u0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284544d;

    public ImageGalleryUI$$u0(ImageGalleryUI imageGalleryUI) {
        this.f284544d = imageGalleryUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        ImageGalleryUI imageGalleryUI = this.f284544d;
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.getClass();
        C77407n nVar = new C77407n((Context) imageGalleryUI, 1, false);
        nVar.f225771i = new C97040c0(imageGalleryUI);
        nVar.f225782p = imageGalleryUI.f284480w2;
        nVar.mo107573q();
        return true;
    }
}
