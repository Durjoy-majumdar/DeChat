package vp3;

import android.graphics.SurfaceTexture;
import fy3.C32226l;
import gy3.C87412m;

/* renamed from: vp3.g */
public final class C90859g implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l f260834d;

    public C90859g(C32226l lVar) {
        this.f260834d = lVar;
    }

    public final /* synthetic */ void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C87412m.m108590c(this.f260834d.invoke(surfaceTexture), "invoke(...)");
    }
}
