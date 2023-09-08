package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: il1.o4 */
public final class C60480o4 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFixClickIssueRecyclerView f172397d;

    public C60480o4(FinderLiveFixClickIssueRecyclerView finderLiveFixClickIssueRecyclerView) {
        this.f172397d = finderLiveFixClickIssueRecyclerView;
    }

    public void onAnimationEnd(Animator animator) {
        this.f172397d.setAnimating(false);
        Log.m105924i("FinderLiveFixClickIssueRecyclerView", "resetTranslationY finish translationY:" + this.f172397d.getTranslationY() + '!');
    }
}
