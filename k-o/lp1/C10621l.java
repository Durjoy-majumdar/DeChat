package lp1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lp1.l */
public final class C10621l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10623n f32010d;

    public C10621l(C10623n nVar) {
        this.f32010d = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC$initContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f32010d.mo10884I3();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC$initContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
