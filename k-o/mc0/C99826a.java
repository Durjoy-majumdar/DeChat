package mc0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gc0.C20830c;
import java.io.IOException;

/* renamed from: mc0.a */
public class C99826a {
    /* renamed from: a */
    public static Bitmap m130344a(C20830c cVar, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return BitmapUtil.extractThumbNailAssets(str, 0, 0);
        }
        try {
            return BitmapUtil.extractThumbNailAssets(str, i, i2);
        } catch (IOException e) {
            Log.m105921e("MicroMsg.imageloader.ImageLoaderUtils", "get bitmap from assert failed. :%s", e.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static Bitmap m130345b(C20830c cVar, byte[] bArr, int i, int i2, boolean z, float f, boolean z2, Bitmap.Config config) {
        Bitmap decodeByteArray = (i <= 0 || i2 <= 0) ? BitmapUtil.decodeByteArray(bArr, config) : BitmapUtil.decodeByteArray(bArr, i, i2, config);
        if (z) {
            decodeByteArray = BitmapUtil.extractThumbNail(BitmapUtil.decodeByteArray(bArr, i, i2, config), i, i2, false, true);
        }
        if (f > 0.0f) {
            decodeByteArray = BitmapUtil.setAlpha(decodeByteArray, f);
        }
        return z2 ? BitmapUtil.setGrayscale(decodeByteArray) : decodeByteArray;
    }
}
