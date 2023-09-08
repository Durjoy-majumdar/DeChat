package com.tencent.p014mm.plugin.appbrand.utils;

import android.graphics.Bitmap;
import com.tencent.p014mm.appbrand.commonjni.BitmapUtilsJni;
import com.tencent.p014mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.io.IOException;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.l0 */
public final class C84763l0 {
    /* renamed from: a */
    public static final boolean m104423a(Bitmap bitmap, float f, CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails) {
        C87412m.m108594g(bitmap, "_bitmap");
        int[] iArr = {bitmap.getWidth(), bitmap.getHeight()};
        long currentTicks = Util.currentTicks();
        try {
            if (!bitmap.isRecycled()) {
                int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                if (min > 0) {
                    if (min > 300) {
                        float f2 = 300.0f / ((float) min);
                        bitmap = BitmapUtil.scaleBitmap(bitmap, f2, f2);
                    }
                    int nativeCheckBitmapIsBlank = BitmapUtilsJni.nativeCheckBitmapIsBlank(bitmap, f, checkBitmapIsBlankResultDetails);
                    if (nativeCheckBitmapIsBlank == 1) {
                        Log.m105924i("MicroMsg.AppBrand.BitmapUtils", "checkBitmapIsBlank bitmap[" + iArr[0] + 'x' + iArr[1] + "], cost:" + (Util.currentTicks() - currentTicks) + LocaleUtil.MALAY);
                        return true;
                    } else if (nativeCheckBitmapIsBlank == 2) {
                        return false;
                    } else {
                        throw new IOException("BitmapUtilsJni check failed:" + nativeCheckBitmapIsBlank);
                    }
                } else {
                    throw new IllegalArgumentException("width and height must be > 0");
                }
            } else {
                throw new IllegalArgumentException("cannot use a recycled source");
            }
        } finally {
            Log.m105924i("MicroMsg.AppBrand.BitmapUtils", "checkBitmapIsBlank bitmap[" + iArr[0] + 'x' + iArr[1] + "], cost:" + (Util.currentTicks() - currentTicks) + LocaleUtil.MALAY);
        }
    }
}
