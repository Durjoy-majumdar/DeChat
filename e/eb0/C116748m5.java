package eb0;

import eb0.C116756s5;

/* renamed from: eb0.m5 */
public class C116748m5 extends C116756s5.C116757a {
    public C116748m5(C116756s5 s5Var) {
        super(s5Var, (C116732g5) null);
    }

    /* renamed from: a */
    public boolean mo180719a(C58543t4 t4Var) {
        if (System.currentTimeMillis() - t4Var.f167585f <= 3600000 || t4Var.f167584e.length() <= 0) {
            return false;
        }
        C116756s5.m164689b(t4Var.f167583d, t4Var.f167584e);
        t4Var.f167584e = "";
        t4Var.f167585f = System.currentTimeMillis();
        return true;
    }

    /* renamed from: b */
    public C58543t4 mo180724b(int i, Object... objArr) {
        C58543t4 t4Var = new C58543t4();
        t4Var.f167583d = i;
        if (objArr != null && objArr.length > 0) {
            t4Var.f167584e = "" + objArr[0];
        }
        t4Var.f167585f = 0;
        return t4Var;
    }

    /* renamed from: c */
    public void mo180725c(C58543t4 t4Var, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            t4Var.f167584e = "" + objArr[0];
        }
    }
}
