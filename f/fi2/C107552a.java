package fi2;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: fi2.a */
public final class C107552a {

    /* renamed from: a */
    public RectF f321787a = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: b */
    public float[] f321788b = new float[2];

    /* renamed from: c */
    public float f321789c = 1.0f;

    /* renamed from: d */
    public float f321790d = 1.0f;

    /* renamed from: fi2.a$a */
    public static final class C107553a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C107552a f321791d;

        /* renamed from: e */
        public final /* synthetic */ float f321792e;

        /* renamed from: f */
        public final /* synthetic */ float f321793f;

        /* renamed from: g */
        public final /* synthetic */ float f321794g;

        /* renamed from: h */
        public final /* synthetic */ float[] f321795h;

        /* renamed from: i */
        public final /* synthetic */ float[] f321796i;

        /* renamed from: j */
        public final /* synthetic */ C32227p<Matrix, Boolean, C13598b0> f321797j;

        public C107553a(C107552a aVar, float f, float f2, float f3, float[] fArr, float[] fArr2, C32227p<? super Matrix, ? super Boolean, C13598b0> pVar) {
            this.f321791d = aVar;
            this.f321792e = f;
            this.f321793f = f2;
            this.f321794g = f3;
            this.f321795h = fArr;
            this.f321796i = fArr2;
            this.f321797j = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C107552a aVar = this.f321791d;
            float f = this.f321792e;
            float f2 = this.f321793f;
            float f3 = this.f321794g;
            float[] fArr = this.f321795h;
            float[] fArr2 = this.f321796i;
            C32227p<Matrix, Boolean, C13598b0> pVar = this.f321797j;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Matrix matrix = new Matrix();
            float[] fArr3 = aVar.f321788b;
            boolean z = false;
            matrix.setTranslate(-fArr3[0], -fArr3[1]);
            float f4 = ((float) 1) - floatValue;
            float f5 = (f2 * floatValue) + (f * f4);
            matrix.postScale(f5, f5);
            matrix.postRotate(f3);
            matrix.postTranslate((fArr2[0] * floatValue) + (fArr[0] * f4), (fArr2[1] * floatValue) + (fArr[1] * f4));
            if (pVar != null) {
                if (floatValue == 1.0f) {
                    z = true;
                }
                pVar.invoke(matrix, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: a */
    public final void mo157995a(Matrix matrix, C32227p<? super Matrix, ? super Boolean, C13598b0> pVar) {
        Matrix matrix2 = matrix;
        C32227p<? super Matrix, ? super Boolean, C13598b0> pVar2 = pVar;
        C87412m.m108594g(matrix2, "matrix");
        float[] fArr = new float[2];
        matrix2.mapPoints(fArr, this.f321788b);
        boolean z = false;
        float f = fArr[0];
        RectF rectF = this.f321787a;
        float f2 = fArr[1];
        RectF rectF2 = this.f321787a;
        float[] fArr2 = {Math.max(rectF.left, Math.min(f, rectF.right)), Math.max(rectF2.top, Math.min(f2, rectF2.bottom))};
        float[] fArr3 = new float[9];
        matrix2.getValues(fArr3);
        double d = (double) fArr3[0];
        double d2 = (double) fArr3[3];
        double d3 = (double) fArr3[4];
        float sqrt = (float) Math.sqrt((d * d) + (d2 * d2));
        float round = (float) Math.round(Math.atan2(d2, d3) * 57.29577951308232d);
        float max = Math.max(this.f321789c, Math.min(sqrt, this.f321790d));
        if (sqrt == max) {
            if (fArr[0] == fArr2[0]) {
                if (fArr[1] == fArr2[1]) {
                    z = true;
                }
                if (z) {
                    if (pVar2 != null) {
                        pVar2.invoke(matrix2, Boolean.TRUE);
                        return;
                    }
                    return;
                }
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C107553a(this, sqrt, max, round, fArr, fArr2, pVar));
        ofFloat.start();
    }
}
