package com.tencent.tencentmap.lbssdk.service;

public class RtkCommon {
    public static native void jni_ecef2pos(double d, double d2, double d3, double[] dArr);

    public static native String jni_outnmea_gga(double d, double d2, double d3);

    public static native void jni_pos2ecef(double d, double d2, double d3, double[] dArr);

    public static native String jni_satno2id(int i);
}
