package pc0;

import java.util.concurrent.ConcurrentLinkedQueue;

public final /* synthetic */ class e0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118002e0 f352717d;

    /* renamed from: e */
    public final /* synthetic */ C118010i f352718e;

    public /* synthetic */ e0$$a(C118002e0 e0Var, C118010i iVar) {
        this.f352717d = e0Var;
        this.f352718e = iVar;
    }

    public final void run() {
        C118002e0 e0Var = this.f352717d;
        C118010i iVar = this.f352718e;
        if (iVar != null) {
            e0Var.getClass();
            if (iVar instanceof e0$$h) {
                ((ConcurrentLinkedQueue) e0Var.f352707c).add(iVar);
            } else {
                ((ConcurrentLinkedQueue) e0Var.f352706b).add(iVar);
            }
        }
        e0Var.mo182763g((C118010i) null);
    }
}
