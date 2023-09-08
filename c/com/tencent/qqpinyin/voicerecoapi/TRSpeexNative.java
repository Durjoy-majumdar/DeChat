package com.tencent.qqpinyin.voicerecoapi;

class TRSpeexNative {
    public native int nativeTRSpeexDecode(long j, byte[] bArr, int i, int i2, byte[] bArr2);

    public native long nativeTRSpeexDecodeInit();

    public native int nativeTRSpeexDecodeRelease(long j);

    public native int nativeTRSpeexEncode(long j, byte[] bArr, int i, int i2, byte[] bArr2);

    public native long nativeTRSpeexInit();

    public native int nativeTRSpeexRelease(long j);
}
