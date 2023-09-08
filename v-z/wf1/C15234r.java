package wf1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wf1.r */
public final class C15234r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41454d;

    public C15234r(C15193l lVar) {
        this.f41454d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f41454d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
