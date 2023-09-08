package ce1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ce1.l */
public final class C0475l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0465g f1162d;

    public C0475l(C0465g gVar) {
        this.f1162d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104428a aVar = this.f1162d.f1121K;
        if (aVar != null) {
            aVar.hide();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$showBottomSheet$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
