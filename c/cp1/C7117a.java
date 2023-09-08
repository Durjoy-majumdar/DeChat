package cp1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: cp1.a */
public final class C7117a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7120d f25070d;

    public C7117a(C7120d dVar) {
        this.f25070d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7120d dVar = this.f25070d;
        C7120d.m7319a(dVar, false, dVar.f25075e, dVar.getObjId());
        C12925w bottomSheet = this.f25070d.getBottomSheet();
        if (bottomSheet != null) {
            bottomSheet.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
