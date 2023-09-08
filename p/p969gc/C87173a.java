package p969gc;

import java.util.concurrent.Callable;

/* renamed from: gc.a */
public final class C87173a<V> implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C87174b<Object> f252810d;

    public C87173a(C87174b<Object> bVar) {
        this.f252810d = bVar;
    }

    public final Object call() {
        long currentTimeMillis = System.currentTimeMillis();
        Object c = this.f252810d.mo109764c();
        this.f252810d.f252815e = System.currentTimeMillis() - currentTimeMillis;
        return c;
    }
}
