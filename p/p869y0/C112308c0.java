package p869y0;

import gy3.C87412m;
import p658q1.C110282c0;
import p658q1.C110301j;
import p658q1.C110311s;
import rx3.C13603j;

/* renamed from: y0.c0 */
public final class C112308c0 {
    /* renamed from: a */
    public static final void m153187a(C112321l lVar) {
        C87412m.m108594g(lVar, "<this>");
        int ordinal = lVar.f336333g.ordinal();
        if (ordinal == 3) {
            lVar.mo164050b(C112306b0.Inactive);
        } else if (ordinal == 4) {
            lVar.mo164050b(C112306b0.ActiveParent);
        }
    }

    /* renamed from: b */
    public static final boolean m153188b(C112321l lVar) {
        C112321l lVar2 = lVar.f336334h;
        if (lVar2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (!m153189c(lVar2, false)) {
            return false;
        } else {
            lVar.f336334h = null;
            return true;
        }
    }

    /* renamed from: c */
    public static final boolean m153189c(C112321l lVar, boolean z) {
        C112306b0 b0Var = C112306b0.Inactive;
        C87412m.m108594g(lVar, "<this>");
        int ordinal = lVar.f336333g.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new C13603j();
                            }
                        } else if (m153188b(lVar)) {
                            lVar.mo164050b(C112306b0.Deactivated);
                        }
                    }
                } else if (!z) {
                    return z;
                } else {
                    lVar.mo164050b(b0Var);
                    return z;
                }
            } else if (m153188b(lVar)) {
                lVar.mo164050b(b0Var);
            }
            return false;
        }
        lVar.mo164050b(b0Var);
        return true;
    }

    /* renamed from: d */
    public static final void m153190d(C112321l lVar) {
        C110301j jVar;
        C110282c0 c0Var;
        C66478i focusManager;
        C112306b0 b0Var = C112306b0.Deactivated;
        C87412m.m108594g(lVar, "<this>");
        int ordinal = lVar.f336333g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                lVar.mo164050b(C112306b0.DeactivatedParent);
                return;
            } else if (ordinal != 2) {
                if (ordinal == 5) {
                    lVar.mo164050b(b0Var);
                    return;
                }
                return;
            }
        }
        C110311s sVar = lVar.f336341r;
        if (!(sVar == null || (jVar = sVar.f329972h) == null || (c0Var = jVar.f329918j) == null || (focusManager = c0Var.getFocusManager()) == null)) {
            focusManager.mo90561b(true);
        }
        lVar.mo164050b(b0Var);
    }

    /* renamed from: e */
    public static final void m153191e(C112321l lVar) {
        C112306b0 b0Var;
        int ordinal = lVar.f336333g.ordinal();
        if (!(ordinal == 0 || ordinal == 1)) {
            if (ordinal == 2) {
                b0Var = C112306b0.Captured;
                lVar.mo164050b(b0Var);
            } else if (ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            } else if (ordinal != 5) {
                throw new C13603j();
            }
        }
        b0Var = C112306b0.Active;
        lVar.mo164050b(b0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.f329972h;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m153192f(p869y0.C112321l r2) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r2, r0)
            q1.s r0 = r2.f336341r
            if (r0 == 0) goto L_0x0010
            q1.j r0 = r0.f329972h
            if (r0 == 0) goto L_0x0010
            q1.c0 r0 = r0.f329918j
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r1 = 1
            if (r0 != 0) goto L_0x0017
            r2.f336342s = r1
            return
        L_0x0017:
            y0.b0 r0 = r2.f336333g
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x004a
            if (r0 == r1) goto L_0x0040
            r1 = 2
            if (r0 == r1) goto L_0x004a
            r1 = 3
            if (r0 == r1) goto L_0x004a
            r1 = 4
            if (r0 == r1) goto L_0x004a
            r1 = 5
            if (r0 == r1) goto L_0x002e
            goto L_0x0051
        L_0x002e:
            y0.l r0 = r2.f336331e
            if (r0 == 0) goto L_0x0036
            m153193g(r0, r2)
            goto L_0x0051
        L_0x0036:
            boolean r0 = m153194h(r2)
            if (r0 == 0) goto L_0x0051
            m153191e(r2)
            goto L_0x0051
        L_0x0040:
            boolean r0 = m153188b(r2)
            if (r0 == 0) goto L_0x0051
            m153191e(r2)
            goto L_0x0051
        L_0x004a:
            y0.h r2 = r2.f336335i
            if (r2 == 0) goto L_0x0051
            r2.mo164047e()
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112308c0.m153192f(y0.l):void");
    }

    /* renamed from: g */
    public static final boolean m153193g(C112321l lVar, C112321l lVar2) {
        if (lVar.f336332f.mo159864f(lVar2)) {
            int ordinal = lVar.f336333g.ordinal();
            if (ordinal == 0) {
                lVar.mo164050b(C112306b0.ActiveParent);
                lVar.f336334h = lVar2;
                m153191e(lVar2);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    return false;
                }
                if (ordinal == 3) {
                    m153187a(lVar);
                    boolean g = m153193g(lVar, lVar2);
                    m153190d(lVar);
                    return g;
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        C112321l lVar3 = lVar.f336331e;
                        if (lVar3 == null && m153194h(lVar)) {
                            lVar.mo164050b(C112306b0.Active);
                            return m153193g(lVar, lVar2);
                        } else if (lVar3 == null || !m153193g(lVar3, lVar)) {
                            return false;
                        } else {
                            return m153193g(lVar, lVar2);
                        }
                    } else {
                        throw new C13603j();
                    }
                } else if (lVar.f336334h == null) {
                    lVar.f336334h = lVar2;
                    m153191e(lVar2);
                } else if (!m153188b(lVar)) {
                    return false;
                } else {
                    lVar.f336334h = lVar2;
                    m153191e(lVar2);
                }
            } else if (!m153188b(lVar)) {
                return false;
            } else {
                lVar.f336334h = lVar2;
                m153191e(lVar2);
            }
            return true;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    /* renamed from: h */
    public static final boolean m153194h(C112321l lVar) {
        C110301j jVar;
        C110282c0 c0Var;
        C110311s sVar = lVar.f336341r;
        if (sVar != null && (jVar = sVar.f329972h) != null && (c0Var = jVar.f329918j) != null) {
            return c0Var.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
