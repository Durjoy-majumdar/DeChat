package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.widget.CheckBox;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.d4 */
public final class C4036d4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f18111d;

    public C4036d4(CheckBox checkBox) {
        this.f18111d = checkBox;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticeView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f18111d;
        checkBox.setChecked(!checkBox.isChecked());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initNoticeView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
