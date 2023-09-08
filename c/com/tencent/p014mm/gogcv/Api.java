package com.tencent.p014mm.gogcv;

import android.graphics.Bitmap;

/* renamed from: com.tencent.mm.gogcv.Api */
public class Api {
    public native byte[] checkImage(Bitmap bitmap);

    public native byte[] checkVideo(Bitmap[] bitmapArr);

    public native boolean init(String str);

    public native void release();
}
