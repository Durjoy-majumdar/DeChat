package gt0;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;

/* renamed from: gt0.t */
public class C45955t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ImageView f123962d;

    /* renamed from: e */
    public final /* synthetic */ TextView f123963e;

    public C45955t(C84926a aVar, ImageView imageView, TextView textView) {
        this.f123962d = imageView;
        this.f123963e = textView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f123962d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f123963e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
