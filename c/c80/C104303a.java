package c80;

import android.graphics.Matrix;
import android.graphics.RectF;
import gy3.C87412m;

/* renamed from: c80.a */
public final class C104303a {

    /* renamed from: a */
    public final Matrix f308719a;

    public C104303a(boolean z, int i, RectF rectF, RectF rectF2) {
        C87412m.m108594g(rectF, "previewRect");
        C87412m.m108594g(rectF2, "cameraDriverRect");
        Matrix matrix = new Matrix();
        matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate((float) i);
        matrix.mapRect(rectF);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
        matrix.setConcat(matrix2, matrix);
        this.f308719a = matrix;
    }
}
