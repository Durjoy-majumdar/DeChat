package rl1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rl1.f */
public final class C13035f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63463e f37135d;

    public C13035f(C63463e eVar) {
        this.f37135d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f37135d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
