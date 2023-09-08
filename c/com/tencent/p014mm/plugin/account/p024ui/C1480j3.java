package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import p214om.C11502f;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.account.ui.j3 */
public class C1480j3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WelcomeActivity f10826d;

    public C1480j3(WelcomeActivity welcomeActivity) {
        this.f10826d = welcomeActivity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/WelcomeActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("not_auth_setting", true);
        intent.putExtra("from_login_history", true);
        C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
        WelcomeActivity welcomeActivity = this.f10826d;
        ((C67654r1) yM).getClass();
        if (welcomeActivity != null) {
            C88144b.m109791i(welcomeActivity, "setting", ".ui.setting.SettingsLanguageUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
