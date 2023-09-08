package kz2;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.io.IOException;
import zt3.C119157j;

/* renamed from: kz2.g */
public final class C76658g {

    /* renamed from: kz2.g$a */
    public static final class C76659a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<Object> f224347d;

        public C76659a(C32224a<? extends Object> aVar) {
            this.f224347d = aVar;
        }

        public final void run() {
            this.f224347d.invoke();
        }
    }

    /* renamed from: a */
    public static final void m92307a(C32224a<? extends Object> aVar) {
        C87412m.m108594g(aVar, "callback");
        ((C119157j) C119157j.f356862d).mo183875f(new C76659a(aVar));
    }

    /* renamed from: b */
    public static final Bitmap m92308b(String str) {
        Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(str);
        if (decodeFileWithSample != null) {
            int width = decodeFileWithSample.getWidth();
            int height = decodeFileWithSample.getHeight();
            int maxTextureSize = ForceGpuUtil.getMaxTextureSize();
            if (width > maxTextureSize) {
                decodeFileWithSample = BitmapUtil.getCenterCropBitmap(decodeFileWithSample, maxTextureSize, decodeFileWithSample.getHeight(), true);
            } else if (height > maxTextureSize) {
                decodeFileWithSample = BitmapUtil.getCenterCropBitmap(decodeFileWithSample, decodeFileWithSample.getWidth(), maxTextureSize, true);
            }
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
        return exifOrientation == 0 ? decodeFileWithSample : BitmapUtil.rotateAndScale(decodeFileWithSample, (float) exifOrientation, 1.0f, 1.0f);
    }

    /* renamed from: c */
    public static final void m92309c(Bitmap bitmap, String str) {
        C87412m.m108594g(str, "path");
        if (bitmap != null) {
            try {
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, str, false);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.TextStatus.StatusImgHandler", "save bitmap to image failed: " + e);
            }
        }
    }
}
