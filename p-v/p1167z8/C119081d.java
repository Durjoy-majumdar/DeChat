package p1167z8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p832y8.C118943a;
import p832y8.C118944b;
import p832y8.C118946c;

/* renamed from: z8.d */
public final class C119081d extends C119083e {

    /* renamed from: z8.d$a */
    public static final class C119082a<V> implements Runnable {

        /* renamed from: d */
        public final Future<V> f356627d;

        /* renamed from: e */
        public final C119080c<? super V> f356628e;

        public C119082a(Future<V> future, C119080c<? super V> cVar) {
            this.f356627d = future;
            this.f356628e = cVar;
        }

        public void run() {
            try {
                this.f356628e.onSuccess(C119081d.m167873a(this.f356627d));
            } catch (ExecutionException e) {
                this.f356628e.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f356628e.onFailure(e2);
            }
        }

        public String toString() {
            C118944b bVar = new C118944b(C119082a.class.getSimpleName(), (C118943a) null);
            C119080c<? super V> cVar = this.f356628e;
            C118944b.C118945a aVar = new C118944b.C118945a((C118943a) null);
            bVar.f356265c.f356267b = aVar;
            bVar.f356265c = aVar;
            aVar.f356266a = cVar;
            return bVar.toString();
        }
    }

    /* renamed from: a */
    public static <V> V m167873a(Future<V> future) {
        V v;
        boolean z = false;
        if (future.isDone()) {
            while (true) {
                try {
                    v = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return v;
        }
        throw new IllegalStateException(C118946c.m167701a("Future was expected to be done: %s", future));
    }
}
