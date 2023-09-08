package com.tencent.tav;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.tencent.tav.Utils */
public class C106896Utils {
    private static String kPhoneName = "";

    public static Bitmap flipYBitmap(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static String getPhoneName() {
        String str = kPhoneName;
        if (str == null || str.isEmpty()) {
            String str2 = Build.MANUFACTURER.toUpperCase() + " " + Build.MODEL;
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            kPhoneName = str2.replace(" ", "_").replace("+", "").replace("(t)", "");
        }
        return kPhoneName;
    }

    public static boolean isOnlySupportLowVersionGl() {
        if (Build.VERSION.SDK_INT >= 24) {
            String str = Build.HARDWARE;
            return "mt6752".equals(str) || "mt6797".equals(str) || "mt6757".equals(str) || "mt6750".equals(str);
        }
    }
}
