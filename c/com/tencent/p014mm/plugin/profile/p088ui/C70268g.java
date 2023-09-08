package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.g */
public class C70268g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddDescriptionUI f203023d;

    public C70268g(AddDescriptionUI addDescriptionUI) {
        this.f203023d = addDescriptionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AddDescriptionUI.m82638J7(this.f203023d, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
