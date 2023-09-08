package androidx.camera.camera2.internal;

import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p1167z8.C112608f;

public final /* synthetic */ class SynchronizedCaptureSessionBaseImpl$$b implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f44087a;

    /* renamed from: b */
    public final /* synthetic */ List f44088b;

    public /* synthetic */ SynchronizedCaptureSessionBaseImpl$$b(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, List list) {
        this.f44087a = synchronizedCaptureSessionBaseImpl;
        this.f44088b = list;
    }

    public final C112608f apply(Object obj) {
        return this.f44087a.lambda$startWithDeferrableSurface$1(this.f44088b, (List) obj);
    }
}
