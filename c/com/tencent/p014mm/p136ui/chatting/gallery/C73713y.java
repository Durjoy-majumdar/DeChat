package com.tencent.p014mm.p136ui.chatting.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.ui.chatting.gallery.y */
public class C73713y extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f216455d;

    public C73713y(ImageGalleryUI imageGalleryUI) {
        this.f216455d = imageGalleryUI;
    }

    public void onAnimationEnd(Animator animator) {
        this.f216455d.f284378N1.setAlpha(0.0f);
    }

    public void onAnimationStart(Animator animator) {
        this.f216455d.f284378N1.setAlpha(0.0f);
    }
}
