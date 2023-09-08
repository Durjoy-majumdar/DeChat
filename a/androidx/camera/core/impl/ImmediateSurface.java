package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.utils.futures.Futures;
import p1167z8.C112608f;

public final class ImmediateSurface extends DeferrableSurface {
    private final Surface mSurface;

    public ImmediateSurface(Surface surface, Size size, int i) {
        super(size, i);
        this.mSurface = surface;
    }

    public C112608f<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }

    public ImmediateSurface(Surface surface) {
        this.mSurface = surface;
    }
}
