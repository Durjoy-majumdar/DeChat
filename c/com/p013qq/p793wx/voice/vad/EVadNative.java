package com.p013qq.p793wx.voice.vad;

/* renamed from: com.qq.wx.voice.vad.EVadNative */
public class EVadNative {
    public native int AddData(long j, short[] sArr, int i);

    public native long Init(int i, int i2, float f, int i3, int i4);

    public native int Release(long j);

    public native int Reset(long j);
}
