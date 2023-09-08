package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import android.widget.EditText;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.j0 */
public final class C3842j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17380d;

    public C3842j0(FinderCreateContactUI finderCreateContactUI) {
        this.f17380d = finderCreateContactUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditText editText = this.f17380d.f16844s;
        if (editText != null) {
            editText.getText().clear();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initContentView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("nickEdt");
        throw null;
    }
}
