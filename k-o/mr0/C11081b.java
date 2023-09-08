package mr0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import junit.framework.Assert;
import lb0.C88394b;

/* renamed from: mr0.b */
public class C11081b implements C88394b.C88408j {

    /* renamed from: d */
    public int f32854d;

    /* renamed from: e */
    public int f32855e;

    public C11081b(int i, int i2) {
        boolean z = true;
        Assert.assertFalse(i == 0);
        Assert.assertFalse(i2 != 0 ? false : z);
        this.f32854d = i;
        this.f32855e = i2;
    }

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = this.f32855e;
        int i2 = this.f32854d;
        float f = ((float) i) / ((float) i2);
        Bitmap createBitmap = BitmapUtil.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect();
        rect.left = 0;
        rect.top = 0;
        float f2 = (float) height;
        float f3 = (float) width;
        if (f <= f2 / f3) {
            rect.right = width;
            rect.bottom = (int) (f3 * f);
        } else {
            rect.right = (int) (f2 / f);
            rect.bottom = height;
        }
        Rect rect2 = new Rect();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = this.f32854d;
        rect2.bottom = this.f32855e;
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
        return createBitmap;
    }

    public String key() {
        return String.format("Transformation_w%s_h%s", new Object[]{Integer.valueOf(this.f32854d), Integer.valueOf(this.f32855e)});
    }
}
