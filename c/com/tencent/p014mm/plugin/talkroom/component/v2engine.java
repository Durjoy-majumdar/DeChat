package com.tencent.p014mm.plugin.talkroom.component;

import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.pointers.PInt;

/* renamed from: com.tencent.mm.plugin.talkroom.component.v2engine */
public class v2engine {
    public native int Close();

    public native int GetAudioData(PByteArray pByteArray, int i, PInt pInt, PInt pInt2);

    public native int GetStatis(PByteArray pByteArray, String str);

    public native int IsSilenceFrame();

    public native int Open(ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i, int i2, int i3, long j, int i4, byte[] bArr, int i5);

    public native int Send(byte[] bArr, short s);

    public native int SetCurrentMicId(int i);

    public native int initLive(int i, String str);

    public native int uninitLive();
}
