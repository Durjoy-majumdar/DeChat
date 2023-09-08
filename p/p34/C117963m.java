package p34;

import l34.C117456i;
import n34.C117603a;

/* renamed from: p34.m */
public class C117963m implements C117603a {

    /* renamed from: d */
    public final C117603a f352556d;

    /* renamed from: e */
    public final C117456i.C117457a f352557e;

    /* renamed from: f */
    public final long f352558f;

    public C117963m(C117603a aVar, C117456i.C117457a aVar2, long j) {
        this.f352556d = aVar;
        this.f352557e = aVar2;
        this.f352558f = j;
    }

    public void call() {
        if (!this.f352557e.mo182164c()) {
            long a = this.f352558f - this.f352557e.mo182161a();
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
            if (!this.f352557e.mo182164c()) {
                this.f352556d.call();
            }
        }
    }
}
