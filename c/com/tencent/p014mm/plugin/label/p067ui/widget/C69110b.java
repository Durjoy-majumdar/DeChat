package com.tencent.p014mm.plugin.label.p067ui.widget;

import android.view.View;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.label.ui.widget.b */
public class C69110b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMLabelPanel f198744d;

    public C69110b(MMLabelPanel mMLabelPanel) {
        this.f198744d = mMLabelPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMLabelPanel mMLabelPanel = this.f198744d;
        MMLabelPanel.C69108a aVar = mMLabelPanel.f198742Q;
        if (aVar != null) {
            ((ContactLabelUI.C69088d) aVar).mo95163a(mMLabelPanel.f198740N);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
