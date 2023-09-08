package kp1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.search.p055ui.FinderSearchBaseUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kp1.d */
public final class C10379d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSearchBaseUI f31588d;

    public C10379d(FinderSearchBaseUI finderSearchBaseUI) {
        this.f31588d = finderSearchBaseUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f31588d.onClickBackBtn(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
