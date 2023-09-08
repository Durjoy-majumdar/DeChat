package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p140cw.C7138g;

/* renamed from: com.tencent.mm.plugin.finder.ui.f0 */
public final class C3790f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17265d;

    public C3790f0(FinderCreateContactUI finderCreateContactUI) {
        this.f17265d = finderCreateContactUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderCreateContactUI finderCreateContactUI = this.f17265d;
        ((C7138g) C86312j.m106911c(C7138g.class)).mo8317di(finderCreateContactUI, finderCreateContactUI.f16824P, 1, 5, (Intent) null, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
