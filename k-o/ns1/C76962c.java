package ns1;

import android.animation.Animator;
import com.tencent.p014mm.plugin.finder.view.whatnews.FinderWhatsNewView;

/* renamed from: ns1.c */
public final class C76962c implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderWhatsNewView f224890d;

    public C76962c(FinderWhatsNewView finderWhatsNewView) {
        this.f224890d = finderWhatsNewView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f224890d.setTranslationX(0.0f);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
