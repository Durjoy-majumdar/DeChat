package a60;

import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: a60.c */
public final class C53984c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53979a f151245d;

    /* renamed from: e */
    public final /* synthetic */ long f151246e;

    public C53984c(C53979a aVar, long j) {
        this.f151245d = aVar;
        this.f151246e = j;
    }

    public final void run() {
        C32226l<? super Long, C13598b0> lVar = this.f151245d.f151228c;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(this.f151246e));
        }
    }
}
