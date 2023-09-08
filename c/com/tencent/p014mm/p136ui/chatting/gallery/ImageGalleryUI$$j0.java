package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$j0 */
public class ImageGalleryUI$$j0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284516d;

    public ImageGalleryUI$$j0(ImageGalleryUI imageGalleryUI) {
        this.f284516d = imageGalleryUI;
    }

    public boolean onTimerExpired() {
        ImageGalleryUI imageGalleryUI = this.f284516d;
        if (imageGalleryUI.f284370K2) {
            if (!(imageGalleryUI.mo135724G8() || imageGalleryUI.f284397T0)) {
                this.f284516d.mo135719B8();
            }
        }
        return false;
    }
}
