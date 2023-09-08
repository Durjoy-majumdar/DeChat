package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.core.CameraProvider;
import androidx.camera.extensions.internal.VersionName;
import p202m2.C117512b;

public final /* synthetic */ class ExtensionsManager$$a implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ VersionName f44372a;

    /* renamed from: b */
    public final /* synthetic */ Context f44373b;

    /* renamed from: c */
    public final /* synthetic */ CameraProvider f44374c;

    public /* synthetic */ ExtensionsManager$$a(VersionName versionName, Context context, CameraProvider cameraProvider) {
        this.f44372a = versionName;
        this.f44373b = context;
        this.f44374c = cameraProvider;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return ExtensionsManager.lambda$getInstanceAsync$0(this.f44372a, this.f44373b, this.f44374c, aVar);
    }
}
