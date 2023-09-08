package wa0;

import a14.C53895h;
import a14.C53934p0;
import com.google.android.gms.common.internal.Constants;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import my3.C61595o;
import p175j0.C108494d2;
import p175j0.C108504h;
import p415q0.C110261c;
import p560i2.C108319b;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109894x0;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: wa0.h */
public final class C111792h extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f334757d;

    /* renamed from: e */
    public final /* synthetic */ List<C109854n0> f334758e;

    /* renamed from: f */
    public final /* synthetic */ C109894x0 f334759f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f334760g;

    /* renamed from: h */
    public final /* synthetic */ C111790e f334761h;

    /* renamed from: i */
    public final /* synthetic */ int f334762i;

    /* renamed from: j */
    public final /* synthetic */ long f334763j;

    /* renamed from: n */
    public final /* synthetic */ C8478d0 f334764n;

    /* renamed from: o */
    public final /* synthetic */ C8478d0 f334765o;

    /* renamed from: p */
    public final /* synthetic */ C32228q<List<C111791f>, C108504h, Integer, C13598b0> f334766p;

    /* renamed from: q */
    public final /* synthetic */ int f334767q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111792h(int i, List<? extends C109854n0> list, C109894x0 x0Var, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C111790e eVar, int i2, long j, C8478d0 d0Var, C8478d0 d0Var2, C32228q<? super List<C111791f>, ? super C108504h, ? super Integer, C13598b0> qVar, int i3) {
        super(1);
        this.f334757d = i;
        this.f334758e = list;
        this.f334759f = x0Var;
        this.f334760g = pVar;
        this.f334761h = eVar;
        this.f334762i = i2;
        this.f334763j = j;
        this.f334764n = d0Var;
        this.f334765o = d0Var2;
        this.f334766p = qVar;
        this.f334767q = i3;
    }

    public Object invoke(Object obj) {
        C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
        C87412m.m108594g(aVar, "$this$layout");
        ArrayList arrayList = new ArrayList();
        int i = this.f334757d;
        List<C109854n0> list = this.f334758e;
        C109894x0 x0Var = this.f334759f;
        int size = list.size();
        int i2 = i;
        int i3 = 0;
        while (i3 < size) {
            C109854n0 n0Var = list.get(i3);
            C109854n0 n0Var2 = n0Var;
            C109854n0.C109855a.m149306f(aVar, n0Var, i2, 0, 0.0f, 4, (Object) null);
            arrayList.add(new C111791f(x0Var.mo143039m(i2), x0Var.mo143039m(n0Var2.f328779d), (C8480h) null));
            i2 += n0Var2.f328779d;
            i3++;
            list = list;
        }
        List<C109893x> q0 = this.f334759f.mo161192q0(C38040k.Divider, this.f334760g);
        long j = this.f334763j;
        C8478d0 d0Var = this.f334764n;
        C8478d0 d0Var2 = this.f334765o;
        int size2 = q0.size();
        int i4 = 0;
        while (i4 < size2) {
            int i5 = d0Var.f27483d;
            C109854n0 K = q0.get(i4).mo161155K(C108319b.m146690a(j, i5, i5, 0, 0, 12, (Object) null));
            int i6 = i4;
            C8478d0 d0Var3 = d0Var2;
            C109854n0.C109855a.m149306f(aVar, K, 0, d0Var2.f27483d - K.f328780e, 0.0f, 4, (Object) null);
            i4 = i6 + 1;
            size2 = size2;
            d0Var2 = d0Var3;
            d0Var = d0Var;
            j = j;
        }
        List<C109893x> q05 = this.f334759f.mo161192q0(C38040k.Indicator, C110261c.m149879c(-2142794720, true, new C65944g(this.f334766p, arrayList, this.f334767q)));
        C8478d0 d0Var4 = this.f334764n;
        C8478d0 d0Var5 = this.f334765o;
        int size3 = q05.size();
        for (int i7 = 0; i7 < size3; i7++) {
            C109854n0.C109855a.m149306f(aVar, q05.get(i7).mo161155K(C108319b.f324339b.mo158785c(d0Var4.f27483d, d0Var5.f27483d)), 0, 0, 0.0f, 4, (Object) null);
        }
        C111790e eVar = this.f334761h;
        C109894x0 x0Var2 = this.f334759f;
        int i8 = this.f334757d;
        int i9 = this.f334762i;
        eVar.getClass();
        C87412m.m108594g(x0Var2, Constants.PARAM_DENSITY);
        Integer num = eVar.f334754c;
        if (num == null || num.intValue() != i9) {
            eVar.f334754c = Integer.valueOf(i9);
            C111791f fVar = (C111791f) C110818d0.m150917O(arrayList, i9);
            if (fVar != null) {
                C111791f fVar2 = (C111791f) C110818d0.m150923U(arrayList);
                int M = x0Var2.mo143032M(fVar2.f334755a + fVar2.f334756b) + i8;
                int intValue = M - ((Number) ((C108494d2) eVar.f334752a.f335097c).getValue()).intValue();
                int M2 = x0Var2.mo143032M(fVar.f334755a) - ((intValue / 2) - (x0Var2.mo143032M(fVar.f334756b) / 2));
                int i15 = M - intValue;
                if (i15 < 0) {
                    i15 = 0;
                }
                C53895h.m60466d(eVar.f334753b, (C66212f) null, (C53934p0) null, new C111789d(eVar, C61595o.m72297e(M2, 0, i15), (C15601d<? super C111789d>) null), 3, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
