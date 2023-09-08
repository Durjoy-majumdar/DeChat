package wg1;

import android.content.Context;
import android.view.View;
import di3.C86312j;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;
import rx3.C13598b0;
import wc3.C15133e0;

/* renamed from: wg1.o2 */
public final class C15331o2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41659d;

    public C15331o2(C15370z1 z1Var) {
        this.f41659d = z1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15370z1 z1Var = this.f41659d;
        C77407n nVar = new C77407n((Context) z1Var.getContext(), 0, true);
        nVar.f225779n1 = false;
        nVar.f225775k1 = true;
        nVar.f225792t1 = false;
        ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Q60(z1Var.getActivity(), nVar, 2, (C32226l<? super Boolean, C13598b0>) null, new C15272e2(nVar, z1Var));
        nVar.f225771i = new C15258b2(nVar, z1Var);
        nVar.f225782p = new C15261c2(z1Var, nVar);
        nVar.mo107573q();
        if (z1Var.f41739N.f41642a) {
            z1Var.mo14195j3(6);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
