package uq1;

import android.graphics.Matrix;
import gy3.C87412m;

/* renamed from: uq1.n */
public final class C65451n {
    /* renamed from: a */
    public static final float m77120a(Matrix matrix) {
        C87412m.m108594g(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[3];
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }
}
