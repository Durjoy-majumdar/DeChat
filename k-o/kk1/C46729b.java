package kk1;

import fy3.C32227p;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49452fo1;

/* renamed from: kk1.b */
public final class C46729b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Integer, LinkedList<String>, C13598b0> f125803a;

    public C46729b(C32227p<? super Integer, ? super LinkedList<String>, C13598b0> pVar) {
        this.f125803a = pVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C32227p<Integer, LinkedList<String>, C13598b0> pVar = this.f125803a;
        if (pVar == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(cVar.f256794b);
        LinkedList<String> linkedList = ((C49452fo1) cVar.f256796d).f133613d;
        C87412m.m108593f(linkedList, "it.resp.block_song_names");
        pVar.invoke(valueOf, linkedList);
        return C13598b0.f38549a;
    }
}
