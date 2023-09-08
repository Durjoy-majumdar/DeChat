package androidx.compose.p002ui.platform;

import gy3.C87412m;
import p544h2.C32658d;
import p735w1.C111703v;

/* renamed from: androidx.compose.ui.platform.c */
public final class C103611c extends C103605a {

    /* renamed from: d */
    public static C103611c f306061d;

    /* renamed from: c */
    public C111703v f306062c;

    /* renamed from: a */
    public int[] mo144709a(int i) {
        int i2;
        C32658d dVar = C32658d.Rtl;
        if (mo144708d().length() <= 0 || i >= mo144708d().length()) {
            return null;
        }
        if (i < 0) {
            C111703v vVar = this.f306062c;
            if (vVar != null) {
                i2 = vVar.mo163369f(0);
            } else {
                C87412m.m108603p("layoutResult");
                throw null;
            }
        } else {
            C111703v vVar2 = this.f306062c;
            if (vVar2 != null) {
                int f = vVar2.mo163369f(i);
                i2 = mo144715e(f, dVar) == i ? f : f + 1;
            } else {
                C87412m.m108603p("layoutResult");
                throw null;
            }
        }
        C111703v vVar3 = this.f306062c;
        if (vVar3 == null) {
            C87412m.m108603p("layoutResult");
            throw null;
        } else if (i2 >= vVar3.f334372b.f334319f) {
            return null;
        } else {
            return mo144707c(mo144715e(i2, dVar), mo144715e(i2, C32658d.Ltr) + 1);
        }
    }

    /* renamed from: b */
    public int[] mo144710b(int i) {
        int i2;
        C32658d dVar = C32658d.Ltr;
        if (mo144708d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > mo144708d().length()) {
            C111703v vVar = this.f306062c;
            if (vVar != null) {
                i2 = vVar.mo163369f(mo144708d().length());
            } else {
                C87412m.m108603p("layoutResult");
                throw null;
            }
        } else {
            C111703v vVar2 = this.f306062c;
            if (vVar2 != null) {
                int f = vVar2.mo163369f(i);
                i2 = mo144715e(f, dVar) + 1 == i ? f : f - 1;
            } else {
                C87412m.m108603p("layoutResult");
                throw null;
            }
        }
        if (i2 < 0) {
            return null;
        }
        return mo144707c(mo144715e(i2, C32658d.Rtl), mo144715e(i2, dVar) + 1);
    }

    /* renamed from: e */
    public final int mo144715e(int i, C32658d dVar) {
        C111703v vVar = this.f306062c;
        if (vVar != null) {
            int j = vVar.mo163374j(i);
            C111703v vVar2 = this.f306062c;
            if (vVar2 == null) {
                C87412m.m108603p("layoutResult");
                throw null;
            } else if (dVar != vVar2.mo163377m(j)) {
                C111703v vVar3 = this.f306062c;
                if (vVar3 != null) {
                    return vVar3.mo163374j(i);
                }
                C87412m.m108603p("layoutResult");
                throw null;
            } else {
                C111703v vVar4 = this.f306062c;
                if (vVar4 != null) {
                    return vVar4.mo163367e(i, false) - 1;
                }
                C87412m.m108603p("layoutResult");
                throw null;
            }
        } else {
            C87412m.m108603p("layoutResult");
            throw null;
        }
    }
}
