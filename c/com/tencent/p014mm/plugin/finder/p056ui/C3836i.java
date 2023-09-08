package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.i */
public final class C3836i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderActivityDescUI f17373d;

    public C3836i(FinderActivityDescUI finderActivityDescUI) {
        this.f17373d = finderActivityDescUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$showBottomSheet$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104428a aVar = this.f17373d.f16756s;
        if (aVar != null) {
            aVar.hide();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$showBottomSheet$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
