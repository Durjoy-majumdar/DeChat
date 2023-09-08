package rs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.ob */
public final class C63610ob implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63625rb f180368d;

    public C63610ob(C63625rb rbVar) {
        this.f180368d = rbVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f180368d.onClickBackBtn(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
