package p155g0;

import gy3.C87412m;
import p1111g1.C107693a;
import p1166z0.C112539e;
import p152f0.C107343g0;
import p152f0.C107351i1;
import p152f0.C107394p2;
import p152f0.C107401q2;
import p175j0.C108494d2;
import p735w1.C111703v;
import p735w1.C38006x;
import p735w1.C38007y;

/* renamed from: g0.z */
public final class C107656z implements C107351i1 {

    /* renamed from: a */
    public final /* synthetic */ C107601b0 f322057a;

    public C107656z(C107601b0 b0Var) {
        this.f322057a = b0Var;
    }

    /* renamed from: a */
    public void mo157797a(long j) {
        C107601b0 b0Var = this.f322057a;
        b0Var.f321964k = C107640p.m145814a(b0Var.mo158022i(true));
        C107601b0 b0Var2 = this.f322057a;
        C107601b0.m145760a(b0Var2, new C112539e(b0Var2.f321964k));
        C107601b0 b0Var3 = this.f322057a;
        int i = C112539e.f336958e;
        b0Var3.f321966m = C112539e.f336955b;
        C107601b0.m145761b(b0Var3, C107343g0.Cursor);
    }

    /* renamed from: b */
    public void mo157798b() {
        C107601b0.m145761b(this.f322057a, (C107343g0) null);
        C107601b0.m145760a(this.f322057a, (C112539e) null);
    }

    /* renamed from: c */
    public void mo157799c(long j) {
        C107601b0.m145761b(this.f322057a, C107343g0.Cursor);
        C107601b0 b0Var = this.f322057a;
        C107601b0.m145760a(b0Var, new C112539e(C107640p.m145814a(b0Var.mo158022i(true))));
    }

    /* renamed from: d */
    public void mo157800d(long j) {
        C107401q2 q2Var;
        C111703v vVar;
        C107601b0 b0Var = this.f322057a;
        b0Var.f321966m = C112539e.m153742g(b0Var.f321966m, j);
        C107601b0 b0Var2 = this.f322057a;
        C107394p2 p2Var = b0Var2.f321957d;
        if (p2Var != null && (q2Var = p2Var.f321319g) != null && (vVar = q2Var.f321339a) != null) {
            ((C108494d2) b0Var2.f321968o).setValue(new C112539e(C112539e.m153742g(b0Var2.f321964k, b0Var2.f321966m)));
            C112539e eVar = (C112539e) ((C108494d2) b0Var2.f321968o).getValue();
            C87412m.m108591d(eVar);
            int l = vVar.mo163376l(eVar.f336959a);
            long a = C38007y.m41701a(l, l);
            if (!C38006x.m41693a(a, b0Var2.mo158023j().f78286b)) {
                C107693a aVar = b0Var2.f321961h;
                if (aVar != null) {
                    aVar.mo158098a(9);
                }
                b0Var2.f321956c.invoke(b0Var2.mo158018e(b0Var2.mo158023j().f78285a, a));
            }
        }
    }

    public void onCancel() {
    }

    public void onStop() {
        C107601b0.m145761b(this.f322057a, (C107343g0) null);
        C107601b0.m145760a(this.f322057a, (C112539e) null);
    }
}
