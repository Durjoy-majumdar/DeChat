package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.Animator;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.p */
public class C105556p implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C105562q f313966d;

    public C105556p(C105562q qVar) {
        this.f313966d = qVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        VideoPlayerTextureView videoPlayerTextureView = this.f313966d.f313989h;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.requestLayout();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
