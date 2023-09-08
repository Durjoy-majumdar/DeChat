package p1014o4;

import a14.C53973z1;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p1167z8.C112608f;
import p283z4.C119049a;
import p283z4.C119060c;

/* renamed from: o4.l */
public final class C117692l<R> implements C112608f<R> {

    /* renamed from: d */
    public final C53973z1 f352013d;

    /* renamed from: e */
    public final C119060c<R> f352014e;

    public C117692l(C53973z1 z1Var, C119060c<R> cVar, int i, C8480h hVar) {
        cVar = (i & 2) != 0 ? new C119060c<>() : cVar;
        C87412m.m108594g(z1Var, "job");
        C87412m.m108594g(cVar, "underlying");
        this.f352013d = z1Var;
        this.f352014e = cVar;
        z1Var.mo74515E(new C117691k(this));
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.f352014e.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.f352014e.cancel(z);
    }

    public R get() {
        return this.f352014e.get();
    }

    public R get(long j, TimeUnit timeUnit) {
        return this.f352014e.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.f352014e.f356565d instanceof C119049a.C119052c;
    }

    public boolean isDone() {
        return this.f352014e.isDone();
    }
}
