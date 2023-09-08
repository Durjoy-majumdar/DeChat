package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;

public abstract class AttachedSurfaceInfo {
    public static AttachedSurfaceInfo create(SurfaceConfig surfaceConfig, int i, Size size, Range<Integer> range) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i, size, range);
    }

    public abstract int getImageFormat();

    public abstract Size getSize();

    public abstract SurfaceConfig getSurfaceConfig();

    public abstract Range<Integer> getTargetFrameRate();
}
