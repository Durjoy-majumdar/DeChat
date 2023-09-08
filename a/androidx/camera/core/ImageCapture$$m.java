package androidx.camera.core;

import java.util.concurrent.ExecutorService;

public final /* synthetic */ class ImageCapture$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExecutorService f44248d;

    public /* synthetic */ ImageCapture$$m(ExecutorService executorService) {
        this.f44248d = executorService;
    }

    public final void run() {
        this.f44248d.shutdown();
    }
}
