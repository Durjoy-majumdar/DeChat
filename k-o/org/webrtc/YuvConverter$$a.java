package org.webrtc;

import java.nio.ByteBuffer;

public final /* synthetic */ class YuvConverter$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ByteBuffer f61878d;

    public /* synthetic */ YuvConverter$$a(ByteBuffer byteBuffer) {
        this.f61878d = byteBuffer;
    }

    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.f61878d);
    }
}
