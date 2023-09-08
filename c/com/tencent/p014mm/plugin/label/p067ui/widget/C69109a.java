package com.tencent.p014mm.plugin.label.p067ui.widget;

import android.view.View;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.label.ui.widget.a */
public class C69109a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMLabelPanel f198743d;

    public C69109a(MMLabelPanel mMLabelPanel) {
        this.f198743d = mMLabelPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMLabelPanel mMLabelPanel = this.f198743d;
        MMLabelPanel.C69108a aVar = mMLabelPanel.f198741P;
        if (aVar != null) {
            ((ContactLabelUI.C69088d) aVar).mo95163a(mMLabelPanel.f198739M);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
