package a60;

import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: a60.e */
public final class C53986e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53979a f151249d;

    public C53986e(C53979a aVar) {
        this.f151249d = aVar;
    }

    public final void run() {
        C32226l<? super Boolean, C13598b0> lVar = this.f151249d.f151226a;
        if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }
}
