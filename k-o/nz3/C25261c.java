package nz3;

import fy3.C32226l;
import fz3.C24498c;
import gy3.C87412m;
import gy3.C87413o;
import hz3.C24615g;
import jz3.C24799e;
import xy3.C26566c;

/* renamed from: nz3.c */
public final class C25261c extends C87413o implements C32226l<Object, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C25257a<Object> f71733d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25261c(C25257a<Object> aVar) {
        super(1);
        this.f71733d = aVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g(obj, "$this$extractNullability");
        C25308u uVar = (C25308u) this.f71733d;
        uVar.getClass();
        C26566c cVar = (C26566c) obj;
        return Boolean.valueOf(((cVar instanceof C24615g) && ((C24615g) cVar).mo51297c()) || ((cVar instanceof C24799e) && !uVar.f71806c.f70290a.f70275t.mo51475c() && (((C24799e) cVar).f70726h || uVar.f71807d == C24498c.TYPE_PARAMETER_BOUNDS)));
    }
}
