package xp3;

import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: xp3.f */
public final class C112169f implements C112168e {

    /* renamed from: a */
    public final LinkedList<C112168e> f335856a = new LinkedList<>();

    /* renamed from: a */
    public void mo134637a(long j) {
        synchronized (this.f335856a) {
            for (C112168e a : this.f335856a) {
                a.mo134637a(j);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public void mo134638d() {
        synchronized (this.f335856a) {
            for (C112168e d : this.f335856a) {
                d.mo134638d();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
