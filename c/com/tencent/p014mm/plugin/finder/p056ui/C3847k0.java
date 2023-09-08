package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.ui.k0 */
public final class C3847k0 implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17384d;

    public C3847k0(FinderCreateContactUI finderCreateContactUI) {
        this.f17384d = finderCreateContactUI;
    }

    public final void onFocusChange(View view, boolean z) {
        View view2 = this.f17384d.f16820K;
        if (view2 != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$6", "onFocusChange", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$6", "onFocusChange", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("clearNameBtn");
        throw null;
    }
}
