package p176jc;

import a14.C53916l;
import kotlin.Result;
import rx3.C13598b0;

/* renamed from: jc.m */
public final class C33532m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53916l<C13598b0> f90789d;

    public C33532m(C53916l<? super C13598b0> lVar) {
        this.f90789d = lVar;
    }

    public final void run() {
        if (this.f90789d.mo74597a()) {
            C53916l<C13598b0> lVar = this.f90789d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }
}
