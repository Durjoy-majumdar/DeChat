package il1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: il1.g5 */
public final class C8992g5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f28410d;

    public C8992g5(C32226l<? super Boolean, C13598b0> lVar) {
        this.f28410d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$showVerificationLayerInfo$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f28410d.invoke(Boolean.TRUE);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$showVerificationLayerInfo$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
