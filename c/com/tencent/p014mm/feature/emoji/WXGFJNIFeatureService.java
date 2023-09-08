package com.tencent.p014mm.feature.emoji;

import android.graphics.Bitmap;
import com.tencent.p014mm.feature.emoji.api.IWXGFJNIService;
import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import di3.C86301e;
import ei3.C86522b;

@C86522b
/* renamed from: com.tencent.mm.feature.emoji.WXGFJNIFeatureService */
public class WXGFJNIFeatureService extends C86301e implements IWXGFJNIService {
    public int getErrorCode() {
        return MMWXGFJNI.getErrorCode();
    }

    public int nativeDecodeBufferFrame(long j, byte[] bArr, int i, Bitmap bitmap, int[] iArr) {
        return MMWXGFJNI.nativeDecodeBufferFrame(j, bArr, i, bitmap, iArr);
    }

    public int nativeDecodeBufferHeader(long j, byte[] bArr, int i) {
        return MMWXGFJNI.nativeDecodeBufferHeader(j, bArr, i);
    }

    public int nativeGetOption(long j, byte[] bArr, int i, int[] iArr) {
        return MMWXGFJNI.nativeGetOption(j, bArr, i, iArr);
    }

    public long nativeInitWxAMDecoder() {
        return MMWXGFJNI.nativeInitWxAMDecoder();
    }

    public int nativeRewindBuffer(long j) {
        return MMWXGFJNI.nativeRewindBuffer(j);
    }

    public int nativeUninit(long j) {
        return MMWXGFJNI.nativeUninit(j);
    }

    public int pic2WxamWithWH(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return MMWXGFJNI.pic2WxamWithWH(str, bArr, i, i2, i3, i4, i5, i6, i7);
    }
}
