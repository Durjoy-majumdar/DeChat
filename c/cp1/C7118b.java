package cp1;

import android.view.View;
import er1.C58739j4;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import rx3.C13598b0;

/* renamed from: cp1.b */
public final class C7118b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7120d f25071d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f25072e;

    public C7118b(C7120d dVar, C32224a<C13598b0> aVar) {
        this.f25071d = dVar;
        this.f25072e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C7120d dVar = this.f25071d;
        C7120d.m7319a(dVar, true, dVar.f25075e, dVar.getObjId());
        C12925w bottomSheet = this.f25071d.getBottomSheet();
        if (bottomSheet != null) {
            bottomSheet.mo5085n();
        }
        this.f25072e.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
