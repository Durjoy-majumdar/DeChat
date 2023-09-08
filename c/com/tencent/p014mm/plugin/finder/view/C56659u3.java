package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.FinderPostFooter;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.u3 */
public final class C56659u3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostFooter.C56564a f162409d;

    public C56659u3(FinderPostFooter.C56564a aVar) {
        this.f162409d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f162409d.mo75068U1();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
