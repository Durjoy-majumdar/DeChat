package com.tencent.youtu.lipreader.jni;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

public class YTLipReader {
    private static final String TAG = "YTLipReader";
    private long nativePtr;

    public YTLipReader() {
        NativeConstructor();
    }

    private native void NativeConstructor();

    private native void NativeDestructor();

    public static byte[] encodeJpeg(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] encodePng(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void destroy() {
        NativeDestructor();
    }

    public native String feature();

    public native void feed(float[] fArr, byte[] bArr, int i, int i2, int i3, float f, float f2, float f3);

    public void finalize() {
        super.finalize();
        NativeDestructor();
    }

    public native String getImageListJsonStr();

    public native String getVersion();

    public native void init();

    public native String lipReadingFeature();

    public native void reset();
}
