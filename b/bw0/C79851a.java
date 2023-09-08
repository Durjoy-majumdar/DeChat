package bw0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import lb0.C88394b;

/* renamed from: bw0.a */
public class C79851a implements C88394b.C88408j {

    /* renamed from: d */
    public static final C79851a f234000d = new C79851a();

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        return (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) ? bitmap : BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) (bitmap.getWidth() / 2), false);
    }

    public String key() {
        return "FloatBallIcon";
    }
}
