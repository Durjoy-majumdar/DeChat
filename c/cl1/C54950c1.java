package cl1;

import rx3.C13598b0;

/* renamed from: cl1.c1 */
public final class C54950c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54943a1 f153998d;

    public C54950c1(C54943a1 a1Var) {
        this.f153998d = a1Var;
    }

    public final void run() {
        C54943a1 a1Var = this.f153998d;
        synchronized (a1Var) {
            a1Var.f153979j.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
