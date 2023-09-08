package p34;

import java.util.concurrent.ThreadFactory;
import l34.C117456i;

/* renamed from: p34.g */
public final class C117947g extends C117456i {

    /* renamed from: e */
    public final ThreadFactory f352524e;

    public C117947g(ThreadFactory threadFactory) {
        this.f352524e = threadFactory;
    }

    public C117456i.C117457a createWorker() {
        return new C117948h(this.f352524e);
    }
}
