package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.i1 */
public class C18745i1 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceRankListHeaderView f52456a;

    public C18745i1(ExdeviceRankListHeaderView exdeviceRankListHeaderView) {
        this.f52456a = exdeviceRankListHeaderView;
    }

    public void onAnimationEnd(Animation animation) {
        this.f52456a.f52438e.setVisibility(4);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.f52456a.f52438e.setVisibility(0);
    }
}
