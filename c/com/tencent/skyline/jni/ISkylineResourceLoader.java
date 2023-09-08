package com.tencent.skyline.jni;

import android.graphics.Bitmap;

public interface ISkylineResourceLoader {

    public interface BitmapLoadCallback {
        void onBitmapLoaded(Bitmap bitmap);
    }

    public interface ResourceLoadCallback {
        void onResourceLoaded(byte[] bArr);
    }

    Bitmap loadBitmap(String str);

    void loadBitmapAsync(String str, BitmapLoadCallback bitmapLoadCallback);

    byte[] loadResource(String str);

    void loadResourceAsync(String str, ResourceLoadCallback resourceLoadCallback);
}
