package com.tencent.p014mm.plugin.gif;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import p206nj.C88957l;
import p823sg.C48380r;

/* renamed from: com.tencent.mm.plugin.gif.MMWXGFJNI */
public class MMWXGFJNI {
    public static final int PIC_TYPE_JPG = 0;
    public static final int PIC_TYPE_PNG = 1;
    private static final String TAG = "MicroMsg.JNI.MMWXGF";
    public static int mECode = -1;
    public static boolean mIsInit;

    static {
        Log.m105924i(TAG, "static MMWXGFJNI");
        C88957l.m111078n("voipVideoCodec");
        mIsInit = false;
        int nativeInit = nativeInit("libvoipVideoCodec.so");
        mECode = nativeInit;
        mIsInit = nativeInit >= 0;
        Log.m105925i(TAG, "native init MMWXGF mECode:%d result:%b :%s", Integer.valueOf(nativeInit), Boolean.valueOf(mIsInit), "libvoipVideoCodec.so");
    }

    public static int getErrorCode() {
        return mECode;
    }

    private static native int nativeAV2Gif(String str, String str2);

    private static native int nativeAV2Gif(byte[] bArr, byte[] bArr2);

    public static native int nativeAddGifEncodeRgbaFrame(long j, int i, int i2, byte[] bArr, long j2);

    public static native int nativeAddWxAMEncodeRgbaFrame(long j, int i, int i2, byte[] bArr, long j2);

    public static native int nativeDecodeBufferFrame(long j, byte[] bArr, int i, Bitmap bitmap, int[] iArr);

    public static native int nativeDecodeBufferHeader(long j, byte[] bArr, int i);

    public static native byte[] nativeFinishGifEncode(long j);

    public static native byte[] nativeFinishWxAMEncode(long j);

    public static native int nativeGetOption(long j, byte[] bArr, int i, int[] iArr);

    public static native int nativeInit(String str);

    public static native long nativeInitGifEncode(int i, int i2, long j);

    public static native long nativeInitWxAMDecoder();

    public static native long nativeInitWxAMEncoder(int i, int i2, long j, int i3);

    public static native boolean nativeIsWXGF(byte[] bArr, int i);

    private static native int nativePic2Wxam(String str, String str2, int i, int i2, int i3, int i4, int i5);

    private static native int nativePic2WxamWithWH(String str, String str2, int i, int i2, int i3, int i4);

    private static native int nativePic2WxamWithWH(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public static native int nativeRewindBuffer(long j);

    public static native int nativeUninit(long j);

    private static native int nativeWxam2Pic(String str, String str2);

    public static native byte[] nativeWxam2PicBuf(byte[] bArr);

    public static native byte[] nativeWxamToGif(byte[] bArr);

    public static int pic2Wxam(String str, String str2, int i, int i2, int i3, int i4) {
        return nativePic2Wxam(C48380r.m53726a(str, false), C48380r.m53726a(str2, true), i, i2, ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_wxam_full_range, 0), i3, i4);
    }

    public static int pic2WxamWithWH(String str, String str2, int i, int i2, int i3, int i4) {
        return nativePic2WxamWithWH(C48380r.m53726a(str, false), C48380r.m53726a(str2, true), i, i2, i3, i4);
    }

    public static int wxam2Pic(String str, String str2) {
        return nativeWxam2Pic(C48380r.m53726a(str, false), C48380r.m53726a(str2, true));
    }

    public static int pic2WxamWithWH(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String str2 = str;
        return nativePic2WxamWithWH(C48380r.m53726a(str, true), bArr, i, i2, i3, i4, i5, i6, i7);
    }
}
