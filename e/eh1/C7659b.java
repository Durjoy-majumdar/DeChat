package eh1;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: eh1.b */
public class C7659b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C7652a f25999d;

    public C7659b(C7652a aVar) {
        this.f25999d = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup = this.f25999d.f25984L;
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
