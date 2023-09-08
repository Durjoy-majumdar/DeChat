package p774zg;

import java.util.concurrent.Future;

/* renamed from: zg.z */
public class C91751z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91683a0 f262801d;

    public C91751z(C91683a0 a0Var) {
        this.f262801d = a0Var;
    }

    public void run() {
        Future<?> future = this.f262801d.f262678c;
        if (future != null) {
            future.cancel(false);
        }
    }
}
