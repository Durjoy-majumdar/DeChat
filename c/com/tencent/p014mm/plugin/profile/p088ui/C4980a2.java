package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.a2 */
public class C4980a2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NormalProfileHeaderPreference f20264d;

    public C4980a2(NormalProfileHeaderPreference normalProfileHeaderPreference) {
        this.f20264d = normalProfileHeaderPreference;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("finder_username", this.f20264d.f202582W.username);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(this.f20264d.f121274d, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
