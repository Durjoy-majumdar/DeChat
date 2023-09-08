package com.tencent.maas.instamovie;

public interface MJTextResolver {
    public static final String KEY_DEVICE_NAME = "deviceName";
    public static final String KEY_USERNAME = "username";

    String resolve(String str);
}
