package v82;

import zt3.C119157j;

/* renamed from: v82.e1 */
public final class C111443e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111425d1 f333665d;

    /* renamed from: e */
    public final /* synthetic */ boolean f333666e;

    /* renamed from: v82.e1$a */
    public static final class C111444a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111425d1 f333667d;

        /* renamed from: e */
        public final /* synthetic */ boolean f333668e;

        public C111444a(C111425d1 d1Var, boolean z) {
            this.f333667d = d1Var;
            this.f333668e = z;
        }

        public final void run() {
            C111425d1 d1Var = this.f333667d;
            C111423c1 c1Var = d1Var.f333586d;
            if (c1Var != null && !d1Var.f333589g && c1Var != null) {
                c1Var.mo153021c(this.f333668e);
            }
        }
    }

    public C111443e1(C111425d1 d1Var, boolean z) {
        this.f333665d = d1Var;
        this.f333666e = z;
    }

    public final void run() {
        ((C119157j) C119157j.f356862d).mo183895z(new C111444a(this.f333665d, this.f333666e));
    }
}
