package com.tencent.p014mm.feature.emoji.api;

import android.graphics.Bitmap;
import di3.C7335d;

/* renamed from: com.tencent.mm.feature.emoji.api.IWXGFJNIService */
public interface IWXGFJNIService extends C7335d {
    int getErrorCode();

    int nativeDecodeBufferFrame(long j, byte[] bArr, int i, Bitmap bitmap, int[] iArr);

    int nativeDecodeBufferHeader(long j, byte[] bArr, int i);

    int nativeGetOption(long j, byte[] bArr, int i, int[] iArr);

    long nativeInitWxAMDecoder();

    int nativeRewindBuffer(long j);

    int nativeUninit(long j);

    int pic2WxamWithWH(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);
}
