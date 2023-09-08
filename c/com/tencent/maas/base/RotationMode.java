package com.tencent.maas.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RotationMode {
    public static final int CCW90 = 1;
    public static final int CW180 = 2;
    public static final int CW90 = 3;
    public static final int None = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }
}
