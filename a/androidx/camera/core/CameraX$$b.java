package androidx.camera.core;

import java.util.concurrent.Executor;
import p202m2.C117512b;

public final /* synthetic */ class CameraX$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraX f44187d;

    /* renamed from: e */
    public final /* synthetic */ Executor f44188e;

    /* renamed from: f */
    public final /* synthetic */ long f44189f;

    /* renamed from: g */
    public final /* synthetic */ C117512b.C117513a f44190g;

    public /* synthetic */ CameraX$$b(CameraX cameraX, Executor executor, long j, C117512b.C117513a aVar) {
        this.f44187d = cameraX;
        this.f44188e = executor;
        this.f44189f = j;
        this.f44190g = aVar;
    }

    public final void run() {
        this.f44187d.lambda$initAndRetryRecursively$1(this.f44188e, this.f44189f, this.f44190g);
    }
}
