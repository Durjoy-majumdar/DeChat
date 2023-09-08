package com.tencent.p014mm.modelvoice;

import com.tencent.p014mm.pointers.PByteArray;
import p375qh.C101195p;

/* renamed from: com.tencent.mm.modelvoice.MediaRecorder */
public class MediaRecorder {
    static {
        C101195p.m132710a();
    }

    public static native int SetVoiceSilkControl(int i, int i2, long j);

    public static native int SetVoiceSilkDecControl(int i, byte[] bArr, int i2, long j);

    public static native long SilkDecInit(int i, byte[] bArr, int i2, long j);

    public static native int SilkDecUnInit(long j);

    public static native int SilkDoDec(byte[] bArr, short s, long j);

    public static native int SilkDoEnc(byte[] bArr, short s, byte[] bArr2, short[] sArr, boolean z, long j);

    public static native long SilkEncInit(int i, int i2, int i3, long j);

    public static native int SilkEncUnInit(long j);

    public static native int SilkGetEncSampleRate(byte[] bArr, long j);

    public static native long StreamSilkDecInit(int i, long j);

    public static native int StreamSilkDecUnInit(long j);

    public static native int StreamSilkDoDec(byte[] bArr, int i, short[] sArr, int i2, boolean z, long j);

    public static native boolean native_init();

    public static native boolean native_pcm2amr(int i, byte[] bArr, int i2, PByteArray pByteArray, int i3);

    public static native boolean native_pcmresamp(byte[] bArr, int i, PByteArray pByteArray);

    public static native boolean native_release();
}
