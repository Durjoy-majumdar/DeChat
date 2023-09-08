package a14;

import f14.C58885i;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C66447b;

/* renamed from: a14.j2 */
public final class C53907j2 extends C53951t2 {

    /* renamed from: f */
    public final C15601d<C13598b0> f151160f;

    public C53907j2(C66212f fVar, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        super(fVar, false);
        this.f151160f = C66447b.m78391a(pVar, this, this);
    }

    /* renamed from: p0 */
    public void mo74541p0() {
        try {
            C15601d<C13598b0> b = C66447b.m78392b(this.f151160f);
            Result.Companion companion = Result.Companion;
            C58885i.m68733b(b, Result.m168114constructorimpl(C13598b0.f38549a), (C32226l) null, 2, (Object) null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
