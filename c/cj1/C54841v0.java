package cj1;

import fj1.C45795b;
import gy3.C87412m;
import hp3.C87581a;
import kotlin.Result;
import np1.C61866i0;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C64434i11;
import wx3.C15601d;

/* renamed from: cj1.v0 */
public final class C54841v0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ String f153743a;

    /* renamed from: b */
    public final /* synthetic */ C45795b f153744b;

    /* renamed from: c */
    public final /* synthetic */ C15601d<C64434i11> f153745c;

    public C54841v0(String str, C45795b bVar, C15601d<? super C64434i11> dVar) {
        this.f153743a = str;
        this.f153744b = bVar;
        this.f153745c = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C61866i0 i0Var = C61866i0.f175909a;
            String str = this.f153743a;
            C45795b bVar = this.f153744b;
            T t = cVar.f256796d;
            C87412m.m108593f(t, "it.resp");
            if (i0Var.mo86800l(str, bVar, (C64434i11) t)) {
                C15601d<C64434i11> dVar = this.f153745c;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(cVar.f256796d));
            } else {
                this.f153745c.resumeWith(Result.m168114constructorimpl((Object) null));
            }
        } else {
            this.f153745c.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
