package androidx.camera.core.internal.compat.workaround;

import android.media.MediaCodec;
import androidx.camera.core.Preview;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.List;

public class SurfaceSorter {
    private static final int PRIORITY_MEDIA_CODEC_SURFACE = 2;
    private static final int PRIORITY_OTHERS = 1;
    private static final int PRIORITY_PREVIEW_SURFACE = 0;
    private final boolean mHasQuirk;

    public SurfaceSorter() {
        this.mHasQuirk = DeviceQuirks.get(SurfaceOrderQuirk.class) != null;
    }

    private int getSurfacePriority(DeferrableSurface deferrableSurface) {
        if (deferrableSurface.getContainerClass() == MediaCodec.class || deferrableSurface.getContainerClass() == VideoCapture.class) {
            return 2;
        }
        return deferrableSurface.getContainerClass() == Preview.class ? 0 : 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int lambda$sort$0(DeferrableSurface deferrableSurface, DeferrableSurface deferrableSurface2) {
        return getSurfacePriority(deferrableSurface) - getSurfacePriority(deferrableSurface2);
    }

    public void sort(List<DeferrableSurface> list) {
        if (this.mHasQuirk) {
            Collections.sort(list, new SurfaceSorter$$a(this));
        }
    }
}
