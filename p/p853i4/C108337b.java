package p853i4;

import android.animation.TypeEvaluator;

/* renamed from: i4.b */
public class C108337b implements TypeEvaluator<float[]> {

    /* renamed from: a */
    public float[] f324360a;

    public C108337b(float[] fArr) {
        this.f324360a = fArr;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.f324360a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
