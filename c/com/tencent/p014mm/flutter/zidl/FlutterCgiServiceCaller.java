package com.tencent.p014mm.flutter.zidl;

/* renamed from: com.tencent.mm.flutter.zidl.FlutterCgiServiceCaller */
public class FlutterCgiServiceCaller {

    /* renamed from: com.tencent.mm.flutter.zidl.FlutterCgiServiceCaller$SendCallback */
    public interface SendCallback {
        void complete(long j, long j2, long j3, byte[] bArr);
    }

    private native void jniSendAsync(long j, long j2, String str, byte[] bArr, boolean z, long j3, Object obj);

    public void sendAsync(long j, long j2, String str, byte[] bArr, boolean z, long j3, SendCallback sendCallback) {
        jniSendAsync(j, j2, str, bArr, z, j3, sendCallback);
    }
}
