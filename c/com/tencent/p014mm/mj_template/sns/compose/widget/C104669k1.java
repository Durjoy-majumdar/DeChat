package com.tencent.p014mm.mj_template.sns.compose.widget;

import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kg3.C76577a;
import p004b0.C103941f;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103214y0;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k1 */
public final class C104669k1 extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<List<C55319n1.C55323d>> f310817d;

    /* renamed from: e */
    public final /* synthetic */ C55304k f310818e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104669k1(List<? extends List<C55319n1.C55323d>> list, C55304k kVar) {
        super(4);
        this.f310817d = list;
        this.f310818e = kVar;
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
            C103111a.C103116e eVar = C103111a.f304242i;
            int i = C65503j.f188489K0;
            C65503j g = C103214y0.m136591g(C103166l0.m136523g(C65503j.C65504a.f188490d, 0.0f, ((float) 8) * ((float) 3), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null);
            List<List<C55319n1.C55323d>> list = this.f310817d;
            C55304k kVar = this.f310818e;
            hVar.mo51557H(693286680);
            int i2 = C111294a.f333218a;
            C109895y a = C103199s0.m136579a(eVar, C111294a.C111295a.f333226h, hVar, 6);
            hVar.mo51557H(-1323940314);
            C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) hVar.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) hVar.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
            if (hVar.mo51543A() instanceof C24665d) {
                hVar.mo51615v();
                if (hVar.mo51621y()) {
                    hVar.mo51612t(aVar);
                } else {
                    hVar.mo51579c();
                }
                hVar.mo51561L();
                C108508o2.m147049a(hVar, a, C110269a.C110270a.f329836e);
                C108508o2.m147049a(hVar, dVar, C110269a.C110270a.f329835d);
                C108508o2.m147049a(hVar, oVar, C110269a.C110270a.f329837f);
                C108508o2.m147049a(hVar, i2Var, C110269a.C110270a.f329838g);
                hVar.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                hVar.mo51557H(2058660585);
                hVar.mo51557H(-678309503);
                List<C55319n1.C55323d> list2 = list.get(intValue);
                hVar.mo51557H(1660914978);
                for (C55319n1.C55323d dVar2 : list2) {
                    C104674o1.m140306f(dVar2, new C55303j1(kVar, dVar2), hVar, 0);
                }
                hVar.mo51565P();
                int size = 4 - list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = C65503j.f188489K0;
                    C103129b1.m136432a(C103214y0.m136596l(C103166l0.m136521e(C65503j.C65504a.f188490d, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avm)), 0.0f, 2, (Object) null), (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avn))), hVar, 0);
                }
                hVar.mo51565P();
                hVar.mo51565P();
                hVar.mo51610s();
                hVar.mo51565P();
                hVar.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
