package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;

public interface SurfaceOutputConfig extends Camera2OutputConfig {
    Surface getSurface();
}
