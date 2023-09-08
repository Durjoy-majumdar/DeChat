package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder;

final class AutoValue_Camera2OutputConfigBuilder_SurfaceConfig extends Camera2OutputConfigBuilder.SurfaceConfig {
    private final Surface surface;

    public AutoValue_Camera2OutputConfigBuilder_SurfaceConfig(Surface surface2) {
        if (surface2 != null) {
            this.surface = surface2;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Camera2OutputConfigBuilder.SurfaceConfig) {
            return this.surface.equals(((Camera2OutputConfigBuilder.SurfaceConfig) obj).getSurface());
        }
        return false;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return this.surface.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SurfaceConfig{surface=" + this.surface + "}";
    }
}
