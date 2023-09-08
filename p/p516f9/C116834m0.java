package p516f9;

/* renamed from: f9.m0 */
public final /* synthetic */ class C116834m0 implements Runnable {

    /* renamed from: d */
    public final C116826i0 f350200d;

    /* renamed from: e */
    public final C116811b f350201e;

    public C116834m0(C116826i0 i0Var, C116811b bVar) {
        this.f350200d = i0Var;
        this.f350201e = bVar;
    }

    public final void run() {
        C116826i0 i0Var = this.f350200d;
        int i = this.f350201e.f350159a;
        synchronized (i0Var) {
            C116811b bVar = i0Var.f350185h.get(i);
            if (bVar != null) {
                i0Var.f350185h.remove(i);
                bVar.mo180804b(new C116813c(3, "Timed out waiting for response"));
                i0Var.mo180820c();
            }
        }
    }
}
