package p516f9;

/* renamed from: f9.k0 */
public final /* synthetic */ class C116830k0 implements Runnable {

    /* renamed from: d */
    public final C116826i0 f350192d;

    public C116830k0(C116826i0 i0Var) {
        this.f350192d = i0Var;
    }

    public final void run() {
        C116826i0 i0Var = this.f350192d;
        synchronized (i0Var) {
            if (i0Var.f350181d == 1) {
                i0Var.mo180818a(1, "Timed out while binding");
            }
        }
    }
}
