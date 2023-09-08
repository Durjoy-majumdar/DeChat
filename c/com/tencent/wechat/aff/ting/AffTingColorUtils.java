package com.tencent.wechat.aff.ting;

import com.tencent.wechat.aff.ting.TingAffBizProto;

public class AffTingColorUtils {
    private static AffTingColorUtils instance = new AffTingColorUtils();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void oncoverColorComplete(int i, TingAffBizProto.TingRGBAColor tingRGBAColor);

        void onimageColorsComplete(int i, TingAffBizProto.TingImageColorAsset tingImageColorAsset);

        void onlinkColorComplete(int i, TingAffBizProto.TingRGBAColor tingRGBAColor);

        void onminibarColorComplete(int i, TingAffBizProto.TingRGBAColor tingRGBAColor);

        void onplayerBackgroundColorComplete(int i, TingAffBizProto.TingRGBAColor tingRGBAColor);

        void onselectColorComplete(int i, int i2, TingAffBizProto.TingRGBAColor tingRGBAColor);
    }

    private AffTingColorUtils() {
        jniCreateAffTingColorUtils();
    }

    public static AffTingColorUtils getInstance() {
        return instance;
    }

    private native void jniCreateAffTingColorUtils();

    private native void jniSetCallback(Object obj);

    private native void jnicoverColorAsync(int i, byte[] bArr, byte[] bArr2);

    private native void jniimageColorsAsync(int i, byte[] bArr, byte[] bArr2);

    private native void jnilinkColorAsync(int i, byte[] bArr, byte[] bArr2);

    private native void jniminibarColorAsync(int i, byte[] bArr, byte[] bArr2);

    private native void jniplayerBackgroundColorAsync(int i, byte[] bArr, byte[] bArr2);

    private native void jniselectColorAsync(int i, byte[] bArr, byte[] bArr2);

    public void coverColorAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jnicoverColorAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void imageColorsAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jniimageColorsAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void linkColorAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jnilinkColorAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void minibarColorAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jniminibarColorAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void playerBackgroundColorAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jniplayerBackgroundColorAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void selectColorAsync(int i, byte[] bArr, TingAffBizProto.TingRGBAImageInfo tingRGBAImageInfo) {
        jniselectColorAsync(i, bArr, tingRGBAImageInfo.toByteArray());
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
