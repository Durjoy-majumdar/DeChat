package gt0;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;

/* renamed from: gt0.u */
public class C45956u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ImageView f123964d;

    public C45956u(C84926a aVar, ImageView imageView) {
        this.f123964d = imageView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f123964d.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f123964d.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
