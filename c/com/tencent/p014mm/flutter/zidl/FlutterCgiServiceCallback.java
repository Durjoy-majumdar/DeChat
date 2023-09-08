package com.tencent.p014mm.flutter.zidl;

import com.tencent.p014mm.flutter.zidl.FlutterCgiService;

/* renamed from: com.tencent.mm.flutter.zidl.FlutterCgiServiceCallback */
class FlutterCgiServiceCallback implements FlutterCgiService.Callback {
    private native void jniOnSendComplete(long j, long j2, long j3, byte[] bArr);

    public void onSendComplete(long j, long j2, long j3, byte[] bArr) {
        jniOnSendComplete(j, j2, j3, bArr);
    }
}
