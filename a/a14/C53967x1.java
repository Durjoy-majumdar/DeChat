package a14;

import fy3.C32226l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx3.C13598b0;

/* renamed from: a14.x1 */
public final class C53967x1 extends C53859b2 {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f151209i = AtomicIntegerFieldUpdater.newUpdater(C53967x1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: h */
    public final C32226l<Throwable, C13598b0> f151210h;

    public C53967x1(C32226l<? super Throwable, C13598b0> lVar) {
        this.f151210h = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74474t((Throwable) obj);
        return C13598b0.f38549a;
    }

    /* renamed from: t */
    public void mo74474t(Throwable th) {
        if (f151209i.compareAndSet(this, 0, 1)) {
            this.f151210h.invoke(th);
        }
    }
}
