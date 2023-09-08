package androidx.compose.p002ui.platform;

import android.graphics.Rect;
import gy3.C87412m;
import iy3.C60641c;
import p1166z0.C112541g;
import p246u1.C111087s;
import p544h2.C32658d;
import p735w1.C111703v;

/* renamed from: androidx.compose.ui.platform.d */
public final class C103615d extends C103605a {

    /* renamed from: e */
    public static C103615d f306067e;

    /* renamed from: c */
    public C111703v f306068c;

    /* renamed from: d */
    public C111087s f306069d;

    public C103615d() {
        new Rect();
    }

    /* renamed from: a */
    public int[] mo144709a(int i) {
        int i2;
        if (mo144708d().length() <= 0 || i >= mo144708d().length()) {
            return null;
        }
        try {
            C111087s sVar = this.f306069d;
            if (sVar != null) {
                C112541g d = sVar.mo162835d();
                int b = C60641c.m70921b(d.f336964d - d.f336962b);
                if (i <= 0) {
                    i = 0;
                }
                C111703v vVar = this.f306068c;
                if (vVar != null) {
                    int f = vVar.mo163369f(i);
                    C111703v vVar2 = this.f306068c;
                    if (vVar2 != null) {
                        float k = vVar2.mo163375k(f) + ((float) b);
                        C111703v vVar3 = this.f306068c;
                        if (vVar3 == null) {
                            C87412m.m108603p("layoutResult");
                            throw null;
                        } else if (vVar3 != null) {
                            if (k < vVar3.mo163375k(vVar3.f334372b.f334319f - 1)) {
                                C111703v vVar4 = this.f306068c;
                                if (vVar4 != null) {
                                    i2 = vVar4.mo163370g(k);
                                } else {
                                    C87412m.m108603p("layoutResult");
                                    throw null;
                                }
                            } else {
                                C111703v vVar5 = this.f306068c;
                                if (vVar5 != null) {
                                    i2 = vVar5.f334372b.f334319f;
                                } else {
                                    C87412m.m108603p("layoutResult");
                                    throw null;
                                }
                            }
                            return mo144707c(i, mo144717e(i2 - 1, C32658d.Ltr) + 1);
                        } else {
                            C87412m.m108603p("layoutResult");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("layoutResult");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("layoutResult");
                    throw null;
                }
            } else {
                C87412m.m108603p("node");
                throw null;
            }
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public int[] mo144710b(int i) {
        int i2;
        if (mo144708d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            C111087s sVar = this.f306069d;
            if (sVar != null) {
                C112541g d = sVar.mo162835d();
                int b = C60641c.m70921b(d.f336964d - d.f336962b);
                int length = mo144708d().length();
                if (length <= i) {
                    i = length;
                }
                C111703v vVar = this.f306068c;
                if (vVar != null) {
                    int f = vVar.mo163369f(i);
                    C111703v vVar2 = this.f306068c;
                    if (vVar2 != null) {
                        float k = vVar2.mo163375k(f) - ((float) b);
                        if (k > 0.0f) {
                            C111703v vVar3 = this.f306068c;
                            if (vVar3 != null) {
                                i2 = vVar3.mo163370g(k);
                            } else {
                                C87412m.m108603p("layoutResult");
                                throw null;
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i == mo144708d().length() && i2 < f) {
                            i2++;
                        }
                        return mo144707c(mo144717e(i2, C32658d.Rtl), i);
                    }
                    C87412m.m108603p("layoutResult");
                    throw null;
                }
                C87412m.m108603p("layoutResult");
                throw null;
            }
            C87412m.m108603p("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final int mo144717e(int i, C32658d dVar) {
        C111703v vVar = this.f306068c;
        if (vVar != null) {
            int j = vVar.mo163374j(i);
            C111703v vVar2 = this.f306068c;
            if (vVar2 == null) {
                C87412m.m108603p("layoutResult");
                throw null;
            } else if (dVar != vVar2.mo163377m(j)) {
                C111703v vVar3 = this.f306068c;
                if (vVar3 != null) {
                    return vVar3.mo163374j(i);
                }
                C87412m.m108603p("layoutResult");
                throw null;
            } else {
                C111703v vVar4 = this.f306068c;
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
