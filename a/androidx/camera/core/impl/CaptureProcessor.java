package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import p1167z8.C112608f;

public interface CaptureProcessor {
    void close();

    C112608f<Void> getCloseFuture();

    void onOutputSurface(Surface surface, int i);

    void onResolutionUpdate(Size size);

    void process(ImageProxyBundle imageProxyBundle);
}
