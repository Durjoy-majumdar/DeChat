package a14;

import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;

/* renamed from: a14.q2 */
public final class C53940q2<T> extends C53879e2 {

    /* renamed from: h */
    public final C53921m<T> f151191h;

    public C53940q2(C53921m<? super T> mVar) {
        this.f151191h = mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74474t((Throwable) obj);
        return C13598b0.f38549a;
    }

    /* renamed from: t */
    public void mo74474t(Throwable th) {
        Object d0 = mo74505u().mo74531d0();
        if (d0 instanceof C53969y) {
            C53921m<T> mVar = this.f151191h;
            Result.Companion companion = Result.Companion;
            mVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(((C53969y) d0).f151214a)));
            return;
        }
        C53921m<T> mVar2 = this.f151191h;
        Result.Companion companion2 = Result.Companion;
        mVar2.resumeWith(Result.m168114constructorimpl(C53899h2.m60476a(d0)));
    }
}
