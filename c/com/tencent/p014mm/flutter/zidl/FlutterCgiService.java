package com.tencent.p014mm.flutter.zidl;

/* renamed from: com.tencent.mm.flutter.zidl.FlutterCgiService */
public interface FlutterCgiService {

    /* renamed from: com.tencent.mm.flutter.zidl.FlutterCgiService$Callback */
    public interface Callback {
        void onSendComplete(long j, long j2, long j3, byte[] bArr);
    }

    void sendAsync(long j, long j2, String str, byte[] bArr, boolean z, long j3);

    void setCallback(Callback callback);
}
