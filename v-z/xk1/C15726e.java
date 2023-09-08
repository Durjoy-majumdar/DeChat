package xk1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xk1.e */
public final class C15726e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66309g f42431d;

    public C15726e(C66309g gVar) {
        this.f42431d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66309g.m78227c3(this.f42431d, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
