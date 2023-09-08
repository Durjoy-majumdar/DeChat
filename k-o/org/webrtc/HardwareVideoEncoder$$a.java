package org.webrtc;

public final /* synthetic */ class HardwareVideoEncoder$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ HardwareVideoEncoder f61831d;

    /* renamed from: e */
    public final /* synthetic */ int f61832e;

    public /* synthetic */ HardwareVideoEncoder$$a(HardwareVideoEncoder hardwareVideoEncoder, int i) {
        this.f61831d = hardwareVideoEncoder;
        this.f61832e = i;
    }

    public final void run() {
        this.f61831d.lambda$deliverEncodedImage$0(this.f61832e);
    }
}
