package p161h8;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: h8.g */
public class C98320g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f288175a = new float[9];

    /* renamed from: b */
    public final float[] f288176b = new float[9];

    /* renamed from: c */
    public final Matrix f288177c = new Matrix();

    public Object evaluate(float f, Object obj, Object obj2) {
        ((Matrix) obj).getValues(this.f288175a);
        ((Matrix) obj2).getValues(this.f288176b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f288176b;
            float f2 = fArr[i];
            float f3 = this.f288175a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f288177c.setValues(this.f288176b);
        return this.f288177c;
    }
}
