package com.tencent.p014mm.xeffect;

import java.nio.Buffer;
import qr3.C36070f;

/* renamed from: com.tencent.mm.xeffect.WeImageScore */
public class WeImageScore {
    static {
        C36070f.m40901a("xlabeffect");
    }

    public static native float[] nApplyImageScoreReq(long j, Buffer buffer, int i, int i2);

    public static native long nInit(String str, int i);

    public static native void nRelease(long j);
}
