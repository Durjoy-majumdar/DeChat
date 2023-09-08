package com.tencent.p014mm.feature.emoji;

import android.graphics.Bitmap;
import com.tencent.p014mm.feature.emoji.api.IGIFJNIService;
import com.tencent.p014mm.plugin.gif.MMGIFJNI;
import di3.C86301e;
import ei3.C86522b;
import java.io.FileDescriptor;
import java.io.InputStream;

@C86522b
/* renamed from: com.tencent.mm.feature.emoji.GIFJNIFeatureService */
public class GIFJNIFeatureService extends C86301e implements IGIFJNIService {
    public byte[] decFile(String str, String str2) {
        return MMGIFJNI.decFile(str, str2);
    }

    public boolean drawFrameBitmap(long j, Bitmap bitmap, int[] iArr) {
        return MMGIFJNI.drawFrameBitmap(j, bitmap, iArr);
    }

    public boolean drawFramePixels(long j, int[] iArr, int[] iArr2) {
        return MMGIFJNI.drawFramePixels(j, iArr, iArr2);
    }

    public void encFile(String str, String str2) {
        MMGIFJNI.encFile(str, str2);
    }

    public String encodeString(String str) {
        return MMGIFJNI.encodeString(str);
    }

    public int getCurrentFrameDuration(long j) {
        return MMGIFJNI.getCurrentFrameDuration(j);
    }

    public int getCurrentFrameIndex(long j) {
        return MMGIFJNI.getCurrentFrameIndex(j);
    }

    public int getHeight(long j) {
        return MMGIFJNI.getHeight(j);
    }

    public int getTotalFrameCount(long j) {
        return MMGIFJNI.getTotalFrameCount(j);
    }

    public int getWidth(long j) {
        return MMGIFJNI.getWidth(j);
    }

    public void isEncFile(String str) {
        MMGIFJNI.isEncFile(str);
    }

    public boolean isGif(long j) {
        return MMGIFJNI.isGif(j);
    }

    public void lockBitmap(Bitmap bitmap) {
        MMGIFJNI.lockBitmap(bitmap);
    }

    public long openByByteArray(byte[] bArr, int[] iArr) {
        return MMGIFJNI.openByByteArray(bArr, iArr);
    }

    public long openByFileDescroptor(FileDescriptor fileDescriptor, long j, int[] iArr) {
        return MMGIFJNI.openByFileDescroptor(fileDescriptor, j, iArr);
    }

    public long openByFilePath(String str, int[] iArr) {
        return MMGIFJNI.openByFilePath(str, iArr);
    }

    public long openByInputStrem(InputStream inputStream, int[] iArr) {
        return MMGIFJNI.openByInputStrem(inputStream, iArr);
    }

    public void recycle(long j) {
        MMGIFJNI.recycle(j);
    }

    public void reset(long j) {
        MMGIFJNI.reset(j);
    }

    public void restoreRemainder(long j) {
        MMGIFJNI.restoreRemainder(j);
    }

    public void saveRemainder(long j) {
        MMGIFJNI.saveRemainder(j);
    }
}
