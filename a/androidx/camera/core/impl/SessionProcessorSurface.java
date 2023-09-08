package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.utils.futures.Futures;
import p1167z8.C112608f;

public final class SessionProcessorSurface extends DeferrableSurface {
    private final int mOutputConfigId;
    private final Surface mSurface;

    public SessionProcessorSurface(Surface surface, int i) {
        this.mSurface = surface;
        this.mOutputConfigId = i;
    }

    public int getOutputConfigId() {
        return this.mOutputConfigId;
    }

    public C112608f<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }
}
