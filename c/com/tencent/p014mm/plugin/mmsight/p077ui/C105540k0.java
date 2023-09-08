package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.k0 */
public class C105540k0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f313947d;

    public C105540k0(SightCaptureUI sightCaptureUI) {
        this.f313947d = sightCaptureUI;
    }

    public void onAnimationEnd(Animator animator) {
        this.f313947d.f313826E.setVisibility(8);
    }
}
