package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.h */
public class C70276h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddDescriptionUI f203037d;

    public C70276h(AddDescriptionUI addDescriptionUI) {
        this.f203037d = addDescriptionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AddDescriptionUI.m82638J7(this.f203037d, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
