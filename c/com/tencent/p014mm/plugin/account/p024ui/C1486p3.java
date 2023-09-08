package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.p3 */
public class C1486p3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WelcomeActivity f10832d;

    public C1486p3(WelcomeActivity welcomeActivity) {
        this.f10832d = welcomeActivity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/WelcomeActivity$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f10832d, RegByMobileRegAIOUI.class);
        WelcomeActivity welcomeActivity = this.f10832d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        WelcomeActivity welcomeActivity2 = welcomeActivity;
        C117292a.m165358d(welcomeActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        welcomeActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(welcomeActivity2, "com/tencent/mm/plugin/account/ui/WelcomeActivity$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
