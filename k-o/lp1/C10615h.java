package lp1;

import android.view.View;
import dp1.C7434f1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lp1.h */
public final class C10615h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10617j f31999d;

    public C10615h(C10617j jVar) {
        this.f31999d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f31999d.mo10876I3(0);
        C7434f1.f25625a.mo8576b(this.f31999d.getActivity(), 5, "");
        this.f31999d.clear();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideNextUIC$initClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
