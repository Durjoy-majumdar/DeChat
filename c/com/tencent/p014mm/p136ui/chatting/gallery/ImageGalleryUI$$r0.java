package com.tencent.p014mm.p136ui.chatting.gallery;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$r0 */
public class ImageGalleryUI$$r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f284535d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284536e;

    public ImageGalleryUI$$r0(ImageGalleryUI imageGalleryUI, boolean z) {
        this.f284536e = imageGalleryUI;
        this.f284535d = z;
    }

    public void run() {
        if (this.f284535d) {
            ImageGalleryUI imageGalleryUI = this.f284536e;
            imageGalleryUI.f284354F1 = true;
            imageGalleryUI.mo135738Q7(1, false);
        }
    }
}
