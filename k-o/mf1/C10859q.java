package mf1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import pf1.C11920q;
import te3.C49730ho;
import te3.uc4;

/* renamed from: mf1.q */
public class C10859q extends C10854p {
    /* renamed from: C */
    public final C49730ho mo11077C(C11920q qVar) {
        T t;
        boolean z;
        uc4 uc4 = this.f37017f;
        if (uc4 == null) {
            LinkedList<uc4> linkedList = qVar.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == 6) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            uc4 = (uc4) t;
        }
        if (uc4 != null) {
            return uc4.f142770s;
        }
        return null;
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Object obj = oVar.f173503E;
        C0740i2 i2Var = obj instanceof C0740i2 ? (C0740i2) obj : null;
        if (i2Var != null) {
            long itemId = i2Var.getItemId();
            if (qVar.f34827a.business_type == 2) {
                C39818r rVar = C39818r.f106831a;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar.mo62443b(context).mo62449e(FinderDescPanelUIC.class);
                if (finderDescPanelUIC != null) {
                    finderDescPanelUIC.mo5123k3(itemId, 128);
                }
            }
        }
        mo11074x(baseFinderFeed, oVar, view, qVar, str, mo11077C(qVar), false);
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        C49730ho C = mo11077C(qVar);
        return !Util.isNullOrNil(C != null ? C.f134754e : null);
    }
}
