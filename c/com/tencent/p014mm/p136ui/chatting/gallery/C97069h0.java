package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.ui.chatting.gallery.h0 */
public class C97069h0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284770a;

    public C97069h0(ImageGalleryUI imageGalleryUI) {
        this.f284770a = imageGalleryUI;
    }

    public void onAnimationEnd(Animation animation) {
        ImageGalleryUI imageGalleryUI = this.f284770a;
        if (!imageGalleryUI.f284370K2) {
            imageGalleryUI.mo135720C8();
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
