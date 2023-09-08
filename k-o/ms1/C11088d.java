package ms1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ms1.d */
public final class C11088d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11089e f32859d;

    public C11088d(C11089e eVar) {
        this.f32859d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f32859d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
