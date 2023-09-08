package v34;

import java.util.concurrent.atomic.AtomicReference;
import l34.C117459k;

/* renamed from: v34.c */
public final class C118647c implements C117459k {

    /* renamed from: d */
    public final AtomicReference<C118648a> f355037d = new AtomicReference<>(new C118648a(false, new C118644a()));

    /* renamed from: v34.c$a */
    public static final class C118648a {

        /* renamed from: a */
        public final boolean f355038a;

        /* renamed from: b */
        public final C117459k f355039b;

        public C118648a(boolean z, C117459k kVar) {
            this.f355038a = z;
            this.f355039b = kVar;
        }
    }

    /* renamed from: a */
    public void mo183373a(C117459k kVar) {
        boolean z;
        if (kVar != null) {
            AtomicReference<C118648a> atomicReference = this.f355037d;
            do {
                C118648a aVar = atomicReference.get();
                boolean z2 = aVar.f355038a;
                if (!z2) {
                    C118648a aVar2 = new C118648a(z2, kVar);
                    while (true) {
                        if (!atomicReference.compareAndSet(aVar, aVar2)) {
                            if (atomicReference.get() != aVar) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    kVar.mo182165d();
                    return;
                }
            } while (!z);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    /* renamed from: c */
    public boolean mo182164c() {
        return this.f355037d.get().f355038a;
    }

    /* renamed from: d */
    public void mo182165d() {
        C118648a aVar;
        boolean z;
        AtomicReference<C118648a> atomicReference = this.f355037d;
        do {
            aVar = atomicReference.get();
            if (!aVar.f355038a) {
                z = true;
                C118648a aVar2 = new C118648a(true, aVar.f355039b);
                while (true) {
                    if (!atomicReference.compareAndSet(aVar, aVar2)) {
                        if (atomicReference.get() != aVar) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z);
        aVar.f355039b.mo182165d();
    }
}
