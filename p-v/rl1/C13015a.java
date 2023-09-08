package rl1;

import android.view.View;
import cl1.C54991o;
import hq1.C60085d;
import hq1.C60090e;
import j20.C117292a;
import java.util.ArrayList;
import zj1.C16217b;

/* renamed from: rl1.a */
public final class C13015a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13021d f37076d;

    public C13015a(C13021d dVar) {
        this.f37076d = dVar;
    }

    public final void onClick(View view) {
        C60085d dVar;
        C60090e eVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLiveAnchorLotteryEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f37076d.mo12530c();
        if (!(!((C54991o) this.f37076d.f37086c.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f37076d.f37086c.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
            eVar.mo84955a();
            eVar.mo84957c(2019);
        }
        C16217b bVar = C16217b.f43438a;
        bVar.mo14745b(this.f37076d.f37091h, false);
        bVar.mo14745b(this.f37076d.f37092i, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveAnchorLotteryEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
