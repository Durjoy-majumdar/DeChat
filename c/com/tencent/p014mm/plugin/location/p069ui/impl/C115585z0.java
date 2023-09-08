package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.z0 */
public class C115585z0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ TrackPointAnimAvatar f346643a;

    public C115585z0(TrackPointAnimAvatar trackPointAnimAvatar) {
        this.f346643a = trackPointAnimAvatar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f346643a.bringToFront();
        TrackPointAnimAvatar trackPointAnimAvatar = this.f346643a;
        trackPointAnimAvatar.f346487e.startAnimation(trackPointAnimAvatar.f346491i);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
