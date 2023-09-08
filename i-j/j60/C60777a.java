package j60;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import bf0.C16794b;
import gy3.C87412m;
import ky3.C88334c;

/* renamed from: j60.a */
public final class C60777a extends C16794b {

    /* renamed from: J */
    public final Bitmap f173100J;

    /* renamed from: K */
    public float f173101K;

    /* renamed from: L */
    public final int f173102L;

    /* renamed from: M */
    public final int f173103M;

    /* renamed from: N */
    public final int f173104N = C88334c.f255322d.mo122723h(0, 2);

    /* renamed from: O */
    public final float f173105O = 0.685f;

    /* renamed from: P */
    public final float f173106P = 1.4f;

    /* renamed from: Q */
    public final int f173107Q = 250;

    public C60777a(Bitmap bitmap, float f) {
        C87412m.m108594g(bitmap, "bitmap");
        this.f173100J = bitmap;
        this.f173101K = f;
        this.f173102L = bitmap.getWidth() / 2;
        this.f173103M = bitmap.getHeight() / 2;
    }

    /* renamed from: e */
    public void mo17820e(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4) {
        float f5;
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(matrix, "matrix");
        C87412m.m108594g(paint, "paint");
        float f6 = this.f173105O;
        if (f4 <= f6) {
            f5 = Math.max(f4 / (f6 / this.f173106P), 0.5f);
        } else {
            float f7 = (float) 1;
            f5 = Math.max((f7 - f4) / ((f7 - f6) / this.f173106P), 0.5f);
        }
        int alpha = paint.getAlpha();
        float f8 = this.f45373f;
        int i = this.f173107Q;
        matrix.preTranslate(f2 > f8 - ((float) i) ? this.f45372e : this.f45372e - ((((float) this.f173104N) * 0.5f) * ((f8 - ((float) i)) - f2)), f2);
        matrix.preScale(f5, f5, (float) this.f173102L, (float) this.f173103M);
        paint.setAlpha((int) (this.f173101K * 255.0f));
        canvas.drawBitmap(this.f173100J, matrix, paint);
        paint.setAlpha(alpha);
    }

    /* renamed from: f */
    public int mo17821f() {
        return this.f173100J.getHeight();
    }

    /* renamed from: g */
    public int mo17822g() {
        return this.f173100J.getWidth();
    }
}
