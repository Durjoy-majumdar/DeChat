package e22;

import android.view.View;
import e22.C75510j0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: e22.k0 */
public final class C75514k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75510j0 f221885d;

    public C75514k0(C75510j0 j0Var) {
        this.f221885d = j0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/HeaderAddDataItem$HeaderAddViewItem$setHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75510j0.C75513c cVar = this.f221885d.f221881B;
        if (cVar != null) {
            cVar.mo95164a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/HeaderAddDataItem$HeaderAddViewItem$setHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("onAddItemClickListener");
        throw null;
    }
}
