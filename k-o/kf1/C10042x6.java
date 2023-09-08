package kf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kf1.x6 */
public final class C10042x6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f30781d;

    public C10042x6(View view) {
        this.f30781d = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$onRetryShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View findViewById = this.f30781d.findViewById(C0966R.C0970id.is_);
        if (findViewById != null) {
            findViewById.callOnClick();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$onRetryShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
