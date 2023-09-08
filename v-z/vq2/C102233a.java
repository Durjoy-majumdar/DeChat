package vq2;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p104ad.widget.advideo.AdLandingVideoPlayerToolBar;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: vq2.a */
public class C102233a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ AdLandingVideoPlayerToolBar f301027d;

    public C102233a(AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar) {
        this.f301027d = adLandingVideoPlayerToolBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$1");
        ViewGroup.LayoutParams layoutParams = this.f301027d.getLayoutParams();
        layoutParams.width = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f301027d.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$1");
    }
}
