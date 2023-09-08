package es0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import lb0.C88394b;

/* renamed from: es0.j */
public class C86667j implements C88394b.C88408j {

    /* renamed from: f */
    public static final C86667j f251650f = new C86667j();

    /* renamed from: d */
    public int f251651d = 0;

    /* renamed from: e */
    public int f251652e = 0;

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return bitmap;
        }
        if (bitmap.getWidth() == bitmap.getHeight()) {
            int i = this.f251651d;
            float f = (float) i;
            if (this.f251652e > 0 && i > 0) {
                f = (float) ((i * bitmap.getWidth()) / this.f251652e);
            }
            return BitmapUtil.getRoundedCornerBitmap(bitmap, false, f);
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (min <= 0) {
            min = Math.max(bitmap.getWidth(), bitmap.getHeight());
        }
        Bitmap centerCropBitmap = BitmapUtil.getCenterCropBitmap(bitmap, min, min, true);
        int i2 = this.f251651d;
        float f2 = (float) i2;
        if (this.f251652e > 0 && i2 > 0) {
            f2 = (float) ((i2 * centerCropBitmap.getWidth()) / this.f251652e);
        }
        return BitmapUtil.getRoundedCornerBitmap(centerCropBitmap, false, f2);
    }

    public String key() {
        return "WxaRecommendIcon";
    }
}
