package v34;

import java.util.concurrent.atomic.AtomicReference;
import l34.C117459k;
import n34.C117603a;

/* renamed from: v34.a */
public final class C118644a implements C117459k {

    /* renamed from: e */
    public static final C117603a f355033e = new C118645a();

    /* renamed from: d */
    public final AtomicReference<C117603a> f355034d;

    /* renamed from: v34.a$a */
    public static class C118645a implements C117603a {
        public void call() {
        }
    }

    public C118644a() {
        this.f355034d = new AtomicReference<>();
    }

    /* renamed from: c */
    public boolean mo182164c() {
        return this.f355034d.get() == f355033e;
    }

    /* renamed from: d */
    public void mo182165d() {
        C117603a andSet;
        C117603a aVar = this.f355034d.get();
        C117603a aVar2 = f355033e;
        if (aVar != aVar2 && (andSet = this.f355034d.getAndSet(aVar2)) != null && andSet != aVar2) {
            andSet.call();
        }
    }

    public C118644a(C117603a aVar) {
        this.f355034d = new AtomicReference<>(aVar);
    }
}
