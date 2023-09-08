package rl1;

import hp3.C87581a;
import java.util.LinkedList;
import kotlin.Result;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C48779ay0;
import te3.C50189kx0;
import te3.C52204z21;
import wx3.C15601d;

/* renamed from: rl1.g0 */
public final class C13037g0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C13022d0 f37137a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<C13604l<Boolean, ? extends C48779ay0>> f37138b;

    public C13037g0(C13022d0 d0Var, C15601d<? super C13604l<Boolean, ? extends C48779ay0>> dVar) {
        this.f37137a = d0Var;
        this.f37138b = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C13022d0 d0Var = this.f37137a;
            d0Var.getClass();
            C61926c.m72668M(new C13036f0(d0Var));
            C52204z21 z212 = ((C50189kx0) cVar.f256796d).f137077d;
            if (z212 != null) {
                C13022d0 d0Var2 = this.f37137a;
                LinkedList linkedList = new LinkedList();
                linkedList.add(z212);
                d0Var2.mo12532F3(linkedList, false);
                d0Var2.f37101q.postValue(Boolean.TRUE);
            }
            C15601d<C13604l<Boolean, ? extends C48779ay0>> dVar = this.f37138b;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.TRUE, null)));
        } else {
            C15601d<C13604l<Boolean, ? extends C48779ay0>> dVar2 = this.f37138b;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.FALSE, ((C50189kx0) cVar.f256796d).f137078e)));
        }
        return C13598b0.f38549a;
    }
}
