package wg1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wg1.p2 */
public final class C15335p2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41666d;

    public C15335p2(C15370z1 z1Var) {
        this.f41666d = z1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15370z1 z1Var = this.f41666d;
        z1Var.f41741Q = 1;
        z1Var.mo14196k3(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
