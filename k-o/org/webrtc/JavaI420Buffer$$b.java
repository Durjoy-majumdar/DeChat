package org.webrtc;

import java.nio.ByteBuffer;

public final /* synthetic */ class JavaI420Buffer$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ByteBuffer f61834d;

    public /* synthetic */ JavaI420Buffer$$b(ByteBuffer byteBuffer) {
        this.f61834d = byteBuffer;
    }

    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.f61834d);
    }
}
