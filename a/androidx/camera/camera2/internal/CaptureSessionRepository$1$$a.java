package androidx.camera.camera2.internal;

import java.util.LinkedHashSet;

public final /* synthetic */ class CaptureSessionRepository$1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedHashSet f44045d;

    public /* synthetic */ CaptureSessionRepository$1$$a(LinkedHashSet linkedHashSet) {
        this.f44045d = linkedHashSet;
    }

    public final void run() {
        CaptureSessionRepository.forceOnClosed(this.f44045d);
    }
}
