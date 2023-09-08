package vq2;

import android.animation.Animator;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.advideo.AdLandingVideoPlayerToolBar;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: vq2.b */
public class C102234b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ AdLandingVideoPlayerToolBar f301028d;

    public C102234b(AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar) {
        this.f301028d = adLandingVideoPlayerToolBar;
    }

    public void onAnimationCancel(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        ImageView imageView = this.f301028d.f274350f;
        if (imageView != null) {
            imageView.setClickable(true);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }

    public void onAnimationRepeat(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        ImageView imageView = this.f301028d.f274350f;
        if (imageView != null) {
            imageView.setClickable(false);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }
}
