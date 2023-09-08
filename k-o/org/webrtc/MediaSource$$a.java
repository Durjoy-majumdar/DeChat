package org.webrtc;

public final /* synthetic */ class MediaSource$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f61835d;

    public /* synthetic */ MediaSource$$a(long j) {
        this.f61835d = j;
    }

    public final void run() {
        JniCommon.nativeReleaseRef(this.f61835d);
    }
}
