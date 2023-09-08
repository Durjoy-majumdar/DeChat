package t83;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t83.n1 */
public final class C13862n1 {

    /* renamed from: a */
    public static final C13862n1 f39019a = new C13862n1();

    /* renamed from: b */
    public static final List<C13853i> f39020b = new ArrayList();

    /* renamed from: c */
    public static final C13861m1 f39021c = C13861m1.f39016b;

    /* renamed from: a */
    public final boolean mo13195a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        C13853i c = jVar.f39001d.mo13177c();
        if (c != null && c.mo8736b(jVar, h1Var) && c.mo8735a(jVar, h1Var)) {
            return true;
        }
        for (C13853i iVar : f39020b) {
            if (iVar.mo8736b(jVar, h1Var) && iVar.mo8735a(jVar, h1Var)) {
                return true;
            }
        }
        C13861m1 m1Var = f39021c;
        return m1Var.mo8736b(jVar, h1Var) && m1Var.mo8735a(jVar, h1Var);
    }
}
