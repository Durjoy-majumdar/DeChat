package androidx.camera.core;

import androidx.camera.core.ImageSaver;

public final /* synthetic */ class ImageSaver$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageSaver f44263d;

    /* renamed from: e */
    public final /* synthetic */ ImageSaver.SaveError f44264e;

    /* renamed from: f */
    public final /* synthetic */ String f44265f;

    /* renamed from: g */
    public final /* synthetic */ Throwable f44266g;

    public /* synthetic */ ImageSaver$$b(ImageSaver imageSaver, ImageSaver.SaveError saveError, String str, Throwable th) {
        this.f44263d = imageSaver;
        this.f44264e = saveError;
        this.f44265f = str;
        this.f44266g = th;
    }

    public final void run() {
        this.f44263d.lambda$postError$2(this.f44264e, this.f44265f, this.f44266g);
    }
}
