package fq3;

import android.content.Context;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p004b0.C103941f;
import p157gk.C32467x;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p267x.C111885b;
import p415q0.C35747b;
import p435a0.C103141f;
import p436a1.C103266t0;
import p543h0.C107969n;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: fq3.t */
public final class C107578t extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C32467x> f321880d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C32467x, C13598b0> f321881e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107578t(ArrayList<C32467x> arrayList, C32226l<? super C32467x, C13598b0> lVar) {
        super(4);
        this.f321880d = arrayList;
        this.f321881e = lVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g((C103941f) obj, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) != 144 || !hVar.mo51575a()) {
            C107573r.m145747d(this.f321880d.get(intValue).f86263a, new C8183s(this.f321881e, this.f321880d, intValue), hVar, 0);
            if (intValue < this.f321880d.size() - 1) {
                int i = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                C65503j c = C111885b.m152607c(aVar, C110954a.m151254b(C0966R.color.am6, context), (C103266t0) null, 2, (Object) null);
                hVar.mo51557H(733328855);
                int i2 = C111294a.f333218a;
                C109895y c2 = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
                hVar.mo51557H(-1323940314);
                C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
                C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
                C110269a.f329831D0.getClass();
                C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(c);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar2);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C108508o2.m147049a(hVar, c2, C110269a.C110270a.f329836e);
                    C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                    C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                    C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                    hVar.mo51590i();
                    ((C35747b) a).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-2137368960);
                    Context context2 = MMApplicationContext.getContext();
                    C87412m.m108593f(context2, "getContext()");
                    C107969n.m146258a((C65503j) null, C110954a.m151254b(C0966R.color.BW_100_Alpha_0_1, context2), (float) 0.5d, ((float) 2.13d) * ((float) 8), hVar, 3456, 1);
                    hVar.mo51565P();
                    hVar.mo51565P();
                    hVar.mo51610s();
                    hVar.mo51565P();
                    hVar.mo51565P();
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            }
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
