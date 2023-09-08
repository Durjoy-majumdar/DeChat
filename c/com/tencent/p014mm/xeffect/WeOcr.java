package com.tencent.p014mm.xeffect;

import java.nio.Buffer;
import qr3.C36070f;

/* renamed from: com.tencent.mm.xeffect.WeOcr */
public class WeOcr {
    static {
        C36070f.m40901a("xlabeffect");
    }

    public static native String nGetImageHash(Buffer buffer, int i, int i2);

    public static native long nInit(String str, String str2, String str3);

    public static native String nLocateKeyWords(long j, Buffer buffer, int i, int i2, String str);

    public static native String nProcess(long j, Buffer buffer, int i, int i2);

    public static native void nRelease(long j);
}
