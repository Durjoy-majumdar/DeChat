package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.widget.CheckBox;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.c4 */
public final class C4031c4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f18096d;

    public C4031c4(CheckBox checkBox) {
        this.f18096d = checkBox;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticeView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f18096d;
        checkBox.setChecked(!checkBox.isChecked());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticeView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
