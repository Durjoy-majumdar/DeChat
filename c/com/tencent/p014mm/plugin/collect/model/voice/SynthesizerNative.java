package com.tencent.p014mm.plugin.collect.model.voice;

/* renamed from: com.tencent.mm.plugin.collect.model.voice.SynthesizerNative */
public class SynthesizerNative {
    public native int init(byte[] bArr);

    public native int readmoney(byte[] bArr, byte[] bArr2, int i, float f, float f2);

    public native void release();
}
