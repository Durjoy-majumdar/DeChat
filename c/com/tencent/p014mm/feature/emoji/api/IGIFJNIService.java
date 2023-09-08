package com.tencent.p014mm.feature.emoji.api;

import android.graphics.Bitmap;
import di3.C7335d;
import java.io.FileDescriptor;
import java.io.InputStream;

/* renamed from: com.tencent.mm.feature.emoji.api.IGIFJNIService */
public interface IGIFJNIService extends C7335d {
    byte[] decFile(String str, String str2);

    boolean drawFrameBitmap(long j, Bitmap bitmap, int[] iArr);

    boolean drawFramePixels(long j, int[] iArr, int[] iArr2);

    void encFile(String str, String str2);

    String encodeString(String str);

    int getCurrentFrameDuration(long j);

    int getCurrentFrameIndex(long j);

    int getHeight(long j);

    int getTotalFrameCount(long j);

    int getWidth(long j);

    void isEncFile(String str);

    boolean isGif(long j);

    void lockBitmap(Bitmap bitmap);

    long openByByteArray(byte[] bArr, int[] iArr);

    long openByFileDescroptor(FileDescriptor fileDescriptor, long j, int[] iArr);

    long openByFilePath(String str, int[] iArr);

    long openByInputStrem(InputStream inputStream, int[] iArr);

    void recycle(long j);

    void reset(long j);

    void restoreRemainder(long j);

    void saveRemainder(long j);
}
