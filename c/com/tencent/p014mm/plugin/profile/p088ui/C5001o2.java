package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.o2 */
public class C5001o2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI f20307d;

    public C5001o2(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f20307d = sayHiWithSnsPermissionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f20307d;
        int i = SayHiWithSnsPermissionUI.f202707r1;
        sayHiWithSnsPermissionUI.getClass();
        Intent intent = new Intent();
        intent.setClass(sayHiWithSnsPermissionUI.getContext(), AddDescriptionUI.class);
        intent.putExtra("Contact_User", sayHiWithSnsPermissionUI.f202778x);
        intent.putExtra("Contact_verify_string", sayHiWithSnsPermissionUI.f202719L);
        sayHiWithSnsPermissionUI.startActivityForResult(intent, 100);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
