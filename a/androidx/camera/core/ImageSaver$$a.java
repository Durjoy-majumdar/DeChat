package androidx.camera.core;

import android.net.Uri;

public final /* synthetic */ class ImageSaver$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageSaver f44261d;

    /* renamed from: e */
    public final /* synthetic */ Uri f44262e;

    public /* synthetic */ ImageSaver$$a(ImageSaver imageSaver, Uri uri) {
        this.f44261d = imageSaver;
        this.f44262e = uri;
    }

    public final void run() {
        this.f44261d.lambda$postSuccess$1(this.f44262e);
    }
}
