package androidx.camera.core;

import java.io.File;

public final /* synthetic */ class ImageSaver$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageSaver f44267d;

    /* renamed from: e */
    public final /* synthetic */ File f44268e;

    public /* synthetic */ ImageSaver$$c(ImageSaver imageSaver, File file) {
        this.f44267d = imageSaver;
        this.f44268e = file;
    }

    public final void run() {
        this.f44267d.lambda$run$0(this.f44268e);
    }
}
