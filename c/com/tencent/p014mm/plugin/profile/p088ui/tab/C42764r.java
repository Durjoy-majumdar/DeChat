package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.r */
public final class C42764r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42734m f115786d;

    public C42764r(C42734m mVar) {
        this.f115786d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDialogMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactWidgetTabBizHeaderController.this.f115558i.mo66853b();
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDialogMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
