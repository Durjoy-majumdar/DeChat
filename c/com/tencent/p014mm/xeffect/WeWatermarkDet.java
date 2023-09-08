package com.tencent.p014mm.xeffect;

import java.nio.Buffer;
import java.util.ArrayList;
import qr3.C36070f;

/* renamed from: com.tencent.mm.xeffect.WeWatermarkDet */
public class WeWatermarkDet {
    static {
        C36070f.m40901a("xlabeffect");
    }

    public static native long nApplyWatermarkDet(long j, ArrayList<Buffer> arrayList, int i, int i2);

    public static native long nInit(String str, String str2);

    public static native void nRelease(long j);
}
