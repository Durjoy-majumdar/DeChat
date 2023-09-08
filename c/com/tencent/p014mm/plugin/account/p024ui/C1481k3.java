package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.k3 */
public class C1481k3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WelcomeActivity f10827d;

    public C1481k3(WelcomeActivity welcomeActivity) {
        this.f10827d = welcomeActivity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C85875k4.m106210y() || C85875k4.m106157N()) {
            Intent intent = new Intent(this.f10827d, LoginSelectUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            WelcomeActivity welcomeActivity = this.f10827d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WelcomeActivity welcomeActivity2 = welcomeActivity;
            C117292a.m165358d(welcomeActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            welcomeActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(welcomeActivity2, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            Intent intent2 = new Intent(this.f10827d, MobileInputUI.class);
            intent2.putExtra("mobile_input_purpose", 1);
            WelcomeActivity welcomeActivity3 = this.f10827d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            WelcomeActivity welcomeActivity4 = welcomeActivity3;
            C117292a.m165358d(welcomeActivity4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            welcomeActivity3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(welcomeActivity4, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
