package qj1;

/* renamed from: qj1.m5 */
public final class C12516m5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f35978d;

    /* renamed from: e */
    public final /* synthetic */ C12322e5 f35979e;

    public C12516m5(int i, C12322e5 e5Var) {
        this.f35978d = i;
        this.f35979e = e5Var;
    }

    public final void run() {
        int i = this.f35978d;
        if (i >= 0 && i < this.f35979e.f35506C.f36654g.size()) {
            this.f35979e.f35506C.notifyItemChanged(this.f35978d);
        }
    }
}
