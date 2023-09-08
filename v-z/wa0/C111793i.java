package wa0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p175j0.C108504h;
import p560i2.C108319b;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109894x0;
import p631o1.C109899z;
import rx3.C13598b0;

/* renamed from: wa0.i */
public final class C111793i extends C87413o implements C32227p<C109894x0, C108319b, C109899z> {

    /* renamed from: d */
    public final /* synthetic */ float f334768d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f334769e;

    /* renamed from: f */
    public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f334770f;

    /* renamed from: g */
    public final /* synthetic */ C111790e f334771g;

    /* renamed from: h */
    public final /* synthetic */ int f334772h;

    /* renamed from: i */
    public final /* synthetic */ C32228q<List<C111791f>, C108504h, Integer, C13598b0> f334773i;

    /* renamed from: j */
    public final /* synthetic */ int f334774j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111793i(float f, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar2, C111790e eVar, int i, C32228q<? super List<C111791f>, ? super C108504h, ? super Integer, C13598b0> qVar, int i2) {
        super(2);
        this.f334768d = f;
        this.f334769e = pVar;
        this.f334770f = pVar2;
        this.f334771g = eVar;
        this.f334772h = i;
        this.f334773i = qVar;
        this.f334774j = i2;
    }

    public Object invoke(Object obj, Object obj2) {
        C109894x0 x0Var = (C109894x0) obj;
        long j = ((C108319b) obj2).f324343a;
        C87412m.m108594g(x0Var, "$this$SubcomposeLayout");
        int M = x0Var.mo143032M(this.f334768d);
        List<C109893x> q0 = x0Var.mo161192q0(C38040k.Tabs, this.f334769e);
        ArrayList arrayList = new ArrayList(q0.size());
        int size = q0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(q0.get(i).mo161155K(j));
        }
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = M * 2;
        C8478d0 d0Var2 = new C8478d0();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C109854n0 n0Var = (C109854n0) arrayList.get(i2);
            d0Var.f27483d += n0Var.f328779d;
            d0Var2.f27483d = Math.max(d0Var2.f27483d, n0Var.f328780e);
        }
        return C109827a0.C109828a.m149247b(x0Var, d0Var.f27483d, d0Var2.f27483d, (Map) null, new C111792h(M, arrayList, x0Var, this.f334770f, this.f334771g, this.f334772h, j, d0Var, d0Var2, this.f334773i, this.f334774j), 4, (Object) null);
    }
}
