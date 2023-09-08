package qj1;

import hp3.C87581a;
import kotlin.Result;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C52026xv0;
import wx3.C15601d;

/* renamed from: qj1.vg */
public final class C12721vg<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15601d<C13604l<Boolean, Boolean>> f36446a;

    /* renamed from: b */
    public final /* synthetic */ C12677tg f36447b;

    public C12721vg(C15601d<? super C13604l<Boolean, Boolean>> dVar, C12677tg tgVar) {
        this.f36446a = dVar;
        this.f36447b = tgVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            C61926c.m72668M(new C12701ug(cVar, this.f36447b));
            C15601d<C13604l<Boolean, Boolean>> dVar = this.f36446a;
            Result.Companion companion = Result.Companion;
            Boolean bool = Boolean.FALSE;
            dVar.resumeWith(Result.m168114constructorimpl(new C13604l(bool, bool)));
        } else if (((C52026xv0) cVar.f256796d).f144990d) {
            C15601d<C13604l<Boolean, Boolean>> dVar2 = this.f36446a;
            Result.Companion companion2 = Result.Companion;
            Boolean bool2 = Boolean.TRUE;
            dVar2.resumeWith(Result.m168114constructorimpl(new C13604l(bool2, bool2)));
        } else {
            C15601d<C13604l<Boolean, Boolean>> dVar3 = this.f36446a;
            Result.Companion companion3 = Result.Companion;
            dVar3.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.TRUE, Boolean.FALSE)));
        }
        return C13598b0.f38549a;
    }
}
