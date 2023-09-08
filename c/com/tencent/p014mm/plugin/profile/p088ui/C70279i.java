package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.i */
public class C70279i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddDescriptionUI f203039d;

    public C70279i(AddDescriptionUI addDescriptionUI) {
        this.f203039d = addDescriptionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AddDescriptionUI.m82638J7(this.f203039d, 2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
