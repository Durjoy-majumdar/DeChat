package v82;

import zt3.C119157j;

/* renamed from: v82.f1 */
public final class C111448f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111425d1 f333673d;

    /* renamed from: v82.f1$a */
    public static final class C111449a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111425d1 f333674d;

        public C111449a(C111425d1 d1Var) {
            this.f333674d = d1Var;
        }

        public final void run() {
            C111425d1 d1Var = this.f333674d;
            C111423c1 c1Var = d1Var.f333586d;
            if (c1Var != null && !d1Var.f333589g && c1Var != null) {
                c1Var.mo153026h();
            }
        }
    }

    public C111448f1(C111425d1 d1Var) {
        this.f333673d = d1Var;
    }

    public final void run() {
        ((C119157j) C119157j.f356862d).mo183895z(new C111449a(this.f333673d));
    }
}
