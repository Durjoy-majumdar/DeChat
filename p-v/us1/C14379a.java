package us1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qj1.C62660c;
import zj1.C16217b;

/* renamed from: us1.a */
public final class C14379a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14380b f39941d;

    public C14379a(C14380b bVar) {
        this.f39941d = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/FinderLiveAnchorVoteEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14380b bVar = this.f39941d;
        if (bVar.f39944c.mo82893g0()) {
            C62660c.m73643W0(bVar.f39944c, bVar.f39945d, (Object) null, 2, (Object) null);
        } else {
            Class cls = C54991o.class;
            if (((C54991o) bVar.f39944c.mo87684A0().mo71262a(cls)).f154275W3 != null) {
                C58124b.C7172a.m7372a(bVar.f39943b, C58124b.C58125b.FINDER_LIVE_VOTING_SHOW, (Bundle) null, 2, (Object) null);
            } else {
                C55001u uVar = (C55001u) bVar.f39944c.mo87684A0().mo71262a(C55001u.class);
                C62042e eVar = C62042e.f176370a;
                Context context = bVar.f39942a.getContext();
                C87412m.m108593f(context, "root.context");
                eVar.mo87012I0(context, uVar.f154420q.f182392d, uVar.f154416j, uVar.f154423t, ((C54991o) bVar.f39944c.mo87684A0().mo71262a(cls)).f154345o);
            }
        }
        C16217b.f43438a.mo14745b(this.f39941d.f39948g, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/FinderLiveAnchorVoteEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
