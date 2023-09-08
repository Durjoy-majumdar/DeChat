package p175j0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53927n1;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import fy3.C32227p;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: j0.r0 */
public final class C60680r0 implements C24725u1 {

    /* renamed from: d */
    public final C32227p<C0000n0, C15601d<? super C13598b0>, Object> f172848d;

    /* renamed from: e */
    public final C0000n0 f172849e;

    /* renamed from: f */
    public C53973z1 f172850f;

    public C60680r0(C66212f fVar, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(fVar, "parentCoroutineContext");
        C87412m.m108594g(pVar, "task");
        this.f172848d = pVar;
        this.f172849e = C53930o0.m60554a(fVar);
    }

    /* renamed from: b */
    public void mo51625b() {
        C53973z1 z1Var = this.f172850f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f172850f = null;
    }

    /* renamed from: c */
    public void mo51626c() {
        C53973z1 z1Var = this.f172850f;
        if (z1Var != null) {
            z1Var.mo74528b(C53927n1.m60552a("Old job was still running!", (Throwable) null));
        }
        this.f172850f = C53895h.m60466d(this.f172849e, (C66212f) null, (C53934p0) null, this.f172848d, 3, (Object) null);
    }

    /* renamed from: d */
    public void mo51627d() {
        C53973z1 z1Var = this.f172850f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f172850f = null;
    }
}
