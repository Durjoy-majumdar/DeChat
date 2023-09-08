package il1;

import ak1.C54116w;
import ak1.C54117x;
import android.os.Bundle;
import android.view.View;
import cl1.C54991o;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import hq1.C60085d;
import hq1.C60090e;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64247az0;

/* renamed from: il1.r6 */
public final class C60503r6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64247az0 f172454d;

    /* renamed from: e */
    public final /* synthetic */ C60528t6 f172455e;

    public C60503r6(C64247az0 az02, C60528t6 t6Var) {
        this.f172454d = az02;
        this.f172455e = t6Var;
    }

    public final void onClick(View view) {
        C60085d dVar;
        C60090e eVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameEntranceWidget$mount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w wVar = (C54116w) c;
        C64247az0 az02 = this.f172454d;
        C54116w.gy0(wVar, 2, 0, (String) null, az02 != null ? C54117x.m60831b(az02) : null, 6, (Object) null);
        if (!(!((C54991o) this.f172455e.f172523c.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f172455e.f172523c.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
            eVar.mo84955a();
            eVar.mo84957c(2021);
        }
        C58124b.C7172a.m7372a(this.f172455e.f172522b, C58124b.C58125b.FINDER_LIVE_VISITOR_GAME_PLAY_TOGETHER_SHOW_HALF, (Bundle) null, 2, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameEntranceWidget$mount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
