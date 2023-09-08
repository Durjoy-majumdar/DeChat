package qk1;

import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import yh1.C16011a;

/* renamed from: qk1.p1 */
public final class C12828p1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12814m1 f36716d;

    /* renamed from: e */
    public final /* synthetic */ C8916d f36717e;

    public C12828p1(C12814m1 m1Var, C8916d dVar) {
        this.f36716d = m1Var;
        this.f36717e = dVar;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C16011a aVar = this.f36716d.f36680h;
        if (aVar != null) {
            C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            String str = this.f36717e.field_rewardProductId;
            C87412m.m108593f(str, "giftInfo.field_rewardProductId");
            aVar.mo12006b((ViewGroup) view, str);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
