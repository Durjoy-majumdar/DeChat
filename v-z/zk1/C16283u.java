package zk1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zk1.u */
public final class C16283u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43576d;

    public C16283u(C16229h hVar) {
        this.f43576d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16229h.m15121c3(this.f43576d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
