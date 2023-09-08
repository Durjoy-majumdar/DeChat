package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

public abstract class ResolutionInfo {
    public static ResolutionInfo create(Size size, Rect rect, int i) {
        return new AutoValue_ResolutionInfo(size, rect, i);
    }

    public abstract Rect getCropRect();

    public abstract Size getResolution();

    public abstract int getRotationDegrees();
}
