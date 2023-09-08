package xk1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xk1.f0 */
public final class C15733f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66355w f42449d;

    public C15733f0(C66355w wVar) {
        this.f42449d = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42449d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
