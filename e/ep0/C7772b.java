package ep0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import junit.framework.Assert;
import lb0.C88394b;

/* renamed from: ep0.b */
public class C7772b implements C88394b.C88408j {

    /* renamed from: d */
    public int f26267d;

    /* renamed from: e */
    public int f26268e;

    /* renamed from: f */
    public int f26269f;

    /* renamed from: g */
    public int f26270g;

    public C7772b(int i, int i2, int i3, int i4) {
        boolean z = true;
        Assert.assertFalse(i3 == 0);
        Assert.assertFalse(i4 != 0 ? false : z);
        this.f26267d = i;
        this.f26268e = i2;
        this.f26269f = i3;
        this.f26270g = i4;
    }

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = this.f26267d;
        int i2 = this.f26268e;
        int i3 = i < 0 ? 0 : i > width ? width : i;
        int i4 = i2 < 0 ? 0 : i2 > height ? height : i2;
        int i5 = (this.f26269f + i) - i3;
        int i6 = (this.f26270g + i2) - i4;
        if (i3 + i5 > width) {
            i5 = width - i3;
        }
        if (i4 + i6 > height) {
            i6 = height - i4;
        }
        if (i5 <= 0 || i6 <= 0) {
            return BitmapUtil.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Bitmap createBitmap = BitmapUtil.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, new Rect(i3, i4, i3 + i5, i4 + i6), new Rect(0, 0, i5, i6), (Paint) null);
        return createBitmap;
    }

    public String key() {
        return String.format("Transformation_x%s_y%s_w%s_h%s", new Object[]{Integer.valueOf(this.f26267d), Integer.valueOf(this.f26268e), Integer.valueOf(this.f26269f), Integer.valueOf(this.f26270g)});
    }
}
