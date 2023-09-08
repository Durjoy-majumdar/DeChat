package wl2;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: wl2.b */
public final class C15512b implements C15520i<C15511a> {
    /* renamed from: a */
    public int mo12981a(Object obj, int i, int i2) {
        C15511a aVar = (C15511a) obj;
        C87412m.m108594g(aVar, "request");
        float f = ((float) (i * i2)) / ((float) aVar.f42055c);
        if (f > 1.0f) {
            return (int) ((float) Math.ceil((double) ((float) Math.sqrt((double) f))));
        }
        return 1;
    }

    /* renamed from: b */
    public Bitmap mo12982b(Object obj, Bitmap bitmap) {
        C15511a aVar = (C15511a) obj;
        C87412m.m108594g(aVar, "request");
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(aVar.f42059a);
        if (exifOrientation != 90 && exifOrientation != 270) {
            return bitmap;
        }
        Log.m105925i("MicroMsg.AiImageCompressStrategy", "onTransform needRotate: %d", Integer.valueOf(exifOrientation));
        return BitmapUtil.rotate(bitmap, (float) exifOrientation);
    }

    /* renamed from: c */
    public boolean mo12983c(int i, int i2) {
        return true;
    }

    public String name() {
        return "MicroMsg.AiImageCompressStrategy";
    }
}
