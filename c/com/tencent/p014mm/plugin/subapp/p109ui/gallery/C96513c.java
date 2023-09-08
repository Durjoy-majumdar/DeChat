package com.tencent.p014mm.plugin.subapp.p109ui.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.c */
public class C96513c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ GestureGalleryTransAndOcrLogic f282412d;

    public C96513c(GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic) {
        this.f282412d = gestureGalleryTransAndOcrLogic;
    }

    public void onAnimationEnd(Animator animator) {
        this.f282412d.f282243h.setAlpha(0.0f);
    }

    public void onAnimationStart(Animator animator) {
        this.f282412d.f282243h.setAlpha(0.0f);
    }
}
