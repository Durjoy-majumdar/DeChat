package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$n0 */
public class ImageGalleryUI$$n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f284525d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284526e;

    public ImageGalleryUI$$n0(ImageGalleryUI imageGalleryUI, C72963f4 f4Var) {
        this.f284526e = imageGalleryUI;
        this.f284525d = f4Var;
    }

    public void run() {
        ImageGalleryUI imageGalleryUI = this.f284526e;
        C72963f4 f4Var = this.f284525d;
        boolean z = f4Var != null && f4Var.mo101016t3();
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135738Q7(5, z);
        this.f284526e.f284393S.setVisibility(0);
    }
}
