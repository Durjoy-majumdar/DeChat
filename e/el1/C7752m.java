package el1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: el1.m */
public final class C7752m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7741d f26248d;

    public C7752m(C7741d dVar) {
        this.f26248d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$showChargeModeBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101218e0 e0Var = this.f26248d.f26235x;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$showChargeModeBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
