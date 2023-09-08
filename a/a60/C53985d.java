package a60;

import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: a60.d */
public final class C53985d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53979a f151247d;

    /* renamed from: e */
    public final /* synthetic */ boolean f151248e;

    public C53985d(C53979a aVar, boolean z) {
        this.f151247d = aVar;
        this.f151248e = z;
    }

    public final void run() {
        C32226l<? super Boolean, C13598b0> lVar = this.f151247d.f151229d;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f151248e));
        }
    }
}
