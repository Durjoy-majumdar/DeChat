package p155g0;

import androidx.compose.p002ui.platform.C103709y1;
import androidx.compose.p002ui.platform.C27934a2;
import gy3.C87412m;
import p009c2.C104269s;
import p1166z0.C112539e;
import p152f0.C107343g0;
import p152f0.C107351i1;
import p152f0.C107394p2;
import p152f0.C107401q2;
import p155g0.C107629m;
import p175j0.C108494d2;
import p735w1.C111703v;
import p735w1.C38006x;

/* renamed from: g0.a0 */
public final class C107599a0 implements C107351i1 {

    /* renamed from: a */
    public final /* synthetic */ C107601b0 f321950a;

    /* renamed from: b */
    public final /* synthetic */ boolean f321951b;

    public C107599a0(C107601b0 b0Var, boolean z) {
        this.f321950a = b0Var;
        this.f321951b = z;
    }

    /* renamed from: a */
    public void mo157797a(long j) {
        C107601b0 b0Var = this.f321950a;
        b0Var.f321964k = C107640p.m145814a(b0Var.mo158022i(this.f321951b));
        C107601b0 b0Var2 = this.f321950a;
        C107601b0.m145760a(b0Var2, new C112539e(b0Var2.f321964k));
        C107601b0 b0Var3 = this.f321950a;
        int i = C112539e.f336958e;
        b0Var3.f321966m = C112539e.f336955b;
        C107601b0.m145761b(b0Var3, this.f321951b ? C107343g0.SelectionStart : C107343g0.SelectionEnd);
        C107394p2 p2Var = this.f321950a.f321957d;
        if (p2Var != null) {
            p2Var.f321321i = false;
        }
    }

    /* renamed from: b */
    public void mo157798b() {
        C107601b0.m145761b(this.f321950a, (C107343g0) null);
        C107601b0.m145760a(this.f321950a, (C112539e) null);
    }

    /* renamed from: c */
    public void mo157799c(long j) {
        C107601b0.m145761b(this.f321950a, this.f321951b ? C107343g0.SelectionStart : C107343g0.SelectionEnd);
        C107601b0 b0Var = this.f321950a;
        C107601b0.m145760a(b0Var, new C112539e(C107640p.m145814a(b0Var.mo158022i(this.f321951b))));
    }

    /* renamed from: d */
    public void mo157800d(long j) {
        C107401q2 q2Var;
        C111703v vVar;
        int i;
        int i2;
        C107601b0 b0Var = this.f321950a;
        b0Var.f321966m = C112539e.m153742g(b0Var.f321966m, j);
        C107601b0 b0Var2 = this.f321950a;
        C107394p2 p2Var = b0Var2.f321957d;
        if (!(p2Var == null || (q2Var = p2Var.f321319g) == null || (vVar = q2Var.f321339a) == null)) {
            boolean z = this.f321951b;
            ((C108494d2) b0Var2.f321968o).setValue(new C112539e(C112539e.m153742g(b0Var2.f321964k, b0Var2.f321966m)));
            if (z) {
                C112539e eVar = (C112539e) ((C108494d2) b0Var2.f321968o).getValue();
                C87412m.m108591d(eVar);
                i = vVar.mo163376l(eVar.f336959a);
            } else {
                C104269s sVar = b0Var2.f321955b;
                long j2 = b0Var2.mo158023j().f78286b;
                int i3 = C38006x.f100499c;
                i = sVar.mo145897b((int) (j2 >> 32));
            }
            int i4 = i;
            if (z) {
                i2 = b0Var2.f321955b.mo145897b(C38006x.m41695c(b0Var2.mo158023j().f78286b));
            } else {
                C112539e eVar2 = (C112539e) ((C108494d2) b0Var2.f321968o).getValue();
                C87412m.m108591d(eVar2);
                i2 = vVar.mo163376l(eVar2.f336959a);
            }
            C107601b0.m145762c(b0Var2, b0Var2.mo158023j(), i4, i2, z, C107629m.C107630a.f322024b);
        }
        C107394p2 p2Var2 = this.f321950a.f321957d;
        if (p2Var2 != null) {
            p2Var2.f321321i = false;
        }
    }

    public void onCancel() {
    }

    public void onStop() {
        C27934a2 a2Var = null;
        C107601b0.m145761b(this.f321950a, (C107343g0) null);
        C107601b0.m145760a(this.f321950a, (C112539e) null);
        C107601b0 b0Var = this.f321950a;
        C107394p2 p2Var = b0Var.f321957d;
        if (p2Var != null) {
            p2Var.f321321i = true;
        }
        C103709y1 y1Var = b0Var.f321960g;
        if (y1Var != null) {
            a2Var = y1Var.getStatus();
        }
        if (a2Var == C27934a2.Hidden) {
            this.f321950a.mo158027n();
        }
    }
}
