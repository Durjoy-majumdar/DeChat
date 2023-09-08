package wf1;

import a14.C53916l;
import gy3.C8477a0;
import kotlin.Result;
import qo3.C101218e0;

/* renamed from: wf1.d */
public final class C15171d implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ C53916l<Boolean> f41316a;

    /* renamed from: b */
    public final /* synthetic */ C8477a0 f41317b;

    public C15171d(C53916l<? super Boolean> lVar, C8477a0 a0Var) {
        this.f41316a = lVar;
        this.f41317b = a0Var;
    }

    public final void dismiss() {
        C15191k.f41360a.mo14129d("153");
        C53916l<Boolean> lVar = this.f41316a;
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(this.f41317b.f27482d)));
    }
}
