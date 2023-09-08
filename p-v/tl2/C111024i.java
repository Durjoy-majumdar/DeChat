package tl2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import gy3.C87412m;

/* renamed from: tl2.i */
public final class C111024i extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f332497d;

    /* renamed from: tl2.i$a */
    public static final class C111025a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ScanGoodsMaskView f332498d;

        public C111025a(ScanGoodsMaskView scanGoodsMaskView) {
            this.f332498d = scanGoodsMaskView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C71029e eVar = this.f332498d.f315926W;
            if (eVar != null) {
                eVar.mo24256a(false);
            }
        }
    }

    public C111024i(ScanGoodsMaskView scanGoodsMaskView) {
        this.f332497d = scanGoodsMaskView;
    }

    public void onAnimationEnd(Animator animator) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        super.onAnimationEnd(animator);
        ImageView imageView = this.f332497d.f315930x;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (animate != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(200)) != null && (interpolator = duration.setInterpolator(new LinearInterpolator())) != null && (listener = interpolator.setListener(new C111025a(this.f332497d))) != null && (updateListener = listener.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null)) != null) {
                updateListener.start();
                return;
            }
            return;
        }
        C87412m.m108603p("successDecorationView");
        throw null;
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        C71029e eVar = this.f332497d.f315926W;
        if (eVar != null) {
            eVar.mo24257b();
        }
    }
}
