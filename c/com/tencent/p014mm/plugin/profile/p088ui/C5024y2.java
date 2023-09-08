package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.y2 */
public class C5024y2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI3 f20337d;

    public C5024y2(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f20337d = sayHiWithSnsPermissionUI3;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f20337d;
        int i = SayHiWithSnsPermissionUI3.f202888l1;
        sayHiWithSnsPermissionUI3.getClass();
        Intent intent = new Intent();
        intent.setClass(sayHiWithSnsPermissionUI3.getContext(), AddDescriptionUI.class);
        intent.putExtra("Contact_User", sayHiWithSnsPermissionUI3.f202950u);
        sayHiWithSnsPermissionUI3.startActivityForResult(intent, 100);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
