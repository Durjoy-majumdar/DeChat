package com.tencent.wechat.aff.ting;

import com.tencent.wechat.aff.ting.TingAffBizProto;

public class AffTingImageUtils {
    private static AffTingImageUtils instance = new AffTingImageUtils();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void ongenerateMinibarBackgroundComplete(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo);

        void ongeneratePlayerBackgroundComplete(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo);
    }

    private AffTingImageUtils() {
        jniCreateAffTingImageUtils();
    }

    public static AffTingImageUtils getInstance() {
        return instance;
    }

    private native void jniCreateAffTingImageUtils();

    private native void jniSetCallback(Object obj);

    private native void jnigenerateMinibarBackgroundAsync(int i, byte[] bArr, byte[] bArr2);

    private native void jnigeneratePlayerBackgroundAsync(int i, byte[] bArr, byte[] bArr2);

    public void generateMinibarBackgroundAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jnigenerateMinibarBackgroundAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void generatePlayerBackgroundAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jnigeneratePlayerBackgroundAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
