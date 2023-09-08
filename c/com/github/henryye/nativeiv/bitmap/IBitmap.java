package com.github.henryye.nativeiv.bitmap;

import com.github.henryye.nativeiv.ImageDecodeConfig;
import java.io.InputStream;
import p1024q6.C89484c;

public interface IBitmap<Type> {
    void decodeInputStream(InputStream inputStream, ImageDecodeConfig imageDecodeConfig, C89484c cVar);

    long getDecodeTime();

    BitmapType getType();

    Type provide();

    void recycle();
}
