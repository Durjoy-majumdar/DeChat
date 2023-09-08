package androidx.camera.core;

import p202m2.C117512b;

public final /* synthetic */ class ProcessingImageReader$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingImageReader f44279d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44280e;

    public /* synthetic */ ProcessingImageReader$$c(ProcessingImageReader processingImageReader, C117512b.C117513a aVar) {
        this.f44279d = processingImageReader;
        this.f44280e = aVar;
    }

    public final void run() {
        this.f44279d.lambda$closeAndCompleteFutureIfNecessary$0(this.f44280e);
    }
}
