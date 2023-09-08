package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.q */
public final class C42763q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42734m f115785d;

    public C42763q(C42734m mVar) {
        this.f115785d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDialogMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactWidgetTabBizHeaderController.this.f115558i.mo66852a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDialogMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
