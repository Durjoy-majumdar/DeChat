package com.tencent.tavkit.utils;

import android.media.ExifInterface;
import java.io.IOException;

public class TAVBitmapUtils {
    public static int readImagePreferRotation(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 2;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 1;
            }
            return 3;
        } catch (IOException unused) {
            return 0;
        }
    }
}
