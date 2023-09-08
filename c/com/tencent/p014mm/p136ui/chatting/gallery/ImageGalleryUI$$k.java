package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$k */
public class ImageGalleryUI$$k implements MMViewPager.C19691i {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284517a;

    public ImageGalleryUI$$k(ImageGalleryUI imageGalleryUI) {
        this.f284517a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo26046a() {
        ImageGalleryUI imageGalleryUI = this.f284517a;
        if (imageGalleryUI.f284475v) {
            Log.m105925i("MicroMsg.ImageGalleryUI", "%d handle single click event.", Integer.valueOf(imageGalleryUI.hashCode()));
            if (imageGalleryUI.f284441j == C97056h.C97067g.video) {
                imageGalleryUI.f284491z2 = false;
                if (imageGalleryUI.f284370K2) {
                    imageGalleryUI.mo135719B8();
                } else {
                    imageGalleryUI.mo135753X8(false);
                }
            } else if (imageGalleryUI.f284363I1 != 1) {
                imageGalleryUI.onBackPressed();
            }
        }
    }

    /* renamed from: b */
    public void mo26047b() {
        ImageGalleryUI imageGalleryUI = this.f284517a;
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135735O8();
    }
}
