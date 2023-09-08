package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.impl.DeferrableSurface;
import java.util.Comparator;

public final /* synthetic */ class SurfaceSorter$$a implements Comparator {

    /* renamed from: d */
    public final /* synthetic */ SurfaceSorter f44369d;

    public /* synthetic */ SurfaceSorter$$a(SurfaceSorter surfaceSorter) {
        this.f44369d = surfaceSorter;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f44369d.lambda$sort$0((DeferrableSurface) obj, (DeferrableSurface) obj2);
    }
}
