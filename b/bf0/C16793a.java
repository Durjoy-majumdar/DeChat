package bf0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: bf0.a */
public class C16793a extends C16794b {

    /* renamed from: J */
    public final Bitmap f45356J;

    /* renamed from: K */
    public final float f45357K;

    /* renamed from: L */
    public final float f45358L;

    public C16793a(Bitmap bitmap) {
        this.f45356J = bitmap;
        this.f45357K = ((float) bitmap.getWidth()) / 2.0f;
        this.f45358L = ((float) bitmap.getHeight()) / 2.0f;
    }

    /* renamed from: e */
    public void mo17820e(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4) {
        matrix.preTranslate(f, f2);
        matrix.preRotate(f3, this.f45357K, this.f45358L);
        canvas.drawBitmap(this.f45356J, matrix, paint);
    }

    /* renamed from: f */
    public int mo17821f() {
        return this.f45356J.getHeight();
    }

    /* renamed from: g */
    public int mo17822g() {
        return this.f45356J.getWidth();
    }
}
