package rh2;

import a14.C53916l;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;

/* renamed from: rh2.c */
public final class C36326c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53916l<C13598b0> f96693d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36326c(C53916l<? super C13598b0> lVar) {
        super(0);
        this.f96693d = lVar;
    }

    public Object invoke() {
        if (this.f96693d.mo74597a()) {
            C53916l<C13598b0> lVar = this.f96693d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        return C13598b0.f38549a;
    }
}
