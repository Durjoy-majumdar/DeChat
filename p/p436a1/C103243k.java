package p436a1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;

/* renamed from: a1.k */
public final class C103243k implements C103248m0 {

    /* renamed from: a */
    public final PathMeasure f304453a;

    public C103243k(PathMeasure pathMeasure) {
        C87412m.m108594g(pathMeasure, "internalPathMeasure");
        this.f304453a = pathMeasure;
    }

    /* renamed from: a */
    public boolean mo143015a(float f, float f2, C27726j0 j0Var, boolean z) {
        C87412m.m108594g(j0Var, FirebaseAnalytics.C113379b.DESTINATION);
        PathMeasure pathMeasure = this.f304453a;
        if (j0Var instanceof C103240i) {
            return pathMeasure.getSegment(f, f2, ((C103240i) j0Var).f304449a, z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: b */
    public void mo143016b(C27726j0 j0Var, boolean z) {
        Path path;
        PathMeasure pathMeasure = this.f304453a;
        if (j0Var == null) {
            path = null;
        } else if (j0Var instanceof C103240i) {
            path = ((C103240i) j0Var).f304449a;
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, z);
    }

    public float getLength() {
        return this.f304453a.getLength();
    }
}
