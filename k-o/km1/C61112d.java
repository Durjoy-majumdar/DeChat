package km1;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import gy3.C87412m;

/* renamed from: km1.d */
public final class C61112d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePreviewView f173986d;

    public C61112d(NearbyLivePreviewView nearbyLivePreviewView) {
        this.f173986d = nearbyLivePreviewView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        NearbyLivePreviewView nearbyLivePreviewView = this.f173986d;
        if (nearbyLivePreviewView != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            nearbyLivePreviewView.setVolume(((Integer) animatedValue).intValue());
        }
    }
}
