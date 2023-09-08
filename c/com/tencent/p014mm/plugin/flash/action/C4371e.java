package com.tencent.p014mm.plugin.flash.action;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.plugin.flash.action.e */
public class C4371e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ FaceFlashActionPreviewLayout f18997a;

    public C4371e(FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f18997a = faceFlashActionPreviewLayout;
    }

    public void onAnimationEnd(Animation animation) {
        this.f18997a.f18929g.setVisibility(4);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
