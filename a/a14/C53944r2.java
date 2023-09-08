package a14;

import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: a14.r2 */
public final class C53944r2 extends C53879e2 {

    /* renamed from: h */
    public final C15601d<C13598b0> f151192h;

    public C53944r2(C15601d<? super C13598b0> dVar) {
        this.f151192h = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74474t((Throwable) obj);
        return C13598b0.f38549a;
    }

    /* renamed from: t */
    public void mo74474t(Throwable th) {
        C15601d<C13598b0> dVar = this.f151192h;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
    }
}
