package px0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18355t;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C64175a0;
import te3.C22521pi1;

/* renamed from: px0.l */
public final class C22048l extends C87413o implements C32226l<C22521pi1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C22039d f62393d;

    /* renamed from: e */
    public final /* synthetic */ C22055p f62394e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22048l(C22039d dVar, C22055p pVar) {
        super(1);
        this.f62393d = dVar;
        this.f62394e = pVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C22521pi1) obj, LocaleUtil.ITALIAN);
        C22521pi1 pi12 = this.f62393d.f62373d;
        if (pi12.f64411F == 1) {
            C22055p pVar = this.f62394e;
            int i = C22055p.f62409o;
            pVar.getClass();
            String str = pi12.f64435r;
            long P = !(str == null || str.length() == 0) ? C61926c.m72671P(pi12.f64435r) : 0;
            String str2 = pi12.f64432o;
            C87412m.m108593f(str2, "targetUsername");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76768Iz(str2, P);
            String str3 = pi12.f64432o;
            ArrayList<C22039d> a = pVar.mo35160a();
            ArrayList arrayList = new ArrayList();
            for (T next : a) {
                if (C87412m.m108589b(((C22039d) next).f62373d.f64432o, str3)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C22039d) it.next()).f62373d.f64422R = true;
            }
            C64175a0.m75512t(pVar.mo35160a(), new C22057q(str3));
            C18355t.m18927f(pVar.mo35161b());
            if (pVar.mo35160a().size() == 0) {
                pVar.f62414a.mo22945m(pVar.mo35161b());
            } else {
                pVar.mo35162c().notifyDataSetChanged();
            }
        } else {
            C22055p pVar2 = this.f62394e;
            String str4 = pi12.f64426f;
            C87412m.m108593f(str4, "data.finderData.username");
            int i2 = C22055p.f62409o;
            C22058r.f62430a.mo35168d(str4, pVar2.mo35163d());
        }
        return C13598b0.f38549a;
    }
}
