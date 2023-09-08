package ob0;

import java.util.Iterator;

public class b0$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f256829d;

    /* renamed from: e */
    public final /* synthetic */ C89137b0 f256830e;

    public b0$$e(C89137b0 b0Var, int i) {
        this.f256830e = b0Var;
        this.f256829d = i;
    }

    public void run() {
        C89137b0 b0Var = this.f256830e;
        int i = this.f256829d;
        synchronized (b0Var.f256817o) {
            Iterator<C117747y> it = b0Var.f256811f.iterator();
            while (it.hasNext()) {
                C117747y next = it.next();
                if (next != null && next.hashCode() == i) {
                    b0Var.mo123458d(next);
                    return;
                }
            }
            Iterator<C117747y> it4 = b0Var.f256812g.iterator();
            while (it4.hasNext()) {
                C117747y next2 = it4.next();
                if (next2 != null && next2.hashCode() == i) {
                    b0Var.mo123458d(next2);
                    return;
                }
            }
        }
    }

    public String toString() {
        return super.toString() + "|cancelImp_" + this.f256829d;
    }
}
