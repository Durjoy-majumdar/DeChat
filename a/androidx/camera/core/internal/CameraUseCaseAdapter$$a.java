package androidx.camera.core.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import p329d3.C86165a;

public final /* synthetic */ class CameraUseCaseAdapter$$a implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ Surface f44366a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f44367b;

    public /* synthetic */ CameraUseCaseAdapter$$a(Surface surface, SurfaceTexture surfaceTexture) {
        this.f44366a = surface;
        this.f44367b = surfaceTexture;
    }

    public final void accept(Object obj) {
        CameraUseCaseAdapter.lambda$createExtraPreview$0(this.f44366a, this.f44367b, (SurfaceRequest.Result) obj);
    }
}
