package is0;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import gy3.C87412m;

/* renamed from: is0.a */
public final class C87793a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C87794b f254162d;

    /* renamed from: e */
    public final /* synthetic */ Animation f254163e;

    /* renamed from: f */
    public final /* synthetic */ ValueAnimator f254164f;

    public C87793a(C87794b bVar, Animation animation, ValueAnimator valueAnimator) {
        this.f254162d = bVar;
        this.f254163e = animation;
        this.f254164f = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f254162d.f254166e != null) {
            Transformation transformation = new Transformation();
            if (this.f254163e.getTransformation(SystemClock.uptimeMillis(), transformation)) {
                C87794b bVar = this.f254162d;
                FrameLayout frameLayout = bVar.f254166e;
                C87412m.m108591d(frameLayout);
                Matrix matrix = transformation.getMatrix();
                bVar.getClass();
                if (matrix == null || matrix.isIdentity()) {
                    frameLayout.setPivotX((float) (frameLayout.getWidth() / 2));
                    frameLayout.setPivotY((float) (frameLayout.getHeight() / 2));
                    frameLayout.setTranslationX(0.0f);
                    frameLayout.setTranslationY(0.0f);
                    frameLayout.setScaleX(1.0f);
                    frameLayout.setScaleY(1.0f);
                    frameLayout.setRotation(0.0f);
                    return;
                }
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                float f = fArr[3];
                int i = 1;
                float sqrt = (float) Math.sqrt((double) (((float) 1) - (f * f)));
                if (fArr[0] < 0.0f) {
                    i = -1;
                }
                float f2 = sqrt * ((float) i);
                float f3 = fArr[2];
                float f4 = fArr[5];
                frameLayout.setPivotX(0.0f);
                frameLayout.setPivotY(0.0f);
                frameLayout.setTranslationX(f3);
                frameLayout.setTranslationY(f4);
                frameLayout.setRotation((float) Math.toDegrees(Math.atan2((double) f, (double) f2)));
                frameLayout.setScaleX(fArr[0] / f2);
                frameLayout.setScaleY(fArr[4] / f2);
                return;
            }
            this.f254164f.cancel();
            return;
        }
        this.f254164f.cancel();
    }
}
