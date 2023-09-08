package qj1;

import android.animation.Animator;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qj1.pd */
public final class C12602pd implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f36133d;

    public C12602pd(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
        this.f36133d = finderLiveRandomMatchLinkMicStatePlugin;
    }

    public void onAnimationCancel(Animator animator) {
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "animatorSet onAnimationCancel");
        this.f36133d.f15149s.setVisibility(4);
        this.f36133d.f15149s.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "animatorSet onAnimationEnd");
        this.f36133d.f15149s.setVisibility(4);
        this.f36133d.f15149s.setAlpha(1.0f);
        this.f36133d.mo3220a1();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
