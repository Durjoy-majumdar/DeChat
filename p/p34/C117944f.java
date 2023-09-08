package p34;

import java.util.concurrent.TimeUnit;
import l34.C117456i;
import l34.C117459k;
import n34.C117603a;
import v34.C118644a;
import v34.C118649d;

/* renamed from: p34.f */
public final class C117944f extends C117456i {

    /* renamed from: e */
    public static final C117944f f352521e = new C117944f();

    /* renamed from: p34.f$b */
    public class C117946b extends C117456i.C117457a {

        /* renamed from: d */
        public final C118644a f352522d = new C118644a();

        public C117946b(C117945a aVar) {
        }

        /* renamed from: b */
        public C117459k mo182162b(C117603a aVar) {
            aVar.call();
            return C118649d.f355040a;
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352522d.mo182164c();
        }

        /* renamed from: d */
        public void mo182165d() {
            this.f352522d.mo182165d();
        }

        /* renamed from: e */
        public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
            long now = C117944f.this.now() + timeUnit.toMillis(j);
            if (!mo182164c()) {
                long a = now - mo182161a();
                if (a > 0) {
                    try {
                        Thread.sleep(a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        if (e instanceof RuntimeException) {
                            throw ((RuntimeException) e);
                        } else if (e instanceof Error) {
                            throw ((Error) e);
                        } else {
                            throw new RuntimeException(e);
                        }
                    }
                }
                if (!mo182164c()) {
                    aVar.call();
                }
            }
            return C118649d.f355040a;
        }
    }

    public C117456i.C117457a createWorker() {
        return new C117946b((C117945a) null);
    }
}
