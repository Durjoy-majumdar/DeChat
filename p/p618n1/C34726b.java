package p618n1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p559i1.C33176a;

/* renamed from: n1.b */
public final class C34726b extends C87413o implements C32226l<C33176a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C34727c, Boolean> f93364d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34726b(C32226l<? super C34727c, Boolean> lVar) {
        super(1);
        this.f93364d = lVar;
    }

    public Object invoke(Object obj) {
        C33176a aVar = (C33176a) obj;
        C87412m.m108594g(aVar, "e");
        if (aVar instanceof C34727c) {
            return this.f93364d.invoke(aVar);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
