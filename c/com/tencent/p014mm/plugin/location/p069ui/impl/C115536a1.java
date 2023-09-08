package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.a1 */
public class C115536a1 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ TrackPointAnimAvatar f346493a;

    public C115536a1(TrackPointAnimAvatar trackPointAnimAvatar) {
        this.f346493a = trackPointAnimAvatar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f346493a.bringToFront();
        TrackPointAnimAvatar trackPointAnimAvatar = this.f346493a;
        trackPointAnimAvatar.f346487e.startAnimation(trackPointAnimAvatar.f346490h);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
