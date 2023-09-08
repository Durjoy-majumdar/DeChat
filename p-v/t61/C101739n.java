package t61;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.widget.ScaleRelativeLayout;

/* renamed from: t61.n */
public class C101739n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScaleRelativeLayout f297816d;

    public C101739n(ScaleRelativeLayout scaleRelativeLayout) {
        this.f297816d = scaleRelativeLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f297816d.f269107f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ScaleRelativeLayout scaleRelativeLayout = this.f297816d;
        View view = scaleRelativeLayout.f269113o;
        if (view != null) {
            view.setScaleX(scaleRelativeLayout.f269107f);
            view.setScaleY(scaleRelativeLayout.f269107f);
        }
    }
}
