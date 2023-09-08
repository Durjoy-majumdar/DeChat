package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.v0 */
public class C1492v0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMFBFriendUI f10845d;

    public C1492v0(MMFBFriendUI mMFBFriendUI) {
        this.f10845d = mMFBFriendUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f10845d.getContext(), MMFBAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        AppCompatActivity context = this.f10845d.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI$12", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$12", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f10845d.finish();
    }
}
