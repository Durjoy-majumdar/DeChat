package bi2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bi2.b */
public final class C92263b extends C92262a {

    /* renamed from: e */
    public final long f264076e;

    /* renamed from: f */
    public int f264077f;

    /* renamed from: g */
    public final List<Bitmap> f264078g = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92263b(Bitmap[] bitmapArr, long j, Matrix matrix) {
        super(matrix);
        C87412m.m108594g(matrix, "matrix");
        this.f264076e = j;
        if (bitmapArr != null) {
            Iterator a = C32617c.m39769a(bitmapArr);
            while (true) {
                C32616b bVar = (C32616b) a;
                if (bVar.hasNext()) {
                    Bitmap bitmap = (Bitmap) bVar.next();
                    if (bitmap != null) {
                        ((ArrayList) this.f264078g).add(bitmap);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo126256b() {
    }

    /* renamed from: c */
    public void mo126257c(Canvas canvas, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        if (!((ArrayList) this.f264078g).isEmpty()) {
            canvas.save();
            canvas.concat(this.f264072a);
            canvas.drawBitmap((Bitmap) ((ArrayList) this.f264078g).get(this.f264077f), 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    /* renamed from: d */
    public void mo126258d() {
    }

    /* renamed from: e */
    public long mo126259e() {
        if (((ArrayList) this.f264078g).isEmpty()) {
            return MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        int i = this.f264077f + 1;
        this.f264077f = i;
        this.f264077f = i % this.f264078g.size();
        return this.f264076e;
    }
}
