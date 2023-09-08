package zl0;

import fy3.C32226l;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.l */
public final class C91786l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262861d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<C13598b0>, C13598b0> f262862e;

    public C91786l(C91774e eVar, C32226l<? super C91789o<C13598b0>, C13598b0> lVar) {
        this.f262861d = eVar;
        this.f262862e = lVar;
    }

    public final void run() {
        int ordinal = this.f262861d.f262836b.mo115091d().ordinal();
        if (ordinal == 0) {
            this.f262862e.invoke(new C91789o.C91791b(C13598b0.f38549a));
        } else if (ordinal != 2) {
            this.f262862e.invoke(new C91789o.C91790a(13017, "system internal error"));
        } else {
            this.f262862e.invoke(new C91789o.C91790a(13021, "NFC discovery already started"));
        }
    }
}
