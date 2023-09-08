package n04;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import n04.C25134i1;
import q04.C25528k;
import q04.C25532p;
import rx3.C13598b0;

/* renamed from: n04.g */
public final class C34723g extends C87413o implements C32226l<C25134i1.C25140a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C25528k> f93358d;

    /* renamed from: e */
    public final /* synthetic */ C25134i1 f93359e;

    /* renamed from: f */
    public final /* synthetic */ C25532p f93360f;

    /* renamed from: g */
    public final /* synthetic */ C25528k f93361g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34723g(List<? extends C25528k> list, C25134i1 i1Var, C25532p pVar, C25528k kVar) {
        super(1);
        this.f93358d = list;
        this.f93359e = i1Var;
        this.f93360f = pVar;
        this.f93361g = kVar;
    }

    public Object invoke(Object obj) {
        C25134i1.C25140a aVar = (C25134i1.C25140a) obj;
        C87412m.m108594g(aVar, "$this$runForkingPoint");
        for (C25528k fVar : this.f93358d) {
            aVar.mo52286a(new C34722f(this.f93359e, this.f93360f, fVar, this.f93361g));
        }
        return C13598b0.f38549a;
    }
}
