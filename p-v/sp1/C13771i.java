package sp1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.libpag.PAGView;

/* renamed from: sp1.i */
public final class C13771i extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ PAGView f38886d;

    public C13771i(PAGView pAGView) {
        this.f38886d = pAGView;
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("FinderLiveShopHotSellView", "sellAnim dismiss anim onAnimationEnd!");
        this.f38886d.setVisibility(8);
        this.f38886d.animate().setListener((Animator.AnimatorListener) null);
        this.f38886d.stop();
    }
}
