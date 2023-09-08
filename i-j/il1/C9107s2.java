package il1;

import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: il1.s2 */
public final class C9107s2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15601d<Boolean> f28692a;

    public C9107s2(C15601d<? super Boolean> dVar) {
        this.f28692a = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C15601d<Boolean> dVar = this.f28692a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        } else {
            C15601d<Boolean> dVar2 = this.f28692a;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        return C13598b0.f38549a;
    }
}
