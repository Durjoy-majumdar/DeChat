package com.tencent.p014mm.plugin.voip.widget;

import android.animation.Animator;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voip.widget.b */
public class C106509b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ NewVideoTalkingSmallView f318208d;

    public C106509b(NewVideoTalkingSmallView newVideoTalkingSmallView) {
        this.f318208d = newVideoTalkingSmallView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f318208d.mo153138n();
        NewVideoTalkingSmallView newVideoTalkingSmallView = this.f318208d;
        newVideoTalkingSmallView.getClass();
        Log.m105924i("MicroMsg.Voip.NewVideoTalkingSmallView", "onRemoteReady");
        newVideoTalkingSmallView.mo153139o();
        newVideoTalkingSmallView.mo153142p();
        this.f318208d.f318179j.mo153117c();
        this.f318208d.f318179j.setAlpha(1.0f);
        this.f318208d.f318178i.setAlpha(1.0f);
        this.f318208d.mo153023g();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
