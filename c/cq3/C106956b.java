package cq3;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import cq3.C106952a;

/* renamed from: cq3.b */
public class C106956b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public float f320162d;

    /* renamed from: e */
    public int f320163e = 0;

    /* renamed from: f */
    public float f320164f = 0.0f;

    /* renamed from: g */
    public float f320165g = 0.0f;

    /* renamed from: h */
    public float f320166h = 0.0f;

    /* renamed from: i */
    public final /* synthetic */ C106952a.C106954b f320167i;

    public C106956b(C106952a.C106954b bVar) {
        this.f320167i = bVar;
        this.f320162d = (float) Math.pow((double) bVar.f320153d, 0.10000000149011612d);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        float floatValue3 = ((Float) valueAnimator.getAnimatedValue("rotation")).floatValue();
        if (this.f320163e < 10) {
            C106952a aVar = C106952a.this;
            Matrix matrix = aVar.f320132e;
            float f = this.f320162d;
            matrix.postScale(f, f, (float) aVar.getBoardRect().centerX(), (float) C106952a.this.getBoardRect().centerY());
            this.f320163e++;
        }
        C106952a.C106954b bVar = this.f320167i;
        float f2 = bVar.f320156g + (floatValue2 - this.f320165g);
        bVar.f320156g = f2;
        bVar.f320157h += floatValue - this.f320164f;
        C106952a aVar2 = C106952a.this;
        Matrix matrix2 = aVar2.f320132e;
        float centerX = f2 - aVar2.getCurImageRect().centerX();
        C106952a.C106954b bVar2 = this.f320167i;
        matrix2.postTranslate(centerX, bVar2.f320157h - C106952a.this.getCurImageRect().centerY());
        C106952a.C106954b bVar3 = this.f320167i;
        if (bVar3.f320158i != 0.0f) {
            C106952a.this.f320132e.postRotate(floatValue3 - this.f320166h, bVar3.f320156g, bVar3.f320157h);
        }
        C106952a.this.postInvalidate();
        this.f320164f = floatValue;
        this.f320165g = floatValue2;
        this.f320166h = floatValue3;
    }
}
