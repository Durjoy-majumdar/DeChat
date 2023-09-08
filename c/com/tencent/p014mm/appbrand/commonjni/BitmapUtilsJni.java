package com.tencent.p014mm.appbrand.commonjni;

import android.graphics.Bitmap;
import p762yg.C39011b;

/* renamed from: com.tencent.mm.appbrand.commonjni.BitmapUtilsJni */
public class BitmapUtilsJni {
    static {
        C39011b.f105067a.loadLibrary("wxa-runtime-binding");
    }

    public static native int nativeCheckBitmapIsBlank(Bitmap bitmap, float f, CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails);
}
