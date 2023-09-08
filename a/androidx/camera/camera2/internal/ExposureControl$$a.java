package androidx.camera.camera2.internal;

import p202m2.C117512b;

public final /* synthetic */ class ExposureControl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExposureControl f44046d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44047e;

    /* renamed from: f */
    public final /* synthetic */ int f44048f;

    public /* synthetic */ ExposureControl$$a(ExposureControl exposureControl, C117512b.C117513a aVar, int i) {
        this.f44046d = exposureControl;
        this.f44047e = aVar;
        this.f44048f = i;
    }

    public final void run() {
        this.f44046d.lambda$setExposureCompensationIndex$1(this.f44047e, this.f44048f);
    }
}
