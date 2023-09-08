package lq3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;

/* renamed from: lq3.b */
public final class C21459b extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ WxRefreshLayout f60756d;

    public C21459b(WxRefreshLayout wxRefreshLayout) {
        this.f60756d = wxRefreshLayout;
    }

    public void onAnimationEnd(Animator animator) {
        boolean z = false;
        if (animator != null && animator.getDuration() == 0) {
            z = true;
        }
        if (!z) {
            this.f60756d.setDirectLoadingState(true);
        }
    }
}
