package zk1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4226y6;
import j20.C117292a;
import java.util.ArrayList;
import sx3.C64197v;

/* renamed from: zk1.r */
public final class C16279r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43572d;

    public C16279r(C16229h hVar) {
        this.f43572d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16229h hVar = this.f43572d;
        new C4226y6(hVar.getActivity(), new C16223e0(hVar)).mo5095a(C64197v.m75537f(10, 500, 1000, 2000));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
