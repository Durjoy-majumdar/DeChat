package pi0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;

/* renamed from: pi0.f */
public class C110232f extends Canvas {

    /* renamed from: a */
    public Bitmap f329754a;

    public C110232f() {
    }

    /* renamed from: a */
    public void mo161638a(float f, float f2, float f3, float f4) {
        Bitmap bitmap = this.f329754a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f329754a.getWidth(), (float) this.f329754a.getHeight());
        RectF rectF2 = new RectF(f, f2, f3, f4);
        Region.Op op = Region.Op.DIFFERENCE;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.clipRect(rectF);
        canvas.clipRect(rectF2, op);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        if (createBitmap != null && !createBitmap.isRecycled()) {
            this.f329754a.eraseColor(0);
            drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            createBitmap.recycle();
        }
    }

    public void setBitmap(Bitmap bitmap) {
        super.setBitmap(bitmap);
        this.f329754a = bitmap;
    }

    public C110232f(Bitmap bitmap) {
        super(bitmap);
        this.f329754a = bitmap;
    }
}
