package p172io.clipworks.displaysys;

import android.view.Surface;

/* renamed from: io.clipworks.displaysys.SurfaceUtils */
final class SurfaceUtils {
    private static native int nativeQuerySurfaceFormat(Surface surface);

    private static native int nativeQuerySurfaceHeight(Surface surface);

    private static native int nativeQuerySurfaceWidth(Surface surface);

    public static int querySurfaceFormat(Surface surface) {
        return nativeQuerySurfaceFormat(surface);
    }

    public static int querySurfaceHeight(Surface surface) {
        return nativeQuerySurfaceHeight(surface);
    }

    public static int querySurfaceWidth(Surface surface) {
        return nativeQuerySurfaceWidth(surface);
    }
}
