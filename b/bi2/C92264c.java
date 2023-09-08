package bi2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import gy3.C87412m;

/* renamed from: bi2.c */
public final class C92264c extends C92262a {

    /* renamed from: e */
    public Bitmap f264079e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92264c(Bitmap bitmap, Matrix matrix) {
        super(matrix);
        C87412m.m108594g(matrix, "matrix");
        this.f264079e = bitmap;
    }

    /* renamed from: b */
    public void mo126256b() {
    }

    /* renamed from: c */
    public void mo126257c(Canvas canvas, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        if (mo126261g()) {
            canvas.save();
            canvas.concat(this.f264072a);
            Bitmap bitmap = this.f264079e;
            C87412m.m108591d(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    /* renamed from: d */
    public void mo126258d() {
    }

    /* renamed from: e */
    public long mo126259e() {
        return MAlarmHandler.NEXT_FIRE_INTERVAL;
    }
}
