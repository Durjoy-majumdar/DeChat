package b80;

import android.graphics.Matrix;
import android.graphics.RectF;
import gy3.C87412m;

/* renamed from: b80.a */
public final class C104037a {

    /* renamed from: b */
    public static final RectF f307680b = new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f);

    /* renamed from: a */
    public final Matrix f307681a;

    public C104037a(boolean z, int i, RectF rectF) {
        C87412m.m108594g(rectF, "previewRect");
        Matrix matrix = new Matrix();
        matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate((float) i);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(f307680b, rectF, Matrix.ScaleToFit.FILL);
        matrix.setConcat(matrix2, matrix);
        Matrix matrix3 = new Matrix();
        matrix.invert(matrix3);
        this.f307681a = matrix3;
    }
}
