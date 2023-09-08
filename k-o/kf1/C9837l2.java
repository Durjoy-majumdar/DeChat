package kf1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedSnsAdHandler;

/* renamed from: kf1.l2 */
public final class C9837l2 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSnsAdHandler f30396d;

    public C9837l2(FinderFeedSnsAdHandler finderFeedSnsAdHandler) {
        this.f30396d = finderFeedSnsAdHandler;
    }

    public void onAnimationEnd(Animator animator) {
        this.f30396d.f13037q = null;
    }
}
