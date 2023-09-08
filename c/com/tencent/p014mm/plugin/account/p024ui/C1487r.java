package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.r */
public class C1487r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ InviteMMFBFriendsUI f10833d;

    public C1487r(InviteMMFBFriendsUI inviteMMFBFriendsUI) {
        this.f10833d = inviteMMFBFriendsUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f10833d.getContext(), MMFBAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        AppCompatActivity context = this.f10833d.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f10833d.finish();
    }
}
