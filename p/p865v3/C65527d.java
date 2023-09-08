package p865v3;

import c14.C54614c;
import fy3.C32227p;
import gy3.C24565l;
import p865v3.C65512c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: v3.d */
public final /* synthetic */ class C65527d extends C24565l implements C32227p<C65512c.C65520c<Object>, C15601d<? super C13598b0>, Object> {
    public C65527d(C65512c.C65513a aVar) {
        super(2, aVar, C65512c.C65513a.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public Object invoke(Object obj, Object obj2) {
        Object o = ((C54614c) ((C65512c.C65513a) this.receiver).f188580a).mo75536o((C65512c.C65520c) obj, (C15601d) obj2);
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }
}
