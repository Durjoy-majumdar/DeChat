package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.l5 */
public final class C4097l5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4105m5<Object> f18239d;

    public C4097l5(C4105m5<Object> m5Var) {
        this.f18239d = m5Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f18239d.getClass();
        this.f18239d.dismiss();
        View contentView = this.f18239d.getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new C4105m5.C4107b(this.f18239d.f18268r));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
