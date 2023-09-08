package nw2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import bf0.C16794b;
import gy3.C87412m;

/* renamed from: nw2.d */
public final class C61908d extends C16794b {

    /* renamed from: J */
    public final Bitmap f176013J;

    /* renamed from: K */
    public final int f176014K;

    /* renamed from: L */
    public final int f176015L;

    public C61908d(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        this.f176013J = bitmap;
        this.f176014K = bitmap.getWidth() / 2;
        this.f176015L = bitmap.getHeight() / 2;
    }

    /* renamed from: e */
    public void mo17820e(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(matrix, "matrix");
        C87412m.m108594g(paint, "paint");
        float f5 = ((float) 1) - f4;
        float max = Math.max(f5, 0.5f);
        float f6 = f4 < 0.3f ? f4 / 0.3f : ((double) f4) > 0.7d ? f5 / 0.3f : 1.0f;
        int alpha = paint.getAlpha();
        matrix.preTranslate(f, f2);
        matrix.preScale(max, max, (float) this.f176014K, (float) this.f176015L);
        paint.setAlpha((int) (f6 * ((float) 255)));
        canvas.drawBitmap(this.f176013J, matrix, paint);
        paint.setAlpha(alpha);
    }

    /* renamed from: f */
    public int mo17821f() {
        return this.f176013J.getHeight();
    }

    /* renamed from: g */
    public int mo17822g() {
        return this.f176013J.getWidth();
    }
}
