package d71;

import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: d71.e */
public final class C31095e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f83379d;

    /* renamed from: e */
    public final /* synthetic */ boolean f83380e;

    public C31095e(C32226l<? super Boolean, C13598b0> lVar, boolean z) {
        this.f83379d = lVar;
        this.f83380e = z;
    }

    public final void run() {
        C32226l<Boolean, C13598b0> lVar = this.f83379d;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f83380e));
        }
    }
}
