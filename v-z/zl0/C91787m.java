package zl0;

import fy3.C32226l;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.m */
public final class C91787m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262863d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<C13598b0>, C13598b0> f262864e;

    public C91787m(C91774e eVar, C32226l<? super C91789o<C13598b0>, C13598b0> lVar) {
        this.f262863d = eVar;
        this.f262864e = lVar;
    }

    public final void run() {
        int ordinal = this.f262863d.f262836b.mo115088a().ordinal();
        if (ordinal == 0) {
            this.f262864e.invoke(new C91789o.C91791b(C13598b0.f38549a));
        } else if (ordinal != 3) {
            this.f262864e.invoke(new C91789o.C91790a(13017, "system internal error"));
        } else {
            this.f262864e.invoke(new C91789o.C91790a(13018, "NFC discovery has not started"));
        }
    }
}
