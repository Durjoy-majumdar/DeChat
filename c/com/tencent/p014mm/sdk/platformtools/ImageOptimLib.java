package com.tencent.p014mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import p823sg.C48380r;

/* renamed from: com.tencent.mm.sdk.platformtools.ImageOptimLib */
public class ImageOptimLib {
    public static final int MAX_DECODE_PICTURE_SIZE = 2764800;

    public static boolean checkIntegrity(String str) {
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            return false;
        }
        return MMJpegOptim.checkIntegrity(C48380r.m53726a(str, false));
    }

    public static int compressByQualityOptim(Bitmap bitmap, int i, boolean z, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return -1;
        }
        return MMJpegOptim.compressByQualityOptim(bitmap, i, z, C48380r.m53726a(str, false));
    }

    public static boolean convertToProgressive(String str, String str2, int i) {
        return !Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && C86013q1.m106450k(str) && MMJpegOptim.convertToProgressive(C48380r.m53726a(str, false), C48380r.m53726a(str2, false), i) == 0;
    }

    public static Bitmap extractThumbNailBeta(String str) {
        if (!Util.isNullOrNil(str) && new C86009m1(str).mo119967g()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Bitmap d = MMBitmapFactory.m98735d(str, options);
            if (d != null) {
                Log.m105925i("ImageOptimLib", "recycle bitmap:%s", d.toString());
                d.recycle();
            }
            if (options.inSampleSize <= 1) {
                options.inSampleSize = 1;
            }
            int i = options.outHeight;
            int i2 = options.outWidth;
            int i3 = options.inSampleSize;
            if (((i * i2) / i3) / i3 > 2764800) {
                options.inSampleSize = i3 + 1;
            }
            short[] sArr = {1, 1, 2, 2, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 8, 8};
            int i4 = options.inSampleSize;
            if (i4 < 0 || i4 > 15) {
                options.inSampleSize = 1;
            } else {
                options.inSampleSize = sArr[i4];
            }
            int i5 = options.inSampleSize;
            Bitmap createBitmap = Bitmap.createBitmap(((i2 + i5) - 1) / i5, ((i + i5) - 1) / i5, Bitmap.Config.ARGB_8888);
            if (MMJpegOptim.decodeToBitmap(str, createBitmap, options.inSampleSize) == 1) {
                return createBitmap;
            }
        }
        return null;
    }
}
