package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.o1 */
public final class C56406o1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaPreviewUI f161252d;

    public C56406o1(FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f161252d = finderMediaPreviewUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$checkPlay$1$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderMediaPreviewUI finderMediaPreviewUI = this.f161252d;
        int i = FinderMediaPreviewUI.f161053y;
        if (finderMediaPreviewUI.mo79092O7().getVisibility() == 0) {
            this.f161252d.mo79092O7().setVisibility(8);
        } else {
            this.f161252d.mo79092O7().setVisibility(0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$checkPlay$1$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
