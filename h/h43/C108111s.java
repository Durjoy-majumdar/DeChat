package h43;

import android.graphics.SurfaceTexture;

/* renamed from: h43.s */
public final class C108111s implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C108115u f323732d;

    public C108111s(C108115u uVar) {
        this.f323732d = uVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C108115u.m146448a(this.f323732d);
        this.f323732d.f323744g = true;
    }
}
