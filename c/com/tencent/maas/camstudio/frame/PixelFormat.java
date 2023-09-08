package com.tencent.maas.camstudio.frame;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class PixelFormat {
    public static final int I420 = 4;
    public static final int NV21 = 3;
    public static final int RGBA_8888 = 0;
    public static final int RGB_565 = 1;
    public static final int UNKNOWN = -1;
    public static final int YV12 = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Format {
    }

    public static int getBitsPerPixel(int i) {
        if (i != 0) {
            return (i == 2 || i == 3 || i == 4) ? 12 : -1;
        }
        return 32;
    }

    public static boolean isRGB(int i) {
        return i == 0 || i == 1;
    }

    public static boolean isYUV(int i) {
        return i == 2 || i == 3 || i == 4;
    }
}
