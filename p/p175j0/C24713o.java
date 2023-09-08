package p175j0;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: j0.o */
public final class C24713o extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C24729z1 f70487d;

    /* renamed from: e */
    public final /* synthetic */ C24663c f70488e;

    /* renamed from: f */
    public final /* synthetic */ List<C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0>> f70489f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24713o(C24729z1 z1Var, C24663c cVar, List<C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0>> list) {
        super(3);
        this.f70487d = z1Var;
        this.f70488e = cVar;
        this.f70489f = list;
    }

    /* JADX INFO: finally extract failed */
    public Object invoke(Object obj, Object obj2, Object obj3) {
        C24665d dVar = (C24665d) obj;
        C24661b2 b2Var = (C24661b2) obj2;
        C24724t1 t1Var = (C24724t1) obj3;
        C87412m.m108594g(dVar, "applier");
        C87412m.m108594g(b2Var, "slots");
        C87412m.m108594g(t1Var, "rememberManager");
        C24729z1 z1Var = this.f70487d;
        List<C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0>> list = this.f70489f;
        C24661b2 l = z1Var.mo51708l();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(dVar, l, t1Var);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            l.mo51515f();
            b2Var.mo51514e();
            C24729z1 z1Var2 = this.f70487d;
            C24663c cVar = this.f70488e;
            cVar.getClass();
            C87412m.m108594g(z1Var2, "slots");
            b2Var.mo51529t(z1Var2, z1Var2.mo51704f(cVar));
            b2Var.mo51519j();
            return C13598b0.f38549a;
        } catch (Throwable th) {
            l.mo51515f();
            throw th;
        }
    }
}
