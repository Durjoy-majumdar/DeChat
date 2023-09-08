package a14;

import a14.C53973z1;
import f14.C58878f0;
import fy3.C32226l;
import fy3.C32227p;
import g14.C59347a;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13603j;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;

/* renamed from: a14.a */
public abstract class C53851a<T> extends C53884f2 implements C15601d<T>, C0000n0 {

    /* renamed from: e */
    public final C66212f f151094e;

    public C53851a(C66212f fVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo74534h0((C53973z1) fVar.get(C53973z1.C0004b.f3d));
        }
        this.f151094e = fVar.plus(this);
    }

    /* renamed from: H */
    public String mo74465H() {
        return getClass().getSimpleName() + " was cancelled";
    }

    /* renamed from: a */
    public boolean mo74466a() {
        return super.mo74466a();
    }

    /* renamed from: f0 */
    public final void mo74467f0(Throwable th) {
        C53918l0.m60515a(this.f151094e, th);
    }

    public final C66212f getContext() {
        return this.f151094e;
    }

    public C66212f getCoroutineContext() {
        return this.f151094e;
    }

    /* renamed from: l0 */
    public String mo74468l0() {
        return super.mo74468l0();
    }

    /* renamed from: o0 */
    public final void mo74469o0(Object obj) {
        if (obj instanceof C53969y) {
            C53969y yVar = (C53969y) obj;
            mo74471w0(yVar.f151214a, yVar.mo74643a());
            return;
        }
        mo74472x0(obj);
    }

    public final void resumeWith(Object obj) {
        Throwable r1 = Result.m168117exceptionOrNullimpl(obj);
        if (r1 != null) {
            obj = new C53969y(r1, false, 2, (C8480h) null);
        }
        Object k0 = mo74538k0(obj);
        if (k0 != C53899h2.f151146b) {
            mo74470v0(k0);
        }
    }

    /* renamed from: v0 */
    public void mo74470v0(Object obj) {
        mo74511x(obj);
    }

    /* renamed from: w0 */
    public void mo74471w0(Throwable th, boolean z) {
    }

    /* renamed from: x0 */
    public void mo74472x0(T t) {
    }

    /* renamed from: y0 */
    public final <R> void mo74473y0(C53934p0 p0Var, R r, C32227p<? super R, ? super C15601d<? super T>, ? extends Object> pVar) {
        C66212f context;
        Object c;
        int ordinal = p0Var.ordinal();
        if (ordinal == 0) {
            C59347a.m69266a(pVar, r, this, (C32226l) null, 4, (Object) null);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                C87412m.m108594g(pVar, "<this>");
                C15601d<C13598b0> b = C66447b.m78392b(C66447b.m78391a(pVar, r, this));
                Result.Companion companion = Result.Companion;
                b.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            } else if (ordinal == 3) {
                try {
                    context = getContext();
                    c = C58878f0.m68716c(context, (Object) null);
                    C24564k0.m30741e(pVar, 2);
                    Object invoke = pVar.invoke(r, this);
                    C58878f0.m68714a(context, c);
                    if (invoke != C15911a.COROUTINE_SUSPENDED) {
                        resumeWith(Result.m168114constructorimpl(invoke));
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
                }
            } else {
                throw new C13603j();
            }
        }
    }
}
