package p1093bh;

import android.animation.ValueAnimator;
import z20.C112571a;

/* renamed from: bh.e */
public class C104095e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C104090d f307938d;

    public C104095e(C104090d dVar) {
        this.f307938d = dVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("bg_alpha")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("alpha")).intValue();
        C112571a aVar = this.f307938d.f307928y;
        aVar.getClass();
        C112571a.f337053u.setAlpha(intValue2);
        C112571a.f337049q.setAlpha(intValue2);
        int i = (int) (((float) intValue2) * 0.7058824f);
        aVar.f337058g = i;
        C112571a.f337052t.setAlpha(i);
        this.f307938d.f307928y.getClass();
        C112571a.f337051s.setAlpha((int) (((float) intValue) * 0.9019608f));
        this.f307938d.mo145704o();
    }
}
