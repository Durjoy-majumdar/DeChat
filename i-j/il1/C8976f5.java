package il1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: il1.f5 */
public final class C8976f5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f28374d;

    public C8976f5(C32224a<C13598b0> aVar) {
        this.f28374d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$showTipWithBlurBgAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f28374d;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$showTipWithBlurBgAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
