package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.q0 */
public class C105565q0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f314009d;

    public C105565q0(SightCaptureUI sightCaptureUI) {
        this.f314009d = sightCaptureUI;
    }

    public void onAnimationEnd(Animator animator) {
        this.f314009d.f313874p.setEnabled(true);
    }

    public void onAnimationStart(Animator animator) {
        this.f314009d.f313874p.setEnabled(false);
    }
}
