package al1;

import a14.C53895h;
import al1.C39612t;
import bl1.C39786k;
import bl1.C39796l;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46514d0;
import kotlin.Result;
import ks3.C46740q;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.C49335eu3;
import te3.C49727hn0;
import te3.C50317lw0;
import te3.C52013xs0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: al1.v */
public final class C39619v<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C39612t.C39615b<C49335eu3> f106377a;

    /* renamed from: b */
    public final /* synthetic */ C89132b<C49335eu3> f106378b;

    /* renamed from: c */
    public final /* synthetic */ C15601d<C39612t.C39616c> f106379c;

    public C39619v(C39612t.C39615b<C49335eu3> bVar, C89132b<C49335eu3> bVar2, C15601d<? super C39612t.C39616c> dVar) {
        this.f106377a = bVar;
        this.f106378b = bVar2;
        this.f106379c = dVar;
    }

    public Object call(Object obj) {
        long j;
        C49727hn0 hn02;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C39612t.C39615b<C49335eu3> bVar = this.f106377a;
        C89132b<C49335eu3> bVar2 = this.f106378b;
        C87412m.m108593f(cVar, "cgiBack");
        C39786k.C39789c cVar2 = (C39786k.C39789c) bVar;
        cVar2.getClass();
        C87412m.m108594g(bVar2, "cgi");
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && (hn02 = (C49727hn0) cVar.f256796d) != null) {
            j = (long) hn02.f134744f;
            LinkedList<C52013xs0> linkedList = hn02.f134743e;
            C87412m.m108593f(linkedList, "resp.app_msg_list");
            for (C52013xs0 xs02 : linkedList) {
                if (xs02.f144910o == null) {
                    String str = ((C46514d0) bVar2).f125312s.f137677e;
                    if (str == null) {
                        str = "";
                    }
                    C50317lw0 lw02 = new C50317lw0();
                    int i = C46740q.f125820a;
                    lw02.f137676d = 1;
                    lw02.f137677e = str;
                    xs02.f144910o = lw02;
                }
            }
            LinkedList<C52013xs0> linkedList2 = hn02.f134743e;
            C87412m.m108593f(linkedList2, "appMsgList");
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList2) {
                if (C39786k.f106761j.contains(Integer.valueOf(((C52013xs0) next).f144903e))) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : linkedList2) {
                if (((C52013xs0) next2).f144903e == 20062) {
                    arrayList2.add(next2);
                }
            }
            C53895h.m60468f((C66212f) null, new C39796l(cVar2, hn02.f134746h, hn02.f134742d, arrayList, arrayList2, C64186f0.f181907d, (C15601d<? super C39796l>) null), 1, (Object) null);
        } else {
            j = 1000;
        }
        this.f106379c.resumeWith(Result.m168114constructorimpl(new C39612t.C39616c(true, j)));
        return C13598b0.f38549a;
    }
}
