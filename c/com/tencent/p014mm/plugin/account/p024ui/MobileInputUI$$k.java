package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$k */
public class MobileInputUI$$k implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f10739d;

    public MobileInputUI$$k(MobileInputUI mobileInputUI) {
        this.f10739d = mobileInputUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.setClassName(this.f10739d.getContext(), "com.tencent.mm.plugin.repairer.ui.RepairerMainUI");
        AppCompatActivity context = this.f10739d.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputUI$19", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/account/ui/MobileInputUI$19", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }
}
